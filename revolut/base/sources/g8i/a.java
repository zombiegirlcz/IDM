package g8i;

import com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager;
import com.revolut.feature_market_data_api.MarketDataApi$Toggles$CryptoFirmPricesMoveMoney;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import kotlin.jvm.internal.Intrinsics;
import pcd.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f141360a;

    public a(gte.a featureToggleInteractor, int i) {
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f141360a = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f141360a = featureToggleInteractor;
                break;
        }
    }

    public boolean a() {
        return ((jte.d) this.f141360a).c(TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager.f91960c);
    }

    public boolean b(AccountWrapper sourceAccount, AccountWrapper targetAccount, OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        if (((jte.d) this.f141360a).c(MarketDataApi$Toggles$CryptoFirmPricesMoveMoney.f97007c)) {
            boolean z = orderMode instanceof OrderMode.Market;
            boolean z3 = cp5.d.z(sourceAccount.getBalance().f115083b) || cp5.d.z(targetAccount.getBalance().f115083b);
            boolean z4 = (com.revolut.feature_move_money.api.model.b.a(sourceAccount) == null && com.revolut.feature_move_money.api.model.b.a(targetAccount) == null) ? false : true;
            if (z && z3 && !z4) {
                return true;
            }
        }
        return false;
    }

    public boolean c(io3.d pocket, x5i.d dVar) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        return (((jte.d) this.f141360a).c(TeenAccountsApi$Toggles$TeenGuardianHub.f90321c) && pocket.f == io3.k.ACTIVE) && (dVar != x5i.d.SOURCE);
    }

    public boolean d(pcd.s vault, x5i.d dVar) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        return (((jte.d) this.f141360a).c(TeenAccountsApi$Toggles$TeenGuardianHub.f90321c) && vault.f234883c == h0.ACTIVE) && (dVar != x5i.d.SOURCE);
    }

    public a(oyh.a checker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(checker, "checker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f141360a = featureToggleInteractor;
    }
}
