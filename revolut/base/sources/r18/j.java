package r18;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
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
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m mVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarB = oih.j.b(mVar.f250922n);
            this.u = 1;
            obj2 = nim.a.b(d0VarB, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        qp7.g gVar = new qp7.g(mVar, (NaviCommand) obj2, null, 23);
        p0 p0Var = p0.f264001a;
        tkm.e eVar = zkm.o.f323119a.e;
        this.u = 2;
        Object objJ = e0.J(eVar, gVar, this);
        return objJ == aVar ? aVar : objJ;
    }
}
