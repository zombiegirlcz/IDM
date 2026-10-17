package uk5;

import cli.n;
import cli.y;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import tk5.j;
import uj6.v;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends oki.h implements dli.b {
    public final sd5.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f280690p;

    public d(n stateMapper, j multichainInfoSheet, sd5.c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(multichainInfoSheet, "multichainInfoSheet");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.o = cryptoConfigInteractor;
        this.f280690p = mra.d.b(this, new b(multichainInfoSheet, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        r map = this.o.a(false).map(new uhl.b(new v(5), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.b1(this, rd0.e.b(map), null, new uf0.d(this, null, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f280690p;
    }
}
