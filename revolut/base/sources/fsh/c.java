package fsh;

import csh.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static LinkedHashMap a(Map providers, final bsh.a adapter) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(providers.size()));
        for (Map.Entry entry : providers.entrySet()) {
            Object key = entry.getKey();
            final phm.a provider = (phm.a) entry.getValue();
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            linkedHashMap.put(key, new phm.a() { // from class: fsh.b
                @Override // phm.a
                public final Object get() {
                    Object obj2 = provider.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    return new a((e) obj2, adapter);
                }
            });
        }
        return linkedHashMap;
    }
}
