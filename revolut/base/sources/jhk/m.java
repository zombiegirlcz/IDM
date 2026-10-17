package jhk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.pricingplans.models.SubscriptionPreviewId;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b f174300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hha.d f174301c;
    public final /* synthetic */ hha.i d;
    public final /* synthetic */ PricingPlanOffer e;

    public /* synthetic */ m(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar, hha.d dVar, hha.i iVar, PricingPlanOffer pricingPlanOffer, int i) {
        this.f174299a = i;
        this.f174300b = bVar;
        this.f174301c = dVar;
        this.d = iVar;
        this.e = pricingPlanOffer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f174299a) {
            case 0:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar = this.f174300b;
                hha.d dVar = this.f174301c;
                hha.i iVar = this.d;
                PricingPlanOffer pricingPlanOffer = this.e;
                if (iVar != null) {
                    bVar.C2(new f(dVar, iVar, pricingPlanOffer));
                } else {
                    bVar.C2(new e(dVar, pricingPlanOffer));
                }
                break;
            case 1:
                hha.d dVar2 = this.f174301c;
                String str = dVar2.f152287a;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar2 = this.f174300b;
                hha.i iVar2 = this.d;
                bVar2.l2(new p(bVar2, new m(bVar2, dVar2, iVar2, this.e, 2), new SubscriptionPreviewId.Plan(str, iVar2), null), new yi5.b(26));
                break;
            default:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar3 = this.f174300b;
                hha.d dVar3 = this.f174301c;
                bVar3.f103092r.b3(dVar3, new jeg.g(new m(bVar3, dVar3, this.d, this.e, 0), 15));
                break;
        }
        return Unit.f186387a;
    }
}
