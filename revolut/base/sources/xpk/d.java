package xpk;

import aw0.p0;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RateDetailsScreen f307985w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RateDetailsScreen rateDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307985w = rateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f307985w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f307985w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f307985w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((p0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureCommand featureCommandF;
        int i = this.u;
        FeatureCommand featureCommand = null;
        Object[] objArr = 0;
        RateDetailsScreen rateDetailsScreen = this.f307985w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarT2 = rateDetailsScreen.T2();
                Intrinsics.h(menuItemId);
                mVarT2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                mVarT2.l2(new xnl.f(menuItemId, mVarT2, objArr == true ? 1 : 0, 2), new yi5.b(26));
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarT22 = rateDetailsScreen.T2();
                Intrinsics.h(clickData);
                mVarT22.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) mVarT22.f308004x).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    mVarT22.C1(cryptoFcaRisksDestinationD);
                }
                break;
            default:
                p0 buttonsAction = (p0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarT23 = rateDetailsScreen.T2();
                Intrinsics.h(buttonsAction);
                mVarT23.getClass();
                Intrinsics.checkNotNullParameter(buttonsAction, "buttonsAction");
                aqk.a aVar4 = mVarT23.v;
                qpk.a aVar5 = aVar4.f8472m;
                RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = aVar4.f8471l;
                Intrinsics.checkNotNullParameter(buttonsAction, "buttonsAction");
                String str = buttonsAction.f10454a;
                if (str.equals("ID_ACTION_SELL")) {
                    xi0.b currencyFrom = rateDetailsScreenContract$InputData.f103727a;
                    xi0.b currencyTo = rateDetailsScreenContract$InputData.f103728b;
                    wd6.c currencyMode = cp5.d.z(currencyFrom) ? wd6.c.CRYPTO_ONLY : wd6.c.ALL;
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
                    Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
                    Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
                    if (((jte.d) aVar5.f248436a).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
                        featureCommandF = u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(new StartUpPocket.CurrencyAccount(currencyFrom), new StartUpPocket.CurrencyAccount(currencyTo), null, null, 60), (Set) null, 6), null));
                        featureCommand = featureCommandF;
                    } else {
                        featureCommand = new FeatureCommand(new ExchangeFeatureConfig.Sell(currencyFrom, currencyTo, null, null, currencyMode, null, null, 4076));
                    }
                } else if (str.equals("ID_ACTION_BUY")) {
                    xi0.b currencyFrom2 = rateDetailsScreenContract$InputData.f103728b;
                    xi0.b currencyTo2 = rateDetailsScreenContract$InputData.f103727a;
                    wd6.c currencyMode2 = cp5.d.z(currencyTo2) ? wd6.c.CRYPTO_ONLY : wd6.c.ALL;
                    BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = rateDetailsScreenContract$InputData.f103731h;
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(currencyFrom2, "currencyFrom");
                    Intrinsics.checkNotNullParameter(currencyTo2, "currencyTo");
                    Intrinsics.checkNotNullParameter(currencyMode2, "currencyMode");
                    if (((jte.d) aVar5.f248436a).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
                        featureCommandF = u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(new StartUpPocket.CurrencyAccount(currencyFrom2), new StartUpPocket.CurrencyAccount(currencyTo2), null, null, 60), (Set) null, 6), null));
                        featureCommand = featureCommandF;
                    } else {
                        xi0.b bVarU = hx7.l.u(buyFundingCurrencyPrefill);
                        featureCommand = new FeatureCommand(new ExchangeFeatureConfig.Buy(bVarU == null ? currencyFrom2 : bVarU, currencyTo2, null, currencyMode2, null, null, false, null, 4084));
                    }
                }
                if (featureCommand != null) {
                    aVar4.A2(new BridgeDestination(featureCommand));
                }
                break;
        }
        return Unit.f186387a;
    }
}
