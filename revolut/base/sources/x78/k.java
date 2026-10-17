package x78;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te8.v;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements g {
    public final hj8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kbb.c f303171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f303172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f303173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f303174s;

    public k(l stateMapper, hj8.a juniorProfileInteractor, kbb.c juniorConfigInteractor, v juniorPocketsProductInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = juniorProfileInteractor;
        this.f303171p = juniorConfigInteractor;
        this.f303172q = juniorPocketsProductInteractor;
        this.f303173r = walletInteractor;
        this.f303174s = mra.d.b(this, new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        nj8.n nVar = (nj8.n) this.o;
        Continuation continuation = null;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, yh5.b.e(nVar.k(null, hVar), xam.a.h(new j(this, continuation, 0), nVar.k(null, hVar)), nim.a.v(rd0.e.b(this.f303171p.L()), new x64.a(9))), null, null, new j(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f303174s;
    }
}
