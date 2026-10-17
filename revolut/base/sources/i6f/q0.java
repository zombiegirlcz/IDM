package i6f;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.d7;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cli.n f158960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r6f.j f158961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cli.n f158962c;
    public final cli.n d;
    public final cli.n e;
    public final g7f.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b7f.g f158963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e7f.i f158964h;
    public final i7f.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a7f.h f158965j;
    public final d1h.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f158966l;

    public q0(cli.n portfolioInfoMapper, r6f.j feesMapper, cli.n portfolioInvestmentsMapper, cli.n chartMapper, cli.n allocationMapper, g7f.g referenceMapper, b7f.g performanceMapper, e7f.i performanceSummaryMapper, i7f.f transactionsMapper, a7f.h ordersMapper, d1h.h disclaimersMapper, h7f.d statusBannerMapper, boc.b actionUIResourcesMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInfoMapper, "portfolioInfoMapper");
        Intrinsics.checkNotNullParameter(feesMapper, "feesMapper");
        Intrinsics.checkNotNullParameter(portfolioInvestmentsMapper, "portfolioInvestmentsMapper");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(referenceMapper, "referenceMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(performanceSummaryMapper, "performanceSummaryMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(statusBannerMapper, "statusBannerMapper");
        Intrinsics.checkNotNullParameter(actionUIResourcesMapper, "actionUIResourcesMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f158960a = portfolioInfoMapper;
        this.f158961b = feesMapper;
        this.f158962c = portfolioInvestmentsMapper;
        this.d = chartMapper;
        this.e = allocationMapper;
        this.f = referenceMapper;
        this.f158963g = performanceMapper;
        this.f158964h = performanceSummaryMapper;
        this.i = transactionsMapper;
        this.f158965j = ordersMapper;
        this.k = disclaimersMapper;
        this.f158966l = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        Pair pair;
        int i;
        TextLocalisedClause textLocalisedClause;
        y6f.a aVar;
        t domainState = (t) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        o6f.c cVar = (o6f.c) this.d.c(domainState.f);
        o6f.a aVar2 = domainState.f;
        Collection collectionE0 = aVar2.f ? zhm.d0.E0(cVar.f222575a, ((g7f.e) this.f.c(domainState.f158973h)).f141199a) : zhm.f0.f322471a;
        List list = ((jte.d) this.f158966l).c(ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign.f91229c) ? ((e7f.g) this.f158964h.c(domainState.f158974j)).f123322a : ((v6f.g) this.f158962c.c(domainState.e)).f286377a;
        y6f.b bVarA = (y6f.b) domainState.f158970b.getContent();
        if (bVarA == null) {
            bVarA = null;
        } else if (aVar2.f) {
            y6f.a aVar3 = cVar.f222576b;
            if (aVar3 != null) {
                bVarA = y6f.b.a(bVarA, aVar3);
            }
        } else {
            y6f.a aVar4 = bVarA.f311267c;
            if (aVar4 != null) {
                Clause value = aVar4.f311263a;
                Intrinsics.checkNotNullParameter(value, "value");
                aVar = new y6f.a(value, null);
            } else {
                aVar = null;
            }
            bVarA = y6f.b.a(bVarA, aVar);
        }
        kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(11);
        s0Var.b(collectionE0.toArray(new koi.j[0]));
        Data data = domainState.f158977n;
        List list2 = data != null ? (List) data.getContent() : null;
        if (list2 == null) {
            list2 = zhm.f0.f322471a;
        }
        s0Var.b(list2.toArray(new koi.j[0]));
        Data status = domainState.k;
        Intrinsics.checkNotNullParameter(status, "status");
        h7f.c cVar2 = (h7f.c) status.getContent();
        if (cVar2 != null) {
            boolean z = cVar2 instanceof h7f.a;
            if (z) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_closure_title, null, null, 14);
                LocalDate localDate = ((h7f.a) cVar2).f149876a;
                if (localDate != null) {
                    int i2 = R$string.wealth_robo_template_details_rebalance_state_closure_description;
                    LocalDateTime localDateTimeAtTime = localDate.atTime(LocalTime.MIN);
                    Intrinsics.checkNotNullExpressionValue(localDateTimeAtTime, "atTime(...)");
                    textLocalisedClause = new TextLocalisedClause(i2, zhm.u.c(new TimeClause(oi0.d.R(localDateTimeAtTime), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12);
                } else {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_closure_description_without_placeholder, null, null, 14);
                }
                pair = new Pair(textLocalisedClause2, textLocalisedClause);
            } else {
                if (!(cVar2 instanceof h7f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (h7f.e.f149878a[((h7f.b) cVar2).f149877a.ordinal()]) {
                    case 1:
                        pair = new Pair(new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_initial_funding_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_initial_funding_description, null, null, 14));
                        break;
                    case 2:
                        pair = new Pair(new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_pending_cash_allocation_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_pending_cash_allocation_description, null, null, 14));
                        break;
                    case 3:
                        pair = new Pair(new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_pending_rebalancing_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_pending_rebalancing_description, null, null, 14));
                        break;
                    case 4:
                        pair = new Pair(new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_pending_change_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_pending_change_description, null, null, 14));
                        break;
                    case 5:
                        pair = new Pair(new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_pending_allocation_change_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_pending_allocation_change_description, null, null, 14));
                        break;
                    case 6:
                        throw new IllegalStateException("No banner for idle rebalance status");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            Clause clause = (Clause) pair.f186385a;
            Clause clause2 = (Clause) pair.f186386b;
            if (z) {
                i = R$drawable.uikit_icn_24_document_pending;
            } else {
                if (!(cVar2 instanceof h7f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_pie_chart_circle;
            }
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("MANAGED_PORTFOLIO_DETAILS_STATUS_BANNER", clause, clause2, new com.revolut.core.ui_kit.delegates.m(new GlyphImage(i, null, null, 6), (LayeredImage) null, (ProgressStyle) null, 6), ActionWidgetDelegate.Model.b.C0394b.f51606a, ActionWidgetDelegate.Model.a.C0393a.f51604a, com.revolut.core.ui_kit.delegates.q.REGULAR, new z(cVar2), null, true, 5888);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = zhm.u.c(model);
        } else {
            listC = null;
        }
        if (listC == null) {
            listC = zhm.f0.f322471a;
        }
        s0Var.b(listC.toArray(new koi.j[0]));
        s0Var.b(list.toArray(new koi.j[0]));
        s0Var.b(((b7f.e) this.f158963g.c(domainState.i)).f13036a.toArray(new koi.j[0]));
        s0Var.b(((j6f.c) this.e.c(domainState.f158972g)).f171742a.toArray(new koi.j[0]));
        s0Var.b(((r6f.g) this.f158961b.c(domainState.d)).f251831a.toArray(new koi.j[0]));
        s0Var.b(((a7f.e) this.f158965j.c(domainState.f158976m)).f1862a.toArray(new koi.j[0]));
        s0Var.b(((i7f.d) this.i.c(domainState.f158975l)).f159284a.toArray(new koi.j[0]));
        s0Var.b(((t6f.k) this.f158960a.c(domainState.f158971c)).f268334a.toArray(new koi.j[0]));
        List listC2 = ((gah.g) this.k).c(domainState.f158979q, d7.DEFAULT);
        int i3 = R$attr.uikit_dp32;
        yp0.b.q(listC2, 0, 0, i3, i3, 3);
        s0Var.b(listC2.toArray(new qv0.i[0]));
        ArrayList arrayList = s0Var.f186433a;
        List listK = zhm.v.k(arrayList.toArray(new koi.j[arrayList.size()]));
        Data data2 = domainState.f158980r;
        return new e0(bVarA, listK, data2 != null ? (aw0.i) iii.c.f(data2, new i4h.q(25), new i2l.n0(18), new gzb.d(this, 26)) : null);
    }
}
