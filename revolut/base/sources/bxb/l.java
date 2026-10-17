package bxb;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements h {
    public final jwb.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jwb.a f19654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a29.b f19655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l80.e f19656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f19657s;

    public l(cli.n stateMapper, jwb.e revPointsGiftcardsInteractor, jwb.a revPointsGiftcardsConfigInteractor, a29.b lifestyleBorderlessFooterFactory, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsConfigInteractor, "revPointsGiftcardsConfigInteractor");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = revPointsGiftcardsInteractor;
        this.f19654p = revPointsGiftcardsConfigInteractor;
        this.f19655q = lifestyleBorderlessFooterFactory;
        this.f19656r = dateProvider;
        this.f19657s = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    public final void I2() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.u(new j(this, continuation, 0), this.o.c(null, w4l.i.f294643c)), null, null, new j(this, continuation, 1), 3);
        yji.l.b1(this, ((x29.b) this.f19655q).a(), null, new j(this, continuation, 2), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
        l2(new brc.h(this, null, 15), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f19657s;
    }
}
