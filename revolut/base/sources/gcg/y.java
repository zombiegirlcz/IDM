package gcg;

import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.v, continuation);
        yVar.u = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((HotelsProperty) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HotelsProperty hotelsProperty = (HotelsProperty) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(hotelsProperty);
        this.v.C2(new q(new HotelsPropertyInputData.BookableProperty(hotelsProperty, null, null, null, null, 30)));
        return Unit.f186387a;
    }
}
