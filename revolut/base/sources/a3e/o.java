package a3e;

import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.feature.store.impl.ui.deals.StoreDealsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StoreDealsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(StoreDealsScreen storeDealsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = storeDealsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.v, continuation, 0);
            default:
                return new o(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((d9) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StoreDealsScreen storeDealsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) storeDealsScreen.d3()).I2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) storeDealsScreen.d3()).I2();
                break;
        }
        return Unit.f186387a;
    }
}
