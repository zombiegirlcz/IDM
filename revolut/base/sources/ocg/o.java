package ocg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ r u;
    public final /* synthetic */ HotelsProperty v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, HotelsProperty hotelsProperty, Continuation continuation) {
        super(1, continuation);
        this.u = rVar;
        this.v = hotelsProperty;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.C2(new i(this.v));
        return Unit.f186387a;
    }
}
