package com.fourthline.vision.internal;

import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface f {
    void startRecording(@NotNull File file);

    @NotNull
    File stopRecording();
}
