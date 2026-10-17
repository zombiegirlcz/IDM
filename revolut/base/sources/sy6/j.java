package sy6;

import ch.qos.logback.core.CoreConstants;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_other_debt.AddOtherDebtScreen;
import com.revolut.feature.invest.smart_notifications.api.domain.InsightPublicationPriceDescriptor;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$ModalStep;
import com.revolut.feature.rev_points.impl.ui.personalisation.RevPointsPersonalisationScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.RevPointsTrophyRoomBottomSheetScreen;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.TaxFilingData;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$Page;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowController;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.PortfolioInsightsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.PortfolioInsightsScreenContract$ModalStep;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.model.PortfolioInsightParcel;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.PortfolioInsightsPerformanceControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreen;
import com.revolut.feature_move_money.impl.amount.order_automations.OrderAutomationsScreen;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.DuplicateBeneficiaryDialogScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.DuplicateBeneficiaryDialogScreenContract$ButtonAction;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsArticleReaderDestination;
import h93.f0;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nii.c0;
import nii.n1;
import pzd.t;
import pzd.u;
import pzd.v;
import pzd.x;
import q97.g3;
import sqd.h0;
import t18.w;
import t27.n;
import t27.r;
import t44.p;
import t5e.m;
import t5e.o;
import t73.q0;
import t73.w0;
import vkm.j2;
import wim.z;
import yhm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f266636w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f266636w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j((com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a) this.f266636w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j((RevPointsPersonalisationScreen) this.f266636w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j((RevPointsTrophyRoomBottomSheetScreen) this.f266636w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j((TaxFilingScreen) this.f266636w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            case 4:
                j jVar5 = new j((t0e.l) this.f266636w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
            case 5:
                return new j((t0e.l) this.v, (StatementPeriod) this.f266636w, continuation, 5);
            case 6:
                return new j((com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) this.v, (NaviCommand) this.f266636w, continuation, 6);
            case 7:
                j jVar6 = new j((AllInsightsScreen) this.f266636w, continuation, 7);
                jVar6.v = obj2;
                return jVar6;
            case 8:
                return new j((w) this.v, (List) this.f266636w, continuation, 8);
            case 9:
                j jVar7 = new j((r) this.f266636w, continuation, 9);
                jVar7.v = obj2;
                return jVar7;
            case 10:
                return new j((t3h.e) this.v, (i4l.a) this.f266636w, continuation, 10);
            case 11:
                return new j((t3h.e) this.v, (eel.i) this.f266636w, continuation, 11);
            case 12:
                return new j((t3h.e) this.v, (eel.c) this.f266636w, continuation, 12);
            case 13:
                j jVar8 = new j((p) this.f266636w, continuation, 13);
                jVar8.v = obj2;
                return jVar8;
            case 14:
                j jVar9 = new j((DuplicateBeneficiaryDialogScreen) this.f266636w, continuation, 14);
                jVar9.v = obj2;
                return jVar9;
            case 15:
                j jVar10 = new j((PerformanceTrackerFlowController) this.f266636w, continuation, 15);
                jVar10.v = obj2;
                return jVar10;
            case 16:
                j jVar11 = new j((o) this.f266636w, continuation, 16);
                jVar11.v = obj2;
                return jVar11;
            case 17:
                j jVar12 = new j((TravelFlightsDatesSelectionScreen) this.f266636w, continuation, 17);
                jVar12.v = obj2;
                return jVar12;
            case 18:
                j jVar13 = new j((TravelFlightsPostBookingScreen) this.f266636w, continuation, 18);
                jVar13.v = obj2;
                return jVar13;
            case 19:
                j jVar14 = new j((OrderAutomationsScreen) this.f266636w, continuation, 19);
                jVar14.v = obj2;
                return jVar14;
            case 20:
                return new j((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.v, (f0) this.f266636w, continuation, 20);
            case 21:
                j jVar15 = new j((c84.c) this.f266636w, continuation, 21);
                jVar15.v = obj2;
                return jVar15;
            case 22:
                j jVar16 = new j((t7d.c) this.f266636w, continuation, 22);
                jVar16.v = obj2;
                return jVar16;
            case 23:
                return new j((t7e.c) this.v, (Subaccount) this.f266636w, continuation, 23);
            case 24:
                j jVar17 = new j((PortfolioInsightsScreen) this.f266636w, continuation, 24);
                jVar17.v = obj2;
                return jVar17;
            case 25:
                j jVar18 = new j((AddOtherDebtScreen) this.f266636w, continuation, 25);
                jVar18.v = obj2;
                return jVar18;
            case 26:
                j jVar19 = new j((t8j.b) this.f266636w, continuation, 26);
                jVar19.v = obj2;
                return jVar19;
            case 27:
                j jVar20 = new j((com.revolut.feature.onboarding.impl.exchange_global_access.flow.a) this.f266636w, continuation, 27);
                jVar20.v = obj2;
                return jVar20;
            case 28:
                return new j((t9e.w) this.v, (qua.p) this.f266636w, continuation, 28);
            default:
                j jVar21 = new j((BuyInPriceScreen) this.f266636w, continuation, 29);
                jVar21.v = obj2;
                return jVar21;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((pzd.w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j) create((DuplicateBeneficiaryDialogScreenContract$ButtonAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j) create((PerformanceTrackerFlowContract$Page) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j) create((PortfolioInsightParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j) create((pu3.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j) create((WealthNewsArticle) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j) create((yja.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str;
        NaviCommand naviCommandA;
        es6.d dVar;
        PortfolioInsightPerformanceMetric riskLevel;
        PortfolioInsightPerformanceMetric averageAnnualReturnBreakdown;
        Object objA;
        int i = this.u;
        int i2 = 6;
        int i3 = 13;
        int i5 = 26;
        int i6 = 7;
        final int i21 = 0;
        Object obj3 = null;
        n nVar = null;
        Object obj4 = this.f266636w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a) obj4;
                aVar2.H2(aVar2.f73943r, new s86.k(data, i5));
                return Unit.f186387a;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                szb.j jVar = (szb.j) ((RevPointsPersonalisationScreen) obj4).P.getValue();
                Intrinsics.h(clickData);
                jVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "ID_TERMS_LEARN_MORE")) {
                    jVar.n2(new h0(jVar, insightPublicationPriceDescriptor, i6), new whi.b(i2));
                }
                return Unit.f186387a;
            case 2:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0c.e eVar = (t0c.e) ((RevPointsTrophyRoomBottomSheetScreen) obj4).S.getValue();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj5 = clickData2.d;
                fub.b bVar = obj5 instanceof fub.b ? (fub.b) obj5 : null;
                if (bVar != null && (str = bVar.f138164a) != null) {
                    eVar.n2(new t0c.c(eVar, str, insightPublicationPriceDescriptor, true ? 1 : 0), new whi.b(i2));
                }
                return Unit.f186387a;
            case 3:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0e.g gVarD3 = ((TaxFilingScreen) obj4).d();
                String id10 = aVar5.f275445a;
                t0e.l lVar = (t0e.l) gVarD3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                TaxFilingData taxFilingData = (TaxFilingData) ((t0e.f) ((j2) lVar.f267014r.f22677a).getValue()).f267006b.getContent();
                String taxAuthorityUrl = taxFilingData != null ? taxFilingData.getTaxAuthorityUrl() : null;
                if (Intrinsics.f(id10, "ID_TAX_ADVICE_TAX_AUTHORITY") && taxAuthorityUrl != null) {
                    lVar.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(taxAuthorityUrl, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
                }
                return Unit.f186387a;
            case 4:
                pzd.w wVar = (pzd.w) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0e.l lVar2 = (t0e.l) obj4;
                n0e.b bVar2 = lVar2.f267013q;
                if (wVar instanceof v) {
                    naviCommandA = bVar2.c(null, ((v) wVar).f240980a);
                } else {
                    if (!(wVar instanceof u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    naviCommandA = bVar2.a(((u) wVar).f240979a);
                }
                lVar2.C1(u0.b(naviCommandA));
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final t0e.l lVar3 = (t0e.l) this.v;
                zxd.c cVar = lVar3.o;
                StatementPeriod statementPeriod = (StatementPeriod) obj4;
                LocalDate fromDate = statementPeriod.getStart();
                LocalDate toDate = statementPeriod.getEnd();
                wi0.b countryCode = ((t0e.f) ((j2) lVar3.f267014r.f22677a).getValue()).f267005a;
                ryd.w wVar2 = (ryd.w) cVar;
                wVar2.getClass();
                Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                Intrinsics.checkNotNullParameter(toDate, "toDate");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Flow flowE = boh.f.e(rd0.e.b(o70.a.f(wVar2.n(2, new q2k.b(wVar2, fromDate, toDate, countryCode, 23)))), new szb.g(11));
                tji.f fVarX = lVar3.X();
                c0 c0VarD = lVar3.f267012p.d();
                Function1 function1 = new Function1() { // from class: t0e.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i21) {
                            case 0:
                                return lVar3.f267012p.c((Throwable) obj6);
                            default:
                                vyd.a aVar9 = lVar3.f267012p;
                                x xVar = (x) obj6;
                                if (xVar instanceof t) {
                                    return aVar9.b(((t) xVar).f240978a);
                                }
                                if (xVar instanceof pzd.w) {
                                    return aVar9.a();
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                };
                final boolean z = true ? 1 : 0;
                return yji.l.b1(lVar3, new g3(mo3.a.g(byd.g.c(flowE, fVarX, c0VarD, function1, new Function1() { // from class: t0e.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (z) {
                            case 0:
                                return lVar3.f267012p.c((Throwable) obj6);
                            default:
                                vyd.a aVar9 = lVar3.f267012p;
                                x xVar = (x) obj6;
                                if (xVar instanceof t) {
                                    return aVar9.b(((t) xVar).f240978a);
                                }
                                if (xVar instanceof pzd.w) {
                                    return aVar9.a();
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }), null, new szb.f(i6), 1), 14), null, new j(lVar3, insightPublicationPriceDescriptor, 4), 3);
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar3 = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) this.v;
                NaviCommand naviCommand = (NaviCommand) obj4;
                Intrinsics.h(naviCommand);
                return bVar3.C1(u0.b(naviCommand));
            case 7:
                ty0.a clickData3 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t18.p pVarE3 = ((AllInsightsScreen) obj4).R2();
                Intrinsics.h(clickData3);
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar4 = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) pVarE3;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                Object obj6 = clickData3.d;
                insightPublicationPriceDescriptor = obj6 instanceof InsightPublicationPriceDescriptor ? (InsightPublicationPriceDescriptor) obj6 : 0;
                if (insightPublicationPriceDescriptor != 0) {
                    oki.h.v2(bVar4.f76438w, new AllInsightsScreenContract$ModalStep.PublicationPrice(insightPublicationPriceDescriptor), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((w) this.v).a((List) obj4);
            case 9:
                Data data2 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) obj4;
                y yVar = rVar.f267443q;
                rVar.H2(yVar, new t05.v(data2, i6));
                od0.i iVar = (od0.i) data2.getContent();
                if (iVar != null && (dVar = (es6.d) iVar.f224257a) != null) {
                    int i22 = t27.p.f267440b[dVar.d.ordinal()];
                    if (i22 == 1) {
                        nVar = n.FIXED_PERCENTAGE_TAX;
                    } else if (i22 == 2) {
                        nVar = n.PRODUCT_TAX;
                    }
                    if (nVar != null) {
                        rVar.H2(yVar, new sx8.a(nVar, i3));
                    }
                    Float f = dVar.e;
                    if (f != null) {
                        rVar.I2(d0.I0(d0.I0(String.valueOf(f.floatValue()), '0'), CoreConstants.DOT));
                    }
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z9h.n.l(String.class, ((t3h.e) this.v).f267784a, "CHART_TYPE_KEY", ((i4l.a) obj4).name());
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z9h.n.l(String.class, ((t3h.e) this.v).f267784a, "CHART_VALUE_TYPE_KEY", ((eel.i) obj4).name());
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t3h.e) this.v).f267784a.G((eel.c) obj4, "CHART_PERIOD_KEY", z.d(o0.b(eel.c.class)));
                return Unit.f186387a;
            case 13:
                Data data3 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) obj4;
                pVar.H2(pVar.f267891r, new t05.v(data3, 10));
                return Unit.f186387a;
            case 14:
                DuplicateBeneficiaryDialogScreenContract$ButtonAction action = (DuplicateBeneficiaryDialogScreenContract$ButtonAction) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.a aVar18 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.a) ((t4j.e) ((DuplicateBeneficiaryDialogScreen) obj4).Q.getValue());
                aVar18.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                if (Intrinsics.f(action, DuplicateBeneficiaryDialogScreenContract$ButtonAction.Cancel.f99732a)) {
                    aVar18.B2();
                } else {
                    if (!(action instanceof DuplicateBeneficiaryDialogScreenContract$ButtonAction.ViewBeneficiary)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar18.C2(new t4j.d(((DuplicateBeneficiaryDialogScreenContract$ButtonAction.ViewBeneficiary) action).f99733a));
                }
                return Unit.f186387a;
            case 15:
                PerformanceTrackerFlowContract$Page page = (PerformanceTrackerFlowContract$Page) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) ((PerformanceTrackerFlowController) obj4).M.getValue();
                oVar.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                oVar.H2(oVar.f268075q, new m(page, i21));
                return Unit.f186387a;
            case 16:
                Data data4 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) obj4;
                oVar2.H2(oVar2.f268075q, new t05.v(data4, i3));
                return Unit.f186387a;
            case 17:
                LocalDate date = (LocalDate) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t5g.f fVar = (t5g.f) ((TravelFlightsDatesSelectionScreen) obj4).O.getValue();
                Intrinsics.h(date);
                com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.a aVar22 = (com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.a) fVar;
                aVar22.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                y yVar2 = aVar22.o;
                TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = ((t5g.d) ((j2) yVar2.f22677a).getValue()).f268106b;
                if (travelFlightsDatesSelectionScreenContract$Trip == null) {
                    aVar22.H2(yVar2, new t5g.h(i21, date));
                } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                    aVar22.H2(yVar2, new sx2.h(aVar22, travelFlightsDatesSelectionScreenContract$Trip, date));
                } else {
                    if (!(travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar22.H2(yVar2, new t5g.h(true ? 1 : 0, date));
                }
                return Unit.f186387a;
            case 18:
                String tabId = (String) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t6g.g gVar = (t6g.g) ((TravelFlightsPostBookingScreen) obj4).O.getValue();
                Intrinsics.h(tabId);
                com.revolut.feature.travel.flights.impl.ui.screen.post_booking.b bVar5 = (com.revolut.feature.travel.flights.impl.ui.screen.post_booking.b) gVar;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                bVar5.f93394q = null;
                bVar5.H2(bVar5.f93395r, new sef.j(tabId, 25));
                return Unit.f186387a;
            case 19:
                String listId = (String) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t6i.k kVar = (t6i.k) ((OrderAutomationsScreen) obj4).T.getValue();
                Intrinsics.h(listId);
                kVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Iterator<E> it8 = t6i.a.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((t6i.a) next).name(), listId)) {
                            obj3 = next;
                        }
                    }
                }
                t6i.a aVar25 = (t6i.a) obj3;
                if (aVar25 != null) {
                    kVar.C2(new t6i.i(aVar25));
                } else if (listId.equals("ORDER_AUTOMATIONS_SEE_ALL")) {
                    kVar.C2(t6i.h.f268355a);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.v;
                f0 f0Var = (f0) obj4;
                gVar2.C2(new w0(f0Var.d0() ? b93.e.JUNIOR_VIRTUAL : f0Var.f150112c ? b93.e.VIRTUAL : f0Var.b0() ? b93.e.JUNIOR : b93.e.PHYSICAL, ((q0) ((j2) gVar2.f65434h0.f22677a).getValue()).i, f0Var.b0() ? f0Var.u : null));
                return Unit.f186387a;
            case 21:
                String str2 = (String) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rc8.k) ((c84.c) obj4).f22077m).Z2(str2);
                return Unit.f186387a;
            case 22:
                Object obj7 = this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t7d.c) obj4).d.b3(((qv0.p) obj7).getF());
                return Unit.f186387a;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t7e.c) this.v).invoke((Subaccount) obj4);
                return Unit.f186387a;
            case 24:
                PortfolioInsightParcel parcel = (PortfolioInsightParcel) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a aVar31 = (com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a) ((t7f.e) ((PortfolioInsightsScreen) obj4).T.getValue());
                aVar31.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof PortfolioInsightParcel.AverageAnnualReturnBreakdown) {
                    PortfolioInsightParcel.AverageAnnualReturnBreakdown averageAnnualReturnBreakdown2 = (PortfolioInsightParcel.AverageAnnualReturnBreakdown) parcel;
                    BigDecimal bigDecimal = averageAnnualReturnBreakdown2.f91385a;
                    BigDecimal bigDecimal2 = averageAnnualReturnBreakdown2.f91386b;
                    PortfolioInsightParcel.ProductFeeRange productFeeRange = averageAnnualReturnBreakdown2.f91387c;
                    averageAnnualReturnBreakdown = new PortfolioInsightPerformanceMetric.AverageAnnualReturnBreakdown(bigDecimal, bigDecimal2, productFeeRange != null ? new PortfolioInsightPerformanceMetric.ProductFeeRange(productFeeRange.f91391a, productFeeRange.f91392b) : null);
                } else {
                    if (parcel instanceof PortfolioInsightParcel.SharpeRatio) {
                        PortfolioInsightParcel.SharpeRatio sharpeRatio = (PortfolioInsightParcel.SharpeRatio) parcel;
                        riskLevel = new PortfolioInsightPerformanceMetric.SharpeRatio(sharpeRatio.f91394a, sharpeRatio.f91395b, sharpeRatio.f91396c);
                    } else if (parcel instanceof PortfolioInsightParcel.MaxDrawdown) {
                        PortfolioInsightParcel.MaxDrawdown maxDrawdown = (PortfolioInsightParcel.MaxDrawdown) parcel;
                        riskLevel = new PortfolioInsightPerformanceMetric.MaxDrawdown(maxDrawdown.f91388a, maxDrawdown.f91389b, maxDrawdown.f91390c, maxDrawdown.d, maxDrawdown.e);
                    } else {
                        if (!(parcel instanceof PortfolioInsightParcel.RiskLevel)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        riskLevel = new PortfolioInsightPerformanceMetric.RiskLevel(((PortfolioInsightParcel.RiskLevel) parcel).f91393a);
                    }
                    averageAnnualReturnBreakdown = riskLevel;
                }
                oki.h.v2(aVar31.v, new PortfolioInsightsScreenContract$ModalStep.PortfolioInsight(new PortfolioInsightsPerformanceControllerContract$InputData(aVar31.o.f91377a, averageAnnualReturnBreakdown)), ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
            case 25:
                pu3.d debtType = (pu3.d) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t84.g gVar3 = (t84.g) ((AddOtherDebtScreen) obj4).X.getValue();
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(debtType, "debtType");
                gVar3.v2(new t84.e(debtType));
                return Unit.f186387a;
            case 26:
                WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(wealthNewsArticle);
                ((t8j.b) obj4).A2(new WealthNewsArticleReaderDestination(wealthNewsArticle, true, null));
                return Unit.f186387a;
            case 27:
                com.revolut.feature.onboarding.impl.exchange_global_access.flow.a aVar34 = (com.revolut.feature.onboarding.impl.exchange_global_access.flow.a) obj4;
                yja.b bVar6 = (yja.b) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i32 = t99.j.f268966a[bVar6.ordinal()];
                if (i32 == 1) {
                    aVar34.B2();
                } else if (i32 == 2) {
                    aVar34.l2(new t99.e(aVar34, insightPublicationPriceDescriptor, i21), new yi5.b(i5));
                } else {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        throw new IllegalStateException(("Unexpected result of onboarding product article: " + o0.f186429a.b(yja.b.class).m()).toString());
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        oki.h.D2(aVar34.u);
                    }
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t9e.w) this.v).v2(new t9e.i((qua.p) obj4));
                return Unit.f186387a;
            default:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t9f.l lVarE3 = ((BuyInPriceScreen) obj4).R2();
                String amount = charSequence.toString();
                t9f.o oVar3 = (t9f.o) lVarE3;
                y yVar3 = oVar3.f269031r;
                Intrinsics.checkNotNullParameter(amount, "amount");
                try {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA = Long.valueOf(oVar3.o.b(d0.F0(amount).toString(), ((t9f.i) ((j2) yVar3.f22677a).getValue()).f269018a.f126704b.f306286a));
                    break;
                } catch (Throwable th11) {
                    m.Companion companion4 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th11);
                }
                Throwable thA2 = yhm.m.a(objA);
                Object obj8 = objA;
                if (thA2 != null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, thA2, h0Var);
                    obj8 = 0L;
                }
                long jLongValue = ((Number) obj8).longValue();
                boolean z3 = jLongValue > 0;
                xi0.b bVar7 = ((t9f.i) ((j2) yVar3.f22677a).getValue()).f269018a.f126704b;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(jLongValue, bVar7.c());
                Intrinsics.h(bigDecimalValueOf);
                oVar3.H2(yVar3, new t9f.n(new ej0.b(bigDecimalValueOf, bVar7), z3, i21));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f266636w = obj2;
    }
}
