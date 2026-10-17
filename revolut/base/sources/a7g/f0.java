package a7g;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.search_results.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            i4g.b bVar2 = bVar.f93425s;
            this.u = 1;
            bVar2.f158423b.setValue(null);
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        bVar.I2(null, ((r) ((j2) bVar.f93427w.f22677a).getValue()).f1895g);
        return Unit.f186387a;
    }
}
