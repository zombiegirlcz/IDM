package g8c;

import g8c.f;
import k3k.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import q7c.q;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        l lVar = this.v;
        if (i == 0) {
            o.b(obj2);
            q qVar = lVar.f141348p;
            String str = ((e) ((j2) lVar.f141349q.f22677a).getValue()).f141342a;
            this.u = 1;
            k7c.b bVar = qVar.d;
            bVar.getClass();
            q0 q0Var = new q0(bVar, str, null, 20);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, q0Var, this);
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
        lVar.C2(f.b.f141344a);
        return Unit.f186387a;
    }
}
