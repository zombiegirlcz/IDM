package ku1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.xc;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import jel.a3;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189607a;

    public /* synthetic */ f0(int i) {
        this.f189607a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f189607a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 3:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return kuc.a.f189766a;
            case 6:
                Throwable error2 = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (tradingLegalEntityInformation == null) {
                    return error2;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 9:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 10:
                Throwable th10 = (Throwable) obj2;
                if (((t61.g) obj3) == null) {
                    return th10;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 12:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 13:
                Throwable error4 = (Throwable) obj2;
                rp0.y yVar = (rp0.y) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (yVar == null) {
                    return error4;
                }
                return null;
            case 14:
                Throwable th11 = (Throwable) obj2;
                if (((Optional) obj3) == null) {
                    return th11;
                }
                return null;
            case 15:
                Throwable error5 = (Throwable) obj2;
                yw4.p pVar = (yw4.p) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (pVar == null) {
                    return error5;
                }
                return null;
            case 16:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new kw4.n(kw4.a0.a(zhm.f0.f322471a), (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)), new kw4.l(null, false));
            case 17:
                List sectorContributors = (List) obj2;
                iwg.a analyticsProductType = (iwg.a) obj3;
                Intrinsics.checkNotNullParameter(sectorContributors, "sectorContributors");
                Intrinsics.checkNotNullParameter(analyticsProductType, "newAnalyticsProductType");
                List<mwg.m> list2 = sectorContributors;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (mwg.m mVar : list2) {
                    a3 sector = mVar.f209478b;
                    String asset = mVar.f209479c;
                    dj0.d pnl2 = mVar.d;
                    float f = mVar.e;
                    LocalDate localDate = mVar.f;
                    String str = mVar.f209480g;
                    Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                    Intrinsics.checkNotNullParameter(sector, "sector");
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    Intrinsics.checkNotNullParameter(pnl2, "pnl");
                    arrayList.add(new mwg.m(analyticsProductType, sector, asset, pnl2, f, localDate, str));
                }
                return arrayList;
            case 18:
                mwg.l sectorAllocators = (mwg.l) obj2;
                iwg.a analyticsProductType2 = (iwg.a) obj3;
                Intrinsics.checkNotNullParameter(sectorAllocators, "sectorAllocators");
                Intrinsics.checkNotNullParameter(analyticsProductType2, "newAnalyticsProductType");
                a3 sector2 = sectorAllocators.f209475b;
                dj0.d totalValue = sectorAllocators.f209476c;
                List assets = sectorAllocators.d;
                Intrinsics.checkNotNullParameter(analyticsProductType2, "analyticsProductType");
                Intrinsics.checkNotNullParameter(sector2, "sector");
                Intrinsics.checkNotNullParameter(totalValue, "totalValue");
                Intrinsics.checkNotNullParameter(assets, "assets");
                return new mwg.l(analyticsProductType2, sector2, totalValue, assets);
            case 19:
                List contributors = (List) obj2;
                iwg.a newAnalyticsProductType = (iwg.a) obj3;
                Intrinsics.checkNotNullParameter(contributors, "contributors");
                Intrinsics.checkNotNullParameter(newAnalyticsProductType, "newAnalyticsProductType");
                List list3 = contributors;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(mwg.f.a((mwg.f) it8.next(), newAnalyticsProductType, null, BitmapDescriptorFactory.HUE_RED, null, 2046));
                }
                return arrayList2;
            case 20:
                List realisedPnlItems = (List) obj2;
                iwg.a analyticsProductType3 = (iwg.a) obj3;
                Intrinsics.checkNotNullParameter(realisedPnlItems, "realisedPnlItems");
                Intrinsics.checkNotNullParameter(analyticsProductType3, "newAnalyticsProductType");
                List<mwg.k> list4 = realisedPnlItems;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                for (mwg.k kVar : list4) {
                    String asset2 = kVar.f209470b;
                    LocalDate sellDate = kVar.f209471c;
                    dj0.d pnlFifo = kVar.d;
                    dj0.d pnlAverage = kVar.e;
                    String str2 = kVar.f;
                    ej0.b bVar = kVar.f209472g;
                    BigDecimal bigDecimal = kVar.f209473h;
                    Intrinsics.checkNotNullParameter(analyticsProductType3, "analyticsProductType");
                    Intrinsics.checkNotNullParameter(asset2, "asset");
                    Intrinsics.checkNotNullParameter(sellDate, "sellDate");
                    Intrinsics.checkNotNullParameter(pnlFifo, "pnlFifo");
                    Intrinsics.checkNotNullParameter(pnlAverage, "pnlAverage");
                    arrayList3.add(new mwg.k(analyticsProductType3, asset2, sellDate, pnlFifo, pnlAverage, str2, bVar, bigDecimal));
                }
                return arrayList3;
            case 21:
                mwg.a allocations = (mwg.a) obj2;
                iwg.a newAnalyticsProductType2 = (iwg.a) obj3;
                Intrinsics.checkNotNullParameter(allocations, "allocations");
                Intrinsics.checkNotNullParameter(newAnalyticsProductType2, "newAnalyticsProductType");
                return mwg.a.a(allocations, newAnalyticsProductType2, null, null, 30);
            case 22:
                ((Boolean) obj2).getClass();
                return Boolean.FALSE;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 24:
                Throwable error6 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list5 == null) {
                    return error6;
                }
                return null;
            case 25:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new Pair(zhm.f0.f322471a, zhm.u.c(new xc("MARKET_HOURS_ERROR", (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null)), 0, null, null, 0, 0, 0, 1020)));
            case 26:
                Throwable error7 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list6 == null) {
                    return error7;
                }
                return null;
            case 27:
                Throwable error8 = (Throwable) obj2;
                l71.d dVar = (l71.d) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (dVar == null) {
                    return error8;
                }
                return null;
            case 28:
                Throwable error9 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (nVar == null) {
                    return error9;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ f0(cli.n nVar, int i) {
        this.f189607a = i;
    }
}
