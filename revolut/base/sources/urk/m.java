package urk;

import afl.a0;
import afl.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(stats, "stats");
        boolean z = true;
        if (stats instanceof afl.f) {
            afl.c cVar = ((afl.f) stats).f4594c;
            return (cVar.f4582c == null && cVar.f4580a == null && cVar.f4581b == null) ? false : true;
        }
        if (!(stats instanceof afl.q)) {
            if (!(stats instanceof a0)) {
                throw new NoWhenBranchMatchedException();
            }
            w wVar = ((a0) stats).f4571b;
            return (wVar.f4655a == null && wVar.f4656b == null && wVar.f4657c == null && wVar.d == null) ? false : true;
        }
        afl.n nVar = ((afl.q) stats).f4628b;
        if (nVar != null) {
            if (nVar.f4617a == null && nVar.f4618b == null && nVar.f4619c == null && nVar.d == null && nVar.e == null) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        return pd.b.j(boolValueOf);
    }
}
