package qee;

import aw0.f6;
import aw0.g6;
import aw0.o9;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import com.revolut.feature.travel.flights.api.R$plurals;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$SearchParameters;
import com.revolut.feature.travel.flights.models.domain.search.LocationPoint;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreenContract$InputData;
import ip0.pb0;
import ip0.vr;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import uyc.y;
import wp4.j0;
import xo8.i0;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245143a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245144b;

    public s(s74.p uiStateFactory) {
        Intrinsics.checkNotNullParameter(uiStateFactory, "uiStateFactory");
        this.f245144b = uiStateFactory;
    }

    public static final ArrayList d(int i) {
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList2.add(new pb0(a0.d.n("LOADING_STATE_ID_", it8.nextInt())));
        }
        a0.x(arrayList2, arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o e(cli.j r32) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qee.s.e(cli.j):cli.o");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final cli.o f(cli.j jVar) {
        char c2;
        Clause textClause;
        Clause compositeClause;
        v5g.d domainState = (v5g.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        p4g.b bVar = ((x5g.b) this.f245144b).f302977a;
        TravelFlightsDiscoverScreenContract$SearchParameters searchParameters = domainState.f286218a;
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        Clause clauseA = x5g.b.a(searchParameters.f93332a);
        LocationPoint locationPoint = searchParameters.f93333b;
        Clause clauseA2 = x5g.b.a(locationPoint);
        LocalDate date = searchParameters.f93334c;
        if (date != null) {
            Intrinsics.checkNotNullParameter(date, "date");
            DateTimeFormatter dateTimeFormatter = p4g.b.f232928b;
            String str = dateTimeFormatter.withLocale(((s80.b) bVar.f232929a).b()).format(date);
            c2 = 1;
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            LocalDate date2 = searchParameters.d;
            if (date2 != null) {
                TextClause textClause2 = new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(date2, "date");
                String str2 = dateTimeFormatter.withLocale(((s80.b) bVar.f232929a).b()).format(date2);
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textClause = new CompositeClause(zhm.v.k(textClause, textClause2, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
            }
        } else {
            c2 = 1;
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        TextLocalisedClause textLocalisedClause = date != null ? null : new TextLocalisedClause(R$string.travel_flights_search_widget_dates_placeholder, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        Passengers passengers = searchParameters.e;
        m7g.d dVar = searchParameters.f;
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.travel_flights_itinerary_details_header_passenger, Integer.valueOf(passengers.f93596b.size() + passengers.f93595a), (List) null, (Style) null, 28);
        TextLocalisedClause textLocalisedClauseQ = ue8.c.Q(dVar);
        if (textLocalisedClauseQ == null) {
            compositeClause = textLocalisedQuantityClause;
        } else {
            TextClause textClause3 = new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Clause[] clauseArr = new Clause[3];
            clauseArr[0] = textLocalisedQuantityClause;
            clauseArr[c2] = textClause3;
            clauseArr[2] = textLocalisedClauseQ;
            compositeClause = new CompositeClause(zhm.v.k(clauseArr), null, null, null, 14);
        }
        vr vrVar = new vr("INPUT_SEARCH_TRAVEL_ID", new f6(clauseA, clauseA2, textClause, textLocalisedClause, g6.LEFT, compositeClause));
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("SEARCH_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.travel_flights_search_button_title, null, null, 14), (searchParameters.f93332a == null || locationPoint == null || date == null) ? 0 : c2, null, null, null, null, 968);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        koi.j[] jVarArr = new koi.j[2];
        jVarArr[0] = vrVar;
        jVarArr[c2] = model;
        return new v5g.h(zhm.v.k(jVarArr));
    }

    private final cli.o g(cli.j jVar) {
        w86.e domainState = (w86.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new w86.j((List) iii.c.f(domainState.f295593a, new w6h.f(this, 8), new w6b.a(9), new vjh.c(this, 16)));
    }

    private final cli.o h(cli.j jVar) {
        wi6.h domainState = (wi6.h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (wi6.o) iii.c.f(domainState.f297808b, new wgk.f(7), new wf0.b(11), new vh2.o(this, domainState, 17));
    }

    private final cli.o i(cli.j jVar) {
        xhj.e domainState = (xhj.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new xhj.h((List) iii.c.f(domainState.f306258a, new xd2.n(this, 26), new xce.d(this, 13), new j0(this, 26)));
    }

    private final cli.o j(cli.j jVar) {
        xob.f domainState = (xob.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (xob.q) iii.c.f(domainState.f307768a, new i0(this, 3), new xlb.l(14), new xo8.j0(this, 2));
    }

    private final cli.o k(cli.j jVar) {
        a8f.c cVar;
        y7f.c domainState = (y7f.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        twg.c cVar2 = (twg.c) this.f245144b;
        PortfolioInsightPerformanceMetric type = domainState.f311507a;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof PortfolioInsightPerformanceMetric.AverageAnnualReturnBreakdown) {
            cVar = (a8f.f) cVar2.f275017a;
        } else if (type instanceof PortfolioInsightPerformanceMetric.MaxDrawdown) {
            cVar = (a8f.a) cVar2.f275019c;
        } else if (type instanceof PortfolioInsightPerformanceMetric.SharpeRatio) {
            cVar = (a8f.e) cVar2.f275018b;
        } else {
            if (!(type instanceof PortfolioInsightPerformanceMetric.RiskLevel)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = (a8f.d) cVar2.d;
        }
        return new y7f.d(cVar.r(), cVar.t(), cVar.s(domainState.f311507a));
    }

    public Clause a() {
        String str = ((OccupationChooserScreenContract$InputData) this.f245144b).e;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.onboarding_occupation_chooser_subtitle, null, null, 14);
    }

    public Clause b() {
        String str = ((OccupationChooserScreenContract$InputData) this.f245144b).d;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.onboarding_occupation_chooser_title, null, null, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0d64  */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.util.ArrayList, java.util.List] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r67) {
        /*
            Method dump skipped, instruction units count: 3496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qee.s.c(cli.j):cli.o");
    }

    public s(ste.r inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f245144b = inputData;
    }

    public s(sye.e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f245144b = inputData;
    }

    public s(w1a.e itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.f245144b = itemProvider;
    }

    public s(ImmutableSet scaleMappers) {
        Intrinsics.checkNotNullParameter(scaleMappers, "scaleMappers");
        this.f245144b = scaleMappers;
    }

    public s(RolleeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f245144b = inputData;
    }

    public s(twg.c insightMapperProvider) {
        Intrinsics.checkNotNullParameter(insightMapperProvider, "insightMapperProvider");
        this.f245144b = insightMapperProvider;
    }

    public s(u2a.a itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f245144b = itemMapper;
    }

    public s(v3k.a itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f245144b = itemsMapper;
    }

    public s(x5g.b searchMapper) {
        Intrinsics.checkNotNullParameter(searchMapper, "searchMapper");
        this.f245144b = searchMapper;
    }

    public s(cli.n allocationMapper) {
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        this.f245144b = allocationMapper;
    }

    public s(r86.d deviceManagementMapper) {
        Intrinsics.checkNotNullParameter(deviceManagementMapper, "deviceManagementMapper");
        this.f245144b = deviceManagementMapper;
    }

    public s(t6i.g itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f245144b = itemsMapper;
    }

    public s(SetTrustedLocationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f245144b = inputData;
    }

    public s(n32.i navBarMapper) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        this.f245144b = navBarMapper;
    }

    public s(rlh.l recurringBuyHubCollectionMapper) {
        Intrinsics.checkNotNullParameter(recurringBuyHubCollectionMapper, "recurringBuyHubCollectionMapper");
        this.f245144b = recurringBuyHubCollectionMapper;
    }

    public s(sph.l filtersListMapper, com.revolut.feature.wealth_discovery.impl.screener.domain.model.b statsGroupNameMapper) {
        Intrinsics.checkNotNullParameter(filtersListMapper, "filtersListMapper");
        Intrinsics.checkNotNullParameter(statsGroupNameMapper, "statsGroupNameMapper");
        this.f245144b = filtersListMapper;
    }

    public s(thj.a itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f245144b = itemsMapper;
    }

    public s(y mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f245144b = mapper;
    }

    public s(x6i.b elementsMapper) {
        Intrinsics.checkNotNullParameter(elementsMapper, "elementsMapper");
        this.f245144b = elementsMapper;
    }

    public s(gk9.b payLaterPlanItemMapper) {
        Intrinsics.checkNotNullParameter(payLaterPlanItemMapper, "payLaterPlanItemMapper");
        this.f245144b = payLaterPlanItemMapper;
    }

    public s(ncc.d revolutPayPromotedMerchantItemMapper) {
        Intrinsics.checkNotNullParameter(revolutPayPromotedMerchantItemMapper, "revolutPayPromotedMerchantItemMapper");
        this.f245144b = revolutPayPromotedMerchantItemMapper;
    }

    public s(nee.g itemsProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f245144b = itemsProvider;
    }

    public s(ubi.i itemsProvider, OccupationChooserScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f245144b = inputData;
    }

    public s(zhj.b helpContentMapper) {
        Intrinsics.checkNotNullParameter(helpContentMapper, "helpContentMapper");
        this.f245144b = helpContentMapper;
    }

    public s(mc4.h kontomatikStyleProvider) {
        Intrinsics.checkNotNullParameter(kontomatikStyleProvider, "kontomatikStyleProvider");
        this.f245144b = kontomatikStyleProvider;
    }

    public s(x0c.e toolbarStateMapper, x0c.d productsMapper, x0c.a footerMapper) {
        Intrinsics.checkNotNullParameter(toolbarStateMapper, "toolbarStateMapper");
        Intrinsics.checkNotNullParameter(productsMapper, "productsMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f245144b = productsMapper;
    }

    public s(zob.c uiStateFactory) {
        Intrinsics.checkNotNullParameter(uiStateFactory, "uiStateFactory");
        this.f245144b = uiStateFactory;
    }

    public s(hi6.o selectionUiStateMapper) {
        Intrinsics.checkNotNullParameter(selectionUiStateMapper, "selectionUiStateMapper");
        this.f245144b = selectionUiStateMapper;
    }

    public s(uvk.k groupMapper, uvk.l searchResultMapper) {
        Intrinsics.checkNotNullParameter(groupMapper, "groupMapper");
        Intrinsics.checkNotNullParameter(searchResultMapper, "searchResultMapper");
        this.f245144b = searchResultMapper;
    }
}
