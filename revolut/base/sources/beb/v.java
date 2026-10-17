package beb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xdb.y f14757w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar, xdb.y yVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f14757w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, this.f14757w, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar2 = this.v;
        aVar2.H2(aVar2.f82839s, new u(data, this.f14757w, 0));
        return Unit.f186387a;
    }
}
