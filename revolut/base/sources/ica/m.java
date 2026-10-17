package ica;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        n nVar = this.v;
        if (i == 0) {
            o.b(obj2);
            al6.c cVar = new al6.c(19);
            an1.d dVar = new an1.d(nVar, 28);
            l lVar = new l(nVar, null, 1);
            this.u = 1;
            obj2 = n14.k.P(nVar.X(), null, cVar, dVar, lVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (eVar instanceof nii.d) {
            nVar.C2(new h((String) ((nii.d) eVar).f216133a));
        }
        return Unit.f186387a;
    }
}
