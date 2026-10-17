package ts;

import aii.q;
import cli.k;
import cli.n;
import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i extends oki.h implements dli.b {
    public final y o;

    public i(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, f.f273850a)) {
            C2(q.f5292a);
        } else {
            if (!Intrinsics.f(event, e.f273849a)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
