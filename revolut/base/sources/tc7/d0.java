package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d0 implements e4m.e {
    public static la0.b a(ImmutableMap personalProviders, ImmutableMap favouritesProviders, ImmutableMap nearbyRewardsProviders, ImmutableMap rewardsHubProviders, ImmutableMap revPointsRimWidgetProviders, ImmutableMap spendingProviders, ImmutableMap scheduledPaymentsWidgetProviders, ImmutableMap cardsWidgetProviders, ImmutableMap esimWidgetProviders, ImmutableMap savingsProviders, ImmutableMap assistantProviders, ImmutableMap revolutPayProviders, ImmutableMap cobrandsWidgetProviders, fsh.c providerTransformer, ImmutableMap p2PInternationalWidgetProviders, ImmutableMap insuranceWidgetProviders, ImmutableMap networthProviders) {
        Set set = c0.f269581a;
        Intrinsics.checkNotNullParameter(personalProviders, "personalProviders");
        Intrinsics.checkNotNullParameter(favouritesProviders, "favouritesProviders");
        Intrinsics.checkNotNullParameter(nearbyRewardsProviders, "nearbyRewardsProviders");
        Intrinsics.checkNotNullParameter(rewardsHubProviders, "rewardsHubProviders");
        Intrinsics.checkNotNullParameter(revPointsRimWidgetProviders, "revPointsRimWidgetProviders");
        Intrinsics.checkNotNullParameter(spendingProviders, "spendingProviders");
        Intrinsics.checkNotNullParameter(scheduledPaymentsWidgetProviders, "scheduledPaymentsWidgetProviders");
        Intrinsics.checkNotNullParameter(cardsWidgetProviders, "cardsWidgetProviders");
        Intrinsics.checkNotNullParameter(esimWidgetProviders, "esimWidgetProviders");
        Intrinsics.checkNotNullParameter(savingsProviders, "savingsProviders");
        Intrinsics.checkNotNullParameter(assistantProviders, "assistantProviders");
        Intrinsics.checkNotNullParameter(revolutPayProviders, "revolutPayProviders");
        Intrinsics.checkNotNullParameter(cobrandsWidgetProviders, "cobrandsWidgetProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        Intrinsics.checkNotNullParameter(p2PInternationalWidgetProviders, "p2PInternationalWidgetProviders");
        Intrinsics.checkNotNullParameter(insuranceWidgetProviders, "insuranceWidgetProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        LinkedHashMap linkedHashMapP = r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(personalProviders, fsh.c.a(networthProviders, new o(17))), fsh.c.a(nearbyRewardsProviders, new o(28))), fsh.c.a(rewardsHubProviders, new o(29))), fsh.c.a(revPointsRimWidgetProviders, new b0(0))), fsh.c.a(favouritesProviders, new b0(1))), fsh.c.a(spendingProviders, new o(18))), fsh.c.a(scheduledPaymentsWidgetProviders, new o(19))), fsh.c.a(cardsWidgetProviders, new o(20))), fsh.c.a(esimWidgetProviders, new o(21)));
        Set set2 = c0.f269581a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = savingsProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (set2.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new la0.b(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(linkedHashMapP, fsh.c.a(linkedHashMap, new o(22))), fsh.c.a(assistantProviders, new o(23))), fsh.c.a(revolutPayProviders, new o(24))), fsh.c.a(cobrandsWidgetProviders, new o(25))), fsh.c.a(p2PInternationalWidgetProviders, new o(26))), fsh.c.a(insuranceWidgetProviders, new o(27))));
    }
}
