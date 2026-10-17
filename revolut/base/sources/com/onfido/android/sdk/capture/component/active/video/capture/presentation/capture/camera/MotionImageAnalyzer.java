package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera;

import android.graphics.Bitmap;
import androidx.camera.view.PreviewView;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImageAnalyzer;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalyzer;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;", "<init>", "()V", "Lio/reactivex/rxjava3/core/Observable;", "observeFrame", "()Lio/reactivex/rxjava3/core/Observable;", "Landroid/graphics/Bitmap;", "image", "Landroidx/camera/view/PreviewView;", "previewView", "Landroidx/camera/view/PreviewView$ScaleType;", "scaleType", "", "analyze", "(Landroid/graphics/Bitmap;Landroidx/camera/view/PreviewView;Landroidx/camera/view/PreviewView$ScaleType;)V", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "frameSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionImageAnalyzer implements ImageAnalyzer<MotionImage> {

    @NotNull
    private final PublishSubject frameSubject = ch.qos.logback.core.util.a.n("create(...)");

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer
    public void analyze(@NotNull Bitmap image, @NotNull PreviewView previewView, @NotNull PreviewView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.frameSubject.onNext(new MotionImage(image, OnfidoRectF.INSTANCE.toOnfidoRectF(previewView)));
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer
    @NotNull
    public Observable observeFrame() {
        Observable observableHide = this.frameSubject.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }
}
