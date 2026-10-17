package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.widget.FrameLayout;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "", "T", "Lio/reactivex/rxjava3/core/Observable;", "observeFrame", "()Lio/reactivex/rxjava3/core/Observable;", "Landroid/widget/FrameLayout;", "previewView", "Lkotlin/time/b;", "frameSamplingPeriod", "", "onPreviewAvailable-HG0u8IE", "(Landroid/widget/FrameLayout;J)V", "onPreviewAvailable", "close", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FrameSampler<T> {
    void close();

    @NotNull
    Observable observeFrame();

    /* JADX INFO: renamed from: onPreviewAvailable-HG0u8IE */
    void mo3668onPreviewAvailableHG0u8IE(@NotNull FrameLayout previewView, long frameSamplingPeriod);
}
