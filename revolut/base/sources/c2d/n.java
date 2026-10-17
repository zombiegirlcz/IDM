package c2d;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.domain.MarketAsset;
import com.revolut.feature.global_markets.domain.MarketAssetPerformance;
import com.revolut.feature.global_markets.domain.MarketAssetWithPerformance;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingWithDisclaimer;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.selector.SavingsSelectorScreen;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ip0.s7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.m;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20723a;

    public /* synthetic */ n(int i) {
        this.f20723a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BigDecimal bigDecimalJ;
        ogd.e eVar;
        boolean z = true;
        switch (this.f20723a) {
            case 0:
                Data feature = (Data) obj2;
                Intrinsics.checkNotNullParameter(feature, "feature");
                yoj.a aVar = (yoj.a) feature.getContent();
                if (aVar != null) {
                    if (!yoj.b.k(aVar) && !yoj.b.l(aVar)) {
                        z = false;
                    }
                    z = z;
                }
                return Boolean.valueOf(z);
            case 1:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<nel.n> list = instruments;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (nel.n nVar : list) {
                    arrayList.add(new u3d.a(24, null, nVar.f214596b, nVar.e, nVar.d, null));
                }
                return arrayList;
            case 2:
                List tickers = (List) obj2;
                Intrinsics.checkNotNullParameter(tickers, "tickers");
                List<InstrumentTicker> list2 = tickers;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (InstrumentTicker instrumentTicker : list2) {
                    String str = instrumentTicker.f105112b;
                    String str2 = instrumentTicker.f105113c;
                    dj0.d dVar = instrumentTicker.e;
                    arrayList2.add(new lgd.d(str, str2, dVar.f115083b.f306286a, pyd.c.j(dVar), jb3.l.N(instrumentTicker), null));
                }
                return arrayList2;
            case 3:
                List<MarketAssetWithPerformance> marketAssetWithPerformances = (List) obj2;
                Intrinsics.checkNotNullParameter(marketAssetWithPerformances, "marketAssetWithPerformances");
                ArrayList<Pair> arrayList3 = new ArrayList();
                for (MarketAssetWithPerformance marketAssetWithPerformance : marketAssetWithPerformances) {
                    MarketAsset marketAsset = marketAssetWithPerformance.f74577a;
                    MarketAsset.Index index = marketAsset instanceof MarketAsset.Index ? (MarketAsset.Index) marketAsset : null;
                    MarketAssetPerformance marketAssetPerformance = marketAssetWithPerformance.f74578b;
                    Pair pair = (index == null || marketAssetPerformance == null) ? null : new Pair(index, marketAssetPerformance);
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                for (Pair pair2 : arrayList3) {
                    MarketAsset.Index index2 = (MarketAsset.Index) pair2.f186385a;
                    MarketAssetPerformance marketAssetPerformance2 = (MarketAssetPerformance) pair2.f186386b;
                    arrayList4.add(new lgd.d(index2.a(), index2.f74572b, marketAssetPerformance2.f74574a.f306286a, marketAssetPerformance2.f74575b, marketAssetPerformance2.f74576c, null));
                }
                return arrayList4;
            case 4:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(!data.getLoading());
            case 5:
                List assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                List<k77.i> list3 = assets;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                for (k77.i iVar : list3) {
                    arrayList5.add(new u3d.a(16, null, iVar.f, iVar.f181835b, iVar.d, iVar.a().f306286a));
                }
                return arrayList5;
            case 6:
                Data feature2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(feature2, "feature");
                yoj.a aVar2 = (yoj.a) feature2.getContent();
                return Boolean.valueOf(aVar2 != null ? yoj.b.k(aVar2) : false);
            case 7:
                List instruments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments2, "instruments");
                List<nel.n> list4 = instruments2;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list4, 10));
                for (nel.n nVar2 : list4) {
                    arrayList6.add(new u3d.a(8, nVar2.f214603n, nVar2.f214596b, nVar2.e, nVar2.d, null));
                }
                return arrayList6;
            case 8:
                List tickers2 = (List) obj2;
                Intrinsics.checkNotNullParameter(tickers2, "tickers");
                List<InstrumentTicker> list5 = tickers2;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                for (InstrumentTicker instrumentTicker2 : list5) {
                    String str3 = instrumentTicker2.f105112b;
                    String str4 = instrumentTicker2.f105113c;
                    dj0.d dVar2 = instrumentTicker2.e;
                    String str5 = dVar2.f115083b.f306286a;
                    ej0.b bVar = instrumentTicker2.f;
                    if (bVar == null || (bigDecimalJ = bVar.f126703a) == null) {
                        bigDecimalJ = pyd.c.j(dVar2);
                    }
                    arrayList7.add(new lgd.d(str3, str4, str5, bigDecimalJ, jb3.l.N(instrumentTicker2), null));
                }
                return arrayList7;
            case 9:
                List tickers3 = (List) obj2;
                Intrinsics.checkNotNullParameter(tickers3, "tickers");
                List<InstrumentTicker> list6 = tickers3;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list6, 10));
                for (InstrumentTicker instrumentTicker3 : list6) {
                    String str6 = instrumentTicker3.f105112b;
                    String str7 = instrumentTicker3.f105113c;
                    dj0.d dVar3 = instrumentTicker3.e;
                    arrayList8.add(new lgd.d(str6, str7, dVar3.f115083b.f306286a, pyd.c.j(dVar3), jb3.l.N(instrumentTicker3), null));
                }
                return arrayList8;
            case 10:
                Data feature3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(feature3, "feature");
                yoj.a aVar3 = (yoj.a) feature3.getContent();
                return Boolean.valueOf(aVar3 != null ? yoj.b.k(aVar3) : false);
            case 11:
                List instruments3 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments3, "instruments");
                List<nel.n> list7 = instruments3;
                ArrayList arrayList9 = new ArrayList(zhm.w.t(list7, 10));
                for (nel.n nVar3 : list7) {
                    arrayList9.add(new u3d.a(24, null, nVar3.f214596b, nVar3.e, nVar3.d, null));
                }
                return arrayList9;
            case 12:
                List<nel.n> instruments4 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments4, "instruments");
                ArrayList arrayList10 = new ArrayList();
                for (nel.n nVar4 : instruments4) {
                    if (io3.h.j(nVar4.f214597c) && nVar4.f.d && nVar4.f214605q == null) {
                        String str8 = nVar4.f214596b;
                        String str9 = nVar4.e;
                        String str10 = nVar4.d;
                        y1d.b.Companion.getClass();
                        eVar = new ogd.e(new FavouritesAssetDetails(str8, str9, str10, y1d.a.i, false), nVar4.i.f306286a, null, null);
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        arrayList10.add(eVar);
                    }
                }
                return arrayList10;
            case 13:
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                if (!cp5.d.y(currency) && !cp5.d.A(currency)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                xi0.b currency2 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency2, "currency");
                if (!cp5.d.z(currency2) && !cp5.d.A(currency2)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                return Boolean.valueOf(cp5.d.A((xi0.b) obj2));
            case 16:
                List assetInfos = (List) obj2;
                Intrinsics.checkNotNullParameter(assetInfos, "assetInfos");
                List<Pair> list8 = assetInfos;
                ArrayList arrayList11 = new ArrayList(zhm.w.t(list8, 10));
                for (Pair pair3 : list8) {
                    MarketAsset.Index index3 = (MarketAsset.Index) pair3.f186385a;
                    k77.i iVar2 = (k77.i) pair3.f186386b;
                    String strA = index3.a();
                    String str11 = index3.f74572b;
                    y1d.b.Companion.getClass();
                    FavouritesAssetTypeKey favouritesAssetTypeKey = y1d.a.f310362j;
                    String str12 = iVar2.a().f306286a;
                    xi0.b.Companion.getClass();
                    FavouritesAssetDetails favouritesAssetDetails = new FavouritesAssetDetails(strA, str11, str11, favouritesAssetTypeKey, Intrinsics.f(str12, xi0.b.f306271c.f306286a));
                    xi0.b bVar2 = iVar2.f181836c;
                    if (bVar2 == null) {
                        bVar2 = xi0.b.i;
                    }
                    arrayList11.add(new ogd.e(favouritesAssetDetails, bVar2.f306286a, null, null));
                }
                return arrayList11;
            case 17:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List listC = zhm.u.c(new s7("TAX_ID_ITEM_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new c2f.i(listC, new lw0.h(lw0.i.AVATAR));
            case 18:
                TravelExperienceLanguage language = (TravelExperienceLanguage) obj2;
                Intrinsics.checkNotNullParameter(language, "language");
                return language.f92824b;
            case 19:
                CellDetailsSwitcherDelegate.Model it9 = (CellDetailsSwitcherDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Unit.f186387a;
            case 20:
                rp0.p it10 = (rp0.p) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Unit.f186387a;
            case 21:
                String str13 = (String) obj2;
                return prk.o.m(str13, "it", str13, "ORDER_TYPE");
            case 22:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Unit.f186387a;
            case 23:
                m.a it12 = (m.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Unit.f186387a;
            case 24:
                RowDelegate.Model it13 = (RowDelegate.Model) obj2;
                int i = SavingsSelectorScreen.V;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj3 = it13.u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingWithDisclaimer");
                return (SavingWithDisclaimer) obj3;
            case 25:
                c30.a it14 = (c30.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                List dates = it14.getDates();
                ArrayList arrayList12 = new ArrayList(zhm.w.t(dates, 10));
                Iterator it15 = dates.iterator();
                while (it15.hasNext()) {
                    arrayList12.add(mif.a.B((c20.a) it15.next()));
                }
                return arrayList12;
            case 26:
                lk0.e it16 = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return null;
            case 27:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                List list9 = previousPage.f196171a;
                if (list9.isEmpty() || list9.size() < 12) {
                    return null;
                }
                return new f3e.b(list9.size() + ((f3e.b) previousPage.f196172b).f131960a);
            case 28:
                Data it17 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.h hVar = od0.i.Companion;
                Object content = it17.getContent();
                hVar.getClass();
                return od0.h.a(content);
            default:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return iii.c.c(5);
        }
    }
}
