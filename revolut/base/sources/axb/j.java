package axb;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements g {
    public final jwb.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.e f10920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f10921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f10922r;

    public j(jwb.e revPointsGiftcardsInteractor, l80.e dateProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = revPointsGiftcardsInteractor;
        this.f10920p = dateProvider;
        this.f10922r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    public final void I2() {
        this.f10921q = l.a1(this, nim.a.u(new i(this, null, 0), this.o.c(null, w4l.h.f294642c)), null, null, new i(this, null, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f10922r;
    }
}
