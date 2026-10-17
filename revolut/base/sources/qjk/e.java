package qjk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ojk.a0;
import ojk.b0;
import ojk.v;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends ojk.q implements dli.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PricingPlanBottomSheetBEDrivenScreenContract$InputData f246901t;
    public final q u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f246902w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cli.n stateMapper, q06.l deeplinkRouter, ajk.c bottomSheetNavigationResolver, mkd.d slotManagerFeedExtension, PricingPlanBottomSheetBEDrivenScreenContract$InputData inputData, q pricingPlanBottomSheetLayoutProvider, ajk.b outOfAppNavigationProvider) {
        super(deeplinkRouter, slotManagerFeedExtension, bottomSheetNavigationResolver, outOfAppNavigationProvider, inputData.f103377b);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationResolver, "bottomSheetNavigationResolver");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanBottomSheetLayoutProvider, "pricingPlanBottomSheetLayoutProvider");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        this.f246901t = inputData;
        this.u = pricingPlanBottomSheetLayoutProvider;
        this.v = mra.d.b(this, new c(new Data(null, null, true, 3, null), new a0(new ojk.y(r0.g()), new Data(null, null, true, 3, null), new b0(null))), stateMapper, null, false, 12);
        this.f246902w = new vii.b();
    }

    @Override // ojk.q, yji.l
    public final void I1() {
        super.I1();
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f246902w, new q7b.j(continuation, this, 16)), null, null, new qc3.c(this, continuation, 18), 3);
    }

    @Override // ojk.q
    public final akd.s I2() {
        return null;
    }

    @Override // ojk.q
    public final y L2() {
        return this.v;
    }

    @Override // ojk.q
    public final v M2(v vVar, a0 extraData) {
        c currentState = (c) vVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return c.c(currentState, null, extraData, 1);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }

    @Override // ojk.c0
    public final void h0() {
        this.f246902w.a();
    }
}
