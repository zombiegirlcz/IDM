package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection;

import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.PlanContextualSelectionFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.PlanContextualSelectionFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.a0;
import qgk.i0;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanContextualSelectionFlow extends ViewController<q> implements f {
    public final PlanContextualSelectionFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PlanContextualSelectionFlow(PlanContextualSelectionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: shk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanContextualSelectionFlow f263501b;

            {
                this.f263501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PlanContextualSelectionFlow planContextualSelectionFlow = this.f263501b;
                        return czi.c.d(0, 6, null, planContextualSelectionFlow, (b) planContextualSelectionFlow.N.getValue());
                    case 1:
                        PlanContextualSelectionFlow planContextualSelectionFlow2 = this.f263501b;
                        phm.a aVar = (phm.a) e.j(planContextualSelectionFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanContextualSelectionFlowContract$InputData planContextualSelectionFlowContract$InputData = planContextualSelectionFlow2.K;
                        planContextualSelectionFlowContract$InputData.getClass();
                        return new a0(i0Var, new agk.a(), planContextualSelectionFlowContract$InputData);
                    default:
                        return (b) ((a0) ((thk.a) this.f263501b.M.getValue())).f245871l.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: shk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanContextualSelectionFlow f263501b;

            {
                this.f263501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PlanContextualSelectionFlow planContextualSelectionFlow = this.f263501b;
                        return czi.c.d(0, 6, null, planContextualSelectionFlow, (b) planContextualSelectionFlow.N.getValue());
                    case 1:
                        PlanContextualSelectionFlow planContextualSelectionFlow2 = this.f263501b;
                        phm.a aVar = (phm.a) e.j(planContextualSelectionFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanContextualSelectionFlowContract$InputData planContextualSelectionFlowContract$InputData = planContextualSelectionFlow2.K;
                        planContextualSelectionFlowContract$InputData.getClass();
                        return new a0(i0Var, new agk.a(), planContextualSelectionFlowContract$InputData);
                    default:
                        return (b) ((a0) ((thk.a) this.f263501b.M.getValue())).f245871l.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: shk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanContextualSelectionFlow f263501b;

            {
                this.f263501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PlanContextualSelectionFlow planContextualSelectionFlow = this.f263501b;
                        return czi.c.d(0, 6, null, planContextualSelectionFlow, (b) planContextualSelectionFlow.N.getValue());
                    case 1:
                        PlanContextualSelectionFlow planContextualSelectionFlow2 = this.f263501b;
                        phm.a aVar = (phm.a) e.j(planContextualSelectionFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanContextualSelectionFlowContract$InputData planContextualSelectionFlowContract$InputData = planContextualSelectionFlow2.K;
                        planContextualSelectionFlowContract$InputData.getClass();
                        return new a0(i0Var, new agk.a(), planContextualSelectionFlowContract$InputData);
                    default:
                        return (b) ((a0) ((thk.a) this.f263501b.M.getValue())).f245871l.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (thk.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (thk.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (shk.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
