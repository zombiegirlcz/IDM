package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c implements e4m.e {
    public static la0.b a(ImmutableMap creditCardProviders, ImmutableMap personalProviders, ImmutableMap favouritesProviders, ImmutableMap spendingProviders, ImmutableMap revPointsRimWidgetProviders, ImmutableMap cardsWidgetProviders, ImmutableMap esimWidgetProviders, ImmutableMap scheduledPaymentsWidgetProviders, ImmutableMap creditHealthProviders, ImmutableMap networthProviders, fsh.c providerTransformer) {
        Set set = b.f269578a;
        Intrinsics.checkNotNullParameter(creditCardProviders, "creditCardProviders");
        Intrinsics.checkNotNullParameter(personalProviders, "personalProviders");
        Intrinsics.checkNotNullParameter(favouritesProviders, "favouritesProviders");
        Intrinsics.checkNotNullParameter(spendingProviders, "spendingProviders");
        Intrinsics.checkNotNullParameter(revPointsRimWidgetProviders, "revPointsRimWidgetProviders");
        Intrinsics.checkNotNullParameter(cardsWidgetProviders, "cardsWidgetProviders");
        Intrinsics.checkNotNullParameter(esimWidgetProviders, "esimWidgetProviders");
        Intrinsics.checkNotNullParameter(scheduledPaymentsWidgetProviders, "scheduledPaymentsWidgetProviders");
        Intrinsics.checkNotNullParameter(creditHealthProviders, "creditHealthProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        Set set2 = b.f269579b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = networthProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (set2.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMapP = r0.p(fsh.c.a(linkedHashMap, new s1c.d(11)), fsh.c.a(creditCardProviders, new s1c.d(12)));
        Set set3 = b.f269578a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it9 = personalProviders.entrySet().iterator();
        while (it9.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it9.next();
            if (set3.contains((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return new la0.b(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(linkedHashMapP, fsh.c.a(linkedHashMap2, new s1c.d(13))), fsh.c.a(favouritesProviders, new s1c.d(14))), fsh.c.a(spendingProviders, new s1c.d(15))), fsh.c.a(cardsWidgetProviders, new s1c.d(16))), fsh.c.a(scheduledPaymentsWidgetProviders, new s1c.d(17))), fsh.c.a(esimWidgetProviders, new s1c.d(18))), fsh.c.a(revPointsRimWidgetProviders, new s1c.d(19))), fsh.c.a(creditHealthProviders, new s1c.d(20))));
    }
}
