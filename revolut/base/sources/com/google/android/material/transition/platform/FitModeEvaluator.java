package com.google.android.material.transition.platform;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes16.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f, FitModeResult fitModeResult);

    FitModeResult evaluate(float f, float f4, float f5, float f6, float f32, float f35, float f36);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
