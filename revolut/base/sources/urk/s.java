package urk;

import afl.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if (stats instanceof afl.f) {
            afl.e eVar = ((afl.f) stats).d;
            return (eVar.f4588a == null && eVar.f4589b == null && eVar.f4590c == null) ? false : true;
        }
        if ((stats instanceof afl.q) || (stats instanceof a0)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
