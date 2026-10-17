package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose;

import ajk.b;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import dnk.d;
import ffk.t;
import hx7.e;
import i4b.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import xif.k;
import xjl.g;
import xkk.j;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements j {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final egk.d f103471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f103472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f103473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f103474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f103475t;
    public final vii.b u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f103476w;

    public a(n stateMapper, d benefitIdsMapper, egk.d planBenefitsInteractor, t pricingPlanInteractor, f descriptionClickHandler, b outOfAppNavigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(benefitIdsMapper, "benefitIdsMapper");
        Intrinsics.checkNotNullParameter(planBenefitsInteractor, "planBenefitsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(descriptionClickHandler, "descriptionClickHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = benefitIdsMapper;
        this.f103471p = planBenefitsInteractor;
        this.f103472q = pricingPlanInteractor;
        this.f103473r = descriptionClickHandler;
        this.f103474s = outOfAppNavigationProvider;
        this.f103475t = featureToggleInteractor;
        this.u = new vii.b();
        this.v = e.a(this, new k(this, 5));
        this.f103476w = mra.d.b(this, new xkk.f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.u, new x18.e(continuation, this, 14)), null, null, new g(this, continuation, 4), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f103476w;
    }
}
