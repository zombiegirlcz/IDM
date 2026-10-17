package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class q implements e4m.e {
    public static la0.b a(ImmutableMap personalProviders, ImmutableMap favouritesProviders, ImmutableMap spendingProviders, ImmutableMap scheduledPaymentsWidgetProviders, ImmutableMap cardsWidgetProviders, ImmutableMap esimWidgetProviders, ImmutableMap networthProviders, fsh.c providerTransformer) {
        Set set = p.f269758a;
        Intrinsics.checkNotNullParameter(personalProviders, "personalProviders");
        Intrinsics.checkNotNullParameter(favouritesProviders, "favouritesProviders");
        Intrinsics.checkNotNullParameter(spendingProviders, "spendingProviders");
        Intrinsics.checkNotNullParameter(scheduledPaymentsWidgetProviders, "scheduledPaymentsWidgetProviders");
        Intrinsics.checkNotNullParameter(cardsWidgetProviders, "cardsWidgetProviders");
        Intrinsics.checkNotNullParameter(esimWidgetProviders, "esimWidgetProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        LinkedHashMap linkedHashMapA = fsh.c.a(networthProviders, new s1c.d(29));
        Set set2 = p.f269758a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = personalProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (set2.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new la0.b(r0.p(r0.p(r0.p(r0.p(r0.p(r0.p(linkedHashMapA, fsh.c.a(linkedHashMap, new o(0))), fsh.c.a(favouritesProviders, new o(1))), fsh.c.a(spendingProviders, new o(2))), fsh.c.a(scheduledPaymentsWidgetProviders, new o(3))), fsh.c.a(cardsWidgetProviders, new o(4))), fsh.c.a(esimWidgetProviders, new o(5))));
    }
}
