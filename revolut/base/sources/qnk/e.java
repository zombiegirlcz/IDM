package qnk;

import ffk.e0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pe2.l;
import pfk.t0;
import qnk.d;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        g gVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e0 e0Var = gVar.f247963p;
            this.u = 1;
            t0 t0Var = e0Var.f134827a;
            t0Var.getClass();
            l lVar = new l(t0Var, continuation, 5);
            p0 p0Var = p0.f264001a;
            Object objJ = skm.e0.J(elm.f.f127540b, lVar, this);
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
        j2 j2Var = gVar.o.f271575a;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() + 60000);
        j2Var.getClass();
        j2Var.g(null, lValueOf);
        gVar.C2(d.a.f247961a);
        return Unit.f186387a;
    }
}
