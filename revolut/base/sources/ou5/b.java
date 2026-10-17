package ou5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import apd.o;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.global_markets.domain.Market;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.view.RootFrameLayout;
import djb.u;
import ffk.t;
import gsi.g;
import io3.l;
import ip0.v7;
import ish.a0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jel.a3;
import klf.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import krl.m;
import le.u1;
import lki.x;
import lki.y;
import lki.z;
import om4.l0;
import org.joda.time.LocalDate;
import prl.e;
import r40.n0;
import rbh.r;
import rxg.c;
import rxg.h;
import rxg.i;
import tnb.g0;
import vc.s;
import vdl.i0;
import vkm.q0;
import w4l.k;
import wga.j;
import wji.d;
import wsg.n;
import ypi.f;
import z55.w;
import zh9.u0;
import zhm.d0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d, g, hqi.g, xpi.d, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f229819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f229820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f229821c;
    public Object d;
    public Object e;

    public b(r pocketPickerProvider, j60.a bottomExpandableDialogControllerExtension, e wealthBalancesFilterInteractorFactory, g0 tradingCurrencyCompatibilityInteractor, tbh.a allowedBalanceTypesProvider) {
        Intrinsics.checkNotNullParameter(pocketPickerProvider, "pocketPickerProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(wealthBalancesFilterInteractorFactory, "wealthBalancesFilterInteractorFactory");
        Intrinsics.checkNotNullParameter(tradingCurrencyCompatibilityInteractor, "tradingCurrencyCompatibilityInteractor");
        Intrinsics.checkNotNullParameter(allowedBalanceTypesProvider, "allowedBalanceTypesProvider");
        this.f229819a = pocketPickerProvider;
        this.f229820b = bottomExpandableDialogControllerExtension;
        this.f229821c = wealthBalancesFilterInteractorFactory;
        this.d = tradingCurrencyCompatibilityInteractor;
        this.e = allowedBalanceTypesProvider;
    }

    public static q0 A(b bVar, j slot, String str, String str2, String str3, List list, String str4, int i) {
        String str5 = (i & 4) != 0 ? null : str2;
        String str6 = (i & 8) != 0 ? null : str3;
        List list2 = (i & 16) != 0 ? null : list;
        String str7 = (i & 32) != 0 ? null : str4;
        ryc.a aVar = (ryc.a) bVar.d;
        Intrinsics.checkNotNullParameter(slot, "slot");
        return v7.y("PricingPlanContextualBannerInteractor", j6.a.q("observeRemoteBanner error for slot: ", slot.name()), n14.e.x((t) aVar.f258290b, new m((Object) aVar, (Object) slot, str, (Object) str5, (Object) str6, (Object) list2, (Object) str7, 12)));
    }

    public static ej0.b j(List list, xi0.b bVar, xi0.b bVar2) throws Throwable {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((CryptoCommodityPosition) next).f71379a, bVar)) {
                break;
            }
        }
        CryptoCommodityPosition cryptoCommodityPosition = (CryptoCommodityPosition) next;
        ej0.b bVar3 = cryptoCommodityPosition != null ? cryptoCommodityPosition.d : null;
        if (bVar3 == null || Intrinsics.f(bVar3.f126704b, bVar2)) {
            return bVar3;
        }
        hx7.e.n(new IllegalStateException(a0.d.s("can not find avgPrice for commodity=", bVar.f306286a, " in baseCurrency=", bVar2.f306286a)));
        return null;
    }

    public static n9l.a l(List list, xi0.b bVar, xi0.b bVar2) throws Throwable {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((n9l.a) next).f213661a, bVar)) {
                break;
            }
        }
        n9l.a aVar = (n9l.a) next;
        if (aVar == null) {
            hx7.e.n(new IllegalStateException(j6.a.q("can not find exchangeRate for commodity=", bVar.f306286a)));
            return null;
        }
        if (Intrinsics.f(aVar.f213662b, bVar2)) {
            return aVar;
        }
        hx7.e.n(new IllegalStateException(a0.d.s("can not find exchangeRate for commodity=", bVar.f306286a, " in baseCurrency=", bVar2.f306286a)));
        return null;
    }

    public static fzg.g n(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (!((rxg.j) obj2).d().k()) {
                arrayList.add(obj2);
            }
        }
        BigDecimal bigDecimal = null;
        if (arrayList.isEmpty()) {
            return new fzg.g(null, null);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((rxg.j) obj3).d().f(dj0.d.e)) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList) {
            dj0.d dVarD = ((rxg.j) obj4).d();
            dj0.d.Companion.getClass();
            if (dVarD.i(dj0.d.e)) {
                arrayList3.add(obj4);
            }
        }
        int size2 = arrayList2.size();
        Iterator it8 = arrayList3.iterator();
        long j2 = 0;
        while (it8.hasNext()) {
            j2 += ((rxg.j) it8.next()).d().f115082a;
        }
        long jAbs = Math.abs(j2);
        Iterator it9 = arrayList2.iterator();
        long j3 = 0;
        while (it9.hasNext()) {
            j3 += ((rxg.j) it9.next()).d().f115082a;
        }
        if (jAbs != 0) {
            bigDecimal = new BigDecimal(j3 / jAbs);
        } else if (j3 <= 0) {
            bigDecimal = BigDecimal.ONE;
        }
        return new fzg.g(bigDecimal, new BigDecimal((((double) size2) / ((double) size)) * ((double) 100)));
    }

    public static List o(List items, fzg.e eVar, Pair pair) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (eVar != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : items) {
                LocalDate localDateB = ((rxg.j) obj2).b();
                if (localDateB != null && jli.b.b(localDateB) <= eVar.getTimestamp().getMillis()) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        if (pair == null) {
            return items;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : items) {
            LocalDate localDateB2 = ((rxg.j) obj3).b();
            if (localDateB2 != null) {
                long jB = jli.b.b(localDateB2);
                long millis = ((fzg.e) pair.f186385a).getTimestamp().getMillis();
                if (jB <= ((fzg.e) pair.f186386b).getTimestamp().getMillis() && millis <= jB) {
                    arrayList2.add(obj3);
                }
            }
        }
        return arrayList2;
    }

    public static ArrayList p(List list) {
        Object obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : list) {
            rxg.j jVar = (rxg.j) obj3;
            if (jVar instanceof rxg.a) {
                obj2 = ((rxg.a) jVar).f258154a;
            } else if (jVar instanceof rxg.f) {
                obj2 = ((rxg.f) jVar).f258171a;
            } else if (jVar instanceof rxg.b) {
                obj2 = ((rxg.b) jVar).f258157a;
            } else if (jVar instanceof i) {
                obj2 = ((i) jVar).f258181a;
            } else if (jVar instanceof rxg.d) {
                obj2 = ((rxg.d) jVar).f258165a;
            } else if (jVar instanceof rxg.e) {
                obj2 = ((rxg.e) jVar).f258168a;
            } else if (jVar instanceof h) {
                obj2 = ((h) jVar).f258177a;
            } else if (jVar instanceof c) {
                obj2 = ((c) jVar).f258161b;
            } else {
                if (!(jVar instanceof rxg.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = ((rxg.g) jVar).f258174a;
            }
            Object arrayList = linkedHashMap.get(obj2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(obj2, arrayList);
            }
            ((List) arrayList).add(obj3);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            arrayList2.add((List) ((Map.Entry) it8.next()).getValue());
        }
        return arrayList2;
    }

    public static rxg.j q(dj0.d pnl2, List list) {
        rxg.j jVar = (rxg.j) d0.b0(list);
        if (jVar instanceof rxg.a) {
            rxg.a aVar = (rxg.a) jVar;
            String symbol = aVar.f258154a;
            String ref2 = aVar.f258155b;
            String name = aVar.f258156c;
            float f = aVar.e;
            LocalDate localDate = aVar.f;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(pnl2, "pnl");
            return new rxg.a(symbol, ref2, name, pnl2, f, localDate);
        }
        if (jVar instanceof rxg.d) {
            rxg.d dVar = (rxg.d) jVar;
            xi0.b currency = dVar.f258165a;
            float f4 = dVar.f258167c;
            LocalDate localDate2 = dVar.d;
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(pnl2, "pnl");
            return new rxg.d(currency, pnl2, f4, localDate2);
        }
        if (jVar instanceof rxg.e) {
            rxg.e eVar = (rxg.e) jVar;
            xi0.b currency2 = eVar.f258168a;
            float f5 = eVar.f258170c;
            LocalDate localDate3 = eVar.d;
            Intrinsics.checkNotNullParameter(currency2, "currency");
            Intrinsics.checkNotNullParameter(pnl2, "pnl");
            return new rxg.e(currency2, pnl2, f5, localDate3);
        }
        if (jVar instanceof rxg.f) {
            rxg.f fVar = (rxg.f) jVar;
            String symbol2 = fVar.f258171a;
            String ref3 = fVar.f258172b;
            String name2 = fVar.f258173c;
            float f6 = fVar.e;
            LocalDate localDate4 = fVar.f;
            Intrinsics.checkNotNullParameter(symbol2, "symbol");
            Intrinsics.checkNotNullParameter(ref3, "ref");
            Intrinsics.checkNotNullParameter(name2, "name");
            Intrinsics.checkNotNullParameter(pnl2, "pnl");
            return new rxg.f(symbol2, ref3, name2, pnl2, f6, localDate4);
        }
        if (jVar instanceof h) {
            h hVar = (h) jVar;
            a3 sector = hVar.f258177a;
            iwg.c calculationMethod = hVar.f258178b;
            WidgetisedAnalyticsType analyticsType = hVar.f258179c;
            eel.c timeSpan = hVar.d;
            float f32 = hVar.f;
            LocalDate localDate5 = hVar.f258180g;
            Intrinsics.checkNotNullParameter(sector, "sector");
            Intrinsics.checkNotNullParameter(calculationMethod, "calculationMethod");
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(pnl2, "pnl");
            return new h(sector, calculationMethod, analyticsType, timeSpan, pnl2, f32, localDate5);
        }
        if (jVar instanceof rxg.b) {
            rxg.b bVar = (rxg.b) jVar;
            String symbol3 = bVar.f258157a;
            String ref4 = bVar.f258158b;
            String name3 = bVar.f258159c;
            float f35 = bVar.e;
            LocalDate localDate6 = bVar.f;
            Intrinsics.checkNotNullParameter(symbol3, "symbol");
            Intrinsics.checkNotNullParameter(ref4, "ref");
            Intrinsics.checkNotNullParameter(name3, "name");
            Intrinsics.checkNotNullParameter(pnl2, "pnl");
            return new rxg.b(symbol3, ref4, name3, pnl2, f35, localDate6);
        }
        if (jVar instanceof i) {
            i iVar = (i) jVar;
            String symbol4 = iVar.f258181a;
            String ref5 = iVar.f258182b;
            String name4 = iVar.f258183c;
            float f36 = iVar.e;
            LocalDate localDate7 = iVar.f;
            Intrinsics.checkNotNullParameter(symbol4, "symbol");
            Intrinsics.checkNotNullParameter(ref5, "ref");
            Intrinsics.checkNotNullParameter(name4, "name");
            Intrinsics.checkNotNullParameter(pnl2, "pnl");
            return new i(symbol4, ref5, name4, pnl2, f36, localDate7);
        }
        if (jVar instanceof c) {
            c cVar = (c) jVar;
            return new rxg.b(cVar.f258160a, cVar.f258161b, cVar.f258162c, pnl2, cVar.f258164h, cVar.i);
        }
        if (!(jVar instanceof rxg.g)) {
            throw new NoWhenBranchMatchedException();
        }
        rxg.g gVar = (rxg.g) jVar;
        iwg.a analyticsProductType = gVar.f258174a;
        float f37 = gVar.f258176c;
        LocalDate localDate8 = gVar.d;
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        return new rxg.g(analyticsProductType, pnl2, f37, localDate8);
    }

    public static efm.r u(b bVar, xi0.b currency, xi0.b baseCurrency) {
        n9l.b period = n9l.b.SEC_3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(period, "period");
        lal.a aVar = (lal.a) bVar.f229820b;
        efm.r rVarW = nim.a.w(aVar.z(baseCurrency), new a(0, currency));
        efm.r rVarR = pd.b.r(aVar.z(baseCurrency), new l0(bVar, 14, period, baseCurrency));
        mu5.f fVar = (mu5.f) bVar.f229819a;
        n nVar = (n) bVar.f229821c;
        List types = v.k(l.CURRENT, l.BLOCKING);
        Intrinsics.checkNotNullParameter(types, "types");
        efm.r rVarDistinctUntilChanged = nim.a.w(u1.e(rVarW, rVarR, nim.a.w(fVar.e(nVar.T(new v77.a(types, 18), dz5.b.COMMODITY_POCKETS, false), baseCurrency, period), new a(1, currency))), new l0(currency, 13, bVar, baseCurrency)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public akg.n B(String collectionKey) {
        yhl.e eVar = (yhl.e) this.f229819a;
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        lrk.a aVar = eVar.f314177a;
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        akg.n nVarV = nim.a.v(aVar.f199524a.b(collectionKey, w4l.h.f294642c), new z77.a(this, 1));
        om4.d0 d0Var = (om4.d0) this.d;
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        mk0.a aVar2 = (mk0.a) d0Var.f226551b;
        String id10 = "BASIC_COLLECTION_CUSTOM_ORDER_".concat(collectionKey);
        Intrinsics.checkNotNullParameter(id10, "id");
        Flow flowF = aVar2.f(new tk0.e(id10));
        Intrinsics.checkNotNullParameter(flowF, "<this>");
        return nim.a.v(u0.m(nVarV, new zfd.e(flowF, 3)), new w(14));
    }

    public Flow C(Market market) {
        Intrinsics.checkNotNullParameter(market, "market");
        return boh.f.e(B(foh.i.I(market).a()), new z77.a(this, 2));
    }

    public Object D(h87.f fVar, gim.i iVar) {
        Object objD = ((yhl.e) this.f229819a).f314177a.f199524a.d(fVar.a(), false, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    @Override // wji.d
    public ViewGroup a() {
        return (ViewGroup) this.f229819a;
    }

    @Override // wji.d
    public void add(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Function1 function1 = (Function1) this.f229820b;
        ViewGroup viewGroup = (ViewGroup) this.f229819a;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        lki.r rVar = (lki.r) function1.invoke(context);
        rVar.d(view);
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R$id.internal_modalContainer_tag, rVar);
        rVar.c(new vt3.a(this, 23));
        x xVar = (x) this.d;
        if (xVar != null) {
            xVar.g();
        }
        View view2 = rVar.getView();
        if (view2 == null) {
            return;
        }
        viewGroup.removeView(view2);
        viewGroup.addView(view2, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // ypi.f
    public Object b(ypi.h hVar) {
        throw null;
    }

    @Override // gsi.g
    public gsi.h build() {
        s.h((xoi.d) this.f229820b, fsi.g.class);
        s.h((hqi.i) this.f229821c, hqi.i.class);
        s.h((xpi.f) this.d, xpi.f.class);
        s.h((ypi.h) this.e, ypi.h.class);
        return new zma.a((zma.b) this.f229819a, (xoi.d) this.f229820b, (hqi.i) this.f229821c, (xpi.f) this.d, (ypi.h) this.e);
    }

    @Override // wji.d
    public void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        gom.e.f145194a.w("addToBottom has no effect on the modal controller view holder because it's always expected to have one view only", new Object[0]);
        add(view);
    }

    @Override // wji.d
    public void d(View view, View view2, TransitionAnimation animation, boolean z, z transitionListener) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(transitionListener, "transitionListener");
        x xVar = (x) this.d;
        if (xVar != null) {
            xVar.g();
        }
        x xVarA = ((y) this.f229821c).a(animation);
        this.d = xVarA;
        xVarA.e(view, view2, z, transitionListener);
    }

    @Override // wji.d
    public void e(y99.c onDismiss) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        this.e = onDismiss;
    }

    @Override // hqi.g
    public Object g(hqi.i iVar) {
        throw null;
    }

    @Override // gsi.g
    public Object h(fsi.g gVar) {
        throw null;
    }

    public ej0.b i(CombinedPocketsBalance combinedPocketsBalance, List list, List list2, xi0.b bVar) throws Throwable {
        n9l.a aVarL;
        xi0.b bVar2 = combinedPocketsBalance.f71373a.f115083b;
        ej0.b bVarJ = j(list, bVar2, bVar);
        if (bVarJ == null || (aVarL = l(list2, bVar2, bVar)) == null) {
            return null;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(aVarL.f213663c);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return wt5.a.d(new ej0.b(bigDecimalValueOf, aVarL.f213662b), bVarJ, combinedPocketsBalance.f71373a.f115082a / cp5.d.k(bVar2));
    }

    @Override // xpi.d
    public Object k() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(com.revolut.data.model.Data r7, fzg.e r8, kotlin.Pair r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ou5.b.m(com.revolut.data.model.Data, fzg.e, kotlin.Pair, gim.c):java.lang.Object");
    }

    public boolean r(mga.d0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return aha.a.b((gte.a) this.e, context);
    }

    @Override // wji.d
    public void remove(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        lki.r rVarM = com.bumptech.glide.c.m(view);
        if (rVarM != null) {
            rVarM.g(view);
            rVarM.c(null);
            View view2 = rVarM.getView();
            if (view2 != null) {
                ((ViewGroup) this.f229819a).removeView(view2);
            }
        }
    }

    public ufm.c s(SavingsAccountDetails account, AccountWrapper accountWrapper, x5i.d dVar) {
        Intrinsics.checkNotNullParameter(account, "account");
        ufm.c cVar = new ufm.c(new a80.b(accountWrapper, account, this, dVar, 8), 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        return cVar;
    }

    public Flow t(String juniorId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        qq8.a aVar = (qq8.a) this.e;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(nim.a.v(rd0.e.b(aVar.f248500a.e0(juniorId, loadingStrategy)), new qpb.i(aVar, 17)), new pza.d(this, 24, juniorId, loadingStrategy));
    }

    public Flow v(h87.f collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        return boh.f.e(B(collectionKey.a()), new z77.a(this, 0));
    }

    public cyh.f w(String juniorId, Collection vaultIds) {
        Flow flowB;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(vaultIds, "vaultIds");
        zf8.n nVar = (zf8.n) this.f229820b;
        w4l.h loadingStrategy = w4l.h.f294642c;
        akg.n nVarC = nVar.c(juniorId, loadingStrategy);
        akg.n nVarA = hj8.a.a((hj8.a) this.f229819a, juniorId, loadingStrategy);
        jab.a aVar = (jab.a) this.d;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Flow flowH = xam.a.h(new a9h.a(aVar, juniorId, loadingStrategy, (Continuation) null, 14), rd0.e.b(aVar.f172474b.q()));
        if (vaultIds.isEmpty()) {
            flowB = new go.g(new Data(r0.g(), null, false, 6, null), 2);
        } else {
            Collection<String> collection = vaultIds;
            ArrayList arrayList = new ArrayList(zhm.w.t(collection, 10));
            for (String vaultId : collection) {
                pab.a aVar2 = (pab.a) this.f229821c;
                Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                rab.f fVar = (rab.f) aVar2.f234467a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                arrayList.add(fVar.d.e(vaultId, loadingStrategy));
            }
            flowB = rd0.e.b(nim.a.w(mif.a.l(arrayList), new rm2.s(18)));
        }
        return new cyh.f(yh5.b.h(nVarC, nVarA, flowH, flowB, nim.a.v(((zf8.k) this.e).c(null, loadingStrategy), new n0(juniorId, 20))), 2);
    }

    public akg.n x(WidgetisedAnalyticsType analyticsType, vyg.c timeframe, vyg.f pnLType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(pnLType, "pnLType");
        int i = tyg.b.f275568a[pnLType.ordinal()];
        if (i == 1) {
            return nim.a.v(z(analyticsType, timeframe), new tx.f(27));
        }
        if (i == 2) {
            return nim.a.v(u0.i(z(analyticsType, timeframe), ((jpc.e) this.f229820b).S(analyticsType, timeframe, iwg.c.TIME_WEIGHTED, null), ((kbb.c) this.f229821c).J()), new tx.f(28));
        }
        throw new NoWhenBranchMatchedException();
    }

    public efm.r y(xi0.b baseCurrency, n9l.b period) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(period, "period");
        lal.a aVar = (lal.a) this.f229820b;
        efm.r rVarZ = aVar.z(baseCurrency);
        efm.r rVarR = pd.b.r(aVar.z(baseCurrency), new l0(this, 14, period, baseCurrency));
        mu5.f fVar = (mu5.f) this.f229819a;
        n nVar = (n) this.f229821c;
        List types = v.k(l.CURRENT, l.BLOCKING);
        Intrinsics.checkNotNullParameter(types, "types");
        return nim.a.w(u1.e(rVarZ, rVarR, fVar.e(nVar.T(new v77.a(types, 18), dz5.b.COMMODITY_POCKETS, false), baseCurrency, period)), new os9.t(this, baseCurrency, 3));
    }

    public Flow z(WidgetisedAnalyticsType analyticsType, vyg.c cVar) {
        kwg.l lVar = (kwg.l) this.f229819a;
        tyg.j jVar = (tyg.j) this.e;
        if (!jVar.g(analyticsType)) {
            eel.c timeSpan = cVar.b();
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            return rd0.e.b(lVar.e(analyticsType, new kwg.d(lVar, analyticsType, timeSpan, 2)));
        }
        List analyticsProductTypes = jVar.b(analyticsType);
        eel.c timeSpan2 = cVar.b();
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan2, "timeSpan");
        return lVar.g(new kwg.h(lVar, analyticsProductTypes, timeSpan2, 1));
    }

    public b(ang.f userInteractor, tb4.t suggestedFeaturesProviderFactory, ckk.a featureListResourceFactory, tb4.t featureListItemFactoryFactory, xlk.c benefitsComposer) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(suggestedFeaturesProviderFactory, "suggestedFeaturesProviderFactory");
        Intrinsics.checkNotNullParameter(featureListResourceFactory, "featureListResourceFactory");
        Intrinsics.checkNotNullParameter(featureListItemFactoryFactory, "featureListItemFactoryFactory");
        Intrinsics.checkNotNullParameter(benefitsComposer, "benefitsComposer");
        this.f229819a = userInteractor;
        this.f229820b = suggestedFeaturesProviderFactory;
        this.f229821c = featureListResourceFactory;
        this.d = featureListItemFactoryFactory;
        this.e = benefitsComposer;
    }

    public b(vga.b fxBannerInteractor, vga.b atmBannerInteractor, vga.d loungesBannerInteractor, ryc.a remoteBannerInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(fxBannerInteractor, "fxBannerInteractor");
        Intrinsics.checkNotNullParameter(atmBannerInteractor, "atmBannerInteractor");
        Intrinsics.checkNotNullParameter(loungesBannerInteractor, "loungesBannerInteractor");
        Intrinsics.checkNotNullParameter(remoteBannerInteractor, "remoteBannerInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f229819a = fxBannerInteractor;
        this.f229820b = atmBannerInteractor;
        this.f229821c = loungesBannerInteractor;
        this.d = remoteBannerInteractor;
        this.e = featureToggleInteractor;
    }

    public b(jt0.b commonHeaderProvider, h0 commonDataSource, ap5.b cryptoWithdrawInteractor, rlf.d headerMapper, rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f229819a = commonHeaderProvider;
        this.f229820b = commonDataSource;
        this.f229821c = cryptoWithdrawInteractor;
        this.d = headerMapper;
        this.e = entryPoint;
    }

    public b(gte.a featureToggleInteractor, usc.a deliveryInteractor, kbc.b deliveryMapper, kbc.c orderImageMapper, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deliveryInteractor, "deliveryInteractor");
        Intrinsics.checkNotNullParameter(deliveryMapper, "deliveryMapper");
        Intrinsics.checkNotNullParameter(orderImageMapper, "orderImageMapper");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f229819a = featureToggleInteractor;
        this.f229820b = deliveryInteractor;
        this.f229821c = deliveryMapper;
        this.d = orderImageMapper;
        this.e = widgetsUiInteractor;
    }

    public b(ev5.d activityWidgetFactory, yd9.e ordersMapper, iva.a recurringBuysNavigationProvider, pu5.a cryptoOrderDetailsNavigator, yi5.a catalogueProvider) {
        Intrinsics.checkNotNullParameter(activityWidgetFactory, "activityWidgetFactory");
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderDetailsNavigator, "cryptoOrderDetailsNavigator");
        Intrinsics.checkNotNullParameter(catalogueProvider, "catalogueProvider");
        this.f229819a = activityWidgetFactory;
        this.f229820b = ordersMapper;
        this.f229821c = recurringBuysNavigationProvider;
        this.d = cryptoOrderDetailsNavigator;
        this.e = catalogueProvider;
    }

    public b(hj8.a juniorProfileInteractor, wq8.c juniorDetailedTransferSettingsRepository, ao.h juniorCoparentInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, qq8.a juniorCurrentPocketsTransactionFilterInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorDetailedTransferSettingsRepository, "juniorDetailedTransferSettingsRepository");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(juniorCurrentPocketsTransactionFilterInteractor, "juniorCurrentPocketsTransactionFilterInteractor");
        this.f229819a = juniorProfileInteractor;
        this.f229820b = juniorDetailedTransferSettingsRepository;
        this.f229821c = juniorCoparentInteractor;
        this.d = transactionsInteractor;
        this.e = juniorCurrentPocketsTransactionFilterInteractor;
    }

    public b(jzi.a budgetInteractor, eqj.f analyticsCycleInteractor, ge3.e transactionCategorisationInteractor, wmd.f budgetSpentProvider, gmd.b accountWalletIdProvider) {
        Intrinsics.checkNotNullParameter(budgetInteractor, "budgetInteractor");
        Intrinsics.checkNotNullParameter(analyticsCycleInteractor, "analyticsCycleInteractor");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(budgetSpentProvider, "budgetSpentProvider");
        Intrinsics.checkNotNullParameter(accountWalletIdProvider, "accountWalletIdProvider");
        this.f229819a = budgetInteractor;
        this.f229820b = analyticsCycleInteractor;
        this.f229821c = transactionCategorisationInteractor;
        this.d = budgetSpentProvider;
        this.e = accountWalletIdProvider;
    }

    public b(apd.a budgetWidgetContentProvider, apd.f totalWealthWidgetContentProvider, cpd.g analyticsMainWidgetContentProvider, bpd.g earningsWidgetContentProvider, o tripsWidgetContentProvider, xnd.f analyticsDashboardBudgetingProvider) {
        Intrinsics.checkNotNullParameter(budgetWidgetContentProvider, "budgetWidgetContentProvider");
        Intrinsics.checkNotNullParameter(totalWealthWidgetContentProvider, "totalWealthWidgetContentProvider");
        Intrinsics.checkNotNullParameter(analyticsMainWidgetContentProvider, "analyticsMainWidgetContentProvider");
        Intrinsics.checkNotNullParameter(earningsWidgetContentProvider, "earningsWidgetContentProvider");
        Intrinsics.checkNotNullParameter(tripsWidgetContentProvider, "tripsWidgetContentProvider");
        Intrinsics.checkNotNullParameter(analyticsDashboardBudgetingProvider, "analyticsDashboardBudgetingProvider");
        this.f229819a = totalWealthWidgetContentProvider;
        this.f229820b = analyticsMainWidgetContentProvider;
        this.f229821c = earningsWidgetContentProvider;
        this.d = tripsWidgetContentProvider;
        this.e = analyticsDashboardBudgetingProvider;
    }

    public b(qmc.d roboPortfolioBalanceProvider, qmc.h roboPortfolioInfoProvider, tul.b portfolioMetricsInteractor, i0 performanceParametersRepository, ael.z performanceCalculator) {
        Intrinsics.checkNotNullParameter(roboPortfolioBalanceProvider, "roboPortfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(portfolioMetricsInteractor, "portfolioMetricsInteractor");
        Intrinsics.checkNotNullParameter(performanceParametersRepository, "performanceParametersRepository");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        this.f229819a = roboPortfolioBalanceProvider;
        this.f229820b = roboPortfolioInfoProvider;
        this.f229821c = portfolioMetricsInteractor;
        this.d = performanceParametersRepository;
        this.e = performanceCalculator;
    }

    public b(wmd.c budgetAccountContextProvider, jzi.a budgetInteractor, eqj.f analyticsCycleInteractor, uc.d budgetUpcomingPaymentsProvider, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(budgetAccountContextProvider, "budgetAccountContextProvider");
        Intrinsics.checkNotNullParameter(budgetInteractor, "budgetInteractor");
        Intrinsics.checkNotNullParameter(analyticsCycleInteractor, "analyticsCycleInteractor");
        Intrinsics.checkNotNullParameter(budgetUpcomingPaymentsProvider, "budgetUpcomingPaymentsProvider");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f229819a = budgetAccountContextProvider;
        this.f229820b = budgetInteractor;
        this.f229821c = analyticsCycleInteractor;
        this.d = budgetUpcomingPaymentsProvider;
        this.e = transactionsContentProvider;
    }

    public b(hj8.a juniorProfileInteractor, zf8.n juniorAccountStatesProvider, pab.a vaultsInteractor, jab.a juniorPricingPlansInteractor, zf8.k juniorAccountInfoProvider) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(juniorPricingPlansInteractor, "juniorPricingPlansInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        this.f229819a = juniorProfileInteractor;
        this.f229820b = juniorAccountStatesProvider;
        this.f229821c = vaultsInteractor;
        this.d = juniorPricingPlansInteractor;
        this.e = juniorAccountInfoProvider;
    }

    public b(yhl.e curatedCollectionsInteractor, zjh.c indexesInteractor, e9h.d performanceAssetsTransformer, om4.d0 globalMarketsCollectionsRepository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(curatedCollectionsInteractor, "curatedCollectionsInteractor");
        Intrinsics.checkNotNullParameter(indexesInteractor, "indexesInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(globalMarketsCollectionsRepository, "globalMarketsCollectionsRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f229819a = curatedCollectionsInteractor;
        this.f229820b = indexesInteractor;
        this.f229821c = performanceAssetsTransformer;
        this.d = globalMarketsCollectionsRepository;
        this.e = featureToggleInteractor;
    }

    public b(djb.n savingsAccountsDetailsInteractor, r7i.g cryptoEligibilityChecker, u tradingOnboardingStatusProvider, r7i.s juniorAccountsEligibilityChecker, c8i.a moveMoneyAccountPairEligibilityChecker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(cryptoEligibilityChecker, "cryptoEligibilityChecker");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        Intrinsics.checkNotNullParameter(juniorAccountsEligibilityChecker, "juniorAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(moveMoneyAccountPairEligibilityChecker, "moveMoneyAccountPairEligibilityChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f229819a = savingsAccountsDetailsInteractor;
        this.f229820b = tradingOnboardingStatusProvider;
        this.f229821c = juniorAccountsEligibilityChecker;
        this.d = moveMoneyAccountPairEligibilityChecker;
        this.e = featureToggleInteractor;
    }

    public b(ViewGroup container, Function1 modalAnimatable, gki.j jVar) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(modalAnimatable, "modalAnimatable");
        this.f229819a = container;
        this.f229820b = modalAnimatable;
        this.f229821c = new y(jVar);
        if (!(container instanceof hli.e) && !(container instanceof RootFrameLayout)) {
            throw new IllegalStateException("Controller container should be ControllerContainer");
        }
        container.setClipChildren(false);
    }

    public b(kwg.l complexAnalyticsInteractor, jpc.e widgetisedAnalyticsPerformanceInteractor, kbb.c complexAnalyticsCurrencyInteractor, sxg.k complexAnalyticsPerformanceContributionProvider, tyg.j configInteractor) {
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsPerformanceInteractor, "widgetisedAnalyticsPerformanceInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsCurrencyInteractor, "complexAnalyticsCurrencyInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsPerformanceContributionProvider, "complexAnalyticsPerformanceContributionProvider");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f229819a = complexAnalyticsInteractor;
        this.f229820b = widgetisedAnalyticsPerformanceInteractor;
        this.f229821c = complexAnalyticsCurrencyInteractor;
        this.d = complexAnalyticsPerformanceContributionProvider;
        this.e = configInteractor;
    }

    public b(mu5.f cryptoInvestmentsInteractor, lal.a commodityPositionsInteractor, n walletInteractor, wt5.a cryptoInvestmentsCalculations, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(commodityPositionsInteractor, "commodityPositionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f229819a = cryptoInvestmentsInteractor;
        this.f229820b = commodityPositionsInteractor;
        this.f229821c = walletInteractor;
        this.d = cryptoInvestmentsCalculations;
        this.e = ratesInteractor;
    }

    public b(ybl.l configInteractor, kbh.h tradingFooterDisclosuresFactory, kbh.a roboFooterDisclaimerFactory, aah.m wealthDisclaimerMapper, z0h.a wealthDisclaimersClauseDestinationProvider) {
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(tradingFooterDisclosuresFactory, "tradingFooterDisclosuresFactory");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimerFactory, "roboFooterDisclaimerFactory");
        Intrinsics.checkNotNullParameter(wealthDisclaimerMapper, "wealthDisclaimerMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersClauseDestinationProvider, "wealthDisclaimersClauseDestinationProvider");
        this.f229819a = configInteractor;
        this.f229820b = tradingFooterDisclosuresFactory;
        this.f229821c = roboFooterDisclaimerFactory;
        this.d = wealthDisclaimerMapper;
        this.e = wealthDisclaimersClauseDestinationProvider;
    }

    public b(zma.b bVar) {
        this.f229819a = bVar;
    }
}
