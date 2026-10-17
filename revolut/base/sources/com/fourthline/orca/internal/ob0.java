package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ob0 implements oc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f31626a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31628b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31628b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = ob0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ob0(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f31626a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.oc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.oc1.a r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.fourthline.orca.internal.ob0.a
            if (r0 == 0) goto L13
            r0 = r15
            com.fourthline.orca.internal.ob0$a r0 = (com.fourthline.orca.internal.ob0.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ob0$a r0 = new com.fourthline.orca.internal.ob0$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f31628b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r14 = r0.f31627a
            com.fourthline.orca.internal.oc1$a r14 = (com.fourthline.orca.internal.oc1.a) r14
            yhm.o.b(r15)
            yhm.m r15 = (yhm.m) r15
            java.lang.Object r14 = r15.f314193a
            goto L71
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            yhm.o.b(r15)
            com.fourthline.orca.internal.ib0 r15 = r13.f31626a
            java.lang.String r14 = r14.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "/v1/onboarding/verifications/"
            r2.<init>(r4)
            r2.append(r14)
            java.lang.String r14 = "/completeOnboarding"
            r2.append(r14)
            java.lang.String r7 = r2.toString()
            com.fourthline.orca.internal.ab0$b r6 = com.fourthline.orca.internal.ab0.b.f26760b
            java.util.Map r8 = com.fourthline.orca.internal.bx.a()
            com.fourthline.orca.internal.ab0$a r4 = new com.fourthline.orca.internal.ab0$a
            r11 = 48
            r12 = 0
            java.lang.String r5 = "workflow_complete_onboarding"
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r14 = 0
            r0.f31627a = r14
            r0.d = r3
            java.lang.Object r14 = r15.a(r4, r0)
            if (r14 != r1) goto L71
            return r1
        L71:
            java.lang.Throwable r15 = yhm.m.a(r14)
            if (r15 != 0) goto Lab
            com.fourthline.orca.internal.eb0 r14 = (com.fourthline.orca.internal.eb0) r14
            boolean r15 = com.fourthline.orca.internal.fb0.f(r14)
            if (r15 == 0) goto L82
            com.fourthline.orca.internal.oc1$b$a r14 = com.fourthline.orca.internal.oc1.b.a.f31643a
            return r14
        L82:
            boolean r15 = com.fourthline.orca.internal.fb0.e(r14)
            if (r15 == 0) goto L8f
            com.fourthline.orca.internal.re1$c r14 = com.fourthline.orca.internal.re1.c.f32706a
            yhm.n r14 = yhm.o.a(r14)
            return r14
        L8f:
            com.fourthline.orca.internal.re1$b r15 = new com.fourthline.orca.internal.re1$b
            int r14 = r14.d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NetworkUploadIdvCompleteOnboardingWorker."
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            yhm.n r14 = yhm.o.a(r15)
            return r14
        Lab:
            com.fourthline.orca.internal.re1 r14 = com.fourthline.orca.internal.se1.a(r15)
            yhm.n r14 = yhm.o.a(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ob0.a(com.fourthline.orca.internal.oc1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
