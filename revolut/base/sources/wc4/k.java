package wc4;

import cli.n;
import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements dli.b {
    public final y o;

    public k(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof c) {
            C2(f.f296337a);
            return;
        }
        if (!(event instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((d) event).f296336a;
        if (Intrinsics.f(str, "ID_KONTOMATIK")) {
            C2(g.f296338a);
        } else if (Intrinsics.f(str, "ID_MANUAL_UNDERWRITING")) {
            C2(h.f296339a);
        } else {
            hx7.e.n(new IllegalStateException(a0.d.r(str, " is not handled")));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
