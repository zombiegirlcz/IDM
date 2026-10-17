package a3i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature_exchange.impl.ui.order_details_kompot.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChargeBreakdown f1161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1162x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar, ChargeBreakdown chargeBreakdown, String str, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f1161w = chargeBreakdown;
        this.f1162x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.v, this.f1161w, this.f1162x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        String str = this.f1162x;
        com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar = this.v;
        t tVar = new t(0, str, bVar, this.f1161w, (Continuation) null);
        this.u = 1;
        Object objP2 = bVar.p2(this, tVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
