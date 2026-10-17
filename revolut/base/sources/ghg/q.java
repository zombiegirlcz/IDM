package ghg;

import com.revolut.data.model.Data;
import g4c.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c f143922w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f143922w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f143922w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f143922w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar = this.f143922w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.f94293t, new t(data, 29));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.f94293t, new r(data2, 0));
                break;
        }
        return Unit.f186387a;
    }
}
