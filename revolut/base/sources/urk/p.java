package urk;

import afl.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if (stats instanceof afl.f) {
            afl.d dVar = ((afl.f) stats).e;
            return (dVar.f4584a == null && dVar.f4585b == null && dVar.f4586c == null) ? false : true;
        }
        if ((stats instanceof afl.q) || (stats instanceof a0)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
