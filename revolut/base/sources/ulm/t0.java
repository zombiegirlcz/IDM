package ulm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class t0 {
    public static u0 a(String... namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        return ue8.c.j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
    }
}
