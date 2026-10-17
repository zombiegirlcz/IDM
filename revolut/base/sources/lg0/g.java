package lg0;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class g {

    @NotNull
    public static final f Companion = new f();

    public static final String a(String key, Map map) {
        Intrinsics.checkNotNullParameter(key, "key");
        Set set = (Set) map.get(key);
        if (set != null) {
            return (String) d0.c0(set);
        }
        return null;
    }
}
