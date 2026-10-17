package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface j7 {
    static /* synthetic */ Bitmap crop$default(j7 j7Var, Bitmap bitmap, fa faVar, int i, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: crop");
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return j7Var.crop(bitmap, faVar, i);
    }

    @NotNull
    Bitmap crop(@NotNull Bitmap bitmap, @NotNull fa faVar, int i);
}
