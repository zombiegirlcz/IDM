package nt;

import aii.q;
import cli.n;
import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends oki.h implements dli.b {
    public final y o;

    public j(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof g) {
            C2(q.f5292a);
        } else {
            if (!(event instanceof f)) {
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
