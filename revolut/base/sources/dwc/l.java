package dwc;

import a09.z;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yhm.r;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar = (r) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Data data = (Data) rVar.f314201a;
        Data data2 = (Data) rVar.f314202b;
        boolean zBooleanValue = ((Boolean) rVar.f314203c).booleanValue();
        com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar2 = this.v;
        aVar2.H2(aVar2.f85732w, new z(data, data2, zBooleanValue, 19));
        return Unit.f186387a;
    }
}
