package kgm;

import akg.n;
import android.print.PrintAttributes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsController;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import efm.r;
import igm.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jid.v;
import kfm.k;
import kfm.o;
import kl.b0;
import knd.m0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KProperty;
import lak.l;
import nya.i0;
import om4.k3;
import om4.l3;
import skm.e0;
import skm.p0;
import zhm.a0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements p, o, com.bumptech.glide.load.data.g, OnCompleteListener, qdf.d, igm.o, n2h.g, pc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f184018b;

    public c(j2i.c function) {
        this.f184017a = 4;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f184018b = function;
    }

    @Override // n2h.g
    public r C0() {
        InvestmentsController investmentsController = (InvestmentsController) this.f184018b;
        KProperty[] kPropertyArr = InvestmentsController.S;
        r map = investmentsController.d3().f174533b.f58955g.map(new o4a.e(4, new o2g.f(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // n2h.g
    public r G0() {
        InvestmentsController investmentsController = (InvestmentsController) this.f184018b;
        KProperty[] kPropertyArr = InvestmentsController.S;
        r map = investmentsController.d3().f174533b.f.map(new o4a.e(3, new o2g.f(23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.bumptech.glide.load.data.g
    public Object a() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f184018b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f184017a) {
            case 4:
                return ((j2i.c) this.f184018b).invoke(obj2);
            case 5:
                return ((j2i.c) this.f184018b).invoke(obj2);
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 16:
            case 17:
            case 20:
            default:
                return ((h0) this.f184018b).invoke(obj2);
            case 7:
                return ((l) this.f184018b).invoke(obj2);
            case 13:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 6) {
                    return ((k) this.f184018b).c(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
                }
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            case 15:
                return ((m08.i) this.f184018b).invoke(obj2);
            case 18:
                return ((n0c.p) this.f184018b).invoke(obj2);
            case 19:
                return ((n0c.p) this.f184018b).invoke(obj2);
            case 21:
                return ((ne0.e) this.f184018b).invoke(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ki0.e
            if (r0 == 0) goto L13
            r0 = r5
            ki0.e r0 = (ki0.e) r0
            int r1 = r0.f184164w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184164w = r1
            goto L18
        L13:
            ki0.e r0 = new ki0.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184164w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f184018b
            oc.b r5 = (oc.b) r5
            oc.e r5 = (oc.e) r5
            com.google.android.gms.tasks.Task r5 = r5.a()
            java.lang.String r2 = "getAppUpdateInfo(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r0.f184164w = r3
            java.lang.Object r5 = jh.d.b(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            oc.a r5 = (oc.a) r5
            ki0.d r0 = new ki0.d
            int r1 = r5.f223996b
            int r5 = r5.f223995a
            r0.<init>(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.c.b(gim.c):java.lang.Object");
    }

    public Object c(jdb.a aVar, gim.i iVar) throws Throwable {
        i0 i0Var = new i0((kye.e) this.f184018b, aVar, null, 26);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, i0Var, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
    }

    public n d(String juniorId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        un8.b bVar = (un8.b) this.f184018b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(bVar.d.b(juniorId, loadingStrategy), new l3(22));
    }

    public r e(String breakdownId) {
        Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
        return f(breakdownId, z3i.b.RETAIL);
    }

    public r f(String breakdownId, z3i.b endpoint) {
        Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        i4i.g gVar = (i4i.g) ((n4i.a) this.f184018b);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return gVar.f.f(new i4i.d(breakdownId, endpoint), false);
    }

    public vkm.d g(cw5.e timeSpan, cw5.d assetType, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        tw5.i iVar = (tw5.i) this.f184018b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        String strS = a0.d.s("CRYPTO_TRENDING_", timeSpan.name(), "_", assetType.name());
        return new x4l.c(new tw5.h(iVar, timeSpan, assetType, null), new tkm.d(iVar, strS, 27), new qce.b(iVar, strS, 28), new tna.p(iVar, strS, null, 19), new sne.e(iVar, strS, (Continuation) null)).b(Unit.f186387a, loadingStrategy);
    }

    public ArrayList h(ind.c analyticsByPeriod, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval) {
        Intrinsics.checkNotNullParameter(analyticsByPeriod, "analyticsByPeriod");
        ArrayList<he3.h> arrayListJ = j(analyticsSpendingPeriod$Interval, analyticsByPeriod.b(false));
        ArrayList arrayList = new ArrayList(w.t(arrayListJ, 10));
        for (he3.h hVar : arrayListJ) {
            j9l.a aVar = (j9l.a) this.f184018b;
            xi0.b bVar = analyticsByPeriod.d;
            dj0.d dVarA = aVar.a(bVar, hVar.a(bVar, true), analyticsByPeriod.f162796h);
            arrayList.add(new Pair(hVar, dVarA != null ? Long.valueOf(Math.abs(dVarA.f115082a)) : null));
        }
        List listP0 = d0.P0(arrayList, new k2j.d(new m0(), 3));
        ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList2.add((he3.h) ((Pair) it8.next()).f186385a);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public knd.k0 i(ind.c r5, java.lang.String r6, fnd.a r7, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r8) {
        /*
            r4 = this;
            java.lang.String r0 = "analyticsByPeriod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selectedCategoryId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L50
            ind.b0 r2 = r5.e
            boolean r3 = r2 instanceof ind.z
            if (r3 == 0) goto L50
            int[] r5 = knd.l0.f186107a
            int r7 = r7.ordinal()
            r5 = r5[r7]
            if (r5 == r1) goto L2c
            r7 = 2
            if (r5 != r7) goto L26
            ind.z r2 = (ind.z) r2
            java.util.List r5 = r2.f162836b
            goto L30
        L26:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L2c:
            ind.z r2 = (ind.z) r2
            java.util.List r5 = r2.f162835a
        L30:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L36:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r5.next()
            r1 = r7
            he3.j r1 = (he3.j) r1
            java.lang.String r1 = r1.f151563a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r1 == 0) goto L36
            goto L4d
        L4c:
            r7 = r0
        L4d:
            he3.j r7 = (he3.j) r7
            goto L71
        L50:
            java.util.ArrayList r5 = r5.b(r1)
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r5.next()
            r1 = r7
            he3.j r1 = (he3.j) r1
            java.lang.String r1 = r1.f151563a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r1 == 0) goto L58
            goto L6f
        L6e:
            r7 = r0
        L6f:
            he3.j r7 = (he3.j) r7
        L71:
            if (r7 != 0) goto L74
            return r0
        L74:
            knd.k0 r5 = new knd.k0
            java.util.List r6 = zhm.u.c(r7)
            java.util.ArrayList r6 = r4.j(r8, r6)
            r5.<init>(r7, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.c.i(ind.c, java.lang.String, fnd.a, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval):knd.k0");
    }

    public ArrayList j(AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, List selectedCategories) {
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = selectedCategories.iterator();
        while (it8.hasNext()) {
            he3.j jVar = (he3.j) it8.next();
            a0.x(analyticsSpendingPeriod$Interval != null ? lnd.p0.d(jVar, analyticsSpendingPeriod$Interval).e : jVar.e, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r9 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f184018b
            un8.b r0 = (un8.b) r0
            boolean r1 = r10 instanceof on8.a
            if (r1 == 0) goto L17
            r1 = r10
            on8.a r1 = (on8.a) r1
            int r2 = r1.f226915x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f226915x = r2
            goto L1c
        L17:
            on8.a r1 = new on8.a
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f226915x
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3f
            if (r3 == r6) goto L39
            if (r3 != r5) goto L31
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L2f
            goto L77
        L2f:
            r9 = move-exception
            goto L7a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.String r9 = r1.u
            yhm.o.b(r10)
            goto L60
        L3f:
            yhm.o.b(r10)
            r1.u = r9
            r1.f226915x = r6
            r0.getClass()
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            u2i.g r3 = new u2i.g
            r7 = 29
            r3.<init>(r0, r9, r4, r7)
            java.lang.Object r10 = skm.e0.J(r10, r3, r1)
            if (r10 != r2) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L5d:
            if (r10 != r2) goto L60
            goto L76
        L60:
            r1.u = r4     // Catch: java.lang.Exception -> L2f
            r1.f226915x = r5     // Catch: java.lang.Exception -> L2f
            x4l.c r10 = r0.d     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r10.d(r9, r6, r1)     // Catch: java.lang.Exception -> L2f
            if (r9 != r2) goto L6d
            goto L6f
        L6d:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2f
        L6f:
            if (r9 != r2) goto L72
            goto L74
        L72:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2f
        L74:
            if (r9 != r2) goto L77
        L76:
            return r2
        L77:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2f
            goto L83
        L7a:
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r9, r10)
        L83:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.c.k(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // qdf.d
    public ihm.f n() {
        return ((StockDetailsOverviewController) this.f184018b).P.f51654g;
    }

    @Override // qdf.d
    public ihm.f o() {
        return ((StockDetailsOverviewController) this.f184018b).P.d;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        pfm.g gVar = (pfm.g) this.f184018b;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            rd0.e.s(task);
            gVar.onComplete();
        } catch (Exception e) {
            if (gVar.isDisposed()) {
                return;
            }
            gVar.onError(e);
        }
    }

    @Override // igm.p
    public boolean test(Object obj2) {
        return Objects.equals(obj2, this.f184018b);
    }

    @Override // pc.c
    public Object zza() {
        return new oc.d(((oc.f) ((b0) this.f184018b).f185144b).f224008a);
    }

    public c(j2i.c function, byte b4) {
        this.f184017a = 5;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f184018b = function;
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f184017a = i;
        this.f184018b = obj2;
    }

    public c(h0 function) {
        this.f184017a = 22;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f184018b = function;
    }

    public c(l function) {
        this.f184017a = 7;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f184018b = function;
    }

    public c(m08.i function) {
        this.f184017a = 15;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f184018b = function;
    }

    public c(n0c.p function) {
        this.f184017a = 18;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f184018b = function;
    }

    public c(n0c.p function, byte b4) {
        this.f184017a = 19;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f184018b = function;
    }

    public c(ne0.e function) {
        this.f184017a = 21;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f184018b = function;
    }

    public c(oc.b appUpdateManager) {
        this.f184017a = 1;
        Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
        this.f184018b = appUpdateManager;
    }

    public c(fkg.a screenerInstrumentProvider) {
        this.f184017a = 16;
        Intrinsics.checkNotNullParameter(screenerInstrumentProvider, "screenerInstrumentProvider");
        this.f184018b = screenerInstrumentProvider;
    }

    public c(v shopsLocationInteractor) {
        this.f184017a = 28;
        Intrinsics.checkNotNullParameter(shopsLocationInteractor, "shopsLocationInteractor");
        this.f184018b = shopsLocationInteractor;
    }

    public c(pfm.g emitter) {
        this.f184017a = 14;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f184018b = emitter;
    }

    public c(kye.e repository) {
        this.f184017a = 12;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f184018b = repository;
    }

    public c(uc7.a eventDispatcher) {
        this.f184017a = 27;
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        this.f184018b = eventDispatcher;
    }

    public c(tw5.i repository) {
        this.f184017a = 24;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f184018b = repository;
    }

    public c(jx0.a screenerInstrumentsWithPerformanceProvider) {
        this.f184017a = 23;
        Intrinsics.checkNotNullParameter(screenerInstrumentsWithPerformanceProvider, "screenerInstrumentsWithPerformanceProvider");
        this.f184018b = screenerInstrumentsWithPerformanceProvider;
    }

    public c(lnd.p0 categoryGroupMapper, j9l.a moneyCalculator) {
        this.f184017a = 2;
        Intrinsics.checkNotNullParameter(categoryGroupMapper, "categoryGroupMapper");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f184018b = moneyCalculator;
    }

    public c(n4i.a orderQuoteRepository) {
        this.f184017a = 10;
        Intrinsics.checkNotNullParameter(orderQuoteRepository, "orderQuoteRepository");
        this.f184018b = orderQuoteRepository;
    }

    public c(un8.b juniorDeviceRepository) {
        this.f184017a = 29;
        Intrinsics.checkNotNullParameter(juniorDeviceRepository, "juniorDeviceRepository");
        this.f184018b = juniorDeviceRepository;
    }

    public c(k3 preferencesInteractor) {
        this.f184017a = 8;
        Intrinsics.checkNotNullParameter(preferencesInteractor, "preferencesInteractor");
        this.f184018b = preferencesInteractor;
    }

    public c(n7j.i commonCellBuilder) {
        this.f184017a = 20;
        Intrinsics.checkNotNullParameter(commonCellBuilder, "commonCellBuilder");
        this.f184018b = commonCellBuilder;
    }

    public c(PrintAttributes printAttributes) {
        this.f184017a = 6;
        Intrinsics.checkNotNullParameter(printAttributes, "printAttributes");
        this.f184018b = printAttributes;
    }
}
