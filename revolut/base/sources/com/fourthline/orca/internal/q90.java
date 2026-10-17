package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q90 implements u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kh1 f32357a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32359b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f32359b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = q90.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public q90(kh1 workflowStatusWorker) {
        Intrinsics.checkNotNullParameter(workflowStatusWorker, "workflowStatusWorker");
        this.f32357a = workflowStatusWorker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.u6.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.q90.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.q90$a r0 = (com.fourthline.orca.internal.q90.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.q90$a r0 = new com.fourthline.orca.internal.q90$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32359b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f32358a
            com.fourthline.orca.internal.u6$a r6 = (com.fourthline.orca.internal.u6.a) r6
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r6 = r7.f314193a
            goto L51
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            yhm.o.b(r7)
            com.fourthline.orca.internal.kh1 r7 = r5.f32357a
            com.fourthline.orca.internal.kh1$a r2 = new com.fourthline.orca.internal.kh1$a
            java.lang.String r6 = r6.a()
            r2.<init>(r6)
            r0.f32358a = r4
            r0.d = r3
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.Throwable r7 = yhm.m.a(r6)
            if (r7 != 0) goto L77
            com.fourthline.orca.internal.kh1$b r6 = (com.fourthline.orca.internal.kh1.b) r6
            com.fourthline.orca.internal.hh1 r6 = r6.a()
            com.fourthline.orca.internal.h6 r6 = r6.a()
            if (r6 == 0) goto L69
            com.fourthline.orca.internal.u6$b r7 = new com.fourthline.orca.internal.u6$b
            r7.<init>(r6)
            return r7
        L69:
            com.fourthline.orca.bav.internal.error.BavError$Unexpected$Companion r6 = com.fourthline.orca.bav.internal.error.BavError.Unexpected.INSTANCE
            java.lang.String r7 = "NetworkBavStatusWorker.MissingBAVModuleStatus"
            r0 = 2
            com.fourthline.orca.bav.internal.error.BavError$Unexpected r6 = com.fourthline.orca.bav.internal.error.BavError.Unexpected.Companion.create$default(r6, r7, r4, r0, r4)
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L77:
            com.fourthline.orca.internal.re1 r6 = com.fourthline.orca.internal.se1.a(r7)
            yhm.n r6 = yhm.o.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.q90.a(com.fourthline.orca.internal.u6$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
