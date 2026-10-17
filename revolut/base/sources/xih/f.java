package xih;

import aw0.o9;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.i;
import com.revolut.core.ui_kit.delegates.k;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequestedDetails;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import whh.l;
import whh.m;
import whh.n;
import whh.o;
import whh.p;
import whh.q;
import whh.r;
import whh.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f306409a;

    public f(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f306409a = featureToggleInteractor;
    }

    public final ActionWidgetDelegate.Model a(AccountClosureStatus accountClosureStatus, s widgetParcel) {
        TextLocalisedClause textLocalisedClause;
        Clause textClause;
        TextLocalisedClause textLocalisedClause2;
        Clause textClause2;
        String str;
        String str2;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        TextLocalisedClause textLocalisedClause5;
        int i;
        Intrinsics.checkNotNullParameter(accountClosureStatus, "accountClosureStatus");
        Intrinsics.checkNotNullParameter(widgetParcel, "widgetParcel");
        String strConcat = widgetParcel.getClass().getSimpleName().concat("_ACCOUNT_CLOSURE_WIDGET_LIST_ID");
        boolean z = accountClosureStatus instanceof AccountClosureStatus.AccountClosureInProgress;
        gte.a aVar = this.f306409a;
        ActionWidgetDelegate.Model.b.C0394b c0394b = ActionWidgetDelegate.Model.b.C0394b.f51606a;
        n nVar = n.f297668a;
        l lVar = l.f297666a;
        if (z) {
            if (widgetParcel.equals(nVar)) {
                textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_stocks_in_progress_title, null, null, 14);
            } else if (widgetParcel instanceof m) {
                textLocalisedClause5 = new TextLocalisedClause(((jte.d) aVar).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_invest_account_closure_widget_strategies_in_progress_title : R$string.wealth_invest_account_closure_widget_robo_in_progress_title, null, null, 14);
            } else if (widgetParcel.equals(lVar)) {
                textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_margin_in_progress_title, null, null, 14);
            } else if (widgetParcel instanceof o) {
                textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_isa_in_progress_title, null, null, 14);
            } else if (widgetParcel instanceof q) {
                textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_pea_in_progress_title, null, null, 14);
            } else {
                if (!(widgetParcel instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_jisa_in_progress_title, v.l(((p) widgetParcel).f297671b), null, 12);
            }
            AccountClosureStatus.AccountClosureInProgress accountClosureInProgress = (AccountClosureStatus.AccountClosureInProgress) accountClosureStatus;
            if (widgetParcel.equals(nVar)) {
                i = R$string.wealth_invest_account_closure_widget_stocks_in_progress_subtitle;
            } else if (widgetParcel instanceof m) {
                i = R$string.wealth_invest_account_closure_widget_robo_in_progress_subtitle;
            } else if (widgetParcel.equals(lVar)) {
                i = R$string.wealth_invest_account_closure_widget_margin_in_progress_subtitle;
            } else if ((widgetParcel instanceof o) || (widgetParcel instanceof q)) {
                i = R$string.wealth_invest_account_closure_widget_isa_in_progress_subtitle;
            } else {
                if (!(widgetParcel instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_invest_account_closure_widget_jisa_in_progress_subtitle;
            }
            LocalDateTime localDateTimeAtTime = accountClosureInProgress.f104500a.f104495m.atTime(LocalTime.MIN);
            Intrinsics.checkNotNullExpressionValue(localDateTimeAtTime, "atTime(...)");
            return new ActionWidgetDelegate.Model(strConcat, textLocalisedClause5, new TextLocalisedClause(i, u.c(new TimeClause(oi0.d.R(localDateTimeAtTime), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12), new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D304", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), c0394b, new i(14, new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_view_details, null, null, 14), null, false), null, widgetParcel, null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
        }
        if (accountClosureStatus instanceof AccountClosureStatus.AccountClosureProgressBlocked) {
            if (widgetParcel.equals(nVar)) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_stocks_blocked_title, null, null, 14);
            } else if (widgetParcel instanceof m) {
                textLocalisedClause3 = new TextLocalisedClause(((jte.d) aVar).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_invest_account_closure_widget_strategies_blocked_title : R$string.wealth_invest_account_closure_widget_robo_blocked_title, null, null, 14);
            } else if (widgetParcel.equals(lVar)) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_margin_in_progress_title, null, null, 14);
            } else if (widgetParcel instanceof o) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_isa_blocked_title, null, null, 14);
            } else if (widgetParcel instanceof q) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_pea_blocked_title, null, null, 14);
            } else {
                if (!(widgetParcel instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_jisa_blocked_title, v.l(((p) widgetParcel).f297671b), null, 12);
            }
            if (widgetParcel.equals(nVar)) {
                textLocalisedClause4 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_stocks_blocked_subtitle, null, null, 14);
            } else if (widgetParcel instanceof m) {
                textLocalisedClause4 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_robo_blocked_subtitle, null, null, 14);
            } else if (widgetParcel.equals(lVar)) {
                textLocalisedClause4 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_margin_in_progress_subtitle, null, null, 14);
            } else if ((widgetParcel instanceof o) || (widgetParcel instanceof q)) {
                textLocalisedClause4 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_isa_blocked_subtitle, null, null, 14);
            } else {
                if (!(widgetParcel instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause4 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_jisa_blocked_subtitle, v.l(((p) widgetParcel).f297671b), null, 12);
            }
            com.revolut.core.ui_kit.delegates.m mVar = new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6);
            AccountClosureStatus.AccountClosureProgressBlocked accountClosureProgressBlocked = (AccountClosureStatus.AccountClosureProgressBlocked) accountClosureStatus;
            ActionWidgetDelegate.Model.a iVar = new i(14, new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_view_details, null, null, 14), null, false);
            if ((widgetParcel instanceof r) || widgetParcel.equals(nVar)) {
                if (accountClosureProgressBlocked.f104503b != null) {
                    iVar = new k(new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_view_details, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_blocked_clear_balance, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE);
                }
            } else if (!(widgetParcel instanceof m) && !(widgetParcel instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            return new ActionWidgetDelegate.Model(strConcat, textLocalisedClause3, textLocalisedClause4, mVar, c0394b, iVar, null, widgetParcel, null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
        }
        if (!(accountClosureStatus instanceof AccountClosureStatus.BackendRequestedAccountClosure)) {
            if (Intrinsics.f(accountClosureStatus, AccountClosureStatus.NoAccountClosure.f104506a) || (accountClosureStatus instanceof AccountClosureStatus.AccountClosed)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = ((AccountClosureStatus.BackendRequestedAccountClosure) accountClosureStatus).f104505a;
        if (accountClosureBackendRequestedDetails == null || (str2 = accountClosureBackendRequestedDetails.f104485a) == null) {
            if (widgetParcel.equals(nVar)) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_stocks_by_revolut_title, null, null, 14);
            } else if (widgetParcel instanceof m) {
                textLocalisedClause = new TextLocalisedClause(((jte.d) aVar).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_invest_account_closure_widget_strategies_by_revolut_title : R$string.wealth_invest_account_closure_widget_robo_by_revolut_title, null, null, 14);
            } else if (widgetParcel.equals(lVar)) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_margin_in_progress_title, null, null, 14);
            } else if (widgetParcel instanceof o) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_isa_by_revolut_title, null, null, 14);
            } else if (widgetParcel instanceof q) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_pea_by_revolut_title, null, null, 14);
            } else {
                if (!(widgetParcel instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_jisa_by_revolut_title, v.l(((p) widgetParcel).f297671b), null, 12);
            }
            textClause = textLocalisedClause;
        } else {
            textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (accountClosureBackendRequestedDetails == null || (str = accountClosureBackendRequestedDetails.f104486b) == null) {
            if (widgetParcel.equals(nVar)) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_stocks_by_revolut_subtitle, null, null, 14);
            } else if (widgetParcel instanceof m) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_robo_by_revolut_subtitle, null, null, 14);
            } else if (widgetParcel.equals(lVar)) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_margin_in_progress_subtitle, null, null, 14);
            } else if ((widgetParcel instanceof o) || (widgetParcel instanceof q)) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_isa_by_revolut_subtitle, null, null, 14);
            } else {
                if (!(widgetParcel instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_jisa_by_revolut_subtitle, v.l(((p) widgetParcel).f297671b), null, 12);
            }
            textClause2 = textLocalisedClause2;
        } else {
            textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new ActionWidgetDelegate.Model(strConcat, textClause, textClause2, new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), c0394b, new i(14, new TextLocalisedClause(R$string.wealth_invest_account_closure_widget_view_details, null, null, 14), null, false), null, widgetParcel, null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
    }
}
