package gh1;

import gh1.l;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar = this.v;
                k7i.i iVar2 = iVar.o;
                String cardId = ((k) ((j2) iVar.f143823s.f22677a).getValue()).f143825b.f65544a;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                int i = 0;
                return yji.l.a1(iVar, q.q(rd0.e.b(nim.a.w(((x) ((l93.f) iVar2.f182069b)).v(cardId), new kw2.a(iVar2, i)))), null, null, new f(iVar, null, i), 3);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVar = i.Companion;
                i iVar3 = this.v;
                ((x) ((l93.f) iVar3.o.f182069b)).f.e();
                iVar3.C2(l.a.f143827a);
                return Unit.f186387a;
        }
    }
}
