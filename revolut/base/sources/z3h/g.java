package z3h;

import ael.d0;
import ael.q;
import android.content.Context;
import com.revolut.feature.retail.trading.advanced.charts.impl.service.TradingAdvancedChartService;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vc.s;
import vdl.d1;
import x8h.n0;
import ybl.l;
import zhl.k;
import zhl.n;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements m2h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whl.f f319279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zdl.c f319280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final exk.c f319281c;
    public final l70.e d;
    public final an0.c e;
    public final ee0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f319282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zdl.f f319283h;
    public final mrb.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h9h.a f319284j;
    public final trl.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jdh.b f319285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jk3.c f319286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w5j.f f319287n;
    public final q8b.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m2b.e f319288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f319289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c4f.a f319290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f319291s = this;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f319292t;
    public final e4m.e u;

    public g(l70.e eVar, ee0.a aVar, ite.a aVar2, c4f.a aVar3, h9h.a aVar4, an0.c cVar, mrb.b bVar, exk.c cVar2, trl.a aVar5, zdl.f fVar, u0e.a aVar6, w5j.f fVar2, jk3.c cVar3, q8b.a aVar7, y3h.a aVar8, jdh.b bVar2, whl.f fVar3, zdl.c cVar4, m2b.e eVar2, Context context) {
        this.f319279a = fVar3;
        this.f319280b = cVar4;
        this.f319281c = cVar2;
        this.d = eVar;
        this.e = cVar;
        this.f = aVar;
        this.f319282g = aVar2;
        this.f319283h = fVar;
        this.i = bVar;
        this.f319284j = aVar4;
        this.k = aVar5;
        this.f319285l = bVar2;
        this.f319286m = cVar3;
        this.f319287n = fVar2;
        this.o = aVar7;
        this.f319288p = eVar2;
        this.f319289q = context;
        this.f319290r = aVar3;
        int i = 10;
        this.f319292t = e4m.b.b(new yxj.c(this, 0, i));
        this.u = e4m.b.b(new yxj.c(this, 1, i));
    }

    public final z a() {
        return new z(this.f319285l.b(), new d4h.b());
    }

    public final b4h.c b() {
        vrl.g gVarB = this.k.b();
        s.j(gVarB);
        ybl.b bVarB = this.f319280b.b();
        s.j(bVarB);
        gte.a aVarB = this.f319282g.b();
        s.j(aVarB);
        kdh.b bVarB2 = this.f319285l.b();
        l80.e eVarH = this.d.h();
        s.j(eVarH);
        n0 n0VarQ = this.f319284j.q();
        fk3.a aVarA = this.f319286m.a();
        s.j(aVarA);
        return new b4h.c(gVarB, bVarB, aVarB, bVarB2, eVarH, n0VarQ, aVarA);
    }

    public final n3h.e c() {
        l80.e eVarH = this.d.h();
        s.j(eVarH);
        return new n3h.e(new o3h.a(eVarH), new o3h.b());
    }

    public final b4h.e d() {
        ue0.c cVar = (ue0.c) this.f319292t.get();
        gte.a aVarB = this.f319282g.b();
        s.j(aVarB);
        return new b4h.e(new t3h.e(cVar, aVarB));
    }

    public final jpc.e e() {
        udf.a aVar = (udf.a) this.k.F.get();
        s.j(aVar);
        return new jpc.e(aVar, new d1e.a(), c(), b(), this.f319287n.a());
    }

    public final i4b.f f() {
        d0 d0VarK = this.f319280b.k();
        s.j(d0VarK);
        return new i4b.f(d0VarK);
    }

    public final e4h.h g() {
        n8b.a aVarA = this.o.a();
        s.j(aVarA);
        return new e4h.h(new e4h.d(aVarA, new x3h.a()), new e4h.e(new x3h.a()), new e4h.f(new x3h.a()));
    }

    public final i4h.a h() {
        l4h.e eVar = new l4h.e();
        l4h.i iVar = new l4h.i();
        l4h.h hVar = new l4h.h();
        exk.c cVar = this.f319281c;
        jxk.c factory = (jxk.c) cVar.f130464m.get();
        s.j(factory);
        vwk.a tradingHoursUiAssetMapper = (vwk.a) cVar.f130463l.get();
        s.j(tradingHoursUiAssetMapper);
        k4h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(tradingHoursUiAssetMapper, "tradingHoursUiAssetMapper");
        Intrinsics.checkNotNullParameter(tradingHoursUiAssetMapper, "tradingHoursUiAssetMapper");
        jxk.f fVar = new jxk.f(tradingHoursUiAssetMapper);
        l4h.b bVar = new l4h.b();
        l80.e eVarH = this.d.h();
        s.j(eVarH);
        i4h.d dVar = new i4h.d(eVar, iVar, hVar, fVar, bVar, eVarH);
        b4h.e eVarD = d();
        whl.f fVar2 = this.f319279a;
        d1 repository = (d1) fVar2.i.p0.get();
        s.j(repository);
        gte.a featureToggleInteractor = fVar2.f297712h.b();
        s.j(featureToggleInteractor);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        ryc.a aVar = new ryc.a();
        aVar.f258289a = repository;
        aVar.f258290b = featureToggleInteractor;
        k kVarA = fVar2.a();
        zdl.c cVar2 = this.f319280b;
        ybl.b bVarB = cVar2.b();
        s.j(bVarB);
        n nVar = new n();
        d0 d0VarK = cVar2.k();
        s.j(d0VarK);
        ybl.k kVarD = this.f319283h.d();
        s.j(kVarD);
        mrb.b bVar2 = this.i;
        TradingAdvancedChartService tradingAdvancedChartService = (TradingAdvancedChartService) bVar2.f208098c.get();
        CoroutineScope coroutineScopeA = bVar2.f208097b.a();
        s.j(coroutineScopeA);
        kpj.f fVar3 = new kpj.f(new trb.c(tradingAdvancedChartService, coroutineScopeA));
        l lVarF = this.f319284j.f();
        yhl.h hVar2 = (yhl.h) fVar2.B.get();
        s.j(hVar2);
        fxk.a aVarA = cVar.a();
        s.j(aVarA);
        gte.a aVarB = this.f319282g.b();
        s.j(aVarB);
        return new i4h.a(dVar, eVarD, aVar, kVarA, bVarB, nVar, d0VarK, kVarD, fVar3, lVarF, hVar2, aVarA, aVarB);
    }

    public final prl.e i() {
        return new prl.e(k(), l(), new kpj.f(this.f319284j.H()), new ufl.b(new tfl.a()));
    }

    public final a5h.g j() {
        b5h.b bVar = new b5h.b();
        zdl.c cVar = this.f319280b;
        d0 d0VarK = cVar.k();
        s.j(d0VarK);
        ybl.b bVarB = cVar.b();
        s.j(bVarB);
        return new a5h.g(bVar, d0VarK, bVarB, l(), new u4h.b());
    }

    public final c4h.b k() {
        m2b.e eVar = this.f319288p;
        kge.d dVarA = eVar.a();
        ybl.k kVarD = this.f319283h.d();
        s.j(kVarD);
        zdl.c cVar = this.f319280b;
        ybl.b bVarB = cVar.b();
        s.j(bVarB);
        ybl.d dVarH = cVar.h();
        s.j(dVarH);
        l lVarF = this.f319284j.f();
        q qVarE = cVar.e();
        s.j(qVarE);
        f2b.b bVar = (f2b.b) eVar.f201810p.get();
        s.j(bVar);
        return new c4h.b(dVarA, kVarD, bVarB, dVarH, lVarF, qVarE, bVar);
    }

    public final c4h.c l() {
        ybl.k kVarD = this.f319283h.d();
        s.j(kVarD);
        return new c4h.c(kVarD);
    }
}
