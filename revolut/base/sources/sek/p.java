package sek;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import sek.k;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        r rVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            List list = (List) ((i) ((j2) rVar.f262221r.f22677a).getValue()).f262206a.getContent();
            if (list == null) {
                list = f0.f322471a;
            }
            iek.k kVar = new iek.k(rVar.f262220q, 1);
            ack.n nVar = new ack.n(19);
            o oVar = new o(rVar, list, null, 1);
            this.u = 1;
            obj2 = n14.k.Q(rVar, null, kVar, nVar, oVar, this, 1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((nii.e) obj2) instanceof nii.d) {
            rVar.C2(k.c.f262211a);
        }
        return Unit.f186387a;
    }
}
