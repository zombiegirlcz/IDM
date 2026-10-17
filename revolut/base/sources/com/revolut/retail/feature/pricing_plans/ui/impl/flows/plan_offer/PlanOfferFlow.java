package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer;

import com.revolut.core.ui_kit.R$style;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$InputData;
import igk.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.i0;
import qgk.s0;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ligk/v;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanOfferFlow extends ViewController<v> implements f {
    public final PlanOfferFlowContract$InputData K;
    public final int L;
    public final Integer M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PlanOfferFlow(PlanOfferFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        this.M = ((inputData instanceof PlanOfferFlowContract$InputData.ByPrompt) && ((PlanOfferFlowContract$InputData.ByPrompt) inputData).f103194b == a.FULL_SCREEN) ? Integer.valueOf(R$style.UiKitTheme_Mono) : null;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: aik.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferFlow f5299b;

            {
                this.f5299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PlanOfferFlow planOfferFlow = this.f5299b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, planOfferFlow, (c) planOfferFlow.P.getValue());
                    case 1:
                        PlanOfferFlow planOfferFlow2 = this.f5299b;
                        phm.a aVar = (phm.a) ue0.e.j(planOfferFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanOfferFlowContract$InputData planOfferFlowContract$InputData = planOfferFlow2.K;
                        planOfferFlowContract$InputData.getClass();
                        return new s0(i0Var, new agk.a(), planOfferFlowContract$InputData);
                    default:
                        return (c) ((s0) ((bik.a) this.f5299b.O.getValue())).f246230l.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: aik.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferFlow f5299b;

            {
                this.f5299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PlanOfferFlow planOfferFlow = this.f5299b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, planOfferFlow, (c) planOfferFlow.P.getValue());
                    case 1:
                        PlanOfferFlow planOfferFlow2 = this.f5299b;
                        phm.a aVar = (phm.a) ue0.e.j(planOfferFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanOfferFlowContract$InputData planOfferFlowContract$InputData = planOfferFlow2.K;
                        planOfferFlowContract$InputData.getClass();
                        return new s0(i0Var, new agk.a(), planOfferFlowContract$InputData);
                    default:
                        return (c) ((s0) ((bik.a) this.f5299b.O.getValue())).f246230l.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: aik.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferFlow f5299b;

            {
                this.f5299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PlanOfferFlow planOfferFlow = this.f5299b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, planOfferFlow, (c) planOfferFlow.P.getValue());
                    case 1:
                        PlanOfferFlow planOfferFlow2 = this.f5299b;
                        phm.a aVar = (phm.a) ue0.e.j(planOfferFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanOfferFlowContract$InputData planOfferFlowContract$InputData = planOfferFlow2.K;
                        planOfferFlowContract$InputData.getClass();
                        return new s0(i0Var, new agk.a(), planOfferFlowContract$InputData);
                    default:
                        return (c) ((s0) ((bik.a) this.f5299b.O.getValue())).f246230l.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bik.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (bik.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (aik.c) this.P.getValue();
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
