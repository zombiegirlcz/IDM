package kkf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodNavigationDestination;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a2 extends yji.n implements elf.s0 {

    @NotNull
    public static final z1 Companion = new z1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.i f184589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.m1 f184590n;
    public final gte.a o;

    public a2(klf.h0 commonDataSource, klf.i cardDataSource, klf.m1 juniorDataSource, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cardDataSource, "cardDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f184588l = commonDataSource;
        this.f184589m = cardDataSource;
        this.f184590n = juniorDataSource;
        this.o = featureToggleInteractor;
    }

    public final cmf.p Z2() {
        klf.h0 h0Var = this.f184588l;
        SharedFlow sharedFlowD = h0Var.d();
        SharedFlow sharedFlowE = h0Var.e();
        klf.i iVar = this.f184589m;
        return new cmf.p(ta6.a.e(sharedFlowD, sharedFlowE, iVar.a(), (SharedFlow) iVar.f.getValue(), this.f184590n.a(), new f(6, this, a2.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Ljava/util/Map;Lcom/revolut/feature/cards/models/revolutcard/RevolutCard;Lcom/revolut/feature/cards/models/card/PocketWithSubaccount;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 1)), new i0(11), zhm.u.c(this), "InsufficientBalance");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        int iHashCode = str.hashCode();
        boolean z = false;
        if (iHashCode != -462546506) {
            if (iHashCode != 1010231413) {
                if (iHashCode == 1194331250 && str.equals("INSUFFICIENT_FUNDS_ADD_MONEY_LIST_ID")) {
                    Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                    A2(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, (xi0.b) obj2, null, null, pte.a.NESTED_TOP_UP, 22)));
                    z = true;
                }
            } else if (str.equals("INSUFFICIENT_FUNDS_EDIT_CARD_CURRENCY_LIST_ID")) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                A2(new SelectPaymentMethodNavigationDestination(new SelectPaymentMethodInputData(new SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings((h93.f0) obj2, AccountId.Personal.f51414a))));
                z = true;
            }
        } else if (str.equals("INSUFFICIENT_FUNDS_BUY_LIST_ID")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
            xi0.b bVar = (xi0.b) obj2;
            if (((jte.d) this.o).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
                A2(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney((StartUpPocket) new StartUpPocket.CurrencyAccount(bVar), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, false), (Set) null, 6), null));
            } else {
                A2(zh9.u0.c(new ExchangeFeatureConfig.Buy(null, bVar, null, wd6.c.CRYPTO_ONLY, ExchangeFeatureConfigFinishBehavior.Finish.f96861a, null, false, null, 4069)));
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
