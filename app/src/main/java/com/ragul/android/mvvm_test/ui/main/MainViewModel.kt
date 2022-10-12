package com.ragul.android.mvvm_test.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * ViewModel containing the app data and methods to process the data
 */
class MainViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply { value = "" }

    var text: LiveData<String> = _text

    fun updateText(typedText: String){
        _text.value = typedText
    }

}
