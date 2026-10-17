package j8f;

import aw0.n6;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import e8e.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mx0.d7;
import pv7.t;
import pvk.g0;
import pvk.o0;
import pvk.u;
import ru6.r;
import x2h.b;
import z0h.q1;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172203a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f172204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f172205c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f172206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f172207h;

    public o(l8f.f templateRiskLevelMapper, cli.n portfolioInfoMapper, cli.n chartMapper, cli.n allocationMapper, b7f.g performanceMapper, r6f.j feesMapper, d1h.h disclaimersMapper) {
        Intrinsics.checkNotNullParameter(templateRiskLevelMapper, "templateRiskLevelMapper");
        Intrinsics.checkNotNullParameter(portfolioInfoMapper, "portfolioInfoMapper");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(feesMapper, "feesMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        this.f172204b = templateRiskLevelMapper;
        this.f172205c = portfolioInfoMapper;
        this.d = chartMapper;
        this.e = allocationMapper;
        this.f = performanceMapper;
        this.f172206g = feesMapper;
        this.f172207h = disclaimersMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Collection collection;
        Data indexRef;
        List list;
        int i = this.f172203a;
        Object obj2 = this.f172207h;
        Object obj3 = this.f172206g;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.f172205c;
        Object obj7 = this.f;
        Object obj8 = this.f172204b;
        switch (i) {
            case 0:
                j domainState = (j) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                l8f.b bVar = domainState.f172196a;
                if (bVar == null || (collection = ((l8f.d) ((l8f.f) obj8).c(bVar)).f192978a) == null) {
                    collection = f0.f322471a;
                }
                s0 s0Var = new s0(7);
                s0Var.b(collection.toArray(new koi.j[0]));
                s0Var.b(((o6f.c) ((cli.n) obj4).c(domainState.e)).f222575a.toArray(new koi.j[0]));
                s0Var.b(((b7f.e) ((b7f.g) obj7).c(domainState.f)).f13036a.toArray(new koi.j[0]));
                s0Var.b(((j6f.c) ((cli.n) obj5).c(domainState.f172198c)).f171742a.toArray(new koi.j[0]));
                s0Var.b(((r6f.g) ((r6f.j) obj3).c(domainState.d)).f251831a.toArray(new koi.j[0]));
                s0Var.b(((t6f.k) ((cli.n) obj6).c(domainState.f172197b)).f268334a.toArray(new koi.j[0]));
                s0Var.b(((gah.g) ((d1h.h) obj2)).c(domainState.f172199g, d7.DEFAULT).toArray(new qv0.i[0]));
                ArrayList arrayList = s0Var.f186433a;
                return new n(v.k(arrayList.toArray(new koi.j[arrayList.size()])));
            default:
                pvk.p domainState2 = (pvk.p) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                o0 o0Var = (o0) obj8;
                Data insights = domainState2.f240297a;
                dj0.d dVar = domainState2.f240299c;
                Intrinsics.checkNotNullParameter(insights, "insights");
                List list2 = (List) iii.c.f(insights, new pui.a(o0Var, 17), new psl.m(26), new ox2.d(o0Var, dVar, 24));
                x2h.b panelState = ((m3h.c) obj7).a(domainState2.f);
                Data analystRatingsInsight = domainState2.f240298b;
                Intrinsics.checkNotNullParameter(analystRatingsInsight, "analystRatingsInsight");
                int i2 = 11;
                List list3 = (List) iii.c.f(analystRatingsInsight, new r(10), new ru5.m(i2), new ri4.o((rvk.b) obj6, 14));
                Data technicalInsights = domainState2.d;
                Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
                List list4 = (List) iii.c.f(technicalInsights, new r(12), new ru5.m(13), new ri4.o((rvk.g) obj5, 16));
                rvk.d dVar2 = (rvk.d) obj4;
                Data data = domainState2.f240297a;
                try {
                    Object content = data.getContent();
                    indexRef = new Data(content != null ? ((mel.p) content).f204771c : null, data.getError(), data.getLoading());
                    break;
                } catch (Throwable th10) {
                    indexRef = new Data(null, th10, data.getLoading());
                }
                Data indexMarketSentiment = domainState2.e;
                Intrinsics.checkNotNullParameter(indexRef, "indexRef");
                Intrinsics.checkNotNullParameter(indexMarketSentiment, "indexMarketSentiment");
                List list5 = (List) iii.c.f(t1.t(indexRef, indexMarketSentiment), new r(i2), new ru5.m(12), new ri4.o(dVar2, 15));
                eah.e eVar = (eah.e) obj3;
                b1h.d dVar3 = domainState2.f240301h;
                b1h.e variant = new b1h.e(new TextLocalisedClause(R$string.invest_recommended_buys_widget_title, null, null, 14), new TextLocalisedClause(R$string.wealth_view_all, null, null, 14));
                Intrinsics.checkNotNullParameter(variant, "variant");
                if (dVar3 != null) {
                    Data data2 = dVar3.f11803a;
                    if (data2 != null) {
                        int i3 = 13;
                        list = (List) iii.c.f(data2, new y(21), new e6e.a(i3), new a0i.a(variant, i3, eVar, dVar3));
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = f0.f322471a;
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    list = f0.f322471a;
                }
                Data data3 = domainState2.i;
                List listB = data3 != null ? ((aah.m) ((q1) obj2)).b(data3) : null;
                if (listB == null) {
                    listB = f0.f322471a;
                }
                int i5 = 1;
                ArrayList arrayListU = w.u(v.k(list2, list3, list4, list5, list, listB));
                Data indexName = domainState2.f240300g;
                Intrinsics.checkNotNullParameter(panelState, "panelState");
                Intrinsics.checkNotNullParameter(indexName, "indexName");
                boolean z = panelState instanceof x2h.a;
                n2h.d bVar2 = n2h.c.f211542a;
                if (z) {
                    x2h.a aVar = (x2h.a) panelState;
                    if (aVar.f302570a) {
                        bVar2 = new n2h.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.wealth_action_buy, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, pvk.r.f240303a, 508), null, null, 55));
                    } else if (aVar.f302571b) {
                        aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.wealth_action_sell, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, u.f240306a, 508), null, null, 55);
                        bVar2 = new n2h.b((aw0.i) iii.c.f(indexName, new pth.l(eVar2, 10), new pu4.d(eVar2, 7), new t(i5)));
                    }
                } else if (Intrinsics.f(panelState, b.a.f302572a)) {
                    bVar2 = new n2h.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.wealth_action_get_started, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, pvk.t.f240305a, 508), null, null, 55));
                } else if (!Intrinsics.f(panelState, b.C1676b.f302573a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new pvk.f0(arrayListU, bVar2);
        }
    }

    public o(o0 insightsUIFactory, rvk.b analystRatingsWidgetMapper, rvk.d indexSentimentWidgetMapper, rvk.g technicalInsightsWidgetMapper, m3h.c actionsPanelMapper, g0 footerBuilder, eah.e instrumentsCollectionMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(insightsUIFactory, "insightsUIFactory");
        Intrinsics.checkNotNullParameter(analystRatingsWidgetMapper, "analystRatingsWidgetMapper");
        Intrinsics.checkNotNullParameter(indexSentimentWidgetMapper, "indexSentimentWidgetMapper");
        Intrinsics.checkNotNullParameter(technicalInsightsWidgetMapper, "technicalInsightsWidgetMapper");
        Intrinsics.checkNotNullParameter(actionsPanelMapper, "actionsPanelMapper");
        Intrinsics.checkNotNullParameter(footerBuilder, "footerBuilder");
        Intrinsics.checkNotNullParameter(instrumentsCollectionMapper, "instrumentsCollectionMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f172204b = insightsUIFactory;
        this.f172205c = analystRatingsWidgetMapper;
        this.d = indexSentimentWidgetMapper;
        this.e = technicalInsightsWidgetMapper;
        this.f = actionsPanelMapper;
        this.f172206g = instrumentsCollectionMapper;
        this.f172207h = wealthDisclaimersMapper;
    }
}
