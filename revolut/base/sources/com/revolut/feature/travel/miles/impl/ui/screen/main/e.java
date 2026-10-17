package com.revolut.feature.travel.miles.impl.ui.screen.main;

import cli.g;
import cli.n;
import cli.y;
import eh3.s;
import eig.l;
import eig.p;
import eig.q;
import i4b.f;
import kkf.x5;
import klf.l1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfg.o;
import nyb.k;
import nyb.m0;
import oki.h;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements l {
    public final vii.b A;
    public final vii.b B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final y D;
    public final vfg.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f94370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vfg.e f94371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gfg.c f94372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m0 f94373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f94374t;
    public final dyb.a u;
    public final o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a29.b f94375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final bgg.a f94376x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f94377y;
    public final vii.b z;

    public e(n stateMapper, vfg.d accountsInteractor, j60.a bottomDialog, vfg.e airlinesInteractor, gfg.c transactionsPagingInteractor, m0 revPointsTransactionsInteractor, k revPointsInteractor, dyb.a kycCheckExtension, o milesOnboardingRepository, a29.b lifestyleBorderlessFooterFactory, bgg.a accountUnlinkingControllerModelExtension, f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(airlinesInteractor, "airlinesInteractor");
        Intrinsics.checkNotNullParameter(transactionsPagingInteractor, "transactionsPagingInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(kycCheckExtension, "kycCheckExtension");
        Intrinsics.checkNotNullParameter(milesOnboardingRepository, "milesOnboardingRepository");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        Intrinsics.checkNotNullParameter(accountUnlinkingControllerModelExtension, "accountUnlinkingControllerModelExtension");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = accountsInteractor;
        this.f94370p = bottomDialog;
        this.f94371q = airlinesInteractor;
        this.f94372r = transactionsPagingInteractor;
        this.f94373s = revPointsTransactionsInteractor;
        this.f94374t = revPointsInteractor;
        this.u = kycCheckExtension;
        this.v = milesOnboardingRepository;
        this.f94375w = lifestyleBorderlessFooterFactory;
        this.f94376x = accountUnlinkingControllerModelExtension;
        this.f94377y = legalEntityContextProvider;
        this.z = new vii.b();
        this.A = new vii.b();
        this.B = new vii.b();
        this.C = hx7.e.a(this, new s(this, 5));
        this.D = mra.d.b(this, new eig.k(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new q(0, this, continuation), new yi5.b(26));
        wkm.l lVarQ = vkm.q.Q(this.z, new p(0, this, continuation));
        wkm.l lVarQ2 = vkm.q.Q(this.B, new p(2, this, continuation));
        wkm.l lVarQ3 = vkm.q.Q(this.A, new p(1, this, continuation));
        vkm.d dVarB = rd0.e.b(this.f94374t.c(false));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, yh5.b.g(lVarQ, lVarQ2, lVarQ3, rd0.e.n(dVarB, h0Var)), null, null, new eig.o(1, this, null), 3);
        yji.l.a1(this, rd0.e.e(new x5(this.v.f194909a.C0("IS_ONBOARDING_BANNER_CLOSED_KEY", Boolean.TYPE), 29), h0Var, new l1(3, 12, continuation)), null, null, new a2g.q(this, continuation, 14), 3);
        yji.l.a1(this, ((x29.b) this.f94375w).a(), null, null, new eig.o(2, this, null), 3);
        yji.l.a1(this, this.f94377y.j(new md6.q(md6.p.MILES, false)), null, null, new eig.o(0, this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    @Override // cli.z
    public final g getState() {
        return this.D;
    }
}
