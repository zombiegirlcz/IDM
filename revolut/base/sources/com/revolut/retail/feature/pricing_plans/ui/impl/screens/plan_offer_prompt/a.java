package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import prk.o;
import umk.f;
import umk.j;
import vii.b;
import vkm.q;
import w4l.i;
import wik.m;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements j {
    public final PlanOfferPromptScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f103597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f103598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f103599r;

    public a(n stateMapper, PlanOfferPromptScreenContract$InputData inputData, m pricingPlanOffersInteractor) {
        Data data;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        this.o = inputData;
        this.f103597p = pricingPlanOffersInteractor;
        this.f103598q = new b(i.f294643c);
        if (inputData instanceof PlanOfferPromptScreenContract$InputData.ByOfferType) {
            data = new Data(null, null, true, 3, null);
        } else {
            if (!(inputData instanceof PlanOfferPromptScreenContract$InputData.ByPrefetchedOffer)) {
                throw new NoWhenBranchMatchedException();
            }
            data = new Data(((PlanOfferPromptScreenContract$InputData.ByPrefetchedOffer) inputData).f103594a, null, false, 6, null);
        }
        this.f103599r = d.b(this, new f(data), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (this.o instanceof PlanOfferPromptScreenContract$InputData.ByOfferType) {
            Continuation continuation = null;
            l.a1(this, o.w("PlanOfferPromptScreenModel", "observePlanOfferPrompt", q.Q(this.f103598q, new uec.d(continuation, this, 7))), null, null, new uf0.d(this, continuation, 19), 3);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f103599r;
    }
}
