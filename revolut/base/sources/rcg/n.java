package rcg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ q u;
    public final /* synthetic */ HotelsProperty v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, HotelsProperty hotelsProperty, Continuation continuation) {
        super(1, continuation);
        this.u = qVar;
        this.v = hotelsProperty;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.C2(new i(this.v));
        return Unit.f186387a;
    }
}
