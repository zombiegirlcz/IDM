package com.revolut.retail.feature.esim.impl.ui.flows.get_plan;

import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlowContract$Step;
import dfj.w;
import dfj.z2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sfj.d;
import w4l.i;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends d implements vfj.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EsimGetPlanFlowContract$InputData f100633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f100634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f100635t;
    public final cej.b u;
    public final yki.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimGetPlanFlowContract$InputData inputData, w esimDataPlansInteractor, gte.a featureToggleInteractor, cej.b mobilePlansFeatureAvailabilityInteractor, z2 esimRestrictionsInteractor) {
        FlowStep mobilePlanResubscribeCheckout;
        super(esimRestrictionsInteractor, b.f);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimDataPlansInteractor, "esimDataPlansInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        this.f100633r = inputData;
        this.f100634s = esimDataPlansInteractor;
        this.f100635t = featureToggleInteractor;
        this.u = mobilePlansFeatureAvailabilityInteractor;
        if (inputData instanceof EsimGetPlanFlowContract$InputData.Purchase) {
            EsimGetPlanFlowContract$InputData.Purchase purchase = (EsimGetPlanFlowContract$InputData.Purchase) inputData;
            mobilePlanResubscribeCheckout = new EsimGetPlanFlowContract$Step.SelectPlan(purchase.f100613a, purchase.f100614b, purchase.f100615c);
        } else if (inputData instanceof EsimGetPlanFlowContract$InputData.DataPlanCheckout) {
            EsimGetPlanFlowContract$InputData.DataPlanCheckout dataPlanCheckout = (EsimGetPlanFlowContract$InputData.DataPlanCheckout) inputData;
            mobilePlanResubscribeCheckout = new EsimGetPlanFlowContract$Step.Checkout(dataPlanCheckout.f100607a, dataPlanCheckout.f100608b);
        } else {
            if (!(inputData instanceof EsimGetPlanFlowContract$InputData.MobilePlanCheckout)) {
                throw new NoWhenBranchMatchedException();
            }
            EsimGetPlanFlowContract$InputData.MobilePlanCheckout mobilePlanCheckout = (EsimGetPlanFlowContract$InputData.MobilePlanCheckout) inputData;
            String str = mobilePlanCheckout.f100610a;
            String str2 = mobilePlanCheckout.f100611b;
            mobilePlanResubscribeCheckout = str2 != null ? new EsimGetPlanFlowContract$Step.MobilePlanResubscribeCheckout(str, str2) : new EsimGetPlanFlowContract$Step.MobilePlanCheckout(str, null, null);
        }
        this.v = cp5.d.a(this, mobilePlanResubscribeCheckout, f0.f322471a, new v48.d(this, 25));
    }

    public static void J2(c cVar, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        h.t2(cVar, cVar.v, new EsimGetPlanFlowContract$Step.MobilePlanCheckout(str, str2, str3), true, null, false, 12);
    }

    public final void I2(EsimPostCheckoutFlowContract$Step esimPostCheckoutFlowContract$Step) {
        yki.a aVar = this.v;
        h.r2(aVar);
        l.a1(this, c8g.a.D(this.f100634s.a(null, null, null, (7 & 8) != 0 ? w4l.h.f294642c : i.f294643c)), null, null, null, 7);
        h.t2(this, aVar, new EsimGetPlanFlowContract$Step.PostCheckout(esimPostCheckoutFlowContract$Step), false, null, false, 12);
        C2(a.C0610a.f100632a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
