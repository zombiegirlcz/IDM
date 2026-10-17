package f40;

import cli.y;
import f40.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import w30.b;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends oki.h implements g {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f131995p;

    public i(h stateMapper, w30.b bVar) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        d eVar = d.b.f131991a;
        if (bVar != null && !(bVar instanceof b.C1627b)) {
            if (bVar instanceof b.a) {
                eVar = d.a.f131990a;
            } else if (bVar instanceof w30.a) {
                eVar = new c(((w30.a) bVar).f294075a);
            } else {
                if (!(bVar instanceof w30.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = new e(((w30.c) bVar).f294080a);
            }
        }
        d dVar = eVar;
        this.o = dVar;
        this.f131995p = mra.d.b(this, dVar, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f131995p;
    }
}
