package urk;

import afl.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(stats, "stats");
        if ((stats instanceof afl.f) || (stats instanceof a0)) {
            return false;
        }
        if (!(stats instanceof afl.q)) {
            throw new NoWhenBranchMatchedException();
        }
        afl.l lVar = ((afl.q) stats).f;
        if (lVar != null) {
            boolValueOf = Boolean.valueOf((lVar.f4611a == null && lVar.f4612b == null) ? false : true);
        } else {
            boolValueOf = null;
        }
        return pd.b.j(boolValueOf);
    }
}
