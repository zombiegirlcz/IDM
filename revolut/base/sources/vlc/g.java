package vlc;

import android.os.Parcelable;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.RegionSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.SectorSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.TopHoldingSubclassAllocation;
import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import com.revolut.feature.wealth.models.robo.Template;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vlc.d;
import vlc.e;
import wp5.y;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f290362a;

    public g(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f290362a = dateProvider;
    }

    public static ArrayList a(List list) throws Throwable {
        AssetSubclassAllocation.AssetSubclassAdjustment assetSubclassAdjustment;
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            d.a.C1603a c1603a = (d.a.C1603a) it8.next();
            Iterator<E> it9 = vdh.a.b().iterator();
            while (true) {
                assetSubclassAdjustment = null;
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((vdh.a) next).a(), c1603a.getType())) {
                    break;
                }
            }
            vdh.a aVar = (vdh.a) next;
            if (aVar == null) {
                hx7.e.n(new IllegalArgumentException(j6.a.q("AssetSubclassAdjustmentType can't be mapped. type = ", c1603a.getType())));
            } else {
                assetSubclassAdjustment = new AssetSubclassAllocation.AssetSubclassAdjustment(aVar, c1603a.getWeight(), c1603a.getRationale());
            }
            if (assetSubclassAdjustment != null) {
                arrayList.add(assetSubclassAdjustment);
            }
        }
        return arrayList;
    }

    public static alc.f b(e.a.C1605a c1605a) {
        Intrinsics.checkNotNullParameter(c1605a, "<this>");
        return new alc.f(mo3.a.o(c1605a.getMin()), mo3.a.o(c1605a.getMax()), mo3.a.o(c1605a.getDefault()), mo3.a.o(c1605a.getStepSize()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    public static alc.j c(e eVar) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        BigDecimal bigDecimalE = eVar.getStandardDeviation();
        BigDecimal bigDecimalC = eVar.getMean();
        BigDecimal bigDecimalB = eVar.getFee();
        e.a aVarA = eVar.getConfig();
        Intrinsics.checkNotNullParameter(aVarA, "<this>");
        alc.g gVar = new alc.g(b(aVarA.getStartingAmountRange()), b(aVarA.getMonthlyContributionRange()));
        List listD = eVar.getSimulatedAnnualReturns();
        if (listD != null) {
            List<c> list = listD;
            arrayList = new ArrayList(w.t(list, 10));
            for (c cVar : list) {
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                arrayList.add(new alc.h(cVar.getSimulatedYears(), cVar.getReturnPercentile25(), cVar.getReturnPercentile50(), cVar.getReturnPercentile75()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        return new alc.j(bigDecimalE, bigDecimalC, gVar, bigDecimalB, arrayList);
    }

    public static Template d(d templateDto) throws Throwable {
        xdh.a aVar;
        xdh.d dVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        BenchmarkInfo benchmarkInfo;
        Object next;
        Parcelable commodities;
        Parcelable stocks;
        Intrinsics.checkNotNullParameter(templateDto, "templateDto");
        String id10 = templateDto.getId();
        int i = f.f290359a[templateDto.getRiskProfile().ordinal()];
        int i2 = 4;
        if (i == 1) {
            aVar = xdh.a.CONSERVATIVE;
        } else if (i == 2) {
            aVar = xdh.a.CAUTIOUS;
        } else if (i == 3) {
            aVar = xdh.a.BALANCED;
        } else if (i == 4) {
            aVar = xdh.a.BOLD;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = xdh.a.AGGRESSIVE;
        }
        int i3 = f.f290360b[templateDto.getThematicGroup().ordinal()];
        if (i3 == 1) {
            dVar = xdh.d.CORE;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = xdh.d.SUSTAINABLE;
        }
        String name = templateDto.getName();
        String iconName = templateDto.getIconName();
        List<d.a> allocations = templateDto.getAllocations();
        if (allocations != null) {
            arrayList = new ArrayList();
            for (d.a aVar2 : allocations) {
                d.a.b subclass = aVar2.getSubclass();
                int i5 = subclass == null ? -1 : f.f290361c[subclass.ordinal()];
                if (i5 != -1) {
                    if (i5 == 1) {
                        String ref2 = aVar2.getRef();
                        BigDecimal allocation = aVar2.getAllocation();
                        List adjustments = aVar2.getAdjustments();
                        stocks = new AssetSubclassAllocation.Stocks(ref2, allocation, adjustments != null ? a(adjustments) : null);
                    } else if (i5 == 2) {
                        String ref3 = aVar2.getRef();
                        BigDecimal allocation2 = aVar2.getAllocation();
                        List adjustments2 = aVar2.getAdjustments();
                        stocks = new AssetSubclassAllocation.Bonds(ref3, allocation2, adjustments2 != null ? a(adjustments2) : null);
                    } else if (i5 == 3) {
                        String ref4 = aVar2.getRef();
                        xi0.b.Companion.getClass();
                        xi0.b bVarA = xi0.a.a(ref4);
                        BigDecimal allocation3 = aVar2.getAllocation();
                        List adjustments3 = aVar2.getAdjustments();
                        stocks = new AssetSubclassAllocation.Cash(allocation3, bVarA, adjustments3 != null ? a(adjustments3) : null);
                    } else {
                        if (i5 != i2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String ref5 = aVar2.getRef();
                        BigDecimal allocation4 = aVar2.getAllocation();
                        List adjustments4 = aVar2.getAdjustments();
                        commodities = new AssetSubclassAllocation.Commodities(ref5, allocation4, adjustments4 != null ? a(adjustments4) : null);
                    }
                    commodities = stocks;
                } else {
                    y.B("Unrecognized assetClass");
                    commodities = null;
                }
                if (commodities != null) {
                    arrayList.add(commodities);
                }
                i2 = 4;
            }
        } else {
            arrayList = null;
        }
        List sectorAllocations = templateDto.getSectorAllocations();
        if (sectorAllocations != null) {
            List<d.e> list = sectorAllocations;
            arrayList2 = new ArrayList(w.t(list, 10));
            for (d.e eVar : list) {
                arrayList2.add(new SectorSubclassAllocation(eVar.getAllocation(), eVar.getSector()));
            }
        } else {
            arrayList2 = null;
        }
        List regionAllocations = templateDto.getRegionAllocations();
        if (regionAllocations != null) {
            List<d.c> list2 = regionAllocations;
            arrayList3 = new ArrayList(w.t(list2, 10));
            for (d.c cVar : list2) {
                Iterator<E> it8 = qdh.a.a().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((qdh.a) next).b(), cVar.getRegion())) {
                        break;
                    }
                }
                qdh.a aVar3 = (qdh.a) next;
                if (aVar3 == null) {
                    aVar3 = qdh.a.UNSPECIFIED;
                }
                arrayList3.add(new RegionSubclassAllocation(cVar.getAllocation(), aVar3));
            }
        } else {
            arrayList3 = null;
        }
        List topHoldingAllocations = templateDto.getTopHoldingAllocations();
        if (topHoldingAllocations != null) {
            List<d.g> list3 = topHoldingAllocations;
            arrayList4 = new ArrayList(w.t(list3, 10));
            for (d.g gVar : list3) {
                arrayList4.add(new TopHoldingSubclassAllocation(gVar.getRef(), gVar.getAllocation()));
            }
        } else {
            arrayList4 = null;
        }
        String description = templateDto.getDescription();
        d.b benchmark = templateDto.getBenchmark();
        if (benchmark != null) {
            Intrinsics.checkNotNullParameter(benchmark, "<this>");
            benchmarkInfo = new BenchmarkInfo(benchmark.getRef(), benchmark.getName());
        } else {
            benchmarkInfo = null;
        }
        return new Template(id10, aVar, dVar, name, iconName, arrayList, arrayList2, arrayList3, arrayList4, description, benchmarkInfo, templateDto.getOverview(), templateDto.getStrategyReport());
    }

    public static d e(Template template) {
        d.EnumC1604d enumC1604d;
        d.f fVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        d.b bVar;
        d.a.b bVar2;
        ArrayList arrayList5;
        Intrinsics.checkNotNullParameter(template, "template");
        String str = template.f95706a;
        int i = f.d[template.f95707b.ordinal()];
        if (i == 1) {
            enumC1604d = d.EnumC1604d.CONSERVATIVE;
        } else if (i == 2) {
            enumC1604d = d.EnumC1604d.CAUTIOUS;
        } else if (i == 3) {
            enumC1604d = d.EnumC1604d.BALANCED;
        } else if (i == 4) {
            enumC1604d = d.EnumC1604d.BOLD;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            enumC1604d = d.EnumC1604d.AGGRESSIVE;
        }
        int i2 = f.e[template.f95708c.ordinal()];
        if (i2 == 1) {
            fVar = d.f.CORE;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = d.f.SUSTAINABLE;
        }
        d.f fVar2 = fVar;
        String str2 = template.d;
        String str3 = template.e;
        List list = template.f;
        int i3 = 10;
        if (list != null) {
            List<AssetSubclassAllocation> list2 = list;
            ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
            for (AssetSubclassAllocation assetSubclassAllocation : list2) {
                if (assetSubclassAllocation instanceof AssetSubclassAllocation.Bonds) {
                    bVar2 = d.a.b.BOND;
                } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Cash) {
                    bVar2 = d.a.b.CASH;
                } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Commodities) {
                    bVar2 = d.a.b.COMMODITY;
                } else {
                    if (!(assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2 = d.a.b.STOCK;
                }
                String f95689b = assetSubclassAllocation.getF95689b();
                BigDecimal f95688a = assetSubclassAllocation.getF95688a();
                List f95690c = assetSubclassAllocation.getF95690c();
                if (f95690c != null) {
                    List<AssetSubclassAllocation.AssetSubclassAdjustment> list3 = f95690c;
                    arrayList5 = new ArrayList(w.t(list3, i3));
                    for (AssetSubclassAllocation.AssetSubclassAdjustment assetSubclassAdjustment : list3) {
                        d.EnumC1604d enumC1604d2 = enumC1604d;
                        arrayList5.add(new d.a.C1603a(assetSubclassAdjustment.f95676a.name(), assetSubclassAdjustment.f95678c, assetSubclassAdjustment.f95677b));
                        enumC1604d = enumC1604d2;
                    }
                } else {
                    arrayList5 = null;
                }
                d.EnumC1604d enumC1604d3 = enumC1604d;
                arrayList6.add(new d.a(f95689b, bVar2, f95688a, arrayList5));
                enumC1604d = enumC1604d3;
                i3 = 10;
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        d.EnumC1604d enumC1604d4 = enumC1604d;
        List list4 = template.f95709g;
        if (list4 != null) {
            List<SectorSubclassAllocation> list5 = list4;
            ArrayList arrayList7 = new ArrayList(w.t(list5, 10));
            for (SectorSubclassAllocation sectorSubclassAllocation : list5) {
                arrayList7.add(new d.e(sectorSubclassAllocation.f95694b, sectorSubclassAllocation.f95693a));
            }
            arrayList2 = arrayList7;
        } else {
            arrayList2 = null;
        }
        List list6 = template.f95710h;
        if (list6 != null) {
            List<RegionSubclassAllocation> list7 = list6;
            ArrayList arrayList8 = new ArrayList(w.t(list7, 10));
            for (RegionSubclassAllocation regionSubclassAllocation : list7) {
                arrayList8.add(new d.c(regionSubclassAllocation.f95691a.b(), regionSubclassAllocation.f95692b));
            }
            arrayList3 = arrayList8;
        } else {
            arrayList3 = null;
        }
        List list8 = template.i;
        if (list8 != null) {
            List<TopHoldingSubclassAllocation> list9 = list8;
            ArrayList arrayList9 = new ArrayList(w.t(list9, 10));
            for (TopHoldingSubclassAllocation topHoldingSubclassAllocation : list9) {
                arrayList9.add(new d.g(topHoldingSubclassAllocation.f95695a, topHoldingSubclassAllocation.f95696b));
            }
            arrayList4 = arrayList9;
        } else {
            arrayList4 = null;
        }
        String str4 = template.f95711j;
        BenchmarkInfo benchmarkInfo = template.k;
        if (benchmarkInfo != null) {
            Intrinsics.checkNotNullParameter(benchmarkInfo, "<this>");
            bVar = new d.b(benchmarkInfo.f95697a, benchmarkInfo.f95698b);
        } else {
            bVar = null;
        }
        return new d(str, enumC1604d4, fVar2, str2, str3, arrayList, arrayList2, arrayList3, arrayList4, str4, bVar, template.f95712l, template.f95713m);
    }

    public static e.a.C1605a f(alc.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new e.a.C1605a(mo3.a.p(fVar.f6193a), mo3.a.p(fVar.f6194b), mo3.a.p(fVar.f6195c), mo3.a.p(fVar.d));
    }

    public final r g(pdh.c timeSpan) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        switch (f.f[timeSpan.ordinal()]) {
            case 1:
                return k.f290366b;
            case 2:
                return m.f290368b;
            case 3:
                return l.f290367b;
            case 4:
                return o.f290370b;
            case 5:
                return n.f290369b;
            case 6:
                return q.f290372b;
            case 7:
                return j.f290365b;
            case 8:
                return p.f290371b;
            case 9:
                return h.f290363b;
            case 10:
                return new i(((l80.f) this.f290362a).f().getDayOfYear());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
