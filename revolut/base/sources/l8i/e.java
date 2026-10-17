package l8i;

import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ty0.a aVar = (ty0.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = aVar.d;
        Limit.UsageLimit usageLimit = obj3 instanceof Limit.UsageLimit ? (Limit.UsageLimit) obj3 : null;
        if (usageLimit != null) {
            this.v.d.Z2(usageLimit);
        } else {
            Object obj4 = aVar.d;
            hx7.e.n(new IllegalArgumentException(j6.a.q("Expected parcel of type Limit.UsageLimit but got ", obj4 != null ? obj4.getClass().getName() : null)));
        }
        return Unit.f186387a;
    }
}
