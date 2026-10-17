package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.ra;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class va implements wd, t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k7 f37003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7 f37004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1 f37005c;
    private final List d;
    private Function1 e;
    private Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Function0 f37006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37007h;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f37010c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f37011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f37012h;
        Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f37013j;
        int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f37014l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f37015m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f37016n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f37017p;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f37016n = obj2;
            this.f37017p |= Integer.MIN_VALUE;
            return va.this.onImageReceived(null, this);
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function2 {
        public b(Object obj2) {
            super(2, 0, va.class, obj2, "onImageReceived", "onImageReceived(Landroid/media/Image;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Image image, Continuation<? super Unit> continuation) {
            return ((va) this.receiver).onImageReceived(image, continuation);
        }
    }

    public va(@NotNull k7 imageSource, @NotNull t7 isSteadyDataSource, @NotNull w1 compositeStep, @NotNull List<? extends qd> preconditions) {
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        Intrinsics.checkNotNullParameter(isSteadyDataSource, "isSteadyDataSource");
        Intrinsics.checkNotNullParameter(compositeStep, "compositeStep");
        Intrinsics.checkNotNullParameter(preconditions, "preconditions");
        this.f37003a = imageSource;
        this.f37004b = isSteadyDataSource;
        this.f37005c = compositeStep;
        this.d = preconditions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if (r14 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:35:0x00e1, B:37:0x00e7, B:38:0x00f1, B:40:0x00f5, B:41:0x0101, B:42:0x0106, B:20:0x0065, B:31:0x00b9, B:25:0x0086, B:27:0x008d, B:32:0x00c0, B:24:0x0070), top: B:46:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:35:0x00e1, B:37:0x00e7, B:38:0x00f1, B:40:0x00f5, B:41:0x0101, B:42:0x0106, B:20:0x0065, B:31:0x00b9, B:25:0x0086, B:27:0x008d, B:32:0x00c0, B:24:0x0070), top: B:46:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b8 -> B:31:0x00b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onImageReceived(android.media.Image r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) throws com.fourthline.vision.internal.ra.h {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.va.onImageReceived(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void onStepError(Throwable th10) throws ra.h {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(th10);
        if (!(th10 instanceof ra.f.a)) {
            if (th10 instanceof ra.d) {
                invokeStepUpdateOrComplete();
            } else {
                if (!(th10 instanceof ra)) {
                    th10.printStackTrace();
                    throw new ra.h(th10);
                }
                Function1<Try<? extends ud>, Unit> stepResultListener = getStepResultListener();
                if (stepResultListener != null) {
                    stepResultListener.invoke(TryKt.failure(th10));
                }
            }
        }
        if (this.f37005c.isCompleted()) {
            setCompleted(true);
        }
    }

    @Override // com.fourthline.vision.internal.wd
    public Function0<Unit> getOnCompletedListener() {
        return this.f37006g;
    }

    @Override // com.fourthline.vision.internal.wd
    @NotNull
    public sd getStepConfig() {
        return this.f37005c.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.wd
    public Function1<sd, Unit> getStepListener() {
        return this.f;
    }

    @Override // com.fourthline.vision.internal.wd
    public Function1<Try<? extends ud>, Unit> getStepResultListener() {
        return this.e;
    }

    @Override // com.fourthline.vision.internal.wd
    public int getStepsCount() {
        return this.f37005c.getStepsCount();
    }

    public final Unit invokeStepUpdateOrComplete() {
        if (this.f37005c.isCompleted()) {
            setCompleted(true);
            return Unit.f186387a;
        }
        Function1<sd, Unit> stepListener = getStepListener();
        if (stepListener == null) {
            return null;
        }
        stepListener.invoke(this.f37005c.getStepConfig());
        return Unit.f186387a;
    }

    @Override // com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.f37007h;
    }

    @Override // com.fourthline.vision.internal.wd
    public abstract void moveToNext();

    public abstract void onStepSuccess(@NotNull ud udVar);

    @Override // com.fourthline.vision.internal.wd
    public void resetAll() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        for (qd qdVar : this.d) {
            qdVar.stop();
            qdVar.start();
        }
        this.f37005c.reset();
    }

    @Override // com.fourthline.vision.internal.wd
    public abstract void resetCurrentStep();

    public void setCompleted(boolean z) {
        this.f37007h = z;
        if (z) {
            stop();
            Function0<Unit> onCompletedListener = getOnCompletedListener();
            if (onCompletedListener != null) {
                onCompletedListener.invoke();
            }
        }
    }

    @Override // com.fourthline.vision.internal.wd
    public void setOnCompletedListener(Function0<Unit> function0) {
        this.f37006g = function0;
    }

    @Override // com.fourthline.vision.internal.wd
    public void setStepListener(Function1<? super sd, Unit> function1) {
        this.f = function1;
    }

    @Override // com.fourthline.vision.internal.wd
    public void setStepResultListener(Function1<? super Try<? extends ud>, Unit> function1) {
        this.e = function1;
    }

    @Override // com.fourthline.vision.internal.wd, com.fourthline.vision.internal.pd
    public void start() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Function1<sd, Unit> stepListener = getStepListener();
        if (stepListener != null) {
            stepListener.invoke(getStepConfig());
        }
        this.f37005c.start();
        this.f37003a.subscribe(new b(this));
        this.f37003a.start();
        this.f37004b.start();
        Iterator it8 = this.d.iterator();
        while (it8.hasNext()) {
            ((qd) it8.next()).start();
        }
    }

    @Override // com.fourthline.vision.internal.wd, com.fourthline.vision.internal.pd
    public void stop() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Iterator it8 = this.d.iterator();
        while (it8.hasNext()) {
            ((qd) it8.next()).stop();
        }
        this.f37003a.subscribe(null);
        this.f37004b.stop();
        this.f37005c.stop();
    }
}
