package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details;

import ang.f;
import dqd.j;
import kotlin.jvm.internal.Intrinsics;
import mqd.o;
import rqd.k;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f87757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f87758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f87759c;
    public final wzi.a d;
    public final k e;
    public final f f;

    public d(n walletInteractor, j detailsDestinationsProvider, o newIncomeSorterDestinationAvailabilityProvider, wzi.a incomeSorterInteractor, k incomeSorterTransactionProvider, f userInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(detailsDestinationsProvider, "detailsDestinationsProvider");
        Intrinsics.checkNotNullParameter(newIncomeSorterDestinationAvailabilityProvider, "newIncomeSorterDestinationAvailabilityProvider");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterTransactionProvider, "incomeSorterTransactionProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f87757a = walletInteractor;
        this.f87758b = detailsDestinationsProvider;
        this.f87759c = newIncomeSorterDestinationAvailabilityProvider;
        this.d = incomeSorterInteractor;
        this.e = incomeSorterTransactionProvider;
        this.f = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof aqd.e
            if (r0 == 0) goto L13
            r0 = r7
            aqd.e r0 = (aqd.e) r0
            int r1 = r0.f8332w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8332w = r1
            goto L18
        L13:
            aqd.e r0 = new aqd.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8332w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r5 = r7.f314193a
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            r0.f8332w = r3
            wzi.a r7 = r4.d
            etj.o r7 = (etj.o) r7
            java.lang.Object r5 = r7.e(r5, r6, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, java.lang.String r11, java.lang.Boolean r12, gim.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof aqd.h
            if (r0 == 0) goto L14
            r0 = r13
            aqd.h r0 = (aqd.h) r0
            int r1 = r0.f8345w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8345w = r1
        L12:
            r3 = r0
            goto L1a
        L14:
            aqd.h r0 = new aqd.h
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r3.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r3.f8345w
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            yhm.o.b(r13)
            yhm.m r13 = (yhm.m) r13
            java.lang.Object r10 = r13.f314193a
            return r10
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            yhm.o.b(r13)
            r3.f8345w = r2
            wzi.a r13 = r9.d
            r1 = r13
            etj.o r1 = (etj.o) r1
            r2 = 0
            r4 = r2
            r8 = r2
            r6 = r10
            r7 = r11
            r5 = r12
            java.lang.Object r10 = r1.p(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L4c
            return r0
        L4c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d.b(java.lang.String, java.lang.String, java.lang.Boolean, gim.c):java.lang.Object");
    }
}
