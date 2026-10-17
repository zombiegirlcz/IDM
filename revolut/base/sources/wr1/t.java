package wr1;

import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            io3.d dVar = ((g) ((j2) uVar.f299511t.f22677a).getValue()).f.f282231b;
            tr1.f fVar = uVar.f299510s;
            String str = dVar.f163145a;
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
        return yji.l.i2(uVar, uVar.f299508q.a((CurrencyChooserFlowDestination.InputData) obj2), null, new wpj.b(uVar, 4), 1);
    }
}
