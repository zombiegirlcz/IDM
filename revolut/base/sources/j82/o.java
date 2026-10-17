package j82;

import j82.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, Continuation continuation) {
        super(1, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s sVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            zq.a aVar2 = sVar.f172100p;
            Object content = ((i) ((j2) sVar.f172101q.f22677a).getValue()).f172090a.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.u = 1;
            if (aVar2.g((h02.c) content, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        sVar.C2(j.a.f172091a);
        return Unit.f186387a;
    }
}
