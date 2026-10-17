package bjg;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto.zero_fees.api.models.CryptoZeroFeesPromotion;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import com.revolut.feature.derivatives.models.BalanceWithPnl;
import com.revolut.feature.tab.crypto.impl.ui.actions.HeaderActionsProvider$HeaderActionsData;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoHeaderData;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import ip0.qc;
import ip0.tc;
import ip0.xc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import n14.k;
import od0.i;
import ofm.q;
import pwa.n;
import yhm.r;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15663a;

    public /* synthetic */ c(int i) {
        this.f15663a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f15663a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(ajg.a.a((zig.a) it9.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof TrustedMerchant.Approved) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 1:
                zig.a it10 = (zig.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ajg.a.a(it10);
            case 2:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                gom.e.f145194a.e(it11);
                return Unit.f186387a;
            case 3:
                Intrinsics.checkNotNullParameter((ifm.c) obj2, "it");
                return Unit.f186387a;
            case 4:
                return Unit.f186387a;
            case 5:
                List atmsDto = (List) obj2;
                Intrinsics.checkNotNullParameter(atmsDto, "atmsDto");
                List list2 = atmsDto;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it12 = list2.iterator();
                while (it12.hasNext()) {
                    arrayList3.add(bk2.c.b((ak2.b) it12.next()));
                }
                return arrayList3;
            case 6:
                List atmsDto2 = (List) obj2;
                Intrinsics.checkNotNullParameter(atmsDto2, "atmsDto");
                List list3 = atmsDto2;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                Iterator it13 = list3.iterator();
                while (it13.hasNext()) {
                    arrayList4.add(bk2.c.b((ak2.b) it13.next()));
                }
                return arrayList4;
            case 7:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return m72.b.x(it14, i.Companion);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 11:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List listV0 = d0.V0((Iterable) getDefaultLoadingItems.invoke(), 2);
                yp0.b.k(listV0, 0, 0, 0, 0, 31);
                return listV0;
            case 12:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(!it15.isEmpty());
            case 13:
                Boolean it16 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zi0.c.P(it16, false, null, 3);
            case 14:
                Boolean it17 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zi0.c.P(it17, false, null, 3);
            case 15:
                CryptoZeroFeesPromotion it18 = (CryptoZeroFeesPromotion) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return zi0.c.P(it18, false, null, 3);
            case 16:
                k5c.a it19 = (k5c.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.f181472a != k5c.b.NOT_ELIGIBLE);
            case 17:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new Pair((dj0.d) pair.f186385a, (BalanceWithPnl) pair.f186386b);
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 19:
                Boolean it20 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return zi0.c.P(it20, false, null, 3);
            case 20:
                vf0.a aVar = (vf0.a) obj2;
                Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                yh5.a aVar2 = (yh5.a) aVar.f288388a;
                r rVar = (r) aVar.f288389b;
                Pair pair2 = (Pair) aVar.f288390c;
                boolean zBooleanValue = ((Boolean) aVar.d).booleanValue();
                boolean zBooleanValue2 = ((Boolean) aVar.e).booleanValue();
                CryptoZeroFeesPromotion cryptoZeroFeesPromotion = (CryptoZeroFeesPromotion) aVar.f;
                boolean zBooleanValue3 = ((Boolean) aVar.f288391g).booleanValue();
                i iVar = (i) aVar.i;
                Pair pair3 = (Pair) aVar.f288393j;
                ArrayList arrayListN = k.N((List) rVar.f314203c);
                ArrayList arrayList5 = new ArrayList(w.t(arrayListN, 10));
                Iterator it21 = arrayListN.iterator();
                while (it21.hasNext()) {
                    arrayList5.add(q.f0((qta.c) it21.next()));
                }
                return new CryptoHeaderData((PocketBalancesWithSum) rVar.f314201a, (dj0.d) pair3.f186385a, (BalanceWithPnl) pair3.f186386b, (CryptoCommodityPositions) rVar.f314202b, arrayList5, aVar2, new HeaderActionsProvider$HeaderActionsData(((Boolean) pair2.f186385a).booleanValue(), ((Boolean) pair2.f186386b).booleanValue(), zBooleanValue || zBooleanValue2, zBooleanValue3, (n) iVar.f224257a), false, cryptoZeroFeesPromotion);
            case 21:
                Boolean it22 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return zi0.c.P(it22, false, null, 3);
            case 22:
                return ake.a.a((ake.a) obj2, null, null, null, null, null, null, null, null, null, null, 991);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new xc("ID_CONTENT", iii.c.c(5), 0, new tc(qc.f165962a), null, R$attr.uikit_dp96, 0, 0, 876));
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 25:
                BannerDelegate.Model it23 = (BannerDelegate.Model) obj2;
                KProperty[] kPropertyArr = TabInvestController.l0;
                Intrinsics.checkNotNullParameter(it23, "it");
                Object obj4 = it23.k;
                return Boolean.TRUE;
            case 26:
                BannerDelegate.Model it24 = (BannerDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = TabInvestController.l0;
                Intrinsics.checkNotNullParameter(it24, "it");
                Object obj5 = it24.k;
                return Boolean.TRUE;
            case 27:
                WealthAccount it25 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Boolean.valueOf(it25 instanceof WealthAccount.Securities);
            case 28:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TabInvestControllerModel", "Failed to load trading transaction updates", throwable, h0Var);
                return Boolean.TRUE;
            default:
                WealthAccount it26 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return Boolean.valueOf(it26 instanceof WealthAccount.Securities);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f15663a = i;
    }
}
