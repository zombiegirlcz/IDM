package ke4;

import cli.y;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends oki.h implements e {

    @NotNull
    private static final p Companion = new p();
    public final y o;

    public q(cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new f(f0.f322471a), stateMapper, null, false, 12);
    }

    public final void I2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j;
        l lVar = l.f182993a;
        if (z) {
            C2(lVar);
            return;
        }
        if (event instanceof g) {
            C2(lVar);
            return;
        }
        boolean z3 = event instanceof h;
        y yVar = this.o;
        if (z3) {
            C2(new m(((f) ((j2) yVar.f22677a).getValue()).f182988a));
            return;
        }
        if (!(event instanceof i)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = ((i) event).f182991a.k;
        if (obj2 instanceof xy3.f) {
            H2(yVar, new k5e.k((xy3.f) obj2, 28));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "LoanSelectorControllerModel", a0.d.m(obj2, "Unsupported parcel: "), null, h0Var);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
