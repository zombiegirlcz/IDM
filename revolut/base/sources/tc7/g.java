package tc7;

import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class g implements e4m.e {
    public static la0.b a(ImmutableMap groupPocketProviders, ImmutableMap vaultsProviders, ImmutableMap networthProviders, fsh.c providerTransformer) {
        Intrinsics.checkNotNullParameter(groupPocketProviders, "groupPocketProviders");
        Intrinsics.checkNotNullParameter(vaultsProviders, "vaultsProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        return new la0.b(r0.p(r0.p(groupPocketProviders, fsh.c.a(vaultsProviders, new s1c.d(21))), fsh.c.a(networthProviders, new s1c.d(22))));
    }
}
