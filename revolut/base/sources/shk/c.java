package shk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import hha.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a f263503b;

    public /* synthetic */ c(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a aVar, int i) {
        this.f263502a = i;
        this.f263503b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f263502a) {
            case 0:
                igk.c result = (igk.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a aVar = this.f263503b;
                com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar = aVar.f103151p;
                String str = result.f161237a;
                i iVar = result.f161238b;
                PricingPlanOffer pricingPlanOffer = result.d;
                bVar.d3(new PricingPlanAction.Upgrade(str, iVar, pricingPlanOffer != null ? pricingPlanOffer.f81123a : null, false), new c(aVar, 1));
                return Unit.f186387a;
            case 1:
                c.b it8 = (c.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(this.f263503b.f103152q);
                return Unit.f186387a;
            default:
                c.b it9 = (c.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h.D2(this.f263503b.f103152q);
                return Unit.f186387a;
        }
    }
}
