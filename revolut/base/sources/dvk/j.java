package dvk;

import afl.a0;
import cli.o;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsScreen;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsNavigationId;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k1h.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import z0h.q1;
import z0h.t1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.b f118156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f118157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f118158c;
    public final iwk.a d;
    public final q1 e;
    public final kbh.h f;

    public j(n toolbarMapper, com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.b tabsProvider, ImmutableMap sectionsPerScreen, ImmutableMap statsMappers, iwk.a headerMapper, q1 wealthDisclaimersMapper, kbh.h tradingFooterDisclosuresFactory) {
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
        Intrinsics.checkNotNullParameter(tabsProvider, "tabsProvider");
        Intrinsics.checkNotNullParameter(sectionsPerScreen, "sectionsPerScreen");
        Intrinsics.checkNotNullParameter(statsMappers, "statsMappers");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(tradingFooterDisclosuresFactory, "tradingFooterDisclosuresFactory");
        this.f118156a = tabsProvider;
        this.f118157b = sectionsPerScreen;
        this.f118158c = statsMappers;
        this.d = headerMapper;
        this.e = wealthDisclaimersMapper;
        this.f = tradingFooterDisclosuresFactory;
    }

    @Override // cli.n
    public final o c(cli.j jVar) throws IOException {
        hel.b bVar;
        Object next;
        List listE0;
        List listA;
        Pair pair;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        nel.n nVar = domainState.f118149a;
        Data data = domainState.f118150b;
        afl.a aVar = (afl.a) data.getContent();
        afl.a aVar2 = (afl.a) data.getContent();
        List listA2 = (aVar2 == null || (bVar = domainState.f118151c) == null) ? f0.f322471a : this.f118156a.a(domainState.f118149a, bVar, aVar2);
        List<DetailedStatsNavigationId> list = listA2;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((DetailedStatsNavigationId) next).f103921a.equals(domainState.d)) {
                break;
            }
        }
        DetailedStatsNavigationId detailedStatsNavigationId = (DetailedStatsNavigationId) next;
        if (detailedStatsNavigationId == null) {
            detailedStatsNavigationId = (DetailedStatsNavigationId) d0.d0(listA2);
        }
        String str = nVar.e;
        z zVar = nVar.f214597c;
        TextLocalisedClause textLocalisedClauseB = n.b(str, nVar);
        TextLocalisedClause textLocalisedClauseA = n.a(nVar);
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (DetailedStatsNavigationId detailedStatsNavigationId2 : list) {
            arrayList.add(new q(detailedStatsNavigationId2.f103921a, new t(new TextLocalisedClause(detailedStatsNavigationId2.f103923c, null, null, 14)), 58));
        }
        String str2 = detailedStatsNavigationId != null ? detailedStatsNavigationId.f103921a : null;
        if (aVar == null || detailedStatsNavigationId == null) {
            listE0 = f0.f322471a;
        } else {
            StatsScreen statsScreen = detailedStatsNavigationId.f103922b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f118157b;
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isInstance(statsScreen)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterable iterable = (Iterable) d0.c0(linkedHashMap.values());
            if (iterable == null) {
                throw new IllegalStateException(("Can't find sections for requested " + statsScreen + ". Available sections for screen: " + d0.k0(map.entrySet(), null, null, null, 0, null, 63)).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = iterable.iterator();
            while (it9.hasNext()) {
                StatsSection statsSection = (StatsSection) it9.next();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Map map2 = this.f118158c;
                for (Map.Entry entry2 : map2.entrySet()) {
                    Iterator it10 = it9;
                    if (((Class) entry2.getKey()).isInstance(statsSection)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                    it9 = it10;
                }
                Iterator it11 = it9;
                iwk.g gVar = (iwk.g) d0.c0(linkedHashMap2.values());
                if (gVar == null) {
                    throw new IllegalStateException(("Can't find mapper for " + statsSection + ". Available mappers for sections: " + d0.k0(map2.entrySet(), null, null, null, 0, null, 63)).toString());
                }
                if (aVar instanceof afl.q) {
                    afl.q qVar = (afl.q) aVar;
                    pair = new Pair(gVar.c(qVar), new iwk.i(statsSection, qVar));
                } else if (aVar instanceof a0) {
                    a0 a0Var = (a0) aVar;
                    pair = new Pair(gVar.a(a0Var), new iwk.j(statsSection, a0Var));
                } else {
                    if (!(aVar instanceof afl.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    afl.f fVar = (afl.f) aVar;
                    pair = new Pair(gVar.b(fVar), new iwk.h(statsSection, fVar));
                }
                List list2 = (List) pair.f186385a;
                zhm.a0.x(list2.isEmpty() ? f0.f322471a : d0.E0(list2, this.d.a((iwk.k) pair.f186386b)), arrayList2);
                it9 = it11;
            }
            t1 t1Var = (t1) domainState.e.getContent();
            if (t1Var == null) {
                listA = f0.f322471a;
            } else {
                Links links = t1Var.f318563a;
                hel.b bVar2 = t1Var.f318564b;
                listA = (bVar2 == hel.b.EEA && io3.h.k(zVar)) ? r.a(this.f, links, bVar2, zVar, 8) : ((aah.m) this.e).c(u.c(new WealthDisclaimersContract$Disclaimer$Investment.Stats(bVar2, links, zVar, statsScreen.equals(StatsScreen.BondPriceAndVolume.f103752a) ? com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.BOND_PRICE_AND_VOLUME : statsScreen.equals(StatsScreen.Risk.f103759a) ? com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.RISK : statsScreen.equals(StatsScreen.Yield.f103760a) ? com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.YIELD : com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.OTHER)), bVar2);
            }
            listE0 = d0.E0(listA, arrayList2);
        }
        return new h(textLocalisedClauseB, textLocalisedClauseA, arrayList, str2, listE0);
    }
}
