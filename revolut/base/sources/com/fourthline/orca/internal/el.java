package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class el implements lz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pf0 f28172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qo f28173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lz f28174c;
    private final Function0 d;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28177c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28177c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = el.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public el(pf0 worker, qo flowConfig, lz delegate, Function0 nfcScannerRequiredUseCase) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(nfcScannerRequiredUseCase, "nfcScannerRequiredUseCase");
        this.f28172a = worker;
        this.f28173b = flowConfig;
        this.f28174c = delegate;
        this.d = nfcScannerRequiredUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.lz.a r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.fourthline.orca.internal.el.a
            if (r0 == 0) goto L13
            r0 = r10
            com.fourthline.orca.internal.el$a r0 = (com.fourthline.orca.internal.el.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.el$a r0 = new com.fourthline.orca.internal.el$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f28177c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r9 = r0.f28175a
            com.fourthline.orca.internal.lz$a r9 = (com.fourthline.orca.internal.lz.a) r9
            yhm.o.b(r10)
            yhm.m r10 = (yhm.m) r10
            java.lang.Object r9 = r10.f314193a
            return r9
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.f28176b
            com.fourthline.orca.internal.lz$c$c r9 = (com.fourthline.orca.internal.lz.c.C0245c) r9
            java.lang.Object r0 = r0.f28175a
            com.fourthline.orca.internal.lz$a r0 = (com.fourthline.orca.internal.lz.a) r0
            yhm.o.b(r10)
            yhm.m r10 = (yhm.m) r10
            java.lang.Object r10 = r10.f314193a
            goto L8f
        L4a:
            yhm.o.b(r10)
            kotlin.jvm.functions.Function0 r10 = r8.d
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r2 = 0
            if (r10 == 0) goto Lb2
            com.fourthline.orca.internal.lz$c$c r9 = new com.fourthline.orca.internal.lz$c$c
            com.fourthline.orca.internal.nd0 r10 = new com.fourthline.orca.internal.nd0
            com.fourthline.orca.internal.qo r3 = r8.f28173b
            com.fourthline.orca.internal.iz r3 = r3.d()
            com.fourthline.orca.internal.qo r5 = r8.f28173b
            int r5 = r5.f()
            com.fourthline.orca.internal.qo r6 = r8.f28173b
            boolean r6 = r6.k()
            com.fourthline.orca.internal.qo r7 = r8.f28173b
            com.fourthline.orca.internal.km r7 = r7.g()
            r10.<init>(r3, r5, r6, r7)
            java.lang.String r3 = "nfc"
            r9.<init>(r3, r10)
            com.fourthline.orca.internal.pf0 r10 = r8.f28172a
            r0.f28175a = r2
            r0.f28176b = r9
            r0.e = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L8f
            goto Lbe
        L8f:
            yhm.m$a r0 = yhm.m.INSTANCE
            boolean r0 = r10 instanceof yhm.n
            if (r0 != 0) goto Laa
            com.fourthline.orca.internal.pf0$a r10 = (com.fourthline.orca.internal.pf0.a) r10     // Catch: java.lang.Throwable -> La3
            com.fourthline.orca.internal.lz$b r10 = new com.fourthline.orca.internal.lz$b     // Catch: java.lang.Throwable -> La3
            r10.<init>(r9)     // Catch: java.lang.Throwable -> La3
            yhm.m r9 = new yhm.m     // Catch: java.lang.Throwable -> La3
            r9.<init>(r10)     // Catch: java.lang.Throwable -> La3
            r10 = r9
            goto Laa
        La3:
            r9 = move-exception
            yhm.m$a r10 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r9)
        Laa:
            yhm.o.b(r10)
            yhm.m r10 = (yhm.m) r10
            java.lang.Object r9 = r10.f314193a
            return r9
        Lb2:
            com.fourthline.orca.internal.lz r10 = r8.f28174c
            r0.f28175a = r2
            r0.e = r3
            java.lang.Object r9 = r10.a(r9, r0)
            if (r9 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.el.a(com.fourthline.orca.internal.lz$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
