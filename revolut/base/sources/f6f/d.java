package f6f;

import cli.g;
import cli.y;
import g6f.m;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends h implements dli.b {
    public final g6f.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f132423p;

    public d(g6f.c compareChartExtension, e stateMapper) {
        Intrinsics.checkNotNullParameter(compareChartExtension, "compareChartExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = compareChartExtension;
        this.f132423p = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        m mVar = (m) this.o;
        l.b1(this, mVar.f140938n.B(new g4k.e(mVar, 7)), null, new ew1.d(this, null, 26), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f132423p;
    }
}
