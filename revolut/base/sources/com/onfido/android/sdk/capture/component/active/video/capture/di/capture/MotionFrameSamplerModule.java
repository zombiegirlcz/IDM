package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import com.onfido.android.sdk.capture.common.di.FragmentScope;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionFrameSampler;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImageAnalyzer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.preview.PreviewBitmapHelper;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/di/capture/MotionFrameSamplerModule;", "", "()V", "providesMotionFrameSampler", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;", "previewBitmapHelper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/preview/PreviewBitmapHelper;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "providesMotionImageAnalyzer", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalyzer;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionFrameSamplerModule {
    @FragmentScope
    @NotNull
    public final FrameSampler<MotionImage> providesMotionFrameSampler(@NotNull PreviewBitmapHelper previewBitmapHelper, @NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(previewBitmapHelper, "previewBitmapHelper");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        return new MotionFrameSampler(previewBitmapHelper, schedulersProvider);
    }

    @FragmentScope
    @NotNull
    public final ImageAnalyzer<MotionImage> providesMotionImageAnalyzer() {
        return new MotionImageAnalyzer();
    }
}
