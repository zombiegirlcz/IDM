package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.media.Image;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface i7 {
    void close();

    @NotNull
    Bitmap toBitmap(@NotNull Image image, int i, int i2);
}
