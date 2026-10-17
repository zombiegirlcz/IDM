package xnd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$PeriodPopupAction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static PopupMenuItem.Cell a(String str, int i, lzi.i iVar, lzi.i iVar2) {
        return PopupMenuItem.Companion.a(PopupMenuItem.INSTANCE, str, new TextLocalisedClause(i, null, null, 14), iVar == iVar2, null, new AnalyticsDashboardContract$PeriodPopupAction.SelectPeriodType(iVar), null, null, 232);
    }
}
