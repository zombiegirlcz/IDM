package og4;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlowContract$InputData;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import nt4.f;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends t implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PlanSubscribeFlowContract$InputData f225027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yx3.a f225028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ffk.t f225029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zfk.c f225030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f225031t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PlanSubscribeFlowContract$InputData inputData, yx3.a planSubscribeInteractor, ffk.t pricingPlanInteractor, zfk.c planSubscribeControllerModel, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planSubscribeInteractor, "planSubscribeInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planSubscribeControllerModel, "planSubscribeControllerModel");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f225027p = inputData;
        this.f225028q = planSubscribeInteractor;
        this.f225029r = pricingPlanInteractor;
        this.f225030s = planSubscribeControllerModel;
        this.f225031t = d8l.d.a(this, new ob2.a(21));
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 19), new o9h.b(this, 21));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f225031t;
    }
}
