package y77;

import android.content.Context;
import com.google.firebase.messaging.t;
import com.revolut.feature.global_markets.impl.data.network.GlobalMarketsService;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements h77.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9h.a f311406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p77.c f311407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f311408c;
    public final Context d;
    public final an0.c e;
    public final ee0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l70.e f311409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ee0.a f311410h;
    public final ite.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zdl.c f311411j;
    public final e4m.e k = e4m.b.b(new h(this, 2));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f311412l = e4m.b.b(new h(this, 1));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f311413m = e4m.b.b(new h(this, 0));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f311414n = e4m.b.b(new h(this, 4));
    public final e4m.e o = e4m.b.b(new h(this, 3));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f311415p = e4m.b.b(new h(this, 5));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f311416q = e4m.b.b(new h(this, 6));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f311417r = e4m.b.b(new h(this, 7));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f311418s = e4m.b.b(new h(this, 8));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f311419t = e4m.b.b(new h(this, 9));
    public final e4m.e u = e4m.b.b(new h(this, 10));

    public i(p77.c cVar, ee0.a aVar, nj0.a aVar2, l70.e eVar, ee0.c cVar2, zdl.c cVar3, ite.a aVar3, h9h.a aVar4, an0.c cVar4, Context context) {
        this.f311406a = aVar4;
        this.f311407b = cVar;
        this.f311408c = aVar2;
        this.d = context;
        this.e = cVar4;
        this.f = cVar2;
        this.f311409g = eVar;
        this.f311410h = aVar;
        this.i = aVar3;
        this.f311411j = cVar3;
    }

    public final q a() {
        GlobalMarketsService globalMarketsService = (GlobalMarketsService) this.f311413m.get();
        n77.d dVar = (n77.d) this.f311419t.get();
        a31.a aVar = new a31.a((ne0.j) this.f311415p.get());
        b80.c cVarP = this.f311409g.p();
        s.j(cVarP);
        return new q(new t(globalMarketsService, dVar, aVar, cVarP));
    }

    public final jpf.a b() {
        GlobalMarketsService globalMarketsService = (GlobalMarketsService) this.f311413m.get();
        n77.i iVar = (n77.i) this.o.get();
        q qVar = new q((ne0.j) this.f311415p.get());
        b80.c cVarP = this.f311409g.p();
        s.j(cVarP);
        t repository = new t(globalMarketsService, iVar, qVar, cVarP);
        t77.i pinnedAssetsRepository = new t77.i((ue0.c) this.f311416q.get());
        gte.a featureToggleInteractor = this.i.b();
        s.j(featureToggleInteractor);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pinnedAssetsRepository, "pinnedAssetsRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        jpf.a aVar = new jpf.a();
        aVar.f177267a = repository;
        aVar.f177268b = pinnedAssetsRepository;
        aVar.f177269c = featureToggleInteractor;
        return aVar;
    }
}
