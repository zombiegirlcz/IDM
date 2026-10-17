package z63;

import android.app.Activity;
import android.os.Parcelable;
import com.revolut.feature.card_screen.common.tapandpay.TapAndPayPresenterDelegate$NegativeBalancePayload;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import efm.d0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f319666b;

    public /* synthetic */ f(k kVar, int i) {
        this.f319665a = i;
        this.f319666b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f319665a) {
            case 0:
                k kVar = this.f319666b;
                Boolean isWalletExist = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isWalletExist, "isWalletExist");
                if (isWalletExist.booleanValue()) {
                    return pfm.m.f235744a;
                }
                v60.i tokenizeWalletCreationResult = ((d) kVar.f319671h).f319661m;
                Intrinsics.checkNotNullExpressionValue(tokenizeWalletCreationResult, "tokenizeWalletCreationResult");
                d0 d0VarFirstOrError = w.f0(tokenizeWalletCreationResult).doOnSubscribe(new z3e.a(new f(kVar, 1), 16)).firstOrError();
                d0VarFirstOrError.getClass();
                return new pfm.h(d0VarFirstOrError, 4);
            case 1:
                d dVar = (d) this.f319666b.f319671h;
                dVar.i.getClass();
                zri.a.e = true;
                li0.b bVar = (li0.b) dVar.k.getValue();
                Activity activity = dVar.f319658h;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                bVar.f195399a.createWallet(activity, 1001);
                return Unit.f186387a;
            case 2:
                k kVar2 = this.f319666b;
                n result = (n) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof m) {
                    return new pfm.h(new xza.a(kVar2, result, 13), 2);
                }
                if (!(result instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                l lVar = (l) result;
                dj0.d dVar2 = lVar.f319678a;
                boolean z = lVar.f319679b;
                kVar2.getClass();
                pfm.h hVar = new pfm.h(new br6.a(kVar2, z, dVar2, 12), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            default:
                final k kVar3 = this.f319666b;
                k3l.j jVar = (k3l.j) obj2;
                Parcelable f = jVar.a().getF();
                Intrinsics.i(f, "null cannot be cast to non-null type com.revolut.feature.card_screen.common.tapandpay.TapAndPayPresenterDelegate.NegativeBalancePayload");
                final dj0.d dVar3 = ((TapAndPayPresenterDelegate$NegativeBalancePayload) f).f65373a;
                if (jVar instanceof k3l.h) {
                    final int i = 0;
                    pfm.h hVar2 = new pfm.h(new kfm.a() { // from class: z63.e
                        @Override // kfm.a
                        public final void run() {
                            switch (i) {
                                case 0:
                                    kVar3.f319676p.c(u0.f(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar3, null, null, 30))));
                                    break;
                                default:
                                    k kVar4 = kVar3;
                                    gte.a aVar = kVar4.f319677q;
                                    sri.m mVar = kVar4.f319676p;
                                    boolean zC = ((jte.d) aVar).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMovedCards.f97188c);
                                    dj0.d dVar4 = dVar3;
                                    if (!zC) {
                                        mVar.c(new FeatureCommand(new ExchangeFeatureConfig.Buy(null, dVar4.f115083b, null, null, ExchangeFeatureConfigFinishBehavior.Finish.f96861a, null, false, null, 4077)));
                                    } else {
                                        mVar.c(u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney((StartUpPocket) new StartUpPocket.CurrencyAccount(dVar4.f115083b), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, false), (Set) null, 6), null)));
                                    }
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                    return hVar2;
                }
                if (!(jVar instanceof k3l.i)) {
                    pfm.m mVar = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                final int i2 = 1;
                pfm.h hVar3 = new pfm.h(new kfm.a() { // from class: z63.e
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                kVar3.f319676p.c(u0.f(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar3, null, null, 30))));
                                break;
                            default:
                                k kVar4 = kVar3;
                                gte.a aVar = kVar4.f319677q;
                                sri.m mVar2 = kVar4.f319676p;
                                boolean zC = ((jte.d) aVar).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMovedCards.f97188c);
                                dj0.d dVar4 = dVar3;
                                if (!zC) {
                                    mVar2.c(new FeatureCommand(new ExchangeFeatureConfig.Buy(null, dVar4.f115083b, null, null, ExchangeFeatureConfigFinishBehavior.Finish.f96861a, null, false, null, 4077)));
                                } else {
                                    mVar2.c(u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney((StartUpPocket) new StartUpPocket.CurrencyAccount(dVar4.f115083b), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, false), (Set) null, 6), null)));
                                }
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return hVar3;
        }
    }
}
