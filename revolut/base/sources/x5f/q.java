package x5f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models.RegionAllocationSection;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models.SectorAllocationSection$OtherSectorAllocation;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models.SectorAllocationSection$RegularSectorAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.RegionSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.SectorSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.TopHoldingSubclassAllocation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jel.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m6f.v;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f302974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ufm.d f302975b;

    public q(ybl.b instrumentTickerInteractor, ufm.d portfolioAllocationDataProvider) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(portfolioAllocationDataProvider, "portfolioAllocationDataProvider");
        this.f302974a = instrumentTickerInteractor;
        this.f302975b = portfolioAllocationDataProvider;
    }

    public static List a(List list) {
        Object next;
        List listC;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((AssetSubclassAllocation.AssetSubclassAdjustment) next).f95676a == vdh.a.TAA) {
                break;
            }
        }
        AssetSubclassAllocation.AssetSubclassAdjustment assetSubclassAdjustment = (AssetSubclassAllocation.AssetSubclassAdjustment) next;
        return (assetSubclassAdjustment == null || (listC = u.c(assetSubclassAdjustment)) == null) ? f0.f322471a : listC;
    }

    public static m6f.d c(a6f.i iVar, List list) {
        m6f.g eVar;
        if (iVar instanceof a6f.g) {
            eVar = new m6f.e(((a6f.g) iVar).e);
        } else {
            if (!(iVar instanceof a6f.h)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = m6f.f.f203059a;
        }
        m6f.g gVar = eVar;
        List<nel.n> list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (nel.n nVar : list2) {
            linkedHashMap.put(nVar.f214596b, nVar.d);
        }
        List listA = iVar.a();
        ArrayList<AssetSubclassAllocation.Stocks> arrayList = new ArrayList();
        for (Object obj2 : listA) {
            if (obj2 instanceof AssetSubclassAllocation.Stocks) {
                arrayList.add(obj2);
            }
        }
        List listA2 = iVar.a();
        ArrayList<AssetSubclassAllocation.Bonds> arrayList2 = new ArrayList();
        for (Object obj3 : listA2) {
            if (obj3 instanceof AssetSubclassAllocation.Bonds) {
                arrayList2.add(obj3);
            }
        }
        List listA3 = iVar.a();
        ArrayList<AssetSubclassAllocation.Commodities> arrayList3 = new ArrayList();
        for (Object obj4 : listA3) {
            if (obj4 instanceof AssetSubclassAllocation.Commodities) {
                arrayList3.add(obj4);
            }
        }
        List listA4 = iVar.a();
        ArrayList<AssetSubclassAllocation.Cash> arrayList4 = new ArrayList();
        for (Object obj5 : listA4) {
            if (obj5 instanceof AssetSubclassAllocation.Cash) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList(w.t(arrayList, 10));
        for (AssetSubclassAllocation.Stocks stocks : arrayList) {
            String str = stocks.f95689b;
            String str2 = (String) linkedHashMap.get(str);
            if (str2 == null) {
                str2 = str;
            }
            BigDecimal bigDecimal = stocks.f95688a;
            List list3 = stocks.f95690c;
            arrayList5.add(new m6f.i(str2, str, bigDecimal, list3 != null ? a(list3) : null));
        }
        long j2 = 0;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((AssetSubclassAllocation.Stocks) it8.next()).f95688a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        m6f.o oVar = new m6f.o(bigDecimalValueOf, arrayList5, false);
        ArrayList arrayList6 = new ArrayList(w.t(arrayList2, 10));
        for (AssetSubclassAllocation.Bonds bonds : arrayList2) {
            long j3 = j2;
            String str3 = bonds.f95680b;
            String str4 = (String) linkedHashMap.get(str3);
            String str5 = str4 == null ? str3 : str4;
            BigDecimal bigDecimal2 = bonds.f95679a;
            List list4 = bonds.f95681c;
            arrayList6.add(new m6f.i(str5, str3, bigDecimal2, list4 != null ? a(list4) : null));
            j2 = j3;
        }
        long j5 = j2;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j5);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            bigDecimalValueOf2 = bigDecimalValueOf2.add(((AssetSubclassAllocation.Bonds) it9.next()).f95679a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "add(...)");
        }
        m6f.k kVar = new m6f.k(bigDecimalValueOf2, arrayList6, false);
        ArrayList arrayList7 = new ArrayList(w.t(arrayList3, 10));
        for (AssetSubclassAllocation.Commodities commodities : arrayList3) {
            String str6 = commodities.f95686b;
            String str7 = (String) linkedHashMap.get(str6);
            if (str7 == null) {
                str7 = str6;
            }
            BigDecimal bigDecimal3 = commodities.f95685a;
            List list5 = commodities.f95687c;
            arrayList7.add(new m6f.i(str7, str6, bigDecimal3, list5 != null ? a(list5) : null));
        }
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(j5);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
        Iterator it10 = arrayList3.iterator();
        while (it10.hasNext()) {
            bigDecimalValueOf3 = bigDecimalValueOf3.add(((AssetSubclassAllocation.Commodities) it10.next()).f95685a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "add(...)");
        }
        m6f.m mVar = new m6f.m(bigDecimalValueOf3, arrayList7, false);
        ArrayList arrayList8 = new ArrayList(w.t(arrayList4, 10));
        for (AssetSubclassAllocation.Cash cash : arrayList4) {
            xi0.b bVar = cash.f95683b;
            BigDecimal bigDecimal4 = cash.f95682a;
            List list6 = cash.f95684c;
            arrayList8.add(new m6f.h(bVar, bigDecimal4, list6 != null ? a(list6) : null));
        }
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(j5);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf4, "valueOf(...)");
        Iterator it11 = arrayList4.iterator();
        while (it11.hasNext()) {
            bigDecimalValueOf4 = bigDecimalValueOf4.add(((AssetSubclassAllocation.Cash) it11.next()).f95682a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf4, "add(...)");
        }
        m6f.q qVar = new m6f.q(oVar, kVar, mVar, new m6f.l(bigDecimalValueOf4, arrayList8, false));
        List listP0 = d0.P0(iVar.c(), new p());
        int i = listP0.size() <= 6 ? 6 : 5;
        List list7 = listP0;
        List listV0 = d0.V0(list7, i);
        List listV = d0.V(list7, i);
        aim.e eVarB = u.b();
        eVarB.addAll(e(listV0));
        if (!listV.isEmpty()) {
            BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(j5);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf5, "valueOf(...)");
            Iterator it12 = listV.iterator();
            while (it12.hasNext()) {
                bigDecimalValueOf5 = bigDecimalValueOf5.add(((SectorSubclassAllocation) it12.next()).f95694b);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf5, "add(...)");
            }
            eVarB.add(new SectorAllocationSection$OtherSectorAllocation(bigDecimalValueOf5, e(listV), false));
        }
        aim.e eVarA = u.a(eVarB);
        List listP02 = d0.P0(iVar.b(), new o());
        int i2 = listP02.size() <= 6 ? 6 : 5;
        List list8 = listP02;
        List listV02 = d0.V0(list8, i2);
        List listV2 = d0.V(list8, i2);
        aim.e eVarB2 = u.b();
        eVarB2.addAll(d(listV02));
        if (!listV2.isEmpty()) {
            BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(j5);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf6, "valueOf(...)");
            Iterator it13 = listV2.iterator();
            while (it13.hasNext()) {
                bigDecimalValueOf6 = bigDecimalValueOf6.add(((RegionSubclassAllocation) it13.next()).f95692b);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf6, "add(...)");
            }
            eVarB2.add(new RegionAllocationSection.OtherRegionAllocation(bigDecimalValueOf6, d(listV2), false));
        }
        aim.e eVarA2 = u.a(eVarB2);
        List<TopHoldingSubclassAllocation> listD = iVar.d();
        ArrayList arrayList9 = new ArrayList(w.t(listD, 10));
        for (TopHoldingSubclassAllocation topHoldingSubclassAllocation : listD) {
            arrayList9.add(new v(topHoldingSubclassAllocation.f95695a, topHoldingSubclassAllocation.f95696b));
        }
        return new m6f.d(qVar, eVarA, eVarA2, arrayList9, gVar);
    }

    public static ArrayList d(List list) {
        List<RegionSubclassAllocation> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (RegionSubclassAllocation regionSubclassAllocation : list2) {
            arrayList.add(new RegionAllocationSection.RegularRegionAllocation(regionSubclassAllocation.f95692b, regionSubclassAllocation.f95691a));
        }
        return arrayList;
    }

    public static ArrayList e(List list) {
        List<SectorSubclassAllocation> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (SectorSubclassAllocation sectorSubclassAllocation : list2) {
            a3 a3Var = sectorSubclassAllocation.f95693a;
            if (a3Var == a3.OTHER || a3Var == a3.UNSPECIFIED) {
                a3Var = a3.UNSPECIFIED;
            }
            arrayList.add(new SectorAllocationSection$RegularSectorAllocation(sectorSubclassAllocation.f95694b, a3Var));
        }
        return arrayList;
    }

    public final Flow b(String templateId, a6f.a allocationSourceStrategy) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(allocationSourceStrategy, "allocationSourceStrategy");
        return boh.f.e(nim.a.v(this.f302975b.d(templateId, allocationSourceStrategy), new x29.a(this, 23)), new l(this, 0));
    }
}
