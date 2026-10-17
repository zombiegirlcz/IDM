package zli;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f323284a;

    static {
        Map params = r0.g();
        Intrinsics.checkNotNullParameter(params, "params");
        f323284a = params;
    }

    public static final String a(LinkedHashMap linkedHashMap, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Set set = (Set) linkedHashMap.get(key);
        if (set != null) {
            return (String) d0.c0(set);
        }
        return null;
    }
}
