package th7;

import com.google.common.collect.ImmutableMap;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import kyk.x;
import ne0.j;
import uh7.o;
import vc.s;
import ybl.k;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f271312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f271313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f271314c;
    public final h9h.a d;
    public final zdl.c e;
    public final hsh.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zdl.f f271315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ite.a f271316h;
    public final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s5d.a f271317j;
    public final u8h.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f271318l = this;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f271319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f271320n;

    public b(ee0.a aVar, nj0.a aVar2, h9h.a aVar3, an0.c cVar, s5d.a aVar4, u8h.c cVar2, zdl.f fVar, hsh.b bVar, zdl.c cVar3, ite.a aVar5, x xVar) {
        this.f271312a = aVar2;
        this.f271313b = cVar;
        this.f271314c = aVar;
        this.d = aVar3;
        this.e = cVar3;
        this.f = bVar;
        this.f271315g = fVar;
        this.f271316h = aVar5;
        this.i = xVar;
        this.f271317j = aVar4;
        this.k = cVar2;
        int i = 25;
        this.f271319m = e4m.b.b(new sac.a(this, 0, i));
        this.f271320n = e4m.b.b(new sac.a(this, 1, i));
    }

    public final e84.e a() {
        twg.c cVarB = b();
        b7h.a aVar = new b7h.a((j) this.f271320n.get(), 2);
        nh7.d dVar = nh7.d.MOST_TRADED;
        h9h.a aVar2 = this.d;
        ImmutableMap immutableMapOf = ImmutableMap.of(dVar, (vh7.c) new wh7.b(new pi7.a(aVar2.C())), nh7.d.POPULAR_STARTER_CFDS, (vh7.c) new xh7.b(aVar2.C()), nh7.d.CFDS_PNL_DRIVERS, new vh7.c(new adh.a(), aVar2.C()));
        yh7.b bVar = new yh7.b(aVar2.C(), new mi7.c());
        o oVar = new o();
        a0 a0VarC = this.f.c();
        s.j(a0VarC);
        zdl.f fVar = this.f271315g;
        k kVarD = fVar.d();
        s.j(kVarD);
        gte.a aVarB = this.f271316h.b();
        s.j(aVarB);
        k kVarD2 = fVar.d();
        s.j(kVarD2);
        return new e84.e(cVarB, aVar, immutableMapOf, bVar, oVar, a0VarC, kVarD, aVarB, new zh7.c(kVarD2, this.i.a()));
    }

    public final twg.c b() {
        ai7.f instrumentComparatorProvider = new ai7.f();
        di7.b instrumentsTrendCollectionsRepository = (di7.b) this.f271319m.get();
        e9h.d performanceAssetsTransformer = this.d.D();
        ji7.d trendCollectionInstrumentsPicker = new ji7.d();
        ybl.b instrumentTickerInteractor = this.e.b();
        s.j(instrumentTickerInteractor);
        Intrinsics.checkNotNullParameter(instrumentComparatorProvider, "instrumentComparatorProvider");
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionsRepository, "instrumentsTrendCollectionsRepository");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(trendCollectionInstrumentsPicker, "trendCollectionInstrumentsPicker");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        twg.c cVar = new twg.c();
        cVar.f275017a = instrumentComparatorProvider;
        cVar.f275018b = instrumentsTrendCollectionsRepository;
        cVar.f275019c = performanceAssetsTransformer;
        cVar.d = instrumentTickerInteractor;
        return cVar;
    }

    public final mi7.e c() {
        return new mi7.e(this.d.C(), new mi7.b(), new mi7.c());
    }

    public final xe0.e d() {
        yk0.a databaseSessionProvider = this.f271313b.b();
        s.j(databaseSessionProvider);
        ee0.a aVar = this.f271314c;
        je0.d mapper = aVar.d();
        s.j(mapper);
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return xe0.f.f(fVarF, databaseSessionProvider, "instruments_trend_collections_storage", mapper, 3, v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new ei7.a(2, 3, 0)), 32);
    }
}
