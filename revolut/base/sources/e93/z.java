package e93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z {
    private z() {
    }

    public static a0 a(String type) {
        a0 a0Var;
        Intrinsics.checkNotNullParameter(type, "type");
        a0[] a0VarArrValues = a0.values();
        int length = a0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                a0Var = null;
                break;
            }
            a0Var = a0VarArrValues[i];
            if (Intrinsics.f(a0Var.name(), type)) {
                break;
            }
            i++;
        }
        return a0Var == null ? a0.UNKNOWN : a0Var;
    }
}
