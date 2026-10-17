package as1;

import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ io3.d f8782w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, io3.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = a0Var;
        this.f8782w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.v, this.f8782w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        a0 a0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            tr1.f fVar = a0Var.v;
            io3.d dVar = this.f8782w;
            String str = dVar != null ? dVar.f163145a : null;
            this.u = 1;
            obj2 = fVar.c(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return yji.l.i2(a0Var, a0Var.f8757s.a((CurrencyChooserFlowDestination.InputData) obj2), null, new p(a0Var, 1), 1);
    }
}
