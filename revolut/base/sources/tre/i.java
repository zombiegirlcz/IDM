package tre;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import tna.p;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends oki.h implements f {
    public final pre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pre.d f273787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mre.c f273788q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hk0.a f273789r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tqi.e f273790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f273791t;
    public final y u;

    public i(pre.c termsInteractor, pre.d userDocumentsInteractor, mre.c termsNavigationFactory, hk0.a networkFileRepository, tqi.e shareExternalDestinationFactory, j stateMapper) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(userDocumentsInteractor, "userDocumentsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = termsInteractor;
        this.f273787p = userDocumentsInteractor;
        this.f273788q = termsNavigationFactory;
        this.f273789r = networkFileRepository;
        this.f273790s = shareExternalDestinationFactory;
        this.u = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        a2 a2Var = this.f273791t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        pre.c cVar = this.o;
        vkm.d dVarB = rd0.e.b(pd.b.r(nre.a.a(cVar.f238999a, 3), new pre.b(cVar, 1)));
        sre.k kVar = (sre.k) this.f273787p.f239000a;
        kVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        this.f273791t = yji.l.a1(this, rd0.e.n(nim.a.v(u0.m(dVarB, kVar.d.b(Unit.f186387a, loadingStrategy)), new tpi.g(9)), h0.f322473a), null, null, new p(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
