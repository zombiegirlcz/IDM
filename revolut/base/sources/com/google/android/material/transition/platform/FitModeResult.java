package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes16.dex */
class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    public FitModeResult(float f, float f4, float f5, float f6, float f32, float f35) {
        this.startScale = f;
        this.endScale = f4;
        this.currentStartWidth = f5;
        this.currentStartHeight = f6;
        this.currentEndWidth = f32;
        this.currentEndHeight = f35;
    }
}
