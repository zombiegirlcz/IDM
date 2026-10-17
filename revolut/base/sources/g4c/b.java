package g4c;

import com.revolut.feature.revolut_shop.ui.screen.order_history.OrderHistoryScreen;
import ip0.dg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ OrderHistoryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(OrderHistoryScreen orderHistoryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = orderHistoryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((dg) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OrderHistoryScreen orderHistoryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zji.d dVar = ((oki.h) orderHistoryScreen.d()).f226129n;
                Unit unit = Unit.f186387a;
                dVar.a(unit);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) orderHistoryScreen.d();
                uVar.getClass();
                uVar.n2(new p(uVar, null, 3), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar2 = (u) orderHistoryScreen.d();
                uVar2.getClass();
                uVar2.l2(new p(uVar2, null, 0), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
