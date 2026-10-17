package ksb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f189399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bnf.f f189400b;

    public c(com.revolut.domain.interactors.transactions.a transactionsInteractor, bnf.f mapper) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f189399a = transactionsInteractor;
        this.f189400b = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ksb.b
            if (r0 == 0) goto L13
            r0 = r13
            ksb.b r0 = (ksb.b) r0
            int r1 = r0.f189398w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189398w = r1
            goto L18
        L13:
            ksb.b r0 = new ksb.b
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189398w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L79
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            tof.r9 r5 = new tof.r9
            r5.<init>(r12)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r3)
            r9 = 0
            r10 = 26
            com.revolut.domain.interactors.transactions.a r4 = r11.f189399a
            r6 = 0
            r8 = 0
            ufm.i r12 = com.revolut.domain.interactors.transactions.a.b(r4, r5, r6, r7, r8, r9, r10)
            kpj.a r13 = new kpj.a
            r2 = 21
            r13.<init>(r2)
            ksb.a r2 = new ksb.a
            r4 = 0
            r2.<init>(r13, r4)
            ufm.i r13 = new ufm.i
            r4 = 1
            r13.<init>(r12, r2, r4)
            k65.d r12 = new k65.d
            bnf.f r2 = r11.f189400b
            r12.<init>(r2)
            ksb.a r2 = new ksb.a
            r2.<init>(r12, r4)
            ufm.i r12 = new ufm.i
            r12.<init>(r13, r2, r4)
            java.lang.String r13 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
            r0.f189398w = r3
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L79
            return r1
        L79:
            java.lang.String r12 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ksb.c.a(java.lang.String, gim.c):java.lang.Object");
    }
}
