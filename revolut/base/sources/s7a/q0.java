package s7a;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class q0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.picker.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.revolut.feature.picker.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q0 q0Var = new q0(this.v, continuation);
        q0Var.u = obj2;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.picker.a aVar2 = this.v;
        x7a.d dVar = aVar2.o;
        cli.y yVar = aVar2.f80350r;
        Set set = ((r) ((j2) yVar.f22677a).getValue()).f260628c;
        x xVar = aVar2.f80348p;
        aVar2.H2(yVar, new s06.e(data, 5, dVar.d(data, set, xVar.e, ((r) ((j2) yVar.f22677a).getValue()).d, xVar.f260648b), aVar2));
        if (xVar.f260650g) {
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            if (!((r) j2Var.getValue()).f && ((r) j2Var2.getValue()).f260627b.size() == ((r) j2Var2.getValue()).f260628c.size()) {
                aVar2.H2(yVar, new m0(0, zhm.d0.h1(((r) j2Var2.getValue()).f260628c)));
            }
        }
        return Unit.f186387a;
    }
}
