package fmb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsRevampScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreenContract$ModalStep;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ReviewProductDetailsRevampScreen f136264w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136264w = reviewProductDetailsRevampScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f136264w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f136264w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f136264w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = this.f136264w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVarF3 = reviewProductDetailsRevampScreen.R2();
                String id10 = aVar.f275445a;
                Object obj3 = aVar.d;
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) wVarF3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "DISCLAIMER_SUBTITLE_CLICK_ID")) {
                    SavingsProduct.Disclaimer disclaimer = obj3 instanceof SavingsProduct.Disclaimer ? (SavingsProduct.Disclaimer) obj3 : null;
                    if (disclaimer != null) {
                        oki.h.v2(bVar.M, new ReviewProductDetailsScreenContract$ModalStep.Disclaimer(disclaimer.f86639a, disclaimer.f86640b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                } else if (Intrinsics.f(id10, "AVAILABLE_UPSELL_SUBTITLE_CLICK_ID")) {
                    h0 h0Var = obj3 instanceof h0 ? (h0) obj3 : null;
                    if (h0Var != null) {
                        ArrayList arrayList = h0Var.f136272c;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((hha.d) it8.next()).f152287a);
                        }
                        hha.u.Companion.getClass();
                        bVar.C1(zh9.u0.b(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByPlans(hha.u.B, arrayList2, null, null, false, xfa.b.BASE_SAVINGS_PITCH, 172))));
                    }
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("ClickId ", id10, " not supported"));
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                }
                break;
            case 1:
                Object obj4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) reviewProductDetailsRevampScreen.R2()).M2(((qv0.p) obj4).getF52328h(), ((koi.j) obj4).getF52324a());
                break;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) reviewProductDetailsRevampScreen.R2()).M2(aVar4.d, aVar4.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
