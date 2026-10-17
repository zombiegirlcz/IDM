package fug;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f138207a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f138207a = featureToggleInteractor;
    }

    public static TextLocalisedClause a(hel.b bVar) {
        return new TextLocalisedClause(bVar == hel.b.EEA ? R$string.trading_account_closure_status_error_joint_gia_onboarded_brokerage_account_description : R$string.trading_account_closure_status_error_joint_gia_onboarded_description, null, null, 14);
    }

    public static TextLocalisedClause b(AccountClosurePreconditionsStatus accountClosurePreconditionsStatus) {
        if ((accountClosurePreconditionsStatus instanceof AccountClosurePreconditionsStatus.OK) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.Unknown.f94884a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasNonTradeableStocks.f94876a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasPendingStockTransfers.f94879a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasTransferOutRequest.f94881a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasRoboOrFlexibleAccountOnboarded.f94880a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasOtherAccountOnboarded.f94878a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasJointGiaOnboarded.f94874a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasMarginLoan.f94875a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasWarrants.f94882a)) {
            return new TextLocalisedClause(R$string.trading_account_closure_status_error_close_action, null, null, 14);
        }
        if (accountClosurePreconditionsStatus instanceof AccountClosurePreconditionsStatus.HasOpenPositions) {
            return new TextLocalisedClause(R$string.trading_account_closure_status_warning_open_positions_primary_action, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause c(AccountClosurePreconditionsStatus accountClosurePreconditionsStatus) {
        if ((accountClosurePreconditionsStatus instanceof AccountClosurePreconditionsStatus.OK) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.Unknown.f94884a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasNonTradeableStocks.f94876a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasPendingStockTransfers.f94879a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasTransferOutRequest.f94881a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasRoboOrFlexibleAccountOnboarded.f94880a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasOtherAccountOnboarded.f94878a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasJointGiaOnboarded.f94874a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasMarginLoan.f94875a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasWarrants.f94882a)) {
            return null;
        }
        if (accountClosurePreconditionsStatus instanceof AccountClosurePreconditionsStatus.HasOpenPositions) {
            return new TextLocalisedClause(R$string.trading_account_closure_status_warning_open_positions_secondary_action, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String d(AccountClosurePreconditionsStatus accountClosurePreconditionsStatus) {
        if ((accountClosurePreconditionsStatus instanceof AccountClosurePreconditionsStatus.OK) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasNonTradeableStocks.f94876a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasPendingStockTransfers.f94879a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasTransferOutRequest.f94881a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasWarrants.f94882a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasRoboOrFlexibleAccountOnboarded.f94880a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasOtherAccountOnboarded.f94878a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasJointGiaOnboarded.f94874a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasMarginLoan.f94875a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.Unknown.f94884a)) {
            return "ACCOUNT_CLOSURE_PRECONDITION_ERROR";
        }
        if (accountClosurePreconditionsStatus instanceof AccountClosurePreconditionsStatus.HasOpenPositions) {
            return "ACCOUNT_CLOSURE_OPEN_POSITIONS_WARNING_ID";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean e() {
        return ((jte.d) this.f138207a).c(WealthUiApi$Toggles.RoboStrategies.f95863c);
    }
}
