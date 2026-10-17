package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_price_breakdown;

import aii.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_price_breakdown.PlanPriceBreakdownScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_price_breakdown.PlanPriceBreakdownScreenContract$InputData;
import hnk.b;
import hnk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.i0;
import qgk.z0;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_price_breakdown/PlanPriceBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lhnk/b;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanPriceBreakdownScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int U = 0;
    public final PlanPriceBreakdownScreenContract$InputData Q;
    public final CellDetailsDelegate R;
    public final Object S;
    public final Object T;

    public PlanPriceBreakdownScreen(PlanPriceBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = new CellDetailsDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: hnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPriceBreakdownScreen f154130b;

            {
                this.f154130b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanPriceBreakdownScreen planPriceBreakdownScreen = this.f154130b;
                switch (i2) {
                    case 0:
                        int i3 = PlanPriceBreakdownScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(planPriceBreakdownScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPriceBreakdownScreenContract$InputData planPriceBreakdownScreenContract$InputData = planPriceBreakdownScreen.Q;
                        planPriceBreakdownScreenContract$InputData.getClass();
                        return new z0(i0Var, planPriceBreakdownScreenContract$InputData);
                    default:
                        int i5 = PlanPriceBreakdownScreen.U;
                        return (c) ((z0) planPriceBreakdownScreen.S.getValue()).f246351c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: hnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPriceBreakdownScreen f154130b;

            {
                this.f154130b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanPriceBreakdownScreen planPriceBreakdownScreen = this.f154130b;
                switch (i22) {
                    case 0:
                        int i3 = PlanPriceBreakdownScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(planPriceBreakdownScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPriceBreakdownScreenContract$InputData planPriceBreakdownScreenContract$InputData = planPriceBreakdownScreen.Q;
                        planPriceBreakdownScreenContract$InputData.getClass();
                        return new z0(i0Var, planPriceBreakdownScreenContract$InputData);
                    default:
                        int i5 = PlanPriceBreakdownScreen.U;
                        return (c) ((z0) planPriceBreakdownScreen.S.getValue()).f246351c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getS() {
        return u.c(this.R);
    }
}
