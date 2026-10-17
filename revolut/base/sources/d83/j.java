package d83;

import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements dli.b {
    public final y o;

    public j(k stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof d) {
            d dVar = (d) event;
            C2(new a(dVar.f112114a, dVar.f112115b));
        } else {
            if (!(event instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(b.f112113a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
