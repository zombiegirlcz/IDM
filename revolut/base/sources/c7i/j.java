package c7i;

import aw0.n6;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MoveMoneyAutomationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(MoveMoneyAutomationScreen moveMoneyAutomationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = moveMoneyAutomationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MoveMoneyAutomationScreen moveMoneyAutomationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_move_money.impl.automation.screen.c) moveMoneyAutomationScreen.d()).f97343y.Q();
                moveMoneyAutomationScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.automation.screen.c cVar = (com.revolut.feature_move_money.impl.automation.screen.c) moveMoneyAutomationScreen.d();
                cVar.f97343y.Q();
                cVar.l2(new bv4.h(cVar, null, 10), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
