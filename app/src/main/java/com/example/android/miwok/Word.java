package com.example.android.miwok;

import android.media.Image;

// docstring here to define a function that will create functions
public class Word {
    // create the default translation normally in English
    private String mDefaultTranslation;
    // create the miwork translation
    private String mMiwokTranslation;
    // create the resourceid state
    private int mImageResourceId;
    // constructor for activities with images
    private int mMediaResourceId;

    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId, int mediaResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mMediaResourceId = mediaResourceId;
    }
    // constructor for the phrases
    public Word(String DefaultTranslation, String MiwokTranslation, int mediaResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mMediaResourceId = mediaResourceId;
    }

    // create getters for our class
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId;}

    public int getmMediaResourceId(){ return mMediaResourceId;}

}
