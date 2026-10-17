package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 {
    private b0() {
    }

    public static c0 a(String type) {
        c0 c0Var;
        Intrinsics.checkNotNullParameter(type, "type");
        c0[] c0VarArrValues = c0.values();
        int length = c0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c0Var = null;
                break;
            }
            c0Var = c0VarArrValues[i];
            if (Intrinsics.f(c0Var.name(), type)) {
                break;
            }
            i++;
        }
        return c0Var == null ? c0.UNKNOWN : c0Var;
    }
}
