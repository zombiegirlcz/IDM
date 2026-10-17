package urk;

import afl.a0;
import afl.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if ((stats instanceof afl.f) || (stats instanceof afl.q)) {
            return false;
        }
        if (!(stats instanceof a0)) {
            throw new NoWhenBranchMatchedException();
        }
        z zVar = ((a0) stats).f4572c;
        return (zVar.f4664a == null && zVar.f4665b == null) ? false : true;
    }
}
