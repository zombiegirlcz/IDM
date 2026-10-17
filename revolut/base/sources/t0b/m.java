package t0b;

import ael.d0;
import com.google.common.collect.ImmutableMap;
import com.revolut.core_ui_advanced_chart.delegate.AdvancedChartViewDelegate;
import com.revolut.feature.retail.trading.advanced.charts.impl.service.TradingAdvancedChartService;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import gsb.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qrb.q;
import te0.u;
import vc.s;
import vrl.y0;
import yrb.y;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0b.g f266979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdvancedChartViewDelegate f266980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsyncDiffRecyclerView f266981c;
    public final ViewController d;
    public final k e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f266982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f266983h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f266984j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f266985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f266986m;

    public m(k kVar, ViewController viewController, y0b.g gVar, AsyncDiffRecyclerView asyncDiffRecyclerView, AdvancedChartViewDelegate advancedChartViewDelegate) {
        this.e = kVar;
        this.f266979a = gVar;
        this.f266980b = advancedChartViewDelegate;
        this.f266981c = asyncDiffRecyclerView;
        this.d = viewController;
        int i = 0;
        this.f = e4m.b.b(new l(kVar, this, 1, i));
        this.f266982g = e4m.b.b(new l(kVar, this, 2, i));
        this.f266983h = e4m.b.b(new l(kVar, this, 0, i));
        this.i = e4m.b.b(new l(kVar, this, 4, i));
        this.f266984j = e4m.b.b(new l(kVar, this, 3, i));
        this.k = e4m.b.b(new l(kVar, this, 6, i));
        this.f266985l = e4m.b.b(new l(kVar, this, 7, i));
        this.f266986m = e4m.b.b(new l(kVar, this, 5, i));
    }

    public final i0b.d b() {
        jp.a aVar = this.e.e;
        c1b.c cVar = c1b.c.STOCKS;
        lrb.c cVar2 = aVar.f177172a;
        ybl.b bVarB = cVar2.f199484a.b();
        s.j(bVarB);
        mrb.b bVar = cVar2.f199485b;
        TradingAdvancedChartService tradingAdvancedChartService = (TradingAdvancedChartService) bVar.f208098c.get();
        CoroutineScope coroutineScopeA = bVar.f208097b.a();
        s.j(coroutineScopeA);
        ImmutableMap interactors = ImmutableMap.of(cVar, (v8b.a) new nrb.b(bVarB, new kpj.f(new trb.c(tradingAdvancedChartService, coroutineScopeA))), c1b.c.CRYPTO, new v8b.a(aVar.f177173b.f278149b.a()));
        s.j(interactors);
        z0b.b.Companion.getClass();
        y0b.g inputData = this.f266979a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactors, "interactors");
        i0b.d dVar = (i0b.d) interactors.get(inputData.f310177a);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("Cannot find AdvancedChartsInteractor for " + inputData.f310177a);
    }

    public final j0b.c c() {
        jp.a aVar = this.e.e;
        c1b.c cVar = c1b.c.STOCKS;
        lrb.c cVar2 = aVar.f177172a;
        kdh.b bVarB = cVar2.f199486c.b();
        u uVar = (u) cVar2.f199492n.get();
        fsb.a aVar2 = new fsb.a();
        q qVar = q.STOCK;
        trl.a aVar3 = cVar2.f;
        evl.c sourcePocketMapper = aVar3.g();
        m4h.b instrumentWarningStateMapper = new m4h.b();
        bsb.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(sourcePocketMapper, "sourcePocketMapper");
        Intrinsics.checkNotNullParameter(instrumentWarningStateMapper, "instrumentWarningStateMapper");
        dsb.c[] elements = {new dsb.n(sourcePocketMapper), new dsb.b(instrumentWarningStateMapper)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        dsb.e eVar = new dsb.e(kotlin.collections.d.y0(elements));
        q qVar2 = q.CFD;
        m4h.b instrumentWarningStateMapper2 = new m4h.b();
        Intrinsics.checkNotNullParameter(instrumentWarningStateMapper2, "instrumentWarningStateMapper");
        dsb.c[] elements2 = {new dsb.a(), new dsb.b(instrumentWarningStateMapper2)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        ImmutableMap immutableMapOf = ImmutableMap.of(qVar, eVar, qVar2, new dsb.e(kotlin.collections.d.y0(elements2)));
        ImmutableMap immutableMapOf2 = ImmutableMap.of(qVar, (asb.a) new asb.c(), qVar2, new asb.a());
        esb.d dVar = new esb.d();
        l4i.a amountConverter = new l4i.a();
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        ImmutableMap immutableMapOf3 = ImmutableMap.of(qVar, (esb.b) dVar, qVar2, new esb.b());
        bsl.c cVarE = aVar3.e();
        l4i.a amountConverter2 = new l4i.a();
        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
        ImmutableMap immutableMapOf4 = ImmutableMap.of(qVar, (gsb.a) new v(cVarE, new zrb.a(), new qy5.a(new m4h.d())), qVar2, new gsb.a(new l4i.a(), new qy5.a(new m4h.d())));
        l4i.a aVar4 = new l4i.a();
        m2b.e eVar2 = cVar2.f199487g;
        y1b.a aVarD = eVar2.d();
        s.j(aVarD);
        p2b.c cVarE2 = eVar2.e();
        s.j(cVarE2);
        zdl.c cVar3 = cVar2.f199484a;
        ybl.b bVarB2 = cVar3.b();
        s.j(bVarB2);
        lal.a aVarA = cVar2.a();
        vrl.s sVarD = aVar3.d();
        s.j(sVarD);
        prb.c cVar4 = new prb.c();
        ybl.d dVarH = cVar3.h();
        s.j(dVarH);
        d0 d0VarK = cVar3.k();
        s.j(d0VarK);
        y0 y0VarJ = aVar3.j();
        s.j(y0VarJ);
        orb.i iVar = new orb.i(aVar4, aVarD, cVarE2, bVarB2, aVarA, sVarD, cVar4, dVarH, d0VarK, y0VarJ);
        l4i.a aVar5 = new l4i.a();
        d0 d0VarK2 = cVar3.k();
        s.j(d0VarK2);
        ybl.d dVarH2 = cVar3.h();
        s.j(dVarH2);
        ddf.a aVar6 = (ddf.a) aVar3.f273811b0.get();
        s.j(aVar6);
        ybl.l lVarF = cVar2.f199488h.f();
        prb.c cVar5 = new prb.c();
        orb.c cVar6 = new orb.c(new l4i.a(), cVar2.i.a());
        ybl.b bVarB3 = cVar3.b();
        s.j(bVarB3);
        y0 y0VarJ2 = aVar3.j();
        s.j(y0VarJ2);
        zrb.b bVar = new zrb.b();
        vrl.s sVarD2 = aVar3.d();
        s.j(sVarD2);
        ImmutableMap immutableMapOf5 = ImmutableMap.of(qVar2, (orb.o) iVar, qVar, new orb.o(aVar5, d0VarK2, dVarH2, aVar6, lVarF, cVar5, cVar6, bVarB3, y0VarJ2, bVar, sVarD2, cVar2.a()));
        wj0.a aVarI = ((nj0.d) cVar2.f199489j).i();
        s.j(aVarI);
        vdf.d dVar2 = (vdf.d) cVar2.o.get();
        csb.a aVar7 = new csb.a();
        ybl.b bVarB4 = cVar3.b();
        s.j(bVarB4);
        qd0.b bVarN = cVar2.k.n();
        s.j(bVarN);
        ImmutableMap factories = ImmutableMap.of(cVar, (y8b.e) new y(bVarB, uVar, aVar2, immutableMapOf, immutableMapOf2, immutableMapOf3, immutableMapOf4, immutableMapOf5, aVarI, dVar2, aVar7, bVarB4, bVarN), c1b.c.CRYPTO, new y8b.e());
        s.j(factories);
        z0b.b.Companion.getClass();
        y0b.g inputData = this.f266979a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(factories, "factories");
        j0b.c cVar7 = (j0b.c) factories.get(inputData.f310177a);
        if (cVar7 != null) {
            return cVar7;
        }
        throw new IllegalStateException("Cannot find AdvancedChartsTradeExtensionContract.Factory for " + inputData.f310177a);
    }

    @Override // xki.e
    public final Set f() {
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(this.i, "Set contributions cannot be null", arrayList);
        return kii.e.C(this.f266982g, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }

    @Override // xki.e
    public final Set g() {
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(this.f266983h, "Set contributions cannot be null", arrayList);
        return kii.e.C(this.f266984j, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }
}
