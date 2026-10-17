package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f0 implements e4m.e {
    public static la0.b a(ImmutableMap freelancerProviders, ImmutableMap vaultsProviders, ImmutableMap networthProviders, fsh.c providerTransformer) {
        Intrinsics.checkNotNullParameter(freelancerProviders, "freelancerProviders");
        Intrinsics.checkNotNullParameter(vaultsProviders, "vaultsProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(freelancerProviders.size()));
        for (Map.Entry entry : freelancerProviders.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), entry.getValue());
        }
        return new la0.b(r0.p(r0.p(fsh.c.a(linkedHashMap, new b0(4)), fsh.c.a(networthProviders, new b0(5))), fsh.c.a(vaultsProviders, new b0(6))));
    }
}
