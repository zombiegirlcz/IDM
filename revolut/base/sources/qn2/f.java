package qn2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class f {
    private f() {
    }

    public static wn2.c a(rn2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String key = dVar.getKey();
        List params = dVar.getParams();
        if (params == null) {
            params = f0.f322471a;
        }
        return new wn2.c(key, params);
    }
}
