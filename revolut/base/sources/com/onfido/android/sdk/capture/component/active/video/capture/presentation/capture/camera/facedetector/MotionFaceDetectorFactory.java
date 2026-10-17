package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/MotionFaceDetectorFactory;", "", "analytics", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "faceDetectorAvcMLKitProvider", "Lcom/onfido/javax/inject/Provider;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcMLKit;", "faceDetectorAvcTfliteProvider", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcTflite;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;Lcom/onfido/javax/inject/Provider;Lcom/onfido/javax/inject/Provider;)V", "create", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "shouldUseMLKit", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionFaceDetectorFactory {

    @NotNull
    private final OnfidoAnalytics analytics;

    @NotNull
    private final Provider faceDetectorAvcMLKitProvider;

    @NotNull
    private final Provider faceDetectorAvcTfliteProvider;

    public MotionFaceDetectorFactory(@NotNull OnfidoAnalytics analytics, @NotNull Provider faceDetectorAvcMLKitProvider, @NotNull Provider faceDetectorAvcTfliteProvider) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(faceDetectorAvcMLKitProvider, "faceDetectorAvcMLKitProvider");
        Intrinsics.checkNotNullParameter(faceDetectorAvcTfliteProvider, "faceDetectorAvcTfliteProvider");
        this.analytics = analytics;
        this.faceDetectorAvcMLKitProvider = faceDetectorAvcMLKitProvider;
        this.faceDetectorAvcTfliteProvider = faceDetectorAvcTfliteProvider;
    }

    @NotNull
    public final FaceDetectorAvc create(boolean shouldUseMLKit) {
        Provider provider;
        if (shouldUseMLKit) {
            this.analytics.track(new AvcAnalyticsEvent.MotionFaceDetector("MLKit"));
            provider = this.faceDetectorAvcMLKitProvider;
        } else {
            this.analytics.track(new AvcAnalyticsEvent.MotionFaceDetector("TFLite"));
            provider = this.faceDetectorAvcTfliteProvider;
        }
        Object obj2 = provider.get();
        Intrinsics.h(obj2);
        return (FaceDetectorAvc) obj2;
    }
}
