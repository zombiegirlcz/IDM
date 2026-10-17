package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.ra;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class cd implements td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f36072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final td f36073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final td f36074c;
    private td d;
    private final Try e;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36077c;
        int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36077c = obj2;
            this.e |= Integer.MIN_VALUE;
            return cd.process$suspendImpl(cd.this, null, this);
        }
    }

    public cd(@NotNull m combinedTimeoutPrecondition, @NotNull td initialStepInteractor, @NotNull td afterTriggerStepInteractor) {
        Intrinsics.checkNotNullParameter(combinedTimeoutPrecondition, "combinedTimeoutPrecondition");
        Intrinsics.checkNotNullParameter(initialStepInteractor, "initialStepInteractor");
        Intrinsics.checkNotNullParameter(afterTriggerStepInteractor, "afterTriggerStepInteractor");
        this.f36072a = combinedTimeoutPrecondition;
        this.f36073b = initialStepInteractor;
        this.f36074c = afterTriggerStepInteractor;
        this.e = TryKt.failure(ra.f.a.f36780a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <SCANNER_STEP> java.lang.Object process$suspendImpl(com.fourthline.vision.internal.cd r5, android.media.Image r6, kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.ud>> r7) {
        /*
            boolean r0 = r7 instanceof com.fourthline.vision.internal.cd.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.vision.internal.cd$a r0 = (com.fourthline.vision.internal.cd.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.vision.internal.cd$a r0 = new com.fourthline.vision.internal.cd$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36077c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f36076b
            android.media.Image r5 = (android.media.Image) r5
            java.lang.Object r5 = r0.f36075a
            com.fourthline.vision.internal.cd r5 = (com.fourthline.vision.internal.cd) r5
            yhm.o.b(r7)
            goto L76
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r5 = r0.f36076b
            r6 = r5
            android.media.Image r6 = (android.media.Image) r6
            java.lang.Object r5 = r0.f36075a
            com.fourthline.vision.internal.cd r5 = (com.fourthline.vision.internal.cd) r5
            yhm.o.b(r7)
            goto L64
        L47:
            yhm.o.b(r7)
            boolean r7 = r5.isCompleted()
            if (r7 == 0) goto L53
            com.fourthline.core.internal.Try r5 = r5.e
            return r5
        L53:
            com.fourthline.vision.internal.m r7 = r5.f36072a
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r0.f36075a = r5
            r0.f36076b = r6
            r0.e = r4
            java.lang.Object r7 = r7.consume(r2, r0)
            if (r7 != r1) goto L64
            goto L75
        L64:
            com.fourthline.vision.internal.td r7 = r5.d
            if (r7 == 0) goto L7e
            r0.f36075a = r5
            r2 = 0
            r0.f36076b = r2
            r0.e = r3
            java.lang.Object r7 = r7.process(r6, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            com.fourthline.core.internal.Try r7 = (com.fourthline.core.internal.Try) r7
            if (r7 == 0) goto L7e
            r5.switchStepsIfTimeout(r7)
            return r7
        L7e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Processing had started before step started"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.cd.process$suspendImpl(com.fourthline.vision.internal.cd, android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void switchSteps() {
        td tdVar = this.d;
        if (tdVar != this.f36074c) {
            if (tdVar != null) {
                tdVar.stop();
            }
            td tdVar2 = this.f36074c;
            tdVar2.start();
            this.d = tdVar2;
        }
    }

    private final void switchStepsIfTimeout(Try<? extends ud> r3) {
        TryKt.handleError(r3, new eg(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchStepsIfTimeout$lambda$0(cd cdVar, Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        if (it8 instanceof ra.d) {
            cdVar.switchSteps();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.vision.internal.td
    @NotNull
    public sd getStepConfig() {
        sd stepConfig;
        td tdVar = this.d;
        return (tdVar == null || (stepConfig = tdVar.getStepConfig()) == null) ? this.f36073b.getStepConfig() : stepConfig;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        td tdVar = this.d;
        if (tdVar != null) {
            return tdVar.isCompleted();
        }
        return false;
    }

    public Object process(@NotNull Image image, @NotNull Continuation<? super Try<? extends ud>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void start() {
        this.f36072a.start();
        td tdVar = this.f36073b;
        this.d = tdVar;
        if (tdVar != null) {
            tdVar.start();
        }
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        this.f36072a.stop();
        td tdVar = this.d;
        if (tdVar != null) {
            tdVar.stop();
        }
        this.f36073b.stop();
        this.f36074c.stop();
    }

    @NotNull
    public String toString() {
        return getStepConfig().toString();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }
}
