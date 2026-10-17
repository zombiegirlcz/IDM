package bzg;

import c2d.a1;
import c2d.u0;
import c2d.z0;
import c64.l;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlowContract$Step;
import com.revolut.feature.global_markets.domain.MarketAsset;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.restricted_access.impl.ui.flow.FeatureNotAvailableFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d9.e1;
import efm.d0;
import grl.r2;
import ip0.c0;
import ip0.og;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import okhttp3.ResponseBody;
import om4.q4;
import org.joda.time.LocalDate;
import u09.g0;
import u09.h0;
import u09.z;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20019b;

    public /* synthetic */ t(c35.f fVar, x15.l lVar) {
        this.f20018a = 18;
        this.f20019b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        ogd.e eVar;
        z2h.a aVar;
        BigDecimal scale;
        y49.h hVar;
        y49.h hVar2;
        int i = this.f20018a;
        int i2 = 5;
        int i3 = 26;
        int i5 = 0;
        int i6 = 2;
        Continuation continuation = null;
        Object obj3 = this.f20019b;
        switch (i) {
            case 0:
                return k.a((k) obj2, (vyg.f) obj3, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, 2097149);
            case 1:
                return k.a((k) obj2, null, null, null, null, null, null, null, null, false, null, null, false, (fzg.f) obj3, null, null, null, null, 2064383);
            case 2:
                a61.a aVar2 = (a61.a) obj3;
                a09.m mVar = (a09.m) aVar2.f1531b;
                b09.c response = (b09.c) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                if (!(response instanceof b09.b)) {
                    if (!(response instanceof b09.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b09.a aVar3 = (b09.a) response;
                    if (aVar3.f11623b != u09.y.CONTENT_STARTED) {
                        ufm.b bVarM = d0.m(aVar3);
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    }
                    String courseId = aVar3.f11622a;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(courseId, "courseId");
                    return mVar.e.g(courseId, false).D(aVar3);
                }
                b09.b bVar = (b09.b) response;
                z zVar = bVar.f11625a;
                g0 g0Var = zVar.d;
                if ((g0Var != null ? g0Var.f276122a : null) == h0.WARNING) {
                    String courseId2 = zVar.f276160c;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(courseId2, "courseId");
                    return mVar.e.g(courseId2, false).D(bVar);
                }
                if (zVar.f276159b) {
                    pfm.h hVar3 = new pfm.h(new a08.d(aVar2, i2), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                    return hVar3.D(bVar);
                }
                ufm.b bVarM2 = d0.m(bVar);
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
            case 3:
                com.revolut.feature.restricted_access.impl.ui.flow.a aVar4 = (com.revolut.feature.restricted_access.impl.ui.flow.a) obj3;
                FeatureNotAvailableFlowContract$InputData featureNotAvailableFlowContract$InputData = aVar4.o;
                d67.u result = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, d67.s.f111464a)) {
                    aVar4.I2(featureNotAvailableFlowContract$InputData.e);
                } else if (Intrinsics.f(result, d67.q.f111462a)) {
                    aVar4.I2(featureNotAvailableFlowContract$InputData.d);
                } else {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "FeatureNotAvailableFlowViewModel", "Unhandled prompt result: " + result, null, h0Var);
                }
                return Unit.f186387a;
            case 4:
                r10.f fVar = (r10.f) obj3;
                List recentlyViewedItems = (List) obj2;
                Intrinsics.checkNotNullParameter(recentlyViewedItems, "recentlyViewedItems");
                List<nyf.c> list = recentlyViewedItems;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (nyf.c cVar : list) {
                    nyf.a aVar5 = cVar.e;
                    LocalDate localDate = ((l80.f) ((l80.e) fVar.c)).g().toLocalDate();
                    LocalDate localDate2 = aVar5.f220862a;
                    LocalDate localDate3 = aVar5.f220863b;
                    LocalDate localDate4 = (localDate2 == null || !localDate2.isBefore(localDate)) ? aVar5.f220862a : localDate;
                    if (localDate3 == null || !localDate3.isBefore(localDate)) {
                        localDate = localDate3;
                    }
                    nyf.a parameters = new nyf.a(localDate4, localDate);
                    String experienceId = cVar.f220866a;
                    String name = cVar.f220867b;
                    String str = cVar.f220868c;
                    String image = cVar.d;
                    Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    arrayList.add(new nyf.c(experienceId, name, str, image, parameters));
                }
                return arrayList;
            case 5:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((v77.e) ((c2d.v) obj3).f20749c).a(it8);
            case 6:
                u0 u0Var = (u0) obj3;
                List<nel.n> instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                ArrayList arrayList2 = new ArrayList();
                for (nel.n nVar : instruments) {
                    ogd.e eVar2 = (nVar.f.d && ((Set) u0Var.d.getValue()).contains(nVar.f214597c)) ? new ogd.e(new FavouritesAssetDetails(nVar.f214596b, nVar.e, nVar.d, u0Var.a(), false), nVar.i.f306286a, null, null) : null;
                    if (eVar2 != null) {
                        arrayList2.add(eVar2);
                    }
                }
                return arrayList2;
            case 7:
                z0 z0Var = (z0) obj3;
                k77.l assets = (k77.l) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                List<MarketAsset> list2 = assets.f181839a;
                ArrayList<MarketAsset.Index> arrayList3 = new ArrayList();
                for (MarketAsset marketAsset : list2) {
                    MarketAsset.Index index = marketAsset instanceof MarketAsset.Index ? (MarketAsset.Index) marketAsset : null;
                    if (index != null) {
                        arrayList3.add(index);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                for (MarketAsset.Index index2 : arrayList3) {
                    arrayList4.add(nim.a.v(z0Var.f20766b.k(index2.f74573c), new t(index2, 8)));
                }
                return zh9.u0.k(arrayList4);
            case 8:
                k77.i it9 = (k77.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair((MarketAsset.Index) obj3, it9);
            case 9:
                a1 a1Var = (a1) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List<nel.n> list3 = (List) pair.f186385a;
                List list4 = (List) pair.f186386b;
                ArrayList arrayList5 = new ArrayList();
                for (nel.n nVar2 : list3) {
                    if (io3.h.j(nVar2.f214597c)) {
                        if (nVar2.f214605q == null) {
                            List list5 = list4;
                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                Iterator it10 = list5.iterator();
                                while (it10.hasNext()) {
                                    if (((WealthAccount) it10.next()) instanceof WealthAccount.Margin) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean zContains = a1Var.d.contains(nVar2.f214597c);
                    if (nVar2.f.d && zContains && z) {
                        String str2 = nVar2.f214596b;
                        String str3 = nVar2.e;
                        String str4 = nVar2.d;
                        y1d.b.Companion.getClass();
                        eVar = new ogd.e(new FavouritesAssetDetails(str2, str3, str4, y1d.a.e, false), nVar2.i.f306286a, null, null);
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        arrayList5.add(eVar);
                    }
                }
                return arrayList5;
            case 10:
                u0 u0Var2 = (u0) obj3;
                List<nel.n> instruments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments2, "instruments");
                ArrayList arrayList6 = new ArrayList();
                for (nel.n nVar3 : instruments2) {
                    ogd.e eVar3 = (nVar3.f.d && ((Set) u0Var2.d.getValue()).contains(nVar3.f214597c)) ? new ogd.e(new FavouritesAssetDetails(nVar3.f214596b, nVar3.e, nVar3.d, u0Var2.a(), false), nVar3.i.f306286a, null, null) : null;
                    if (eVar3 != null) {
                        arrayList6.add(eVar3);
                    }
                }
                return arrayList6;
            case 11:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                ((c2f.l) obj3).C2(new c2f.e(error));
                return Boolean.TRUE;
            case 12:
                c30.h hVar4 = (c30.h) obj3;
                UUID feedId = (UUID) obj2;
                Intrinsics.checkNotNullParameter(feedId, "feedId");
                return hVar4.e((c30.a) hVar4.f20850c.get(c30.h.b(feedId)));
            case 13:
                ResponseBody body = (ResponseBody) obj2;
                Intrinsics.checkNotNullParameter(body, "body");
                return new c71.a(((c71.b) obj3).f21827a, body.string());
            case 14:
                r04.c cVar2 = (r04.c) obj3;
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "it");
                Intrinsics.h(cVar2);
                Object obj4 = r04.d.f250697a;
                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                Intrinsics.checkNotNullParameter(currency, "currency");
                List outstandingDebts = cVar2.getOutstandingDebts();
                ArrayList arrayList7 = new ArrayList();
                Iterator it11 = outstandingDebts.iterator();
                while (it11.hasNext()) {
                    pu3.b bVarA = r04.d.a((r04.b) it11.next(), currency);
                    if (bVarA != null) {
                        arrayList7.add(bVarA);
                    }
                }
                return new pu3.g(arrayList7);
            case 15:
                c35.c cVar3 = (c35.c) obj3;
                x15.l application = (x15.l) obj2;
                Intrinsics.checkNotNullParameter(application, "application");
                if (application instanceof x15.j) {
                    return boh.f.e(al4.p.a((al4.p) cVar3.e), new c35.b(cVar3, application, i5));
                }
                if (application instanceof x15.k) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                c35.c cVar4 = (c35.c) obj3;
                x15.l application2 = (x15.l) obj2;
                Intrinsics.checkNotNullParameter(application2, "application");
                if (application2 instanceof x15.j) {
                    return boh.f.e(((om4.g) ((al4.c) cVar4.e)).d(), new c35.d(cVar4, application2, i5));
                }
                if (application2 instanceof x15.k) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                c35.f fVar2 = (c35.f) obj3;
                x15.l application3 = (x15.l) obj2;
                Intrinsics.checkNotNullParameter(application3, "application");
                if (application3 instanceof x15.j) {
                    return nim.a.v(xq3.w.a(fVar2.f20891b, r2.ADD_NEW_PRODUCT), new t(fVar2, application3));
                }
                if (application3 instanceof x15.k) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                List entryPoints = (List) obj2;
                Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
                x15.j jVar = (x15.j) ((x15.l) obj3);
                fs3.i iVarU = ebm.a.u(entryPoints, fs3.b.CREDIT_CARD);
                fs3.b bVar2 = iVarU.f137586a;
                String str5 = iVarU.f137587b;
                String str6 = iVarU.f137588c;
                jo3.a aVarP = mo3.a.p(jVar.f302277a.e);
                cl4.a aVar6 = jVar.f302277a;
                String strO = mif.a.o(aVar6.f24928a);
                boolean z3 = aVar6.d;
                dx4.a1 a1Var2 = iVarU.d;
                return new mp3.d("credit_card_account_item_id", bVar2, str5, str6, aVarP, strO, z3, a1Var2 != null ? Integer.valueOf(a1Var2.c()) : null, iVarU.e, cp5.d.L(iVarU.f));
            case 19:
                c35.c cVar5 = (c35.c) obj3;
                x15.l application4 = (x15.l) obj2;
                Intrinsics.checkNotNullParameter(application4, "application");
                if (application4 instanceof x15.j) {
                    return boh.f.e(((q4) ((al4.u) cVar5.e)).d(), new c35.g(cVar5, application4, i5));
                }
                if (application4 instanceof x15.k) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b bVar3 = (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b) obj3;
                z27.k result2 = (z27.k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, z27.g.f318981a)) {
                    oki.h.D2(bVar3.f74264r);
                } else if (result2 instanceof z27.h) {
                    bVar3.C1(new ExternalDestination.Browser(((z27.h) result2).f318982a.f117249a, null));
                } else if (result2 instanceof z27.i) {
                    bVar3.n2(new com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.a(bVar3, result2, null), new whi.b(6));
                } else {
                    if (!(result2 instanceof z27.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yki.a aVar7 = bVar3.f74264r;
                    z27.j jVar2 = (z27.j) result2;
                    TaxHubCalendarEvent taxHubCalendarEvent = jVar2.f318986b;
                    java.time.LocalDate localDate5 = taxHubCalendarEvent.e;
                    java.time.LocalDate localDate6 = taxHubCalendarEvent.f;
                    String str7 = taxHubCalendarEvent.f73483a;
                    TaxHubAssessmentStep taxHubAssessmentStep = jVar2.f318985a;
                    oki.h.t2(bVar3, aVar7, new TaxHubAssessmentFlowContract$Step.TransactionExport(localDate5, localDate6, str7, taxHubAssessmentStep.f73480a, taxHubAssessmentStep.f73482c == ds6.n.COMPLETED), true, null, false, 12);
                }
                return Unit.f186387a;
            case 21:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new a08.l((c3e.c) obj3, pagedData, 9), 2);
            case 22:
                f3e.b bVar4 = (f3e.b) obj3;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List list6 = (List) data.getContent();
                if (list6 == null) {
                    list6 = f0.f322471a;
                }
                return new lk0.e(list6, bVar4, data.getLoading(), null, data.getError(), 8);
            case 23:
                c3e.f fVar3 = (c3e.f) obj3;
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                return optional.d() ? d0.m(optional.c()) : ((z39.b) fVar3.f20944b).f319221b.e().t(5000L, TimeUnit.MILLISECONDS);
            case 24:
                c42.l lVar = (c42.l) obj3;
                lVar.l2(new af3.f(((Boolean) obj2).booleanValue(), lVar, continuation, i6), new yi5.b(i3));
                return Unit.f186387a;
            case 25:
                String address = (String) obj2;
                Intrinsics.checkNotNullParameter(address, "address");
                a49.b bVar5 = (a49.b) ((ne0.d) obj3).get(c49.d.k(address));
                if (bVar5 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar5, "<this>");
                return new LocationDomain(bVar5.getLatitude(), bVar5.getLongitude());
            case 26:
                c4h.b bVar6 = (c4h.b) obj3;
                vf0.h hVar5 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar5, "<destruct>");
                Map map = (Map) hVar5.f288433a;
                od0.i iVar = (od0.i) hVar5.f288434b;
                InstrumentTicker instrumentTicker = (InstrumentTicker) hVar5.f288435c;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) hVar5.d;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((kel.n) entry.getKey()).f183174b.compareTo(BigDecimal.ZERO) > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (linkedHashMap.isEmpty() && (!iVar.d() || ((z2h.g) iVar.c()).f319088c.f310853l.isEmpty())) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                if (io3.h.j(instrumentTicker.d) || linkedHashMap.isEmpty()) {
                    z2h.g gVar = (z2h.g) iVar.f224257a;
                    bVar6.getClass();
                    if (gVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    y49.h hVar6 = gVar.f319088c;
                    dj0.d dVar = hVar6.e;
                    dj0.d dVar2 = hVar6.f310849c;
                    BigDecimal bigDecimal = hVar6.d;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    aVar = new z2h.a(instrumentTicker, dVar, dVar2, bigDecimal.multiply(bigDecimalValueOf).setScale(2, RoundingMode.HALF_UP), tradingLegalEntityInformation, zhm.u.c(gVar));
                } else {
                    z2h.g gVar2 = (z2h.g) iVar.f224257a;
                    bVar6.getClass();
                    List listD1 = zhm.d0.d1(linkedHashMap.keySet());
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj5 : listD1) {
                        String str8 = ((kel.n) obj5).f183173a.e;
                        Object objO = linkedHashMap2.get(str8);
                        if (objO == null) {
                            objO = v0.a.o(linkedHashMap2, str8);
                        }
                        ((List) objO).add(obj5);
                    }
                    Set setKeySet = linkedHashMap2.keySet();
                    if (setKeySet.size() > 1) {
                        throw new IllegalStateException(p.a.p("StockHoldings with ids [", zhm.d0.k0(listD1, null, null, null, 0, new c42.j(7), 31), "] do not share a common currency"));
                    }
                    xi0.a aVar8 = xi0.b.Companion;
                    String str9 = (String) zhm.d0.a0(setKeySet);
                    aVar8.getClass();
                    del.b bVarC = ael.q.c(bVar6.f, zhm.d0.d1(linkedHashMap.keySet()), zhm.u.c(instrumentTicker), f0.f322471a, xi0.a.a(str9));
                    ej0.b bVar7 = bVarC.f113708a;
                    ej0.b bVar8 = bVarC.f113710c;
                    BigDecimal bigDecimal2 = bVar8.f126703a;
                    List<del.a> list7 = bVarC.e;
                    ArrayList arrayList8 = new ArrayList(zhm.w.t(list7, 10));
                    for (del.a aVar9 : list7) {
                        TradingAccount tradingAccount = (TradingAccount) linkedHashMap.get(aVar9.e);
                        if (tradingAccount == null) {
                            throw new IllegalStateException(j6.a.q("Cannot find holding with id ", aVar9.e.f183173a.f183145a));
                        }
                        arrayList8.add(new z2h.h(tradingAccount, aVar9));
                    }
                    if (gVar2 != null) {
                        arrayList8 = zhm.d0.F0(gVar2, arrayList8);
                    }
                    ArrayList arrayList9 = arrayList8;
                    dj0.d dVarO = pyd.c.O(mif.a.Q(bVar7), (gVar2 == null || (hVar2 = gVar2.f319088c) == null) ? null : hVar2.e);
                    dj0.d dVarO2 = pyd.c.O(mif.a.Q(bVar8), (gVar2 == null || (hVar = gVar2.f319088c) == null) ? null : hVar.f310849c);
                    y49.h hVar7 = gVar2 != null ? gVar2.f319088c : null;
                    if ((hVar7 != null ? hVar7.d : null) == null) {
                        scale = bVarC.d;
                    } else {
                        BigDecimal bigDecimalAdd = bigDecimal2.add(pyd.c.Y(hVar7.f310849c));
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                        BigDecimal bigDecimalSubtract = bVar7.f126703a.subtract(bigDecimal2);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                        BigDecimal bigDecimalAdd2 = bigDecimalSubtract.add(hVar7.f.f126703a);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                        if (e1.I(bigDecimalAdd2)) {
                            scale = BigDecimal.ZERO;
                        } else {
                            BigDecimal bigDecimalDivide = bigDecimalAdd.divide(bigDecimalAdd2, MathContext.DECIMAL128);
                            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(100);
                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                            scale = bigDecimalDivide.multiply(bigDecimalValueOf2).setScale(2, RoundingMode.HALF_UP);
                        }
                    }
                    aVar = new z2h.a(instrumentTicker, dVarO, dVarO2, scale, tradingLegalEntityInformation, arrayList9);
                }
                od0.i.Companion.getClass();
                return od0.h.a(aVar);
            case 27:
                c5j.j update = (c5j.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return c5j.j.a(update, null, ((c5j.j) ((j2) ((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a) obj3).f99772t.f22677a).getValue()).f21570c + 1, 3);
            case 28:
                c64.e eVar4 = (c64.e) obj3;
                c64.l outputData = (c64.l) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof c64.m) {
                    eVar4.l2(new btk.j(eVar4, outputData, continuation, 22), new yi5.b(i3));
                } else if (outputData instanceof l.a) {
                    eVar4.l2(new brc.h(eVar4, continuation, 29), new yi5.b(i3));
                } else {
                    if (!(outputData instanceof c64.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar4.K2(((c64.n) outputData).f21635a);
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                TextLocalisedClause textLocalisedClauseA = c64.d0.a("");
                int i21 = ((c64.d0) obj3).f21622b.f67186a;
                List listC = zhm.u.c(new c0("ID_LOADING_ACTION_ITEM", u.b.f54794a, R$attr.uikit_dp0, 0, 56));
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList10 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it12 = intRange.iterator();
                while (it12.f289625c) {
                    og ogVar = new og(a0.d.n("ID_LOADING_ITEM_", it12.nextInt() - 1));
                    yp0.b.l(ogVar, 0, 0, 0, 0, null, false, 63);
                    arrayList10.add(ogVar);
                }
                return new c64.p(i21, textLocalisedClauseA, zhm.d0.E0(arrayList10, listC));
        }
    }

    public /* synthetic */ t(Object obj2, int i) {
        this.f20018a = i;
        this.f20019b = obj2;
    }

    public /* synthetic */ t(ne0.d dVar, c49.d dVar2) {
        this.f20018a = 25;
        this.f20019b = dVar;
    }
}
