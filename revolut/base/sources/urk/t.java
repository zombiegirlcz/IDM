package urk;

import afl.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if (stats instanceof afl.f) {
            afl.c cVar = ((afl.f) stats).f4594c;
            return (cVar.d == null && cVar.e == null) ? false : true;
        }
        if ((stats instanceof afl.q) || (stats instanceof a0)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
