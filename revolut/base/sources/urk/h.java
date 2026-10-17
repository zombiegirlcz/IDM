package urk;

import afl.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if ((stats instanceof afl.f) || (stats instanceof afl.q)) {
            return false;
        }
        if (!(stats instanceof a0)) {
            throw new NoWhenBranchMatchedException();
        }
        afl.t tVar = ((a0) stats).i;
        return (tVar.f4644a == null && tVar.f4645b == null && tVar.f4646c == null) ? false : true;
    }
}
