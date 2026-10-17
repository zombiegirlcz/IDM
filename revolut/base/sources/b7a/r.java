package b7a;

import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f12988p;

    public r(w80.b amountFormatter, e inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountFormatter;
        Long l2 = inputData.f12977a;
        this.f12988p = mra.d.b(this, new d(l2 != null ? l2.longValue() : 0L), stateMapper, null, false, 12);
    }

    public final void I2(n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j;
        y yVar = this.f12988p;
        if (z) {
            String str = ((j) event).f12981a;
            xi0.b.Companion.getClass();
            H2(yVar, new a82.r(this.o.b(str, xi0.b.f306275l.f306286a), 3));
            return;
        }
        if (event instanceof k) {
            C2(g.f12979a);
        } else if (event instanceof l) {
            C2(new f(((d) ((j2) yVar.f22677a).getValue()).f12976a));
        } else {
            if (!(event instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(h.f12980a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f12988p;
    }
}
