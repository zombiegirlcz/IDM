package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.ImageUtilsExtKt;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import igm.o;
import igm.p;
import igm.q;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import pgm.p0;
import pgm.q0;
import pgm.r1;
import pgm.v;
import pgm.y;
import rim.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0016\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/DefaultFrameSampler;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "<init>", "(Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "Landroidx/camera/view/PreviewView;", "previewView", "Lio/reactivex/rxjava3/core/Flowable;", "Landroid/graphics/Bitmap;", "getPreviewBitmap", "(Landroidx/camera/view/PreviewView;)Lio/reactivex/rxjava3/core/Flowable;", "Lio/reactivex/rxjava3/core/Observable;", "observeFrame", "()Lio/reactivex/rxjava3/core/Observable;", "Landroid/widget/FrameLayout;", "Lkotlin/time/b;", "frameSamplingPeriod", "", "onPreviewAvailable-HG0u8IE", "(Landroid/widget/FrameLayout;J)V", "onPreviewAvailable", "close", "()V", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "imageAnalysisFrameSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultFrameSampler implements FrameSampler<OnfidoImage> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int DESIRED_FRAME_WIDTH = 480;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final BehaviorSubject imageAnalysisFrameSubject;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/DefaultFrameSampler$Companion;", "", "()V", "DESIRED_FRAME_WIDTH", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultFrameSampler(@NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.schedulersProvider = schedulersProvider;
        BehaviorSubject behaviorSubjectC = BehaviorSubject.c();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectC, "create(...)");
        this.imageAnalysisFrameSubject = behaviorSubjectC;
        this.compositeDisposable = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flowable getPreviewBitmap(final PreviewView previewView) {
        q qVar = new q() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.b
            @Override // igm.q
            public final Object get() {
                return DefaultFrameSampler.getPreviewBitmap$lambda$0(previewView);
            }
        };
        int i = Flowable.f163113a;
        r1 r1VarL = new ogm.q(qVar, 1).l(this.schedulersProvider.getComputation());
        Intrinsics.checkNotNullExpressionValue(r1VarL, "subscribeOn(...)");
        return r1VarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Publisher getPreviewBitmap$lambda$0(PreviewView previewView) {
        Intrinsics.checkNotNullParameter(previewView, "$previewView");
        Bitmap frame = CameraXExtKt.getFrame(previewView);
        if (frame != null) {
            int i = Flowable.f163113a;
            return new q0(frame);
        }
        int i2 = Flowable.f163113a;
        return y.f236178b;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler
    public void close() {
        this.compositeDisposable.d();
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler
    @NotNull
    public Observable observeFrame() {
        Observable observableSkip = this.imageAnalysisFrameSubject.hide().skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        return observableSkip;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler
    /* JADX INFO: renamed from: onPreviewAvailable-HG0u8IE */
    public void mo3668onPreviewAvailableHG0u8IE(@NotNull final FrameLayout previewView, long frameSamplingPeriod) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        long jF = kotlin.time.b.f(frameSamplingPeriod);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler computation = this.schedulersProvider.getComputation();
        int i = Flowable.f163113a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(computation, "scheduler is null");
        Disposable disposableI = new v(new p0(Math.max(0L, jF), Math.max(0L, jF), computation).b(new p() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler$onPreviewAvailable$1
            public final boolean test(long j2) {
                return ((fhm.a[]) this.this$0.imageAnalysisFrameSubject.f163127b.get()).length != 0;
            }

            @Override // igm.p
            public /* bridge */ /* synthetic */ boolean test(Object obj2) {
                return test(((Number) obj2).longValue());
            }
        }), 2).c(new o() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler$onPreviewAvailable$2
            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }

            @NotNull
            public final Publisher apply(long j2) {
                DefaultFrameSampler defaultFrameSampler = this.this$0;
                FrameLayout frameLayout = previewView;
                Intrinsics.i(frameLayout, "null cannot be cast to non-null type androidx.camera.view.PreviewView");
                return defaultFrameSampler.getPreviewBitmap((PreviewView) frameLayout);
            }
        }, 1, Flowable.f163113a).i(new g() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler$onPreviewAvailable$3
            @Override // igm.g
            public final void accept(@NotNull Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, DefaultFrameSampler.DESIRED_FRAME_WIDTH, d.c((DefaultFrameSampler.DESIRED_FRAME_WIDTH * (previewView.getHeight() / previewView.getWidth())) / 2) * 2, true);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                float width = previewView.getWidth() / bitmapCreateScaledBitmap.getWidth();
                this.imageAnalysisFrameSubject.onNext(new OnfidoImage(ImageUtilsExtKt.toNV21(bitmapCreateScaledBitmap), bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), 0, new OnfidoImage.CropRect(width, (int) ((-((int) previewView.getTranslationY())) / width), (int) ((-((int) previewView.getTranslationX())) / width), previewView.getWidth(), previewView.getHeight()), bitmapCreateScaledBitmap));
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler$onPreviewAvailable$4
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8, "Error on video frames subscription", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }
}
