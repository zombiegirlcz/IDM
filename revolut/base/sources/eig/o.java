package eig;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.main.e f126638w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f126638w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f126638w, continuation);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(1, this.f126638w, continuation);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(2, this.f126638w, continuation);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar = this.f126638w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.D, new ec6.l(data, 14));
                break;
            case 1:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data2 = (Data) hVar.f288433a;
                Data data3 = (Data) hVar.f288434b;
                eVar.H2(eVar.D, new b4c.t(data2, (Data) hVar.f288435c, data3, (Data) hVar.d, 3));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.D, new ec6.l(data4, 15));
                break;
        }
        return Unit.f186387a;
    }
}
