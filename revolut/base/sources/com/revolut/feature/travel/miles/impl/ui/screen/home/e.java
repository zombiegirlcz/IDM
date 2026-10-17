package com.revolut.feature.travel.miles.impl.ui.screen.home;

import aig.j;
import aig.m;
import cli.g;
import cli.n;
import cli.y;
import i4b.f;
import kkf.x5;
import klf.l1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfg.o;
import md6.p;
import nyb.m0;
import oki.h;
import qr0.i;
import tsk.t;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements j {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f94351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m0 f94352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dyb.a f94353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f94354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a29.b f94355t;
    public final f u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f94356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f94357x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94358y;
    public final y z;

    public e(n stateMapper, t accountsInteractor, i agentsInteractor, m0 revPointsTransactionsInteractor, dyb.a kycCheckExtension, o milesOnboardingRepository, a29.b lifestyleBorderlessFooterFactory, f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(agentsInteractor, "agentsInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(kycCheckExtension, "kycCheckExtension");
        Intrinsics.checkNotNullParameter(milesOnboardingRepository, "milesOnboardingRepository");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = accountsInteractor;
        this.f94351p = agentsInteractor;
        this.f94352q = revPointsTransactionsInteractor;
        this.f94353r = kycCheckExtension;
        this.f94354s = milesOnboardingRepository;
        this.f94355t = lifestyleBorderlessFooterFactory;
        this.u = legalEntityContextProvider;
        this.v = new vii.b();
        this.f94356w = new vii.b();
        this.f94357x = new vii.b();
        this.f94358y = hx7.e.a(this, new ack.f(this, 18));
        this.z = mra.d.b(this, new aig.i(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new aig.n(0, this, continuation), new yi5.b(26));
        l.a1(this, yh5.b.e(q.Q(this.v, new m(0, this, continuation)), q.Q(this.f94357x, new m(2, this, continuation)), q.Q(this.f94356w, new m(1, this, continuation))), null, null, new aig.l(1, this, null), 3);
        l.a1(this, rd0.e.e(new x5(this.f94354s.f194909a.C0("IS_ONBOARDING_BANNER_CLOSED_KEY", Boolean.TYPE), 29), h0.f322473a, new l1(3, 12, continuation)), null, null, new a2g.q(this, continuation, 2), 3);
        l.a1(this, ((x29.b) this.f94355t).a(), null, null, new aig.l(2, this, null), 3);
        l.a1(this, this.u.j(new md6.q(p.MILES, false)), null, null, new aig.l(0, this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94358y;
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
