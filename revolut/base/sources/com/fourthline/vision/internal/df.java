package com.fourthline.vision.internal;

import android.util.Size;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface df {
    @NotNull
    Size getImageReaderSize();

    int getOrientationHint();

    @NotNull
    Size getPreviewSize();
}
