package com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats;

import a7j.g;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsScreen;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsNavigationId;
import dvk.k;
import dvk.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import urk.c;
import urk.e;
import urk.f;
import urk.h;
import urk.i;
import urk.j;
import urk.m;
import urk.o;
import urk.p;
import urk.q;
import urk.r;
import urk.s;
import urk.t;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f103929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f103930c;
    public static final Set d;
    public static final Set e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f103931a;

    static {
        DetailedStatsNavigationId.PriceAndVolume priceAndVolume = DetailedStatsNavigationId.PriceAndVolume.d;
        DetailedStatsNavigationId[] elements = {priceAndVolume, DetailedStatsNavigationId.PerShareData.d, DetailedStatsNavigationId.Ratios.d};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f103929b = d.y0(elements);
        DetailedStatsNavigationId[] elements2 = {priceAndVolume, DetailedStatsNavigationId.FundData.d};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f103930c = d.y0(elements2);
        DetailedStatsNavigationId[] elements3 = {DetailedStatsNavigationId.EeaPriceAndVolume.d, DetailedStatsNavigationId.EeaFundData.d};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        d = d.y0(elements3);
        DetailedStatsNavigationId[] elements4 = {DetailedStatsNavigationId.Yield.d, DetailedStatsNavigationId.BondPriceAndVolume.d, DetailedStatsNavigationId.Risk.d};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        e = d.y0(elements4);
    }

    public b(g statsScreenChecker) {
        Intrinsics.checkNotNullParameter(statsScreenChecker, "statsScreenChecker");
        this.f103931a = statsScreenChecker;
    }

    public final ArrayList a(n instrument, hel.b tradingContext, afl.a stats) {
        Set set;
        Boolean boolValueOf;
        rrk.d fVar;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        Intrinsics.checkNotNullParameter(stats, "stats");
        switch (l.f118159a[instrument.f214597c.ordinal()]) {
            case 1:
            case 2:
            case 3:
                switch (l.f118160b[tradingContext.ordinal()]) {
                    case 1:
                        set = d;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        set = f103930c;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                break;
            case 4:
                set = e;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                set = f103929b;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            StatsScreen screen = ((DetailedStatsNavigationId) obj2).f103922b;
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(stats, "stats");
            Intrinsics.checkNotNullParameter(screen, "screen");
            Iterable iterable = (Iterable) this.f103931a.f1921a.get(screen.getClass());
            if (iterable != null) {
                boolean z = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it8 = iterable.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            StatsSection section = (StatsSection) it8.next();
                            Intrinsics.checkNotNullParameter(section, "section");
                            if (Intrinsics.f(section, StatsSection.DividendInformation.f103762b)) {
                                fVar = new urk.a();
                            } else if (Intrinsics.f(section, StatsSection.Dividends.f103763b)) {
                                fVar = new c();
                            } else if (Intrinsics.f(section, StatsSection.DividendsAndCharges.f103764b)) {
                                fVar = new urk.b();
                            } else if (Intrinsics.f(section, StatsSection.EeaMarketCapitalisation.f103765b)) {
                                fVar = new urk.d();
                            } else if (Intrinsics.f(section, StatsSection.EeaPrice.f103766b)) {
                                fVar = new e();
                            } else if (Intrinsics.f(section, StatsSection.ExpenseRatios.f103768b)) {
                                fVar = new urk.g();
                            } else if (Intrinsics.f(section, StatsSection.ManagementEfectiveness.f103769b)) {
                                fVar = new h();
                            } else if (Intrinsics.f(section, StatsSection.ManagementFees.f103770b)) {
                                fVar = new i();
                            } else if (Intrinsics.f(section, StatsSection.MarketCapitalisation.f103771b)) {
                                fVar = new j();
                            } else if (Intrinsics.f(section, StatsSection.PerShareData.f103772b)) {
                                fVar = new urk.k();
                            } else if (Intrinsics.f(section, StatsSection.Price.f103773b)) {
                                fVar = new m();
                            } else if (Intrinsics.f(section, StatsSection.PriceRange.f103774b)) {
                                fVar = new urk.l();
                            } else if (Intrinsics.f(section, StatsSection.ProfitabilityRatios.f103775b)) {
                                fVar = new urk.n();
                            } else if (Intrinsics.f(section, StatsSection.Risk.f103776b)) {
                                fVar = new p();
                            } else if (Intrinsics.f(section, StatsSection.Valuation.f103778b)) {
                                fVar = new q();
                            } else if (Intrinsics.f(section, StatsSection.Volume.f103779b)) {
                                fVar = new r();
                            } else if (Intrinsics.f(section, StatsSection.Yield.f103780b)) {
                                fVar = new t();
                            } else if (Intrinsics.f(section, StatsSection.YieldRange.f103781b)) {
                                fVar = new s();
                            } else if (Intrinsics.f(section, StatsSection.RiskRating.f103777b)) {
                                fVar = new o();
                            } else {
                                if (!Intrinsics.f(section, StatsSection.EeaRiskRating.f103767b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = new f();
                            }
                            if (fVar.a(stats)) {
                                z = true;
                            }
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            if (pd.b.j(boolValueOf)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
