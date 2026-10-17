package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes23.dex */
public final class w51 implements qs {

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34524b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34524b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = w51.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.qs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.qs.a r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.fourthline.orca.internal.w51.a
            if (r4 == 0) goto L13
            r4 = r5
            com.fourthline.orca.internal.w51$a r4 = (com.fourthline.orca.internal.w51.a) r4
            int r0 = r4.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.d = r0
            goto L18
        L13:
            com.fourthline.orca.internal.w51$a r4 = new com.fourthline.orca.internal.w51$a
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.f34524b
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r4 = r4.f34523a
            com.fourthline.orca.internal.qs$a r4 = (com.fourthline.orca.internal.qs.a) r4
            yhm.o.b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r5)
            r5 = 0
            r4.f34523a = r5
            r4.d = r2
            r1 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r4 = skm.k0.b(r1, r4)
            if (r4 != r0) goto L44
            return r0
        L44:
            yhm.m$a r4 = yhm.m.INSTANCE
            com.fourthline.orca.internal.qs$b$b r4 = com.fourthline.orca.internal.qs.b.C0274b.f32526a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.w51.a(com.fourthline.orca.internal.qs$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
