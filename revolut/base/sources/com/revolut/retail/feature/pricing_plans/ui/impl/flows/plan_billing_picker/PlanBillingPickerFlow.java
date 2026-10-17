package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker;

import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerFlow;
import igk.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import phk.h;
import qgk.i0;
import qhk.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ligk/c;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanBillingPickerFlow extends ViewController<c> implements f {
    public final PlanBillingPickerContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PlanBillingPickerFlow(PlanBillingPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        this.M = z92.f.m(inputData.d);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: phk.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBillingPickerFlow f236331b;

            {
                this.f236331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = R$id.screen_transparent_container;
                        PlanBillingPickerFlow planBillingPickerFlow = this.f236331b;
                        return czi.c.d(i2, 4, null, planBillingPickerFlow, (h) planBillingPickerFlow.P.getValue());
                    case 1:
                        PlanBillingPickerFlow planBillingPickerFlow2 = this.f236331b;
                        phm.a aVar = (phm.a) ue0.e.j(planBillingPickerFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qhk.b) ((qhk.a) ((qhk.c) aVar2.b()).l().a(planBillingPickerFlow2)).r(planBillingPickerFlow2.K).build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        return ((qhk.b) this.f236331b.O.getValue()).e();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: phk.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBillingPickerFlow f236331b;

            {
                this.f236331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        PlanBillingPickerFlow planBillingPickerFlow = this.f236331b;
                        return czi.c.d(i22, 4, null, planBillingPickerFlow, (h) planBillingPickerFlow.P.getValue());
                    case 1:
                        PlanBillingPickerFlow planBillingPickerFlow2 = this.f236331b;
                        phm.a aVar = (phm.a) ue0.e.j(planBillingPickerFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qhk.b) ((qhk.a) ((qhk.c) aVar2.b()).l().a(planBillingPickerFlow2)).r(planBillingPickerFlow2.K).build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        return ((qhk.b) this.f236331b.O.getValue()).e();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: phk.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBillingPickerFlow f236331b;

            {
                this.f236331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        PlanBillingPickerFlow planBillingPickerFlow = this.f236331b;
                        return czi.c.d(i22, 4, null, planBillingPickerFlow, (h) planBillingPickerFlow.P.getValue());
                    case 1:
                        PlanBillingPickerFlow planBillingPickerFlow2 = this.f236331b;
                        phm.a aVar = (phm.a) ue0.e.j(planBillingPickerFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qhk.b) ((qhk.a) ((qhk.c) aVar2.b()).l().a(planBillingPickerFlow2)).r(planBillingPickerFlow2.K).build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        return ((qhk.b) this.f236331b.O.getValue()).e();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getS() {
        return Integer.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
