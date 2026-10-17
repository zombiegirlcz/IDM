package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import com.fourthline.vision.internal.ra;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class b3 extends i {
    private final q7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private vd f35987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Try f35988h;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[vd.values().length];
            try {
                iArr[vd.f37019a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vd.f37021c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vd.f37020b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35991c;
        /* synthetic */ Object d;
        int f;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return b3.this.process((Image) null, (Continuation<? super Try<? extends ud>>) this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(@NotNull Function0<? extends List<? extends td>> subStepsFactory, @NotNull q7 resultsPostProcessor, VisionDynamicStepsEvaluator<Object> visionDynamicStepsEvaluator) {
        super(subStepsFactory, visionDynamicStepsEvaluator);
        Intrinsics.checkNotNullParameter(subStepsFactory, "subStepsFactory");
        Intrinsics.checkNotNullParameter(resultsPostProcessor, "resultsPostProcessor");
        this.f = resultsPostProcessor;
        this.f35988h = TryKt.failure(ra.f.a.f36780a);
    }

    private final void updateCompositeStepState(Try<? extends ud> r2) {
        vd vdVar;
        if (r2 instanceof Try.Failure) {
            Throwable exception = ((Try.Failure) r2).getException();
            vdVar = (!(exception instanceof ra.d) && (exception instanceof ra.a)) ? vd.f37020b : this.f35987g;
        } else {
            if (!(r2 instanceof Try.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            vdVar = vd.f37021c;
        }
        this.f35987g = vdVar;
    }

    @Override // com.fourthline.vision.internal.i, com.fourthline.vision.internal.w1
    public void moveToNext() throws ra.a {
        vd vdVar = this.f35987g;
        int i = vdVar == null ? -1 : a.$EnumSwitchMapping$0[vdVar.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                super.moveToNext();
                Unit unit = Unit.f186387a;
                if (isCompleted()) {
                    return;
                }
                this.f35987g = vd.f37019a;
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        super.stop();
        this.f35987g = vd.f37020b;
        throw new ra.a(pa.f36701l, null, 2, null);
    }

    @Override // com.fourthline.vision.internal.i, com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }

    @Override // com.fourthline.vision.internal.i, com.fourthline.vision.internal.w1
    public void reset() {
        super.reset();
        this.f35987g = null;
    }

    @Override // com.fourthline.vision.internal.i, com.fourthline.vision.internal.w1
    public void resetStep() throws ra.a {
        vd vdVar = this.f35987g;
        int i = vdVar == null ? -1 : a.$EnumSwitchMapping$0[vdVar.ordinal()];
        if (i == -1 || i == 1) {
            super.stop();
            this.f35987g = vd.f37020b;
            throw new ra.a(pa.f36702m, null, 2, null);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        super.stop();
        start();
    }

    @Override // com.fourthline.vision.internal.i, com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void start() {
        super.start();
        setCompleted(false);
        this.f35987g = vd.f37019a;
    }

    @Override // com.fourthline.vision.internal.i, com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        super.stop();
        if (this.f35987g == vd.f37019a) {
            this.f35987g = vd.f37020b;
        }
        setCompleted(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.vision.internal.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(@org.jetbrains.annotations.NotNull android.media.Image r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.ud>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.vision.internal.b3.b
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.vision.internal.b3$b r0 = (com.fourthline.vision.internal.b3.b) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.vision.internal.b3$b r0 = new com.fourthline.vision.internal.b3$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f35990b
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            java.lang.Object r8 = r0.f35989a
            android.media.Image r8 = (android.media.Image) r8
            yhm.o.b(r9)
            goto L8d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f35989a
            android.media.Image r8 = (android.media.Image) r8
            yhm.o.b(r9)
            goto L70
        L43:
            yhm.o.b(r9)
            com.fourthline.vision.internal.vd r9 = r7.f35987g
            r2 = -1
            if (r9 != 0) goto L4d
            r9 = r2
            goto L55
        L4d:
            int[] r6 = com.fourthline.vision.internal.b3.a.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r6[r9]
        L55:
            if (r9 == r2) goto L90
            if (r9 == r5) goto L65
            if (r9 == r4) goto L90
            r8 = 3
            if (r9 != r8) goto L5f
            goto L90
        L5f:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L65:
            r0.f35989a = r3
            r0.f = r5
            java.lang.Object r9 = super.process(r8, r0)
            if (r9 != r1) goto L70
            goto L8c
        L70:
            com.fourthline.core.internal.Try r9 = (com.fourthline.core.internal.Try) r9
            com.fourthline.vision.internal.q7 r8 = r7.f
            com.fourthline.vision.internal.sd r2 = r7.getStepConfig()
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r9, r2)
            r0.f35989a = r3
            r0.f35990b = r3
            r9 = 0
            r0.f35991c = r9
            r0.f = r4
            java.lang.Object r9 = r8.process(r5, r0)
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            com.fourthline.core.internal.Try r9 = (com.fourthline.core.internal.Try) r9
            goto L92
        L90:
            com.fourthline.core.internal.Try r9 = r7.f35988h
        L92:
            r7.updateCompositeStepState(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.b3.process(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ b3(Function0 function0, q7 q7Var, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, q7Var, (i & 4) != 0 ? null : visionDynamicStepsEvaluator);
    }
}
