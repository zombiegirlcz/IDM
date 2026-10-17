package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending;

import a0.d;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlowContract$InputData;
import czi.c;
import igk.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.i0;
import qgk.k0;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ligk/p;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanGiftSendingFlow extends ViewController<p> implements f {
    public final PlanGiftSendingFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PlanGiftSendingFlow(PlanGiftSendingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftSendingFlow f314169b;

            {
                this.f314169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = R$id.screen_transparent_container;
                        PlanGiftSendingFlow planGiftSendingFlow = this.f314169b;
                        return c.d(i2, 4, null, planGiftSendingFlow, (b) planGiftSendingFlow.O.getValue());
                    case 1:
                        PlanGiftSendingFlow planGiftSendingFlow2 = this.f314169b;
                        phm.a aVar = (phm.a) e.j(planGiftSendingFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanGiftSendingFlowContract$InputData planGiftSendingFlowContract$InputData = planGiftSendingFlow2.K;
                        planGiftSendingFlowContract$InputData.getClass();
                        return new k0(i0Var, planGiftSendingFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f314169b.N.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftSendingFlow f314169b;

            {
                this.f314169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        PlanGiftSendingFlow planGiftSendingFlow = this.f314169b;
                        return c.d(i22, 4, null, planGiftSendingFlow, (b) planGiftSendingFlow.O.getValue());
                    case 1:
                        PlanGiftSendingFlow planGiftSendingFlow2 = this.f314169b;
                        phm.a aVar = (phm.a) e.j(planGiftSendingFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanGiftSendingFlowContract$InputData planGiftSendingFlowContract$InputData = planGiftSendingFlow2.K;
                        planGiftSendingFlowContract$InputData.getClass();
                        return new k0(i0Var, planGiftSendingFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f314169b.N.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: yhk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftSendingFlow f314169b;

            {
                this.f314169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        PlanGiftSendingFlow planGiftSendingFlow = this.f314169b;
                        return c.d(i22, 4, null, planGiftSendingFlow, (b) planGiftSendingFlow.O.getValue());
                    case 1:
                        PlanGiftSendingFlow planGiftSendingFlow2 = this.f314169b;
                        phm.a aVar = (phm.a) e.j(planGiftSendingFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanGiftSendingFlowContract$InputData planGiftSendingFlowContract$InputData = planGiftSendingFlow2.K;
                        planGiftSendingFlowContract$InputData.getClass();
                        return new k0(i0Var, planGiftSendingFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f314169b.N.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yhk.b) this.O.getValue();
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
