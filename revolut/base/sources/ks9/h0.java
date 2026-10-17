package ks9;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f189332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = n0Var;
        this.f189332w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h0 h0Var = new h0(this.v, this.f189332w, continuation);
        h0Var.u = obj2;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = n1Var instanceof l1;
        dj0.d dVar = this.f189332w;
        n0 n0Var = this.v;
        if (z) {
            n0Var.A2(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar, null, null, 30)));
        } else if (n1Var instanceof m1) {
            if (((jte.d) n0Var.f189361t).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
                n0Var.A2(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(new StartUpPocket.CurrencyAccount(dVar.f115083b), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, 4), (Set) null, 6), null));
            } else {
                n0Var.A2(new BridgeDestination(new FeatureCommand(new ExchangeFeatureConfig.Buy(null, dVar.f115083b, null, null, null, null, false, null, 4093))));
            }
        } else {
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
