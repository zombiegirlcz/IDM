package h5g;

import at.r;
import b4g.i;
import b4g.j;
import cli.g;
import cli.y;
import gul.n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements dli.b {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f149558p;

    public e(r stateMapper, j bookingsRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bookingsRepository, "bookingsRepository");
        this.o = bookingsRepository;
        this.f149558p = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        j jVar = this.o;
        jVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, new g48.r(mo3.a.g(nim.a.v(jVar.d.b(Unit.f186387a, loadingStrategy), i.f), null, null, 3), 3), null, null, new n(this, null, 19), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f149558p;
    }
}
