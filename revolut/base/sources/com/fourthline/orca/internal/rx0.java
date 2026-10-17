package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rx0 implements kx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kx0 f32859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yv0 f32860b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32863c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = rx0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public rx0(kx0 validateSelfieWorker, yv0 pollStatusWorker) {
        Intrinsics.checkNotNullParameter(validateSelfieWorker, "validateSelfieWorker");
        Intrinsics.checkNotNullParameter(pollStatusWorker, "pollStatusWorker");
        this.f32859a = validateSelfieWorker;
        this.f32860b = pollStatusWorker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.kx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.kx0.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.rx0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.rx0$a r0 = (com.fourthline.orca.internal.rx0.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.rx0$a r0 = new com.fourthline.orca.internal.rx0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f32862b
            com.fourthline.orca.internal.kx0$b r6 = (com.fourthline.orca.internal.kx0.b) r6
            java.lang.Object r6 = r0.f32861a
            com.fourthline.orca.internal.kx0$a r6 = (com.fourthline.orca.internal.kx0.a) r6
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L36
            yhm.m r7 = (yhm.m) r7     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r7.f314193a     // Catch: java.lang.Throwable -> L36
            goto L8a
        L36:
            r6 = move-exception
            goto L94
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f32861a
            com.fourthline.orca.internal.kx0$a r6 = (com.fourthline.orca.internal.kx0.a) r6
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r7 = r7.f314193a
            goto L5c
        L4c:
            yhm.o.b(r7)
            com.fourthline.orca.internal.kx0 r7 = r5.f32859a
            r0.f32861a = r6
            r0.f = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L5c
            goto L89
        L5c:
            yhm.m$a r2 = yhm.m.INSTANCE
            boolean r2 = r7 instanceof yhm.n
            if (r2 != 0) goto L9b
            com.fourthline.orca.internal.kx0$b r7 = (com.fourthline.orca.internal.kx0.b) r7     // Catch: java.lang.Throwable -> L36
            boolean r2 = r7 instanceof com.fourthline.orca.internal.kx0.b.C0240b     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L91
            com.fourthline.orca.internal.yv0 r7 = r5.f32860b     // Catch: java.lang.Throwable -> L36
            com.fourthline.orca.internal.yv0$a r2 = new com.fourthline.orca.internal.yv0$a     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r6.b()     // Catch: java.lang.Throwable -> L36
            com.fourthline.orca.internal.sx0 r4 = com.fourthline.orca.internal.sx0.f33155g     // Catch: java.lang.Throwable -> L36
            java.util.Set r4 = zhm.y0.b(r4)     // Catch: java.lang.Throwable -> L36
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r0.f32861a = r6     // Catch: java.lang.Throwable -> L36
            r0.f32862b = r6     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r0.f32863c = r6     // Catch: java.lang.Throwable -> L36
            r0.f = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L36
            if (r6 != r1) goto L8a
        L89:
            return r1
        L8a:
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L36
            com.fourthline.orca.internal.fv0$b r6 = (com.fourthline.orca.internal.fv0.b) r6     // Catch: java.lang.Throwable -> L36
            com.fourthline.orca.internal.kx0$b$b r7 = com.fourthline.orca.internal.kx0.b.C0240b.f30441a     // Catch: java.lang.Throwable -> L36
        L91:
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L36
            return r7
        L94:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L9b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.rx0.a(com.fourthline.orca.internal.kx0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
