package anh;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0VarB = oih.j.b(oVar.f7793l);
            this.u = 1;
            obj2 = nim.a.b(d0VarB, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        af4.e eVar = new af4.e((NaviCommand) obj2, oVar, null, 29);
        p0 p0Var = p0.f264001a;
        tkm.e eVar2 = zkm.o.f323119a.e;
        this.u = 2;
        Object objJ = e0.J(eVar2, eVar, this);
        return objJ == aVar ? aVar : objJ;
    }
}
