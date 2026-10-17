package f5g;

import cli.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements i {
    public final b4g.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f132321p;

    public k(n stateMapper, b4g.j bookingsRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bookingsRepository, "bookingsRepository");
        this.o = bookingsRepository;
        this.f132321p = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        b4g.j jVar = this.o;
        jVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.b1(this, rd0.e.n(nim.a.v(jVar.d.b(Unit.f186387a, loadingStrategy), b4g.i.f), h0.f322473a), null, new ew1.d(this, null, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f132321p;
    }
}
