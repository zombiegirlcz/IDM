package com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.CheckoutPlanSelectionFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.i0;
import qji.b;
import te0.w;
import tgk.c;
import tgk.d;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/checkout/CheckoutPlanSelectionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckoutPlanSelectionFlow extends ViewController<q> implements f {
    public final d K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CheckoutPlanSelectionFlow(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: tgk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutPlanSelectionFlow f271188b;

            {
                this.f271188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = R$id.screen_transparent_container;
                        CheckoutPlanSelectionFlow checkoutPlanSelectionFlow = this.f271188b;
                        return czi.c.d(i2, 4, null, checkoutPlanSelectionFlow, (c) checkoutPlanSelectionFlow.O.getValue());
                    case 1:
                        CheckoutPlanSelectionFlow checkoutPlanSelectionFlow2 = this.f271188b;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutPlanSelectionFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        d dVar = checkoutPlanSelectionFlow2.K;
                        dVar.getClass();
                        return new qgk.e(i0Var, new agk.a(), dVar);
                    default:
                        return (c) ((qgk.e) ((ugk.a) this.f271188b.N.getValue())).k.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: tgk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutPlanSelectionFlow f271188b;

            {
                this.f271188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        CheckoutPlanSelectionFlow checkoutPlanSelectionFlow = this.f271188b;
                        return czi.c.d(i22, 4, null, checkoutPlanSelectionFlow, (c) checkoutPlanSelectionFlow.O.getValue());
                    case 1:
                        CheckoutPlanSelectionFlow checkoutPlanSelectionFlow2 = this.f271188b;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutPlanSelectionFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        d dVar = checkoutPlanSelectionFlow2.K;
                        dVar.getClass();
                        return new qgk.e(i0Var, new agk.a(), dVar);
                    default:
                        return (c) ((qgk.e) ((ugk.a) this.f271188b.N.getValue())).k.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: tgk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutPlanSelectionFlow f271188b;

            {
                this.f271188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        CheckoutPlanSelectionFlow checkoutPlanSelectionFlow = this.f271188b;
                        return czi.c.d(i22, 4, null, checkoutPlanSelectionFlow, (c) checkoutPlanSelectionFlow.O.getValue());
                    case 1:
                        CheckoutPlanSelectionFlow checkoutPlanSelectionFlow2 = this.f271188b;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutPlanSelectionFlow2.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        d dVar = checkoutPlanSelectionFlow2.K;
                        dVar.getClass();
                        return new qgk.e(i0Var, new agk.a(), dVar);
                    default:
                        return (c) ((qgk.e) ((ugk.a) this.f271188b.N.getValue())).k.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ugk.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (ugk.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
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
