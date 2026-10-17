package chg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ j u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, RowDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.u = jVar;
        this.v = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = this.v.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.miles.api.model.TravelMilesAirline");
        this.u.C2(new f((TravelMilesAirline) obj3));
        return Unit.f186387a;
    }
}
