package p68;

import cli.y;
import i3g.k;
import kotlin.jvm.internal.Intrinsics;
import ox5.r;
import rh8.o0;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements f {
    public final o0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f233230p;

    public i(o0 juniorTermsProvider, k stateMapper) {
        Intrinsics.checkNotNullParameter(juniorTermsProvider, "juniorTermsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = juniorTermsProvider;
        this.f233230p = mra.d.b(this, new e(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, nz8.d.j(rd0.e.b(this.o.d()), new p4a.g(12), 1), null, null, new r(this, null, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f233230p;
    }
}
