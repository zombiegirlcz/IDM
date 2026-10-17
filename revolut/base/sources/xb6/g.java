package xb6;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.api.interactor.CharitiesCollectionsInteractor$CollectionNotFoundException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import xb6.e;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = data.getError() instanceof CharitiesCollectionsInteractor$CollectionNotFoundException;
        h hVar = this.v;
        if (z) {
            hVar.v2(e.a.f304002a);
        }
        hVar.x2(new x16.h(data, 17));
        return Unit.f186387a;
    }
}
