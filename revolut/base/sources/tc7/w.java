package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class w implements e4m.e {
    public static la0.b a(ImmutableMap savingsProviders, ImmutableMap vaultsProviders, fsh.c providerTransformer) {
        Set set = v.f269761a;
        Intrinsics.checkNotNullParameter(savingsProviders, "savingsProviders");
        Intrinsics.checkNotNullParameter(vaultsProviders, "vaultsProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        Set set2 = v.f269761a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = vaultsProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (set2.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new la0.b(r0.p(fsh.c.a(linkedHashMap, new o(9)), fsh.c.a(savingsProviders, new o(10))));
    }
}
