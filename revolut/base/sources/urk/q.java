package urk;

import afl.a0;
import afl.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if ((stats instanceof afl.f) || (stats instanceof afl.q)) {
            return false;
        }
        if (!(stats instanceof a0)) {
            throw new NoWhenBranchMatchedException();
        }
        y yVar = ((a0) stats).f4573g;
        return (yVar.f4661a == null && yVar.f4662b == null && yVar.f4663c == null && yVar.d == null) ? false : true;
    }
}
