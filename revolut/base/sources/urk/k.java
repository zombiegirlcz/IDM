package urk;

import afl.a0;
import afl.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        v vVar;
        Intrinsics.checkNotNullParameter(stats, "stats");
        Boolean boolValueOf = null;
        a0 a0Var = stats instanceof a0 ? (a0) stats : null;
        if (a0Var != null && (vVar = a0Var.e) != null) {
            boolValueOf = Boolean.valueOf((vVar.f4652a == null && vVar.f4653b == null && vVar.f4654c == null && vVar.d == null && vVar.e == null) ? false : true);
        }
        return pd.b.j(boolValueOf);
    }
}
