package com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan;

import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.SelectFamilyPlanFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.SelectFamilyPlanFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.i0;
import qgk.r1;
import qik.d;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/select_family_plan/SelectFamilyPlanFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqik/d;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectFamilyPlanFlow extends ViewController<d> implements f {
    public final SelectFamilyPlanFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SelectFamilyPlanFlow(SelectFamilyPlanFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qik.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectFamilyPlanFlow f246749b;

            {
                this.f246749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SelectFamilyPlanFlow selectFamilyPlanFlow = this.f246749b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selectFamilyPlanFlow, (b) selectFamilyPlanFlow.O.getValue());
                    case 1:
                        SelectFamilyPlanFlow selectFamilyPlanFlow2 = this.f246749b;
                        phm.a aVar = (phm.a) e.j(selectFamilyPlanFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        SelectFamilyPlanFlowContract$InputData selectFamilyPlanFlowContract$InputData = selectFamilyPlanFlow2.K;
                        selectFamilyPlanFlowContract$InputData.getClass();
                        return new r1(i0Var, selectFamilyPlanFlowContract$InputData);
                    default:
                        return (b) ((r1) this.f246749b.N.getValue()).f246216c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qik.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectFamilyPlanFlow f246749b;

            {
                this.f246749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SelectFamilyPlanFlow selectFamilyPlanFlow = this.f246749b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selectFamilyPlanFlow, (b) selectFamilyPlanFlow.O.getValue());
                    case 1:
                        SelectFamilyPlanFlow selectFamilyPlanFlow2 = this.f246749b;
                        phm.a aVar = (phm.a) e.j(selectFamilyPlanFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        SelectFamilyPlanFlowContract$InputData selectFamilyPlanFlowContract$InputData = selectFamilyPlanFlow2.K;
                        selectFamilyPlanFlowContract$InputData.getClass();
                        return new r1(i0Var, selectFamilyPlanFlowContract$InputData);
                    default:
                        return (b) ((r1) this.f246749b.N.getValue()).f246216c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: qik.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectFamilyPlanFlow f246749b;

            {
                this.f246749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SelectFamilyPlanFlow selectFamilyPlanFlow = this.f246749b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selectFamilyPlanFlow, (b) selectFamilyPlanFlow.O.getValue());
                    case 1:
                        SelectFamilyPlanFlow selectFamilyPlanFlow2 = this.f246749b;
                        phm.a aVar = (phm.a) e.j(selectFamilyPlanFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        SelectFamilyPlanFlowContract$InputData selectFamilyPlanFlowContract$InputData = selectFamilyPlanFlow2.K;
                        selectFamilyPlanFlowContract$InputData.getClass();
                        return new r1(i0Var, selectFamilyPlanFlowContract$InputData);
                    default:
                        return (b) ((r1) this.f246749b.N.getValue()).f246216c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (r1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (qik.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
