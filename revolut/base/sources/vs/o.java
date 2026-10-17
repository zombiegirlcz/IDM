package vs;

import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o extends oki.h implements dli.b {
    public final y o;

    public o(cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, h.f291700a)) {
            C2(k.f291702a);
        } else if (Intrinsics.f(event, g.f291699a)) {
            B2();
        } else {
            if (!(event instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new l(((i) event).f291701a));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
