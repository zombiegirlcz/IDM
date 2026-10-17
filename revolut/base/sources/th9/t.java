package th9;

import android.view.ViewGroup;
import android.view.ViewParent;
import au0.x1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.internal.views.chart.PieChartView;
import com.revolut.core.ui_kit.internal.views.chart.SegmentedChartView;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking.DocumentDeliveryTrackingScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate.ActivateTelematicsDeviceScreen;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlow;
import com.revolut.feature.rev_points.impl.ui.account_migration_checklist.RevPointsAccountMigrationChecklistScreen;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$TransactionDbTimeoutException;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlow;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreen;
import com.revolut.feature_account_widget.impl.configuration.AccountWidgetConfigScreen;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$InstrumentSuggestion;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ql7.a2;
import ql7.z;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f271349b;

    public /* synthetic */ t(Object obj2, int i) {
        this.f271348a = i;
        this.f271349b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f271348a;
        int i2 = 0;
        Object obj2 = this.f271349b;
        switch (i) {
            case 0:
                ((v) obj2).C2(d.f271332a);
                return Unit.f186387a;
            case 1:
                int i3 = TaxAllowanceDetailScreen.T;
                return (thh.c) ((fhh.a) ((TaxAllowanceDetailScreen) obj2).R.getValue()).f135232c.get();
            case 2:
                ti9.g gVar = (ti9.g) obj2;
                return nim.a.w(kli.a.h(gVar.o(w4l.i.f294643c), rd0.e.c(gVar.k(w4l.h.f294642c), kotlin.coroutines.g.f186406a)), new tfh.a(15));
            case 3:
                return Boolean.valueOf(((jte.d) ((tif.q) obj2).f271517a).c(TransactionApi$Toggles$TransactionDbTimeoutException.f91955c));
            case 4:
                return ((tij.q) obj2).f271566a.b();
            case 5:
                return rd0.e.c(((tjf.j) obj2).f271664a.i(false), kotlin.coroutines.g.f186406a).distinctUntilChanged().replay(1, 100L, TimeUnit.MILLISECONDS).e();
            case 6:
                ((tl7.f) obj2).f272014m.invoke();
                return Unit.f186387a;
            case 7:
                KProperty[] kPropertyArr = DocumentDeliveryTrackingScreen.f75519b0;
                return (tn7.f) ((z) ((DocumentDeliveryTrackingScreen) obj2).X.getValue()).f247546c.get();
            case 8:
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_connectivity_issues_solutions_section_ensure_esim_on, null, null, 14);
                tnj.a aVar = ((tnj.d) obj2).f272463a;
                int i5 = R$drawable.uikit_icn_24_sim_card;
                aVar.getClass();
                return zhm.v.k(new RowDelegate.Model("ENSURE_ESIM_TURNED_ON_ID", tnj.a.b(i5), textLocalisedClause, null, 0, null, null, null, 0, (tf) aVar.f272460a.getValue(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880), new RowDelegate.Model("TOGGLE_AIRPLANE_MODE_ID", tnj.a.b(R$drawable.uikit_icn_24_travel), new TextLocalisedClause(R$string.esim_connectivity_issues_solutions_section_airplane_mode, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("RESTART_DEVICE_ID", tnj.a.b(R$drawable.uikit_icn_24_smartphone), new TextLocalisedClause(R$string.esim_connectivity_issues_solutions_section_restart_device, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("RESET_NETWORK_SELECTION_ID", tnj.a.b(R$drawable.uikit_icn_24_data), new TextLocalisedClause(R$string.esim_connectivity_issues_solutions_section_reset_network, null, null, 14), null, 0, null, null, null, 0, (tf) aVar.f272460a.getValue(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880));
            case 9:
                return Boolean.valueOf(((jte.d) ((toh.g) obj2).f273218a).c(StockDetailsApi$Toggles$InstrumentSuggestion.f103735c));
            case 10:
                KProperty[] kPropertyArr2 = BinaryQuestionsScreen.c0;
                a2 a2Var = (a2) ((BinaryQuestionsScreen) obj2).Y.getValue();
                switch (a2Var.f247232a) {
                    case 0:
                        return (tp7.i) a2Var.d.get();
                    default:
                        return (tp7.i) a2Var.d.get();
                }
            case 11:
                ((tpl.s) obj2).K2();
                return Unit.f186387a;
            case 12:
                KProperty[] kPropertyArr3 = ActivateTelematicsDeviceScreen.f75673b0;
                return (tq7.e) ((ql7.d) ((ActivateTelematicsDeviceScreen) obj2).Y.getValue()).f247268c.get();
            case 13:
                return (tqg.c) ((wpg.i) ((RecurringTransferFlow) obj2).P.getValue()).e.get();
            case 14:
                tqh.i iVar = (tqh.i) obj2;
                String str = iVar.c3().f310974a;
                zel.g gVarE = ((tqh.e) iVar.c3().f310975b).getSortingMetric();
                return mra.d.c(iVar, new tqh.c(str, new tqh.b(iVar.f273588p.a(((tqh.e) iVar.c3().f310975b).getSecurityTypes()), ((tqh.e) iVar.c3().f310975b).c(), ((tqh.e) iVar.c3().f310975b).getLimit()), null, null, gVarE != null ? new ScreenerSortingOptions(f0.f322471a, gVarE, ((tqh.e) iVar.c3().f310975b).getSortOrder()) : null, true), new hog.d(iVar, 7));
            case 15:
                ComparisonLineChartView comparisonLineChartView = (ComparisonLineChartView) obj2;
                comparisonLineChartView.f56622h = true;
                comparisonLineChartView.invalidate();
                return Unit.f186387a;
            case 16:
                HistogramView histogramView = (HistogramView) obj2;
                histogramView.f56684s0 = true;
                histogramView.invalidate();
                return Unit.f186387a;
            case 17:
                LineChartView lineChartView = (LineChartView) obj2;
                lineChartView.f56714t = true;
                lineChartView.invalidate();
                return Unit.f186387a;
            case 18:
                PieChartView pieChartView = (PieChartView) obj2;
                pieChartView.f56732c = true;
                pieChartView.invalidate();
                return Unit.f186387a;
            case 19:
                SegmentedChartView segmentedChartView = (SegmentedChartView) obj2;
                segmentedChartView.C = true;
                segmentedChartView.invalidate();
                return Unit.f186387a;
            case 20:
                return (tu7.a) ((lu7.i) ((EmbeddedDetailFlow) obj2).P.getValue()).d.get();
            case 21:
                fv.c cVarA = ((tv.l) obj2).f274655g.a();
                if (cVarA instanceof fv.a) {
                    return null;
                }
                if (cVarA instanceof fv.b) {
                    return ((fv.b) cVarA).f138297a;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                KProperty[] kPropertyArr4 = AccountWidgetConfigScreen.f96617a0;
                uvh.d dVar = (uvh.d) ((AccountWidgetConfigScreen) obj2).V.getValue();
                uvh.e eVar = dVar.f283467b;
                vvh.l lVarA = eVar.a();
                kq.h hVar = (kq.h) eVar.f283469b.f167779n.get();
                vc.s.j(hVar);
                int iIntValue = dVar.f283466a.intValue();
                oda.o oVar = eVar.e;
                return new tvh.g(lVarA, hVar, iIntValue, new anl.j(new xea.g(oVar.f(), oVar.i.g())));
            case 23:
                r70.c.b(((com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) obj2).f83718q, 3);
                return Unit.f186387a;
            case 24:
                twh.d dVar2 = (twh.d) obj2;
                lfm.c cVar = dVar2.f275028c;
                v60.i contextualPromptSubject = ((rpa.a) dVar2.f275026a).f256307a;
                Intrinsics.checkNotNullExpressionValue(contextualPromptSubject, "contextualPromptSubject");
                cVar.a(contextualPromptSubject.doOnNext(new ts5.o(16, new twh.a(dVar2, i2))).subscribe());
                return Unit.f186387a;
            case 25:
                return NavBarBottomSheet.B((NavBarBottomSheet) obj2);
            case 26:
                NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) obj2;
                NavBarLargeCentred.Companion companion = NavBarLargeCentred.INSTANCE;
                navBarLargeCentred.k(navBarLargeCentred.f9292a, navBarLargeCentred.f9294c);
                return Unit.f186387a;
            case 27:
                x1 x1Var = (x1) obj2;
                int i6 = NavBarWithBigTile.f0;
                ViewParent parent = x1Var.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(x1Var);
                }
                return Unit.f186387a;
            case 28:
                return (WallpaperView) obj2;
            default:
                int i21 = RevPointsAccountMigrationChecklistScreen.T;
                return (tyb.a) ((zxb.b) ((RevPointsAccountMigrationChecklistScreen) obj2).R.getValue()).f326103b.get();
        }
    }
}
