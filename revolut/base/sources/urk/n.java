package urk;

import afl.a0;
import afl.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if ((stats instanceof afl.f) || (stats instanceof afl.q)) {
            return false;
        }
        if (!(stats instanceof a0)) {
            throw new NoWhenBranchMatchedException();
        }
        x xVar = ((a0) stats).f4574h;
        return (xVar.f4658a == null && xVar.f4659b == null && xVar.f4660c == null) ? false : true;
    }
}
