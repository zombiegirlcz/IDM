package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes23.dex */
public final class ri implements s10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32742a = "DocumentDetectionDetector";

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32744b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f32744b = obj2;
            this.d |= Integer.MIN_VALUE;
            return ri.this.a(null, this);
        }
    }

    @Override // com.fourthline.orca.internal.s10
    public /* bridge */ void a() {
        super.a();
    }

    @Override // com.fourthline.orca.internal.s10
    public /* bridge */ void b() {
        super.b();
    }

    @Override // com.fourthline.orca.internal.s10
    public String getName() {
        return this.f32742a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.g51 r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.fourthline.orca.internal.ri.a
            if (r4 == 0) goto L13
            r4 = r5
            com.fourthline.orca.internal.ri$a r4 = (com.fourthline.orca.internal.ri.a) r4
            int r0 = r4.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.d = r0
            goto L18
        L13:
            com.fourthline.orca.internal.ri$a r4 = new com.fourthline.orca.internal.ri$a
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.f32744b
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r4 = r4.f32743a
            com.fourthline.orca.internal.g51 r4 = (com.fourthline.orca.internal.g51) r4
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L48
        L2b:
            r4 = move-exception
            goto L54
        L2d:
            r4 = move-exception
            goto L5e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            yhm.o.b(r5)
            r5 = 0
            r4.f32743a = r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r4.d = r2     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = skm.k0.b(r1, r4)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r4 != r0) goto L48
            return r0
        L48:
            com.fourthline.orca.internal.t10$b r4 = new com.fourthline.orca.internal.t10$b     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0 = 1048576000(0x3e800000, float:0.25)
            r4.<init>(r5, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            return r4
        L54:
            com.fourthline.orca.internal.t10$a r5 = new com.fourthline.orca.internal.t10$a
            java.lang.String r0 = r3.getName()
            r5.<init>(r0, r4)
            return r5
        L5e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ri.a(com.fourthline.orca.internal.g51, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
