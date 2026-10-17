package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade;

import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.e0;
import qgk.i0;
import qji.b;
import te0.w;
import uhk.c;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luhk/c;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanDowngradeFlow extends ViewController<c> implements f {
    public final PlanDowngradeFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PlanDowngradeFlow(PlanDowngradeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: uhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeFlow f280259b;

            {
                this.f280259b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PlanDowngradeFlow planDowngradeFlow = this.f280259b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, planDowngradeFlow, (b) planDowngradeFlow.N.getValue());
                    case 1:
                        return (b) ((e0) ((vhk.a) this.f280259b.O.getValue())).f.get();
                    default:
                        PlanDowngradeFlow planDowngradeFlow2 = this.f280259b;
                        phm.a aVar = (phm.a) ue0.e.j(planDowngradeFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData = planDowngradeFlow2.K;
                        planDowngradeFlowContract$InputData.getClass();
                        return new e0(i0Var, planDowngradeFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: uhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeFlow f280259b;

            {
                this.f280259b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PlanDowngradeFlow planDowngradeFlow = this.f280259b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, planDowngradeFlow, (b) planDowngradeFlow.N.getValue());
                    case 1:
                        return (b) ((e0) ((vhk.a) this.f280259b.O.getValue())).f.get();
                    default:
                        PlanDowngradeFlow planDowngradeFlow2 = this.f280259b;
                        phm.a aVar = (phm.a) ue0.e.j(planDowngradeFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData = planDowngradeFlow2.K;
                        planDowngradeFlowContract$InputData.getClass();
                        return new e0(i0Var, planDowngradeFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: uhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeFlow f280259b;

            {
                this.f280259b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PlanDowngradeFlow planDowngradeFlow = this.f280259b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, planDowngradeFlow, (b) planDowngradeFlow.N.getValue());
                    case 1:
                        return (b) ((e0) ((vhk.a) this.f280259b.O.getValue())).f.get();
                    default:
                        PlanDowngradeFlow planDowngradeFlow2 = this.f280259b;
                        phm.a aVar = (phm.a) ue0.e.j(planDowngradeFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData = planDowngradeFlow2.K;
                        planDowngradeFlowContract$InputData.getClass();
                        return new e0(i0Var, planDowngradeFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vhk.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (vhk.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (uhk.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
