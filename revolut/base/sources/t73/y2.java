package t73;

import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.domain.MarketAsset;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$Step;
import ip0.s7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import s77.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class y2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268575a;

    public /* synthetic */ y2(int i) {
        this.f268575a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        od0.i iVarA;
        xi0.b bVarA;
        Parcelable currencyPair;
        switch (this.f268575a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data2 = (Data) pair.f186385a;
                Data data3 = (Data) pair.f186386b;
                return new s63.f((List) data2.getContent(), (k71.q) data3.getContent(), data2.getLoading() || data3.getLoading());
            case 1:
                k71.q it8 = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.P(it8, false, null, 3);
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Data(null, it9, false, 5, null);
            case 3:
                k71.q it10 = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zi0.c.P(it10, false, null, 3);
            case 4:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new Data(null, it11, false, 5, null);
            case 5:
                p5l.c it12 = (p5l.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.a();
            case 6:
                Data data4 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data4, "data");
                if (data4.getError() != null && data4.getContent() == null) {
                    data = new Data(zhm.f0.f322471a, null, false, 6, null);
                } else {
                    if (data4.getContent() != null || data4.getLoading()) {
                        return data4;
                    }
                    data = new Data(zhm.f0.f322471a, null, false, 6, null);
                }
                return data;
            case 7:
                Data data5 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data5, "data");
                try {
                    Object content = data5.getContent();
                    if (content != null) {
                        od0.h hVar = od0.i.Companion;
                        AccountId.Joint jointC = l38.a.c((n38.a) content);
                        hVar.getClass();
                        iVarA = od0.h.a(jointC);
                    } else {
                        iVarA = null;
                    }
                    return new Data(iVarA, data5.getError(), data5.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data5.getLoading());
                }
            case 8:
                Object[] items = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                int iB = zhm.q0.b(items.length);
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : items) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Pair<K of com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsScreenStateSnapshotInteractor.combineLatestToMap, V of com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsScreenStateSnapshotInteractor.combineLatestToMap>");
                    Pair pair2 = (Pair) obj3;
                    linkedHashMap.put(pair2.f186385a, pair2.f186386b);
                }
                return foh.i.f(linkedHashMap);
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.r0.g();
            case 10:
                q0 it13 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.e;
            case 11:
                al4.i entryPointAvailability = (al4.i) obj2;
                Intrinsics.checkNotNullParameter(entryPointAvailability, "entryPointAvailability");
                return Boolean.valueOf(entryPointAvailability instanceof al4.g);
            case 12:
                s77.m it14 = (s77.m) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Intrinsics.checkNotNullParameter(it14, "<this>");
                String str = it14.f260548b;
                String str2 = it14.f260547a;
                String str3 = it14.f260549c;
                if (str3 != null) {
                    xi0.b.Companion.getClass();
                    bVarA = xi0.a.a(str3);
                } else {
                    bVarA = null;
                }
                return new k77.i(str, str2, bVarA, it14.d, it14.e);
            case 13:
                s77.t it15 = (s77.t) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                List<s77.q> list = it15.f260565a;
                ArrayList arrayList = new ArrayList();
                for (s77.q qVar : list) {
                    if (qVar instanceof q.d) {
                        q.d dVar = (q.d) qVar;
                        currencyPair = new MarketAsset.Index(dVar.f260559b, dVar.f260560c, dVar.d);
                    } else if (qVar instanceof q.a) {
                        xi0.a aVar = xi0.b.Companion;
                        String str4 = ((q.a) qVar).f260554b;
                        aVar.getClass();
                        currencyPair = new MarketAsset.Commodity(xi0.a.a(str4));
                    } else if (qVar instanceof q.c) {
                        xi0.a aVar2 = xi0.b.Companion;
                        q.c cVar = (q.c) qVar;
                        String str5 = cVar.f260557c;
                        aVar2.getClass();
                        currencyPair = new MarketAsset.CurrencyPair(xi0.a.a(str5), xi0.a.a(cVar.d));
                    } else {
                        if (!(qVar instanceof q.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        currencyPair = null;
                    }
                    if (currencyPair != null) {
                        arrayList.add(currencyPair);
                    }
                }
                return arrayList;
            case 14:
                s77.w it16 = (s77.w) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return r77.d.b(it16);
            case 15:
                Intrinsics.h((List) obj2);
                return Boolean.valueOf(!r13.isEmpty());
            case 16:
                return Boolean.TRUE;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 18:
                CreateSubaccountFlowContract$Step it17 = (CreateSubaccountFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17 instanceof CreateSubaccountFlowContract$Step.InfoPickerScreen);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = zhm.u.c(new s7("PortfolioInsights_return_header_loading", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                List listC2 = zhm.u.c(new s7("PortfolioInsights_sharpe_ration_header_loading", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return zhm.d0.E0(listC2, listC);
            case 20:
                rzj.k it18 = (rzj.k) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f258697a;
            case 21:
                NewsDelegate.Model it19 = (NewsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.k instanceof t8j.g);
            case 22:
                NewsDelegate.Model it20 = (NewsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                Object obj4 = it20.k;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.retail.feature.crypto.asset_details.impl.news.CryptoLatestNewsMapper.WealthNewsArticleParcel");
                return ((t8j.g) obj4).f268902a;
            case 23:
                ListSubheaderDelegate.Model it21 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(Intrinsics.f(it21.f52708a, "CRYPTO_LATEST_NEWS_SUBHEADER_ID"));
            case 24:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "args");
                throw null;
            case 25:
                MatchResult matchResult = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(matchResult, "matchResult");
                return matchResult.getValue();
            case 26:
                String it22 = (String) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                String lowerCase = it22.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 27:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : facilities) {
                    if (((f95.d) obj5).f132831b != f95.e.INACTIVE) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 28:
                List listOfLists = (List) obj2;
                Intrinsics.checkNotNullParameter(listOfLists, "listOfLists");
                return zhm.w.u(listOfLists);
            default:
                List visibleCells = (List) obj2;
                Intrinsics.checkNotNullParameter(visibleCells, "visibleCells");
                return zhm.d0.Z(visibleCells);
        }
    }
}
