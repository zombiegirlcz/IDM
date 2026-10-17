package com.onfido.android.sdk.capture.internal.camera.factory;

import android.util.Size;
import androidx.camera.view.PreviewView;
import com.onfido.android.sdk.capture.internal.camera.ConfigurationExtKt;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalysisConfig;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageCaptureConfig;
import com.onfido.android.sdk.capture.internal.camera.camerax.PreviewConfig;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import pkm.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\nH\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/factory/DocCaptureCameraConfigProvider;", "", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "getImageAnalysisConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalysisConfig;", "getImageCaptureConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageCaptureConfig;", "getImageCaptureFlashMode", "", "getImageCaptureMode", "getImageCaptureTargetResolution", "Landroid/util/Size;", "getPreviewConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "getPreviewScaleType", "Landroidx/camera/view/PreviewView$ScaleType;", "getVideoCaptureAspectRatio", "getVideoCaptureConfig", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocCaptureCameraConfigProvider {
    public static final float ASPECT_RATIO_16_9 = 0.5625f;
    public static final float ASPECT_RATIO_4_3 = 0.75f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DOC_CAPTURE_FRAME_SAMPLING_DURATION;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/factory/DocCaptureCameraConfigProvider$Companion;", "", "<init>", "()V", "Lkotlin/time/b;", "DOC_CAPTURE_FRAME_SAMPLING_DURATION", "J", "getDOC_CAPTURE_FRAME_SAMPLING_DURATION-UwyO8pc", "()J", "", "ASPECT_RATIO_16_9", "F", "ASPECT_RATIO_4_3", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getDOC_CAPTURE_FRAME_SAMPLING_DURATION-UwyO8pc, reason: not valid java name */
        public final long m3700getDOC_CAPTURE_FRAME_SAMPLING_DURATIONUwyO8pc() {
            return DocCaptureCameraConfigProvider.DOC_CAPTURE_FRAME_SAMPLING_DURATION;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        DOC_CAPTURE_FRAME_SAMPLING_DURATION = c.g(10, e.MILLISECONDS);
    }

    public DocCaptureCameraConfigProvider(@NotNull OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        this.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    private final int getImageCaptureFlashMode() {
        return this.onfidoRemoteConfig.isAutoFlashModeEnabled() ? 0 : 2;
    }

    private final int getImageCaptureMode() {
        return !this.onfidoRemoteConfig.isCameraXHighQualityModeEnabled() ? 1 : 0;
    }

    private final Size getImageCaptureTargetResolution() {
        float f;
        float f4;
        int targetResolutionWidth = this.onfidoRemoteConfig.getDocumentCapture().getTargetResolutionWidth();
        if (this.onfidoRemoteConfig.isFourByThreeEnabled()) {
            f = targetResolutionWidth;
            f4 = 0.75f;
        } else {
            f = targetResolutionWidth;
            f4 = 0.5625f;
        }
        return new Size(targetResolutionWidth, (int) (f * f4));
    }

    private final PreviewView.ScaleType getPreviewScaleType() {
        return this.onfidoRemoteConfig.isFourByThreeEnabled() ? PreviewView.ScaleType.FIT_CENTER : PreviewView.ScaleType.FILL_CENTER;
    }

    private final int getVideoCaptureAspectRatio() {
        return !this.onfidoRemoteConfig.isFourByThreeEnabled() ? 1 : 0;
    }

    @NotNull
    public final ImageAnalysisConfig getImageAnalysisConfig() {
        return new ImageAnalysisConfig(DOC_CAPTURE_FRAME_SAMPLING_DURATION, null);
    }

    @NotNull
    public final ImageCaptureConfig getImageCaptureConfig() {
        return new ImageCaptureConfig(getImageCaptureTargetResolution(), getImageCaptureMode(), getImageCaptureFlashMode());
    }

    @NotNull
    public final PreviewConfig getPreviewConfig() {
        return new PreviewConfig(getPreviewScaleType(), this.onfidoRemoteConfig.getDocumentCapture().isCameraXViewPortEnabled(), DOC_CAPTURE_FRAME_SAMPLING_DURATION, null);
    }

    @NotNull
    public final VideoCaptureConfig getVideoCaptureConfig() {
        return new VideoCaptureConfig(null, false, 30000, ConfigurationExtKt.getVideoQualityProfile(this.onfidoRemoteConfig.getDocumentCapture()), getVideoCaptureAspectRatio(), this.onfidoRemoteConfig.getDocumentCapture().getVideoBitrate(), 25, 0L, 0L, 385, null);
    }
}
