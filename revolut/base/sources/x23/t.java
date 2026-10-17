package x23;

import aqd.n1;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c f302496w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302496w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f302496w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(this.f302496w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
            default:
                t tVar3 = new t(this.f302496w, continuation, 2);
                tVar3.v = obj2;
                return tVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar = this.f302496w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                od0.i iVar = (od0.i) data.getContent();
                e93.n nVar = iVar != null ? (e93.n) iVar.f224257a : null;
                if (nVar != null) {
                    cVar.H2(cVar.f65179y, new x0b.c(nVar, 11));
                }
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.f65179y, new x16.h(data2, 8));
                break;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.f65179y, new n1(29, bool));
                break;
        }
        return Unit.f186387a;
    }
}
