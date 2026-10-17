package com.revolut.feature.joint.impl.ui.withdraw;

import a83.o0;
import ang.f;
import cli.g;
import cli.y;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m58.i;
import m58.p;
import mra.d;
import oki.h;
import rea.m;
import vkm.q;
import vkm.z1;
import wsg.n;
import x8k.c;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements m58.b {
    public final y A;
    public final JointWithdrawContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f76608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f76609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f76610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f76611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f76612t;
    public final wj0.a u;
    public final z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f76613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f76614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f76615y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public b(JointWithdrawContract$InputData inputData, w80.b amountFormatter, n walletInteractor, c transferInteractor, m pocketDetailsInteractor, f userInteractor, wj0.a idempotencyKeyHolder, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f76608p = amountFormatter;
        this.f76609q = walletInteractor;
        this.f76610r = transferInteractor;
        this.f76611s = pocketDetailsInteractor;
        this.f76612t = userInteractor;
        this.u = idempotencyKeyHolder;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.v = q.b(0, 2, fVar);
        this.f76613w = q.b(0, 2, fVar);
        this.f76614x = q.b(0, 2, fVar);
        this.f76615y = q.b(0, 2, fVar);
        this.z = e.a(this, new lp2.c(this, 26));
        this.A = d.b(this, new m58.a(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.joint.impl.ui.withdraw.b r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.withdraw.b.I2(com.revolut.feature.joint.impl.ui.withdraw.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        this.u.a("payments_peer_to_peer_transfer");
        H2(this.A, new i(this, 1));
        Continuation continuation = null;
        l.a1(this, this.f76613w, null, null, new m58.m(this, null, 0), 3);
        m58.m mVar = new m58.m(this, null, 1);
        z1 z1Var = this.v;
        l.a1(this, z1Var, null, null, mVar, 3);
        m58.m mVar2 = new m58.m(this, null, 2);
        z1 z1Var2 = this.f76614x;
        l.a1(this, z1Var2, null, null, mVar2, 3);
        l.a1(this, this.f76615y, null, null, new m58.m(this, null, 3), 3);
        l2(new lr.l(this, this.o.f76604a, continuation, 13), new yi5.b(26));
        l.a1(this, new t38.e(z1Var2, 24, z1Var, new o0(3, 12, continuation)), null, null, new a(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable J2(io3.d r5, xi0.b r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof m58.j
            if (r0 == 0) goto L13
            r0 = r7
            m58.j r0 = (m58.j) r0
            int r1 = r0.f202861w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202861w = r1
            goto L18
        L13:
            m58.j r0 = new m58.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202861w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            if (r5 != 0) goto L67
            io3.l r5 = io3.l.CURRENT
            com.revolut.core.model.account.AccountId$Personal r7 = com.revolut.core.model.account.AccountId.Personal.f51414a
            rea.m r2 = r4.f76611s
            ufm.i r5 = r2.b(r7, r5, r6)
            m58.i r6 = new m58.i
            r7 = 0
            r6.<init>(r4, r7)
            m30.b r7 = new m30.b
            r2 = 22
            r7.<init>(r2, r6)
            ufm.i r6 = new ufm.i
            r2 = 0
            r6.<init>(r5, r7, r2)
            java.lang.String r5 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            r0.f202861w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            io3.d r7 = (io3.d) r7
            return r7
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.withdraw.b.J2(io3.d, xi0.b, gim.c):java.io.Serializable");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final g getState() {
        return this.A;
    }
}
