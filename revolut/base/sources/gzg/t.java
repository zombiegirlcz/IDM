package gzg;

import aw0.n6;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreenContract$ModalStep;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a f148123b;

    public /* synthetic */ t(com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a aVar, int i) {
        this.f148122a = i;
        this.f148123b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f148122a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WidgetisedAnalyticsTotalValueScreenContract$ModalStep step = (WidgetisedAnalyticsTotalValueScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean zF = Intrinsics.f(step, WidgetisedAnalyticsTotalValueScreenContract$ModalStep.TotalValueInfo.f95130a);
                com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a aVar = this.f148123b;
                if (zF) {
                    b bVar = aVar.f95131p;
                    bVar.getClass();
                    return new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.wealth_analytics_widgetised_total_value_info_bottomsheet_title, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_widgetised_total_value_info_bottomsheet_subtitle, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.wealth_analytics_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), bVar.f148100a, null, null, 24));
                }
                if (!(step instanceof WidgetisedAnalyticsTotalValueScreenContract$ModalStep.ContributionsSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                a aVar2 = aVar.f95132q;
                boolean z = ((WidgetisedAnalyticsTotalValueScreenContract$ModalStep.ContributionsSelection) step).f95129a;
                aVar2.getClass();
                boolean z3 = !z;
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(R$string.wealth_analytics_widgetised_total_value_contributions_title, null, null, 14), null, null, null, false, 30), null, zhm.v.k(new eii.l((Clause) new TextLocalisedClause(R$string.wealth_analytics_widgetised_total_value_show_contributions, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) a.a(R$drawable.uikit_icn_24_eye_outline, z), true, z, (RowDelegate.Model.c) null, (Object) WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel.Show, 200), new eii.l((Clause) new TextLocalisedClause(R$string.wealth_analytics_widgetised_total_value_hide_contributions, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) a.a(R$drawable.uikit_icn_24_eye_hide, z3), true, z3, (RowDelegate.Model.c) null, (Object) WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel.Hide, 200)), aVar2.f148098a, null));
                aVar.a(rowActionsBottomSheetController, new t(aVar, 1));
                return rowActionsBottomSheetController;
            default:
                oki.g onResult = (oki.g) obj2;
                eii.k outputData = (eii.k) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                eii.i iVar = outputData instanceof eii.i ? (eii.i) outputData : null;
                Object obj4 = iVar != null ? iVar.f126655a : null;
                WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel = obj4 instanceof WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel ? (WidgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel) obj4 : null;
                if (widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel == null) {
                    return Unit.f186387a;
                }
                boolean isSelected = widgetisedAnalyticsTotalValueScreenContract$ContributionsSelectionParcel.getIsSelected();
                com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a aVar3 = this.f148123b;
                aVar3.H2(aVar3.f95137x, new g7b.q(isSelected, 4));
                return Unit.f186387a;
        }
    }
}
