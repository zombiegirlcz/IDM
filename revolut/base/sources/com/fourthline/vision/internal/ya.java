package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ya implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f37144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f37145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f37146c;
    private final Function1 d;
    private final Function1 e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f37148h;
    private td i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37149j;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37151b;
        int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f37151b = obj2;
            this.d |= Integer.MIN_VALUE;
            return ya.this.process((Image) null, (Continuation<? super Try<? extends ud>>) this);
        }
    }

    public ya(@NotNull Function0<? extends List<? extends td>> subStepsFactory, @NotNull Function0<? extends List<Integer>> randomnessLivenessSteps, @NotNull Function1<? super Integer, Unit> onLivenessStepSuccess, @NotNull Function1<? super Integer, Unit> onLivenessStepUpdate, @NotNull Function1<? super Integer, Unit> onRandomnessLivenessStepCountUpdate) {
        Intrinsics.checkNotNullParameter(subStepsFactory, "subStepsFactory");
        Intrinsics.checkNotNullParameter(randomnessLivenessSteps, "randomnessLivenessSteps");
        Intrinsics.checkNotNullParameter(onLivenessStepSuccess, "onLivenessStepSuccess");
        Intrinsics.checkNotNullParameter(onLivenessStepUpdate, "onLivenessStepUpdate");
        Intrinsics.checkNotNullParameter(onRandomnessLivenessStepCountUpdate, "onRandomnessLivenessStepCountUpdate");
        this.f37144a = subStepsFactory;
        this.f37145b = randomnessLivenessSteps;
        this.f37146c = onLivenessStepSuccess;
        this.d = onLivenessStepUpdate;
        this.e = onRandomnessLivenessStepCountUpdate;
        this.f37147g = -1;
        this.f37148h = (List) subStepsFactory.invoke();
        this.i = getSubSteps().get(this.f);
    }

    private final List<td> getSubSteps() {
        List<td> list = (List) this.f37144a.invoke();
        td tdVar = (td) this.f37148h.get(this.f);
        tdVar.stop();
        tdVar.start();
        this.f37148h = list;
        return list;
    }

    private final boolean randomnessLivenessEnabled() {
        return this.f37145b.invoke() != null;
    }

    public final int getCurrentRandomnessLivenessStepIndex() {
        return this.f37147g;
    }

    @Override // com.fourthline.vision.internal.w1, com.fourthline.vision.internal.td
    @NotNull
    public sd getStepConfig() {
        return this.i.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.w1
    public int getStepsCount() {
        return getSubSteps().size();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.f37149j;
    }

    @Override // com.fourthline.vision.internal.w1
    public void moveToNext() {
        this.i.stop();
        Unit unit = Unit.f186387a;
        if (zhm.d0.e0(this.f + 1, getSubSteps()) == null) {
            setCompleted(true);
            return;
        }
        List<td> subSteps = getSubSteps();
        int i = this.f + 1;
        this.f = i;
        td tdVar = subSteps.get(i);
        tdVar.start();
        this.i = tdVar;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }

    @Override // com.fourthline.vision.internal.w1
    public void reset() {
        this.i.stop();
        setCompleted(false);
        this.f = 0;
        this.i.start();
    }

    @Override // com.fourthline.vision.internal.w1
    public void resetStep() {
    }

    public void setCompleted(boolean z) {
        this.f37149j = z;
    }

    public final void setCurrentRandomnessLivenessStepIndex(int i) {
        this.f37147g = i;
        td tdVar = this.i;
        tdVar.stop();
        tdVar.start();
        this.d.invoke(Integer.valueOf(this.f37147g));
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        super.stop();
        Iterator<td> it8 = getSubSteps().iterator();
        while (it8.hasNext()) {
            it8.next().stop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(@org.jetbrains.annotations.NotNull android.media.Image r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.ud>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.vision.internal.ya.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.vision.internal.ya$a r0 = (com.fourthline.vision.internal.ya.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.ya$a r0 = new com.fourthline.vision.internal.ya$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37151b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.f37150a
            android.media.Image r6 = (android.media.Image) r6
            yhm.o.b(r7)
            goto L44
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            com.fourthline.vision.internal.td r7 = r5.i
            r0.f37150a = r3
            r0.d = r4
            java.lang.Object r7 = r7.process(r6, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            r6 = r7
            com.fourthline.core.internal.Try r6 = (com.fourthline.core.internal.Try) r6
            boolean r6 = r6.isSuccess()
            if (r6 == 0) goto Lc3
            com.fourthline.vision.internal.td r6 = r5.i
            com.fourthline.vision.internal.sd r6 = r6.getStepConfig()
            java.lang.Object r6 = r6.getStepType()
            com.fourthline.vision.selfie.SelfieScannerStep r0 = com.fourthline.vision.selfie.SelfieScannerStep.SELFIE
            if (r6 != r0) goto L89
            r5.moveToNext()
            boolean r6 = r5.randomnessLivenessEnabled()
            if (r6 == 0) goto Lc3
            kotlin.jvm.functions.Function1 r6 = r5.e
            kotlin.jvm.functions.Function0 r0 = r5.f37145b
            java.lang.Object r0 = r0.invoke()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L81
            int r0 = r0.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r6.invoke(r1)
            r6 = 0
            r5.setCurrentRandomnessLivenessStepIndex(r6)
            return r7
        L81:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "FL Developer error. Randomness suppose to be enabled here."
            r6.<init>(r7)
            throw r6
        L89:
            boolean r6 = r5.randomnessLivenessEnabled()
            if (r6 == 0) goto Lc0
            kotlin.jvm.functions.Function1 r6 = r5.f37146c
            int r0 = r5.f37147g
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r6.invoke(r1)
            kotlin.jvm.functions.Function0 r6 = r5.f37145b
            java.lang.Object r6 = r6.invoke()
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto Laf
            int r0 = r5.f37147g
            int r0 = r0 + r4
            java.lang.Object r6 = zhm.d0.e0(r0, r6)
            r3 = r6
            java.lang.Integer r3 = (java.lang.Integer) r3
        Laf:
            if (r3 == 0) goto Lbc
            int r6 = r5.f37147g
            int r0 = r6 + 1
            r5.setCurrentRandomnessLivenessStepIndex(r0)
            mo3.a.b(r6)
            return r7
        Lbc:
            r5.moveToNext()
            return r7
        Lc0:
            r5.moveToNext()
        Lc3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.ya.process(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
