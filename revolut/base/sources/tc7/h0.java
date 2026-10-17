package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h0 implements e4m.e {
    public static la0.b a(ImmutableMap personalProviders, ImmutableMap freelancerProviders, ImmutableMap cashflowProviders, ImmutableMap spendingProviders, ImmutableMap cardsWidgetProviders, ImmutableMap esimWidgetProviders, ImmutableMap networthProviders, fsh.c providerTransformer) {
        Set set = g0.f269707a;
        Intrinsics.checkNotNullParameter(personalProviders, "personalProviders");
        Intrinsics.checkNotNullParameter(freelancerProviders, "freelancerProviders");
        Intrinsics.checkNotNullParameter(cashflowProviders, "cashflowProviders");
        Intrinsics.checkNotNullParameter(spendingProviders, "spendingProviders");
        Intrinsics.checkNotNullParameter(cardsWidgetProviders, "cardsWidgetProviders");
        Intrinsics.checkNotNullParameter(esimWidgetProviders, "esimWidgetProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        LinkedHashMap linkedHashMapA = fsh.c.a(networthProviders, new b0(7));
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(freelancerProviders.size()));
        for (Map.Entry entry : freelancerProviders.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), entry.getValue());
        }
        LinkedHashMap linkedHashMapP = r0.p(linkedHashMapA, fsh.c.a(linkedHashMap, new b0(8)));
        Set set2 = g0.f269707a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it8 = personalProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it8.next();
            if (set2.contains((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return new la0.b(r0.p(r0.p(r0.p(r0.p(r0.p(linkedHashMapP, fsh.c.a(linkedHashMap2, new b0(9))), fsh.c.a(cashflowProviders, new b0(10))), fsh.c.a(spendingProviders, new b0(11))), fsh.c.a(cardsWidgetProviders, new b0(12))), fsh.c.a(esimWidgetProviders, new b0(13))));
    }
}
