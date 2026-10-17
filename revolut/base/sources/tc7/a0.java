package tc7;

import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a0 implements e4m.e {
    public static la0.b a(ImmutableMap personalPocketProviders, ImmutableMap vaultsProviders, ImmutableMap networthProviders, fsh.c providerTransformer) {
        Intrinsics.checkNotNullParameter(personalPocketProviders, "personalPocketProviders");
        Intrinsics.checkNotNullParameter(vaultsProviders, "vaultsProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        return new la0.b(r0.p(r0.p(personalPocketProviders, fsh.c.a(vaultsProviders, new o(15))), fsh.c.a(networthProviders, new o(16))));
    }
}
