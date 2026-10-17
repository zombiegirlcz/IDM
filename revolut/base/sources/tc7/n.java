package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class n implements e4m.e {
    public static la0.b a(ImmutableMap savingsProviders, ImmutableMap vaultsProviders, ImmutableMap networthProviders, fsh.c providerTransformer) {
        Set set = m.f269753a;
        Intrinsics.checkNotNullParameter(savingsProviders, "savingsProviders");
        Intrinsics.checkNotNullParameter(vaultsProviders, "vaultsProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        Set set2 = m.f269753a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = savingsProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (set2.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMapA = fsh.c.a(linkedHashMap, new s1c.d(26));
        Set set3 = m.f269754b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it9 = vaultsProviders.entrySet().iterator();
        while (it9.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it9.next();
            if (set3.contains((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return new la0.b(r0.p(r0.p(linkedHashMapA, fsh.c.a(linkedHashMap2, new s1c.d(27))), fsh.c.a(networthProviders, new s1c.d(28))));
    }
}
