package uxe;

import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreenContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BrazilStoredMethodDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = brazilStoredMethodDetailsScreen;
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
                return ((j) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b) brazilStoredMethodDetailsScreen.e3()).C2(BrazilStoredMethodDetailsScreenContract$OutputData.Back.f90807a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b bVar = (com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b) brazilStoredMethodDetailsScreen.e3();
                so6.a aVar3 = (so6.a) ((m) ((j2) bVar.f90817q.f22677a).getValue()).f283995a.getContent();
                if (aVar3 != null) {
                    bVar.C2(new BrazilStoredMethodDetailsScreenContract$OutputData.EditAlias(aVar3.f264787a, aVar3.f264788b));
                }
                break;
        }
        return Unit.f186387a;
    }
}
