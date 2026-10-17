package tc7;

import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class z implements e4m.e {
    public static la0.b a(ImmutableMap loanProviders, fsh.c providerTransformer) {
        Intrinsics.checkNotNullParameter(loanProviders, "loanProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        return new la0.b(fsh.c.a(loanProviders, new o(14)));
    }
}
