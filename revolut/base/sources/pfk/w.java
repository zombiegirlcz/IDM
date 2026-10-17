package pfk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.q implements Function1 {
    public static final w f = new w();

    public w() {
        super(1, ifk.b.class, "toDomain", "toDomain(Lcom/revolut/retail/feature/pricing_plans/impl/network/model/cancel/PricingPlanBenefitsToLoseInfoDto;)Lcom/revolut/feature/pricingplans/models/cancel/PricingPlanBenefitsToLoseInfo;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hfk.h p0 = (hfk.h) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List benefits = p0.getBenefits();
        ArrayList arrayList = new ArrayList(zhm.w.t(benefits, 10));
        Iterator it8 = benefits.iterator();
        while (it8.hasNext()) {
            arrayList.add(new hha.u((String) it8.next()));
        }
        List cards = p0.getCards();
        if (cards == null) {
            cards = zhm.f0.f322471a;
        }
        List memberships = p0.getMemberships();
        if (memberships == null) {
            memberships = zhm.f0.f322471a;
        }
        return new iha.g(arrayList, cards, memberships);
    }
}
