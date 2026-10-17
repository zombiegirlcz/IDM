package yw9;

import ew9.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w wVar, Continuation continuation) {
        super(1, continuation);
        this.v = wVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        w wVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            cpg.a aVar2 = wVar.f317386s;
            String str = ((e) ((j2) wVar.f317387t.f22677a).getValue()).f317355a;
            this.u = 1;
            if (aVar2.d(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        wVar.C2(c.a.C0759a.f130114a);
        return Unit.f186387a;
    }
}
