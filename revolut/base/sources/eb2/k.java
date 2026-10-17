package eb2;

import cli.n;
import cli.y;
import eb2.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends oki.h implements f {
    public final y o;

    public k(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof h) {
            C2(e.b.f124288a);
        } else {
            if (!(event instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(e.a.f124287a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
