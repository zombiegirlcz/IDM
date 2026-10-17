package z67;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.giro.api.navigation.GiroCreationFlowInputData;
import com.revolut.feature.giro.impl.ui.GiroFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.giro.impl.ui.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.giro.impl.ui.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.giro.impl.ui.a aVar2 = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                im1.a aVar3 = aVar2.f74537p;
                String str = ((GiroCreationFlowInputData.WithCreditor) aVar2.o).f74530a;
                this.u = 1;
                obj2 = aVar3.a(str, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            h.t2(aVar2, aVar2.f74540s, new GiroFlowContract$Step.Form((Biller) obj2), true, null, false, 12);
        } catch (Exception unused) {
            h.D2(aVar2.f74540s);
        }
        return Unit.f186387a;
    }
}
