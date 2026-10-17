package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.camera.view.PreviewView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.utils.ImageUtilsExtKt;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rim.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/DefaultImageAnalyzer;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalyzer;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "<init>", "()V", "Landroid/graphics/Bitmap;", "image", "Landroidx/camera/view/PreviewView;", "previewView", "getBitmapForFitCenter", "(Landroid/graphics/Bitmap;Landroidx/camera/view/PreviewView;)Landroid/graphics/Bitmap;", "getBitmapForFillCenter", "Lio/reactivex/rxjava3/core/Observable;", "observeFrame", "()Lio/reactivex/rxjava3/core/Observable;", "Landroidx/camera/view/PreviewView$ScaleType;", "scaleType", "", "analyze", "(Landroid/graphics/Bitmap;Landroidx/camera/view/PreviewView;Landroidx/camera/view/PreviewView$ScaleType;)V", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "imageAnalysisFrameSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultImageAnalyzer implements ImageAnalyzer<OnfidoImage> {

    @NotNull
    private final BehaviorSubject imageAnalysisFrameSubject;

    public DefaultImageAnalyzer() {
        BehaviorSubject behaviorSubjectC = BehaviorSubject.c();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectC, "create(...)");
        this.imageAnalysisFrameSubject = behaviorSubjectC;
    }

    private final Bitmap getBitmapForFillCenter(Bitmap image, PreviewView previewView) {
        Bitmap bitmapCreateBitmap;
        if (previewView.getWidth() <= 0 || previewView.getHeight() <= 0) {
            return image;
        }
        float width = previewView.getWidth() / previewView.getHeight();
        if (width > image.getWidth() / image.getHeight()) {
            int iC = d.c((image.getWidth() / width) / 2) * 2;
            bitmapCreateBitmap = Bitmap.createBitmap(image, 0, (image.getHeight() - iC) / 2, image.getWidth(), iC);
        } else {
            int iC2 = d.c((image.getHeight() * width) / 2) * 2;
            bitmapCreateBitmap = Bitmap.createBitmap(image, (image.getWidth() - iC2) / 2, 0, iC2, image.getHeight());
        }
        Intrinsics.h(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    private final Bitmap getBitmapForFitCenter(Bitmap image, PreviewView previewView) {
        float width = previewView.getWidth() / previewView.getHeight();
        if (width > image.getWidth() / image.getHeight()) {
            int iC = d.c((image.getHeight() * width) / 2) * 2;
            int width2 = (iC - image.getWidth()) / 2;
            int height = image.getHeight();
            Bitmap.Config config = image.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Intrinsics.h(config);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, height, config);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
            new Canvas(bitmapCreateBitmap).drawBitmap(image, width2, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            return bitmapCreateBitmap;
        }
        int iC2 = d.c((image.getWidth() / width) / 2) * 2;
        int height2 = (iC2 - image.getHeight()) / 2;
        int width3 = image.getWidth();
        Bitmap.Config config2 = image.getConfig();
        if (config2 == null) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        Intrinsics.h(config2);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width3, iC2, config2);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(width, height, config)");
        new Canvas(bitmapCreateBitmap2).drawBitmap(image, BitmapDescriptorFactory.HUE_RED, height2, (Paint) null);
        return bitmapCreateBitmap2;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer
    public void analyze(@NotNull Bitmap image, @NotNull PreviewView previewView, @NotNull PreviewView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Bitmap bitmapForFitCenter = scaleType == PreviewView.ScaleType.FIT_CENTER ? getBitmapForFitCenter(image, previewView) : getBitmapForFillCenter(image, previewView);
        float width = previewView.getWidth() / bitmapForFitCenter.getWidth();
        this.imageAnalysisFrameSubject.onNext(new OnfidoImage(ImageUtilsExtKt.toNV21(bitmapForFitCenter), bitmapForFitCenter.getWidth(), bitmapForFitCenter.getHeight(), 0, new OnfidoImage.CropRect(width, (int) ((-((int) previewView.getTranslationY())) / width), (int) ((-((int) previewView.getTranslationX())) / width), previewView.getWidth(), previewView.getHeight()), bitmapForFitCenter));
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer
    @NotNull
    public Observable observeFrame() {
        Observable observableHide = this.imageAnalysisFrameSubject.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }
}
