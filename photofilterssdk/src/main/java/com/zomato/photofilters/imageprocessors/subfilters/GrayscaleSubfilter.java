package com.zomato.photofilters.imageprocessors.subfilters;

import android.graphics.Bitmap;

import com.zomato.photofilters.imageprocessors.ImageProcessor;
import com.zomato.photofilters.imageprocessors.SubFilter;

public class GrayscaleSubfilter implements SubFilter {
    private String tag = "";

    @Override
    public Bitmap process(Bitmap inputImage) {
        return ImageProcessor.doGrayscale(inputImage);
    }

    @Override
    public Object getTag() {
        return tag;
    }

    @Override
    public void setTag(Object tag) {
        this.tag = tag.toString();
    }

    @Override
    public Integer getValue() {
        return null;
    }

    @Override
    public void setValue(Integer value) {
        // Do nothing
    }
}
