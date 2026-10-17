package vy5;

import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ w u;
    public final /* synthetic */ sfe.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f293214w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, sfe.m mVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.u = wVar;
        this.v = mVar;
        this.f293214w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.u, this.v, this.f293214w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVar = this.u;
        wVar.getClass();
        sfe.m mVar = this.v;
        io3.d dVarG3 = w.g3(mVar);
        if (dVarG3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        StartUpPocket.FiatCurrencyAccount fiatCurrencyAccount = new StartUpPocket.FiatCurrencyAccount(dVarG3.f163145a);
        io3.d dVarG32 = w.g3(mVar);
        return wVar.A2(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(fiatCurrencyAccount, StartUpPocket.FiatAccountsAll.f104847a, dVarG32 != null ? new Long(dVarG32.i) : null, this.f293214w ? k8l.a.WITHDRAW : k8l.a.MOVE, 32), (Set) null, 6), null));
    }
}
