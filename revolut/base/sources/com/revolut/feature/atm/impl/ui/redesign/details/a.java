package com.revolut.feature.atm.impl.ui.redesign.details;

import cli.y;
import com.revolut.data.model.Data;
import cqh.m;
import ej6.x;
import ek2.o;
import ffk.j;
import ffk.t;
import hng.g;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import m72.b;
import mra.d;
import oki.h;
import tk2.p;
import ukm.q;
import uw1.c;
import vc.s;
import vkm.j2;
import wsg.n;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements ek2.a {
    public boolean A;
    public final q B;
    public final m C;
    public final com.revolut.kompot.navigable.vc.modal.a D;
    public final y E;
    public final dj3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f63164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f63165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f63166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f63167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ang.f f63168t;
    public final l61.a u;
    public final n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final til.m f63169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f63170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gte.a f63171y;
    public final j2 z;

    public a(AtmDetailsBottomSheetContract$InputData inputData, ek2.t statesMapper, dj3.a chooserScreenCommandsFactory, t pricingPlanInteractor, j pricingPlanLimitsInteractor, c apmFeatureChecker, f revolutCardsInteractor, ang.f userInteractor, l61.a userCompanyInteractor, n walletInteractor, til.m workflowFlowDestinationProvider, p atmCoordinator, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statesMapper, "statesMapper");
        Intrinsics.checkNotNullParameter(chooserScreenCommandsFactory, "chooserScreenCommandsFactory");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanLimitsInteractor, "pricingPlanLimitsInteractor");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        Intrinsics.checkNotNullParameter(atmCoordinator, "atmCoordinator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = chooserScreenCommandsFactory;
        this.f63164p = pricingPlanInteractor;
        this.f63165q = pricingPlanLimitsInteractor;
        this.f63166r = apmFeatureChecker;
        this.f63167s = revolutCardsInteractor;
        this.f63168t = userInteractor;
        this.u = userCompanyInteractor;
        this.v = walletInteractor;
        this.f63169w = workflowFlowDestinationProvider;
        this.f63170x = atmCoordinator;
        this.f63171y = featureToggleInteractor;
        this.z = b.y(null, null, true, 3, null);
        this.A = true;
        q qVarA = s.a(-2, null, null, 6);
        this.B = qVarA;
        this.C = new m(vkm.q.K(qVarA), this, 26);
        this.D = e.a(this, new eh3.s(this, 9));
        this.E = d.b(this, new ek2.b(inputData.f63155a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, false, false, false), statesMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        p pVar = this.f63170x;
        Continuation continuation = null;
        l.a1(this, new dfj.f(pVar.f, 12), null, null, new o(this, continuation, 0), 3);
        l.a1(this, vkm.q.q(pVar.f271850j), null, null, new o(this, continuation, 5), 3);
        l2(new ebg.o(this, continuation, 12), new yi5.b(26));
        l.a1(this, this.f63168t.j(w4l.h.f294642c), null, null, new o(this, continuation, 2), 3);
        l.a1(this, rd0.e.b(g.b(((ang.b) this.u).f7765a)), null, null, new o(this, continuation, 1), 3);
        t tVar = this.f63164p;
        l.a1(this, rd0.e.b(tVar.q()), null, null, new eif.j(this, continuation, 7), 3);
        l.a1(this, rd0.e.b(tVar.t(false)), null, null, new o(this, continuation, 3), 3);
        l.a1(this, vkm.q.Q(this.z, new dz6.n(continuation, this, 13)), null, null, new o(this, continuation, 4), 3);
        l.a1(this, nim.a.v(rd0.e.b(osg.b.k(this.v, false, 2)), new x(17)), null, null, new ek2.m(this, null), 3);
    }

    public final void I2() {
        y yVar = this.E;
        C1(u0.b(((ri3.a) this.o).a(((ek2.b) ((j2) yVar.f22677a).getValue()).f126924a.e, ((ek2.b) ((j2) yVar.f22677a).getValue()).f126924a.f)));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
