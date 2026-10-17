package com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f92105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3j.b f92106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f92107c;

    public c(gte.a featureToggleInteractor, d3j.b beneficiaryInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f92105a = featureToggleInteractor;
        this.f92106b = beneficiaryInteractor;
        this.f92107c = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof oof.b
            if (r0 == 0) goto L13
            r0 = r8
            oof.b r0 = (oof.b) r0
            int r1 = r0.f227096x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227096x = r1
            goto L18
        L13:
            oof.b r0 = new oof.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227096x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L60
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            if (r7 != 0) goto L38
            return r4
        L38:
            r8 = 0
            r2 = 5
            d3j.b r5 = r6.f92106b
            efm.r r8 = w2j.a.d(r5, r4, r8, r4, r2)
            ood.g0 r2 = new ood.g0
            r5 = 7
            r2.<init>(r5)
            efm.r r8 = m70.a.g(r8, r4, r2, r3)
            zhm.f0 r2 = zhm.f0.f322471a
            efm.d0 r8 = r8.first(r2)
            java.lang.String r2 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f227096x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L6b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r8.next()
            r1 = r0
            f5j.a r1 = (f5j.a) r1
            java.lang.String r1 = r1.E
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r1 == 0) goto L6b
            r4 = r0
        L81:
            f5j.a r4 = (f5j.a) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c.a(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(tof.w6 r6, tof.r1 r7, java.lang.String r8, klf.j1 r9, gim.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof oof.c
            if (r0 == 0) goto L13
            r0 = r10
            oof.c r0 = (oof.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            oof.c r0 = new oof.c
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f227099y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            boolean r6 = r0.f227098x
            tof.r1 r7 = r0.u
            yhm.o.b(r10)
            goto Lb1
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            boolean r6 = r0.f227097w
            java.lang.String r8 = r0.v
            tof.r1 r7 = r0.u
            yhm.o.b(r10)
            goto L8c
        L41:
            yhm.o.b(r10)
            gte.a r10 = r5.f92105a
            com.revolut.feature.payments.api.PaymentsToggles$ShowIncomingBankTransfer r2 = com.revolut.feature.payments.api.PaymentsToggles$ShowIncomingBankTransfer.f79165c
            boolean r10 = r10.a(r2)
            if (r10 == 0) goto L50
            goto Lbd
        L50:
            boolean r9 = r9.c()
            if (r9 == 0) goto L57
            goto Lbd
        L57:
            tof.w6 r9 = tof.w6.EXTERNAL_ACCOUNT
            tof.w6 r10 = tof.w6.OPEN_BANKING
            tof.w6[] r9 = new tof.w6[]{r9, r10}
            java.lang.String r10 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            java.util.Set r9 = kotlin.collections.d.y0(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r6 = zhm.d0.T(r9, r6)
            if (r6 != 0) goto L71
            goto Lbd
        L71:
            if (r7 != 0) goto L76
            if (r8 != 0) goto L76
            goto Lbd
        L76:
            ang.f r9 = r5.f92107c
            r10 = 0
            efm.d0 r9 = r9.f(r10)
            r0.u = r7
            r0.v = r8
            r0.f227097w = r6
            r0.A = r4
            java.lang.Object r10 = nim.a.b(r9, r0)
            if (r10 != r1) goto L8c
            goto Laf
        L8c:
            do3.n r10 = (do3.n) r10
            kotlin.jvm.internal.Intrinsics.h(r10)
            boolean r9 = te0.w.Z(r10)
            boolean r10 = te0.w.U(r10)
            if (r9 != 0) goto L9e
            if (r10 != 0) goto L9e
            goto Lbd
        L9e:
            r0.u = r7
            r10 = 0
            r0.v = r10
            r0.f227097w = r6
            r0.f227098x = r9
            r0.A = r3
            java.io.Serializable r10 = r5.a(r8, r0)
            if (r10 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            r6 = r9
        Lb1:
            f5j.a r10 = (f5j.a) r10
            if (r6 == 0) goto Lc0
            if (r10 == 0) goto Lbd
            com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State$Enabled r6 = new com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State$Enabled
            r6.<init>(r7, r10)
            return r6
        Lbd:
            com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State$Disabled r6 = com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State.Disabled.f92099a
            return r6
        Lc0:
            com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State$Enabled r6 = new com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State$Enabled
            r6.<init>(r7, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c.b(tof.w6, tof.r1, java.lang.String, klf.j1, gim.c):java.lang.Object");
    }
}
