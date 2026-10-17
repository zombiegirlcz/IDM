package urk;

import afl.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if (stats instanceof afl.q) {
            afl.p pVar = ((afl.q) stats).f4631h;
            return (pVar != null ? pVar.f4624a : null) != null;
        }
        if ((stats instanceof afl.f) || (stats instanceof a0)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
