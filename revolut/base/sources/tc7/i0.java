package tc7;

import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class i0 implements e4m.e {
    public static la0.b a(ImmutableMap savingsProviders, ImmutableMap networthProviders, ImmutableMap vaultsProviders, fsh.c providerTransformer) {
        Intrinsics.checkNotNullParameter(savingsProviders, "savingsProviders");
        Intrinsics.checkNotNullParameter(networthProviders, "networthProviders");
        Intrinsics.checkNotNullParameter(vaultsProviders, "vaultsProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        return new la0.b(r0.p(r0.p(savingsProviders, fsh.c.a(vaultsProviders, new b0(14))), fsh.c.a(networthProviders, new b0(15))));
    }
}
