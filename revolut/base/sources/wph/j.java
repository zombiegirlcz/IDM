package wph;

import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditScreenerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(EditScreenerScreen editScreenerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editScreenerScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditScreenerScreen editScreenerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a) editScreenerScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar3 = (com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a) editScreenerScreen.e3();
                aVar3.getClass();
                aVar3.n2(new d(aVar3, null, 1), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
