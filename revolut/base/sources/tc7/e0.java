package tc7;

import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e0 implements e4m.e {
    public static la0.b a(ImmutableMap vaultsProviders, ImmutableMap networthProviders, fsh.c providerTransformer) {
        Intrinsics.checkNotNullParameter(vaultsProviders, "vaultsProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        return new la0.b(r0.p(fsh.c.a(networthProviders, new b0(2)), fsh.c.a(vaultsProviders, new b0(3))));
    }
}
