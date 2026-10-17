package tc7;

import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class l0 implements e4m.e {
    public static la0.b a(ImmutableMap savingsProviders, fsh.c providerTransformer) {
        Intrinsics.checkNotNullParameter(savingsProviders, "savingsProviders");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        return new la0.b(fsh.c.a(savingsProviders, new b0(17)));
    }
}
