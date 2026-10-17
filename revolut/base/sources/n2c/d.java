package n2c;

import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import oki.h;
import skm.a2;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements dli.b {
    public final rul.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f211517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f211518q;

    public d(f stateMapper, rul.e revPointsSpareChangeInteractor, k revPointsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        this.o = revPointsSpareChangeInteractor;
        this.f211517p = revPointsInteractor;
        this.f211518q = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new mci.e(this, null, 28), new yi5.b(26));
    }

    public final a2 I2(dj0.d dVar) {
        return l.a1(this, rd0.e.n(nim.a.v(rd0.e.b(this.f211517p.c(true)), new ar3.a(20, dVar)), h0.f322473a), null, null, new c(this, null, 0), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f211518q;
    }
}
