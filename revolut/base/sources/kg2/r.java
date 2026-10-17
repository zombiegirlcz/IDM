package kg2;

import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f183918p;

    public r(w80.b amountFormatter, e inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountFormatter;
        Long l2 = inputData.f183907a;
        this.f183918p = mra.d.b(this, new d(l2 != null ? l2.longValue() : 0L), stateMapper, null, false, 12);
    }

    public final void I2(n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j;
        y yVar = this.f183918p;
        if (z) {
            String str = ((j) event).f183911a;
            xi0.b.Companion.getClass();
            H2(yVar, new a82.r(this.o.b(str, xi0.b.E.f306286a), 21));
            return;
        }
        if (event.equals(l.f183913a)) {
            C2(new f(((d) ((j2) yVar.f22677a).getValue()).f183906a));
        } else if (event.equals(m.f183914a)) {
            C2(h.f183910a);
        } else {
            if (!event.equals(k.f183912a)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(g.f183909a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f183918p;
    }
}
