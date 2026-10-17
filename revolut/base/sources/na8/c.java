package na8;

import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import n68.x;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorIsaChildCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(JuniorIsaChildCreationScreen juniorIsaChildCreationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorIsaChildCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorIsaChildCreationScreen juniorIsaChildCreationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oki.h) juniorIsaChildCreationScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a aVar3 = (com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) juniorIsaChildCreationScreen.d();
                aVar3.getClass();
                aVar3.l2(new x(aVar3, null, 5), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
