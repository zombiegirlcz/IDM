package t05;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends oki.h implements dli.b {
    public final p56.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r05.f f266936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r05.g f266937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xq3.j f266938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f266939s;

    public x(z stateMapper, p56.a detailsInteractor, r05.f insightsInteractor, r05.g creditScoreInteractor, xq3.j creditApplicationLifecycleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(detailsInteractor, "detailsInteractor");
        Intrinsics.checkNotNullParameter(insightsInteractor, "insightsInteractor");
        Intrinsics.checkNotNullParameter(creditScoreInteractor, "creditScoreInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        this.o = detailsInteractor;
        this.f266936p = insightsInteractor;
        this.f266937q = creditScoreInteractor;
        this.f266938r = creditApplicationLifecycleInteractor;
        this.f266939s = mra.d.b(this, new n(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        p56.a aVar = this.o;
        aVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l05.c cVar = (l05.c) aVar.f233024b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar2 = cVar.d;
        Unit unit = Unit.f186387a;
        vkm.d dVarB = cVar2.b(unit, loadingStrategy);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(dVarB, h0Var), null, null, new w(this, null, 0), 3);
        r05.f fVar = this.f266936p;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l05.g gVar = fVar.f250704a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.n(gVar.d.b(unit, loadingStrategy), h0Var), null, null, new w(this, null, 1), 3);
        yji.l.a1(this, rd0.e.n(r05.g.a(this.f266937q), h0Var), null, null, new w(this, null, 2), 3);
        xq3.j jVar = this.f266938r;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        xr3.k kVar = jVar.f308077a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.n(kVar.i.b(xr3.a.f308201a, loadingStrategy), h0Var), null, null, new w(this, null, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f266939s;
    }
}
