package fu7;

import du7.f4;
import gu7.p2;
import gu7.s2;
import gu7.v2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final p2 a(f4 f4Var) {
        Intrinsics.checkNotNullParameter(f4Var, "<this>");
        if (f4Var instanceof f4.d) {
            f4.d dVar = (f4.d) f4Var;
            return new v2(dVar.f117674a, dVar.f117675b);
        }
        if (f4Var instanceof f4.b) {
            return new s2(((f4.b) f4Var).f117670a);
        }
        if (f4Var instanceof f4.c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
