package yyi;

import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SchemeAirportLoungesFooter.Action f317945w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a aVar, SchemeAirportLoungesFooter.Action action, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f317945w = action;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f317945w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            xyi.b bVar = this.v.o;
            this.u = 1;
            if (bVar.Z2(this.f317945w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
