package bpe;

import bpe.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k kVar = this.v;
        if (i == 0) {
            o.b(obj2);
            cne.a aVar = kVar.f17618p;
            dne.a aVar2 = ((d) ((j2) kVar.f17619q.f22677a).getValue()).f17611a;
            this.u = 1;
            ape.c cVar = ((yoe.c) aVar).f315670b;
            cVar.getClass();
            ape.b bVar = new ape.b(aVar2, cVar, null);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, bVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        kVar.C2(e.b.f17613a);
        return Unit.f186387a;
    }
}
