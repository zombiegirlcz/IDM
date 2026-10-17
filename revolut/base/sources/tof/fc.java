package tof;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fc {
    public static final i7 a(i7 i7Var, i7 i7Var2) {
        Intrinsics.checkNotNullParameter(i7Var, "<this>");
        if (i7Var2 == null) {
            return i7Var;
        }
        i7.Companion.getClass();
        return i7.c.a(i7Var, i7Var2);
    }

    public static final na b(i7 i7Var) {
        Intrinsics.checkNotNullParameter(i7Var, "<this>");
        return new na(i7Var);
    }

    public static final i7 c(i7 i7Var, i7 i7Var2) {
        Intrinsics.checkNotNullParameter(i7Var, "<this>");
        if (i7Var2 == null) {
            return i7Var;
        }
        i7.Companion.getClass();
        return i7.c.b(i7Var, i7Var2);
    }
}
