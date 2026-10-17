package urk;

import afl.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if (stats instanceof afl.f) {
            afl.b bVar = ((afl.f) stats).f4593b;
            return (bVar.f4576a == null && bVar.f4577b == null && bVar.f4578c == null) ? false : true;
        }
        if ((stats instanceof afl.q) || (stats instanceof a0)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
