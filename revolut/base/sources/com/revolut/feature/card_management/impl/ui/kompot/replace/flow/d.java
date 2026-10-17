package com.revolut.feature.card_management.impl.ui.kompot.replace.flow;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import oki.h;
import wsg.n;
import yki.i;
import z6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends h implements n03.b {
    public final CardReplaceFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f64894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uz2.b f64895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f64896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f64897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z03.c f64898t;
    public final z03.c u;
    public final i v;

    public d(CardReplaceFlowContract$InputData inputData, s cardsInteractor, uz2.b replaceCardInteractor, r0 jointAccountsInteractor, n walletsInteractor, z03.c retailCardCommandProvider, z03.c juniorCardCommandProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(replaceCardInteractor, "replaceCardInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(retailCardCommandProvider, "retailCardCommandProvider");
        Intrinsics.checkNotNullParameter(juniorCardCommandProvider, "juniorCardCommandProvider");
        this.o = inputData;
        this.f64894p = cardsInteractor;
        this.f64895q = replaceCardInteractor;
        this.f64896r = jointAccountsInteractor;
        this.f64897s = walletsInteractor;
        this.f64898t = retailCardCommandProvider;
        this.u = juniorCardCommandProvider;
        this.v = d8l.d.a(this, new r(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d r4, java.lang.String r5, wy2.d r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof n03.i
            if (r0 == 0) goto L13
            r0 = r7
            n03.i r0 = (n03.i) r0
            int r1 = r0.f210867x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210867x = r1
            goto L18
        L13:
            n03.i r0 = new n03.i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210867x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wy2.d r6 = r0.u
            yhm.o.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r7)
            r0.u = r6
            r0.f210867x = r3
            java.lang.Object r7 = r4.M2(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature.card_management.impl.ui.replace_reasons.provider.CardReplaceExpectationsData r7 = (com.revolut.feature.card_management.impl.ui.replace_reasons.provider.CardReplaceExpectationsData) r7
            yki.i r5 = r4.v
            com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$Step$Expectations r0 = new com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$Step$Expectations
            java.lang.String r1 = r7.f64928b
            com.revolut.retail.core.navigation.NaviCommand r7 = r7.f64929c
            r0.<init>(r6, r1, r7)
            r6 = 0
            r7 = 6
            oki.h.u2(r4, r5, r0, r6, r7)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.I2(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d, java.lang.String, wy2.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[PHI: r2 r7 r8 r9
      0x008c: PHI (r2v4 h93.f0) = (r2v3 h93.f0), (r2v6 h93.f0) binds: [B:28:0x0089, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r7v1 com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d) = 
      (r7v0 com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d)
      (r7v4 com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d)
     binds: [B:28:0x0089, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r8v6 com.revolut.core.model.account.AccountId) = (r8v5 com.revolut.core.model.account.AccountId), (r8v11 com.revolut.core.model.account.AccountId) binds: [B:28:0x0089, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r9v10 java.lang.Object) = (r9v9 java.lang.Object), (r9v1 java.lang.Object) binds: [B:28:0x0089, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof n03.j
            if (r0 == 0) goto L13
            r0 = r9
            n03.j r0 = (n03.j) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            n03.j r0 = new n03.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f210869x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L50
            if (r2 == r6) goto L4c
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d r7 = r0.f210868w
            yhm.o.b(r9)
            goto La2
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d r7 = r0.f210868w
            com.revolut.core.model.account.AccountId r8 = r0.v
            h93.f0 r2 = r0.u
            yhm.o.b(r9)
            goto L8c
        L45:
            h93.f0 r8 = r0.u
            yhm.o.b(r9)
            r2 = r8
            goto L7a
        L4c:
            yhm.o.b(r9)
            goto L69
        L50:
            yhm.o.b(r9)
            r0.z = r6
            z6l.s r9 = r7.f64894p
            vkm.d r8 = r9.u(r8)
            mmh.e r9 = new mmh.e
            r2 = 11
            r9.<init>(r8, r2)
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L69
            goto La1
        L69:
            h93.f0 r9 = (h93.f0) r9
            java.lang.String r8 = r9.u
            r0.u = r9
            r0.z = r5
            java.lang.Object r8 = r7.K2(r8, r0)
            if (r8 != r1) goto L78
            goto La1
        L78:
            r2 = r9
            r9 = r8
        L7a:
            r8 = r9
            com.revolut.core.model.account.AccountId r8 = (com.revolut.core.model.account.AccountId) r8
            r0.u = r2
            r0.v = r8
            r0.f210868w = r7
            r0.z = r4
            java.lang.Object r9 = r7.L2(r2, r8, r0)
            if (r9 != r1) goto L8c
            goto La1
        L8c:
            z03.c r9 = (z03.c) r9
            ufm.c r8 = r9.b(r2, r8)
            r9 = 0
            r0.u = r9
            r0.v = r9
            r0.f210868w = r7
            r0.z = r3
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto La2
        La1:
            return r1
        La2:
            java.lang.String r8 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.b(r9)
            r7.C1(r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.J2(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n03.e
            if (r0 == 0) goto L13
            r0 = r6
            n03.e r0 = (n03.e) r0
            int r1 = r0.f210860x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210860x = r1
            goto L18
        L13:
            n03.e r0 = new n03.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210860x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            g48.r0 r6 = r4.f64896r
            akg.n r6 = r6.c()
            r0.u = r5
            r0.f210860x = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            if (r6 == 0) goto L50
            java.lang.Object r6 = r6.getContent()
            n38.a r6 = (n38.a) r6
            goto L51
        L50:
            r6 = 0
        L51:
            if (r6 == 0) goto L63
            java.lang.String r0 = r6.f211924b
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r0, r5)
            if (r5 == 0) goto L63
            com.revolut.core.model.account.AccountId$Joint r5 = new com.revolut.core.model.account.AccountId$Joint
            java.lang.String r6 = r6.f211923a
            r5.<init>(r6, r0)
            return r5
        L63:
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.K2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(h93.f0 r6, com.revolut.core.model.account.AccountId r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof n03.g
            if (r0 == 0) goto L13
            r0 = r8
            n03.g r0 = (n03.g) r0
            int r1 = r0.f210862w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210862w = r1
            goto L18
        L13:
            n03.g r0 = new n03.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210862w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L63
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            boolean r7 = r7 instanceof com.revolut.core.model.account.AccountId.Joint
            if (r7 == 0) goto L37
            goto L6e
        L37:
            wsg.n r7 = r5.f64897s
            r8 = 0
            efm.r r7 = r7.f0(r8)
            n03.c r8 = new n03.c
            r2 = 0
            r8.<init>(r6, r2)
            mv5.h r6 = new mv5.h
            r2 = 24
            r6.<init>(r2)
            r2 = 2
            r4 = 0
            efm.r r6 = m70.a.h(r7, r8, r4, r6, r2)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f210862w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 == 0) goto L6e
            z03.c r6 = r5.u
            return r6
        L6e:
            z03.c r6 = r5.f64898t
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.L2(h93.f0, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        A1(new c(this, null), new yi5.b(25));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(java.lang.String r12, wy2.d r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.M2(java.lang.String, wy2.d, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
