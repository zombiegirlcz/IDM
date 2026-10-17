package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m0 {
    private m0() {
    }

    public static n0 a(String type) {
        n0 n0Var;
        Intrinsics.checkNotNullParameter(type, "type");
        n0[] n0VarArrValues = n0.values();
        int length = n0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                n0Var = null;
                break;
            }
            n0Var = n0VarArrValues[i];
            if (Intrinsics.f(n0Var.name(), type)) {
                break;
            }
            i++;
        }
        return n0Var == null ? n0.UNSUPPORTED : n0Var;
    }
}
