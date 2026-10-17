package q9g;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    public e(c filtersParametersBuilder) {
        Intrinsics.checkNotNullParameter(filtersParametersBuilder, "filtersParametersBuilder");
    }

    public static void a(LinkedHashMap linkedHashMap, String str, Object obj2) {
        if (obj2 != null) {
            linkedHashMap.put(str, obj2);
        }
    }
}
