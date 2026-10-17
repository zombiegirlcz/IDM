package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class y2 {
    @NotNull
    public static final Bitmap cropBitmap(@NotNull Bitmap bitmap, @NotNull fa contentDetectionArea, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(contentDetectionArea, "contentDetectionArea");
        return new n().crop(bitmap, contentDetectionArea, i);
    }
}
