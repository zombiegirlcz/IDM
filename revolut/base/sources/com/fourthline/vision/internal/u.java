package com.fourthline.vision.internal;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface u {
    void bindToPreview(@NotNull PreviewView previewView, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super l0, Unit> function1);

    @NotNull
    v getCoordinates();

    int getVideoRecordingBitrate();

    @NotNull
    ke recordVideo();

    void setAnalyzer(ImageAnalysis.Analyzer analyzer);

    void setVideoRecordingBitrate(int i);

    Object takePicture(@NotNull Continuation<? super o> continuation);
}
