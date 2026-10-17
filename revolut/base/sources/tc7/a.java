package tc7;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a implements e4m.e {
    public static la0.b a(ImmutableMap collateralProviders) {
        Intrinsics.checkNotNullParameter(collateralProviders, "collateralProviders");
        return new la0.b((Map) collateralProviders);
    }
}
