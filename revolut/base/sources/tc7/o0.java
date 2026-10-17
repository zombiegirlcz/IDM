package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class o0 implements e4m.e {
    public static la0.b a(ImmutableMap personalProviders, ImmutableMap favouritesProviders, ImmutableMap nearbyRewardsProviders, ImmutableMap revPointsRimWidgetProviders, ImmutableMap spendingProviders, ImmutableMap scheduledPaymentsWidgetProviders, ImmutableMap cardsWidgetProviders, ImmutableMap esimWidgetProviders, ImmutableMap savingsProviders, ImmutableMap assistantProviders, ImmutableMap revolutPayProviders, ImmutableMap cobrandsWidgetProviders, fsh.c providerTransformer, ImmutableMap p2PInternationalWidgetProviders) {
        Set set = n0.f269756a;
        Intrinsics.checkNotNullParameter(personalProviders, "personalProviders");
        Intrinsics.checkNotNullParameter(favouritesProviders, "favouritesProviders");
        Intrinsics.checkNotNullParameter(nearbyRewardsProviders, "nearbyRewardsProviders");
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
        LinkedHashMap linkedHashMapP = r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(fsh.c.a(personalProviders, new b0(18)), fsh.c.a(nearbyRewardsProviders, new b0(25))), fsh.c.a(revPointsRimWidgetProviders, new b0(26))), fsh.c.a(favouritesProviders, new b0(27))), fsh.c.a(spendingProviders, new b0(28))), fsh.c.a(scheduledPaymentsWidgetProviders, new b0(29))), fsh.c.a(cardsWidgetProviders, new m0(0))), fsh.c.a(esimWidgetProviders, new b0(19)));
        Set set2 = n0.f269756a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = savingsProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (set2.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new la0.b(r0.p(r0.p(r0.p(r0.p(r0.p(linkedHashMapP, fsh.c.a(linkedHashMap, new b0(20))), fsh.c.a(assistantProviders, new b0(21))), fsh.c.a(revolutPayProviders, new b0(22))), fsh.c.a(cobrandsWidgetProviders, new b0(23))), fsh.c.a(p2PInternationalWidgetProviders, new b0(24))));
    }
}
