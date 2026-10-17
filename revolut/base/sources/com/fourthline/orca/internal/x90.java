package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class x90 implements je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f34923a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34926c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34926c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = x90.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public x90(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f34923a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.je
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.je.a r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.fourthline.orca.internal.x90.a
            if (r0 == 0) goto L13
            r0 = r15
            com.fourthline.orca.internal.x90$a r0 = (com.fourthline.orca.internal.x90.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.x90$a r0 = new com.fourthline.orca.internal.x90$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f34926c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.f34925b
            com.fourthline.orca.internal.ab0 r14 = (com.fourthline.orca.internal.ab0) r14
            java.lang.Object r14 = r0.f34924a
            com.fourthline.orca.internal.je$a r14 = (com.fourthline.orca.internal.je.a) r14
            yhm.o.b(r15)
            yhm.m r15 = (yhm.m) r15
            java.lang.Object r14 = r15.f314193a
            goto L71
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            yhm.o.b(r15)
            java.lang.String r8 = r14.b()
            java.lang.String r5 = r14.b()
            java.lang.String r9 = r14.c()
            com.fourthline.orca.internal.je$a$a r10 = r14.a()
            com.fourthline.orca.internal.vz r4 = new com.fourthline.orca.internal.vz
            r11 = 6
            r12 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            com.fourthline.orca.internal.ab0 r14 = r4.c()
            boolean r15 = r14 instanceof com.fourthline.orca.internal.ab0.c
            if (r15 == 0) goto L85
            com.fourthline.orca.internal.ib0 r15 = r13.f34923a
            com.fourthline.orca.internal.ab0$c r14 = (com.fourthline.orca.internal.ab0.c) r14
            r2 = 0
            r0.f34924a = r2
            r0.f34925b = r2
            r0.e = r3
            java.lang.Object r14 = r15.a(r14, r0)
            if (r14 != r1) goto L71
            return r1
        L71:
            java.lang.Throwable r15 = yhm.m.a(r14)
            if (r15 != 0) goto L7c
            com.fourthline.orca.internal.eb0 r14 = (com.fourthline.orca.internal.eb0) r14
            com.fourthline.orca.internal.je$b r14 = com.fourthline.orca.internal.je.b.f29867a
            return r14
        L7c:
            com.fourthline.orca.internal.re1 r14 = com.fourthline.orca.internal.se1.a(r15)
            yhm.n r14 = yhm.o.a(r14)
            return r14
        L85:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "GenericDataUploadRequest must map to a multipart upload."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.x90.a(com.fourthline.orca.internal.je$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
