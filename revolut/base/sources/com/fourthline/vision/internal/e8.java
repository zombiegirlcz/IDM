package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.media.Image;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface e8 {
    @NotNull
    f9 toMlKitFrame(@NotNull Bitmap bitmap);

    @NotNull
    f9 toMlKitFrame(@NotNull Image image);

    @NotNull
    f9 toMlKitFrame(@NotNull Image image, int i, int i2, @NotNull fa faVar);
}
