package com.revolut.feature.external_accounts.impl.domain.open_banking_brazil;

import kotlin.jvm.internal.Intrinsics;
import mp.p;
import wsg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf6.a f72410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f72411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f72412c;

    public b(lf6.a openBankingBrazilRepository, n walletInteractor, p streetModePaymentLocationInteractor) {
        Intrinsics.checkNotNullParameter(openBankingBrazilRepository, "openBankingBrazilRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(streetModePaymentLocationInteractor, "streetModePaymentLocationInteractor");
        this.f72410a = openBankingBrazilRepository;
        this.f72411b = walletInteractor;
        this.f72412c = streetModePaymentLocationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, java.lang.Boolean r14, java.util.Map r15, java.util.Map r16, gim.c r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof og6.b
            if (r1 == 0) goto L15
            r1 = r0
            og6.b r1 = (og6.b) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            og6.b r1 = new og6.b
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.f225040y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.A
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L51
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L34
            java.util.Map r13 = r1.f225039x
            java.util.Map r13 = (java.util.Map) r13
            java.util.Map r13 = r1.f225038w
            java.util.Map r13 = (java.util.Map) r13
            yhm.o.b(r0)
            return r0
        L34:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3c:
            java.util.Map r13 = r1.f225039x
            java.util.Map r13 = (java.util.Map) r13
            java.util.Map r14 = r1.f225038w
            r15 = r14
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Boolean r14 = r1.v
            java.lang.String r3 = r1.u
            yhm.o.b(r0)
            r10 = r13
            r7 = r3
        L4e:
            r8 = r14
            r9 = r15
            goto L7d
        L51:
            yhm.o.b(r0)
            wj0.b r0 = new wj0.b
            java.lang.String r3 = "OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY"
            r0.<init>(r3)
            mp.p r3 = r12.f72412c
            pfm.a r0 = r3.r(r0)
            r1.u = r13
            r1.v = r14
            r3 = r15
            java.util.Map r3 = (java.util.Map) r3
            r1.f225038w = r3
            r3 = r16
            java.util.Map r3 = (java.util.Map) r3
            r1.f225039x = r3
            r1.A = r5
            java.lang.Object r0 = nim.a.a(r0, r1)
            if (r0 != r2) goto L79
            goto La0
        L79:
            r7 = r13
            r10 = r16
            goto L4e
        L7d:
            r13 = 0
            r1.u = r13
            r1.v = r13
            r1.f225038w = r13
            r1.f225039x = r13
            r1.A = r4
            lf6.a r13 = r12.f72410a
            r6 = r13
            lf6.j r6 = (lf6.j) r6
            r6.getClass()
            lf6.d r5 = new lf6.d
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r5, r1)
            if (r13 != r2) goto La1
        La0:
            return r2
        La1:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b.a(java.lang.String, java.lang.Boolean, java.util.Map, java.util.Map, gim.c):java.lang.Object");
    }
}
