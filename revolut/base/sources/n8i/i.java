package n8i;

import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MoveMoneyTopupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(MoveMoneyTopupScreen moveMoneyTopupScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = moveMoneyTopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            default:
                return new i(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        int i = this.u;
        MoveMoneyTopupScreen moveMoneyTopupScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_move_money.impl.topup.a) moveMoneyTopupScreen.d()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.topup.a aVar3 = (com.revolut.feature_move_money.impl.topup.a) moveMoneyTopupScreen.d();
                aVar3.getClass();
                aVar3.l2(new c1(aVar3, null, 0), new yi5.b(26));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.topup.a aVar5 = (com.revolut.feature_move_money.impl.topup.a) moveMoneyTopupScreen.d();
                o oVar = ((q) ((j2) aVar5.M.f22677a).getValue()).f213463c;
                if (!(oVar instanceof n)) {
                    if (!(oVar instanceof m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = aVar5.C1(aVar5.H.b3(((m) oVar).d));
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    break;
                } else {
                    oki.h.v2(aVar5.N, MoveMoneyTopupScreenContract$ModalStep.Schedule.f97418a, ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
        }
    }
}
