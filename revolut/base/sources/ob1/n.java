package ob1;

import com.revolut.feature.acquiring.card_reader.order.api.model.CardReaderOrderProductDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lfg.d0;
import ob1.g;
import vkm.q;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0Var = new d0(nz8.d.j(rd0.e.b(xa1.a.a(oVar.f223857p, null, 3)), null, 3), 26);
            this.u = 1;
            obj2 = q.z(d0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((CardReaderOrderProductDetails) obj2) == null) {
            return Unit.f186387a;
        }
        oVar.v2(g.a.f223850a);
        return Unit.f186387a;
    }
}
