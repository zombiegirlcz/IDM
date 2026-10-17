package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class u implements e4m.e {
    public static la0.b a(ImmutableMap vaultsProviders, fsh.c providerTransformer) {
        Set set = t.f269760a;
        Intrinsics.checkNotNullParameter(vaultsProviders, "vaultsProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = vaultsProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (t.f269760a.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new la0.b(fsh.c.a(linkedHashMap, new o(8)));
    }
}
