package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.preview.PreviewBitmapHelper;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import igm.o;
import igm.q;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import pgm.p0;
import pgm.q0;
import pgm.r1;
import pgm.v;
import pgm.y;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0017\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionFrameSampler;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/preview/PreviewBitmapHelper;", "previewBitmapHelper", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "<init>", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/preview/PreviewBitmapHelper;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "Landroid/widget/FrameLayout;", "previewView", "Lio/reactivex/rxjava3/core/Flowable;", "Landroid/graphics/Bitmap;", "getPreviewBitmap", "(Landroid/widget/FrameLayout;)Lio/reactivex/rxjava3/core/Flowable;", "Lio/reactivex/rxjava3/core/Observable;", "observeFrame", "()Lio/reactivex/rxjava3/core/Observable;", "Lkotlin/time/b;", "frameSamplingPeriod", "", "onPreviewAvailable-HG0u8IE", "(Landroid/widget/FrameLayout;J)V", "onPreviewAvailable", "close", "()V", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/preview/PreviewBitmapHelper;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "frameSamplingSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionFrameSampler implements FrameSampler<MotionImage> {

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final PublishSubject frameSamplingSubject;

    @NotNull
    private final PreviewBitmapHelper previewBitmapHelper;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    public MotionFrameSampler(@NotNull PreviewBitmapHelper previewBitmapHelper, @NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(previewBitmapHelper, "previewBitmapHelper");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.previewBitmapHelper = previewBitmapHelper;
        this.schedulersProvider = schedulersProvider;
        this.compositeDisposable = new CompositeDisposable();
        this.frameSamplingSubject = ch.qos.logback.core.util.a.n("create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flowable getPreviewBitmap(final FrameLayout previewView) {
        q qVar = new q() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.a
            @Override // igm.q
            public final Object get() {
                return MotionFrameSampler.getPreviewBitmap$lambda$0(this.f49879a, previewView);
            }
        };
        int i = Flowable.f163113a;
        r1 r1VarL = new ogm.q(qVar, 1).l(this.schedulersProvider.getComputation());
        Intrinsics.checkNotNullExpressionValue(r1VarL, "subscribeOn(...)");
        return r1VarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Publisher getPreviewBitmap$lambda$0(MotionFrameSampler this$0, FrameLayout previewView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(previewView, "$previewView");
        Bitmap bitmap = this$0.previewBitmapHelper.getBitmap(previewView);
        if (bitmap != null) {
            int i = Flowable.f163113a;
            return new q0(bitmap);
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
        Observable observableHide = this.frameSamplingSubject.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler
    /* JADX INFO: renamed from: onPreviewAvailable-HG0u8IE, reason: not valid java name */
    public void mo3668onPreviewAvailableHG0u8IE(@NotNull final FrameLayout previewView, long frameSamplingPeriod) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        long jF = b.f(frameSamplingPeriod);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler computation = this.schedulersProvider.getComputation();
        int i = Flowable.f163113a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(computation, "scheduler is null");
        Disposable disposableI = new v(new p0(Math.max(0L, jF), Math.max(0L, jF), computation), 2).c(new o() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionFrameSampler$onPreviewAvailable$1
            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }

            @NotNull
            public final Publisher apply(long j2) {
                return this.this$0.getPreviewBitmap(previewView);
            }
        }, 1, Flowable.f163113a).i(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionFrameSampler$onPreviewAvailable$2
            @Override // igm.g
            public final void accept(@NotNull Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                this.this$0.frameSamplingSubject.onNext(new MotionImage(bitmap, OnfidoRectF.INSTANCE.toOnfidoRectF(bitmap)));
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionFrameSampler$onPreviewAvailable$3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e("Error on video frames subscription", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }
}
