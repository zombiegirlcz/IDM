package com.fourthline.core.internal;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.VibratorManager;

/* JADX INFO: loaded from: classes23.dex */
public abstract /* synthetic */ class j0 {
    public static /* synthetic */ RadialGradient a(float f, float f4, float f5, float f6, float f32, float f35, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new RadialGradient(f, f4, f5, f6, f32, f35, jArr, fArr, tileMode);
    }

    public static /* bridge */ /* synthetic */ VibratorManager c(Object obj2) {
        return (VibratorManager) obj2;
    }
}
