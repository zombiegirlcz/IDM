package zs9;

import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Continuation continuation) {
        super(1, continuation);
        this.v = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        z zVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            e eVar = zVar.f324849q;
            this.u = 1;
            obj2 = eVar.f324833b.b(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return yji.l.i2(zVar, zVar.f324851s.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.CurrencyChooser(null, null, (xi0.b) ((p) zVar.t2()).e.getContent(), (List) obj2, null, null, 51))), null, new t(zVar, 1), 1);
    }
}
