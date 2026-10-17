package com.fourthline.vision.internal;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class k7 implements d2, CoroutineScope, pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageReader f36444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f36445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f36446c;
    private Function2 d;
    private Job e;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36449c;
        int d;
        final /* synthetic */ Image e;
        final /* synthetic */ k7 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Image image, k7 k7Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = image;
            this.f = k7Var;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new a(this.e, this.f, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws Exception {
            AutoCloseable autoCloseable;
            Throwable th10;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.d;
            if (i == 0) {
                yhm.o.b(obj2);
                Image image = this.e;
                if (image != null) {
                    try {
                        Function2 function2 = this.f.d;
                        if (function2 != null) {
                            this.f36447a = image;
                            this.f36448b = null;
                            this.f36449c = 0;
                            this.d = 1;
                            if (function2.invoke(image, this) == aVar) {
                                return aVar;
                            }
                        }
                        autoCloseable = image;
                    } catch (Throwable th11) {
                        autoCloseable = image;
                        th10 = th11;
                        throw th10;
                    }
                }
                return Unit.f186387a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            autoCloseable = (AutoCloseable) this.f36447a;
            try {
                yhm.o.b(obj2);
            } catch (Throwable th12) {
                th10 = th12;
                try {
                    throw th10;
                } catch (Throwable th13) {
                    mra.d.l(autoCloseable, th10);
                    throw th13;
                }
            }
            Unit unit = Unit.f186387a;
            mra.d.l(autoCloseable, null);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public k7(@NotNull ImageReader imageReader, @NotNull Handler handler, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(imageReader, "imageReader");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f36444a = imageReader;
        this.f36445b = handler;
        this.f36446c = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(k7 k7Var, ImageReader imageReader) {
        Objects.toString(imageReader);
        Image imageAcquireLatestImage = imageReader != null ? imageReader.acquireLatestImage() : null;
        Job job2 = k7Var.e;
        if (Intrinsics.f(job2 != null ? Boolean.valueOf(job2.d()) : null, Boolean.TRUE)) {
            if (imageAcquireLatestImage != null) {
                imageAcquireLatestImage.close();
            }
        } else {
            skm.a2 a2VarC = skm.e0.C(k7Var, k7Var.getF74819h(), null, new a(imageAcquireLatestImage, k7Var, null), 2);
            a2VarC.k(new eg(imageAcquireLatestImage, 4));
            k7Var.e = a2VarC;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit start$lambda$0$0$0(Image image, Throwable th10) {
        if (image != null) {
            image.close();
        }
        return Unit.f186387a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36446c;
    }

    @NotNull
    public final ImageReader getImageReader() {
        return this.f36444a;
    }

    @NotNull
    public final Surface getSurface() {
        Surface surface = this.f36444a.getSurface();
        Intrinsics.checkNotNullExpressionValue(surface, "getSurface(...)");
        return surface;
    }

    @Override // com.fourthline.vision.internal.pd
    public void start() {
        this.f36444a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: com.fourthline.vision.internal.ah
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                k7.start$lambda$0(this.f35974a, imageReader);
            }
        }, this.f36445b);
    }

    @Override // com.fourthline.vision.internal.pd
    public void stop() {
        Job job2 = this.e;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36444a.setOnImageAvailableListener(null, null);
    }

    @Override // com.fourthline.vision.internal.d2
    public void subscribe(Function2<? super Image, ? super Continuation<? super Unit>, ? extends Object> function2) {
        Objects.toString(function2);
        this.d = function2;
    }

    @Override // com.fourthline.vision.internal.d2
    public Image get() {
        return this.f36444a.acquireLatestImage();
    }
}
