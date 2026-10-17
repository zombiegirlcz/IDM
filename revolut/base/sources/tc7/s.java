package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class s implements e4m.e {
    public static la0.b a(ImmutableMap personalProviders, ImmutableMap juniorProvider, ImmutableMap spendingProviders, fsh.c providerTransformer) {
        Set set = r.f269759a;
        Intrinsics.checkNotNullParameter(personalProviders, "personalProviders");
        Intrinsics.checkNotNullParameter(juniorProvider, "juniorProvider");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        Intrinsics.checkNotNullParameter(spendingProviders, "spendingProviders");
        Set set2 = r.f269759a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = personalProviders.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (set2.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new la0.b(r0.p(r0.p(juniorProvider, fsh.c.a(linkedHashMap, new o(6))), fsh.c.a(spendingProviders, new o(7))));
    }
}
