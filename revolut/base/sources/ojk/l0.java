package ojk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 extends q implements dli.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PricingPlanBEDrivenScreenContract$InputData f225827t;
    public final egk.e u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f225828w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(cli.n stateMapper, PricingPlanBEDrivenScreenContract$InputData inputData, egk.e plansUiInteractor, mkd.d slotManagerFeedExtension, q06.l deeplinkRouter, ajk.c bottomSheetNavigationResolver, ajk.b outOfAppNavigationProvider) {
        super(deeplinkRouter, slotManagerFeedExtension, bottomSheetNavigationResolver, outOfAppNavigationProvider, inputData.f103371b);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(plansUiInteractor, "plansUiInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationResolver, "bottomSheetNavigationResolver");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        this.f225827t = inputData;
        this.u = plansUiInteractor;
        this.v = new vii.b();
        this.f225828w = mra.d.b(this, new j0(new Data(null, null, true, 3, null), new a0(new y(r0.g()), new Data(null, null, false, 7, null), new b0(null))), stateMapper, null, false, 12);
    }

    @Override // ojk.q, yji.l
    public final void I1() {
        super.I1();
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.v, new ns9.h(continuation, this, 27)), null, null, new o95.c(this, continuation, 26), 3);
    }

    @Override // ojk.q
    public final akd.s I2() {
        return null;
    }

    @Override // ojk.q
    public final cli.y L2() {
        return this.f225828w;
    }

    @Override // ojk.q
    public final v M2(v vVar, a0 extraData) {
        j0 currentState = (j0) vVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return j0.c(currentState, null, extraData, 1);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f225828w;
    }

    @Override // ojk.c0
    public final void h0() {
        this.v.a();
    }
}
