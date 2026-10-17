package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms;

import a0.d;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlowContract$InputData;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.g0;
import qgk.i0;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_durable_terms/PlanDurableTermsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_durable_terms/a;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanDurableTermsFlow extends ViewController<a> implements f {
    public final PlanDurableTermsFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PlanDurableTermsFlow(PlanDurableTermsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDurableTermsFlow f306270b;

            {
                this.f306270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = R$id.screen_transparent_container;
                        PlanDurableTermsFlow planDurableTermsFlow = this.f306270b;
                        return c.d(i2, 4, null, planDurableTermsFlow, (b) planDurableTermsFlow.O.getValue());
                    case 1:
                        PlanDurableTermsFlow planDurableTermsFlow2 = this.f306270b;
                        phm.a aVar = (phm.a) e.j(planDurableTermsFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanDurableTermsFlowContract$InputData planDurableTermsFlowContract$InputData = planDurableTermsFlow2.K;
                        planDurableTermsFlowContract$InputData.getClass();
                        return new g0(i0Var, planDurableTermsFlowContract$InputData);
                    default:
                        return (b) ((g0) this.f306270b.N.getValue()).f245965c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: xhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDurableTermsFlow f306270b;

            {
                this.f306270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        PlanDurableTermsFlow planDurableTermsFlow = this.f306270b;
                        return c.d(i22, 4, null, planDurableTermsFlow, (b) planDurableTermsFlow.O.getValue());
                    case 1:
                        PlanDurableTermsFlow planDurableTermsFlow2 = this.f306270b;
                        phm.a aVar = (phm.a) e.j(planDurableTermsFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanDurableTermsFlowContract$InputData planDurableTermsFlowContract$InputData = planDurableTermsFlow2.K;
                        planDurableTermsFlowContract$InputData.getClass();
                        return new g0(i0Var, planDurableTermsFlowContract$InputData);
                    default:
                        return (b) ((g0) this.f306270b.N.getValue()).f245965c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: xhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDurableTermsFlow f306270b;

            {
                this.f306270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        PlanDurableTermsFlow planDurableTermsFlow = this.f306270b;
                        return c.d(i22, 4, null, planDurableTermsFlow, (b) planDurableTermsFlow.O.getValue());
                    case 1:
                        PlanDurableTermsFlow planDurableTermsFlow2 = this.f306270b;
                        phm.a aVar = (phm.a) e.j(planDurableTermsFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanDurableTermsFlowContract$InputData planDurableTermsFlowContract$InputData = planDurableTermsFlow2.K;
                        planDurableTermsFlowContract$InputData.getClass();
                        return new g0(i0Var, planDurableTermsFlowContract$InputData);
                    default:
                        return (b) ((g0) this.f306270b.N.getValue()).f245965c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (xhk.b) this.O.getValue();
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
