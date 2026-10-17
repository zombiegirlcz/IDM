package b88;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends oki.h implements h {
    public final zf8.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f13134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final djb.n f13135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zf8.n f13136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kbb.c f13137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final an8.b f13138t;
    public final y u;

    public n(p stateMapper, zf8.k juniorAccountInfoProvider, hj8.a juniorProfileInteractor, djb.n savingsAccountsDetailsInteractor, zf8.n juniorAccountStatesProvider, kbb.c juniorConfigInteractor, an8.b juniorSavingProductInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        this.o = juniorAccountInfoProvider;
        this.f13134p = juniorProfileInteractor;
        this.f13135q = savingsAccountsDetailsInteractor;
        this.f13136r = juniorAccountStatesProvider;
        this.f13137s = juniorConfigInteractor;
        this.f13138t = juniorSavingProductInteractor;
        this.u = mra.d.b(this, new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        zf8.k kVar = this.o;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        yji.l.a1(this, ta6.a.g(xam.a.h(new l(this, continuation, 0), kVar.c(null, hVar)), ((nj8.n) this.f13134p).k(null, hVar), rd0.e.b(this.f13136r.d(null, hVar)), nim.a.v(rd0.e.b(this.f13137s.L()), new b73.h(14)), new m(5, 0, null)), null, null, new l(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
