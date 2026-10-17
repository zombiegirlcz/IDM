package yb2;

import com.revolut.data.model.Data;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f312168w;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        o oVar = new o(3, (Continuation) obj4);
        oVar.v = (FlowCollector) obj2;
        oVar.f312168w = (Data) obj3;
        return oVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.topup_screen.api.model.b bVar;
        FlowCollector flowCollector = this.v;
        Data data = this.f312168w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (data.getLoading() && data.getError() == null) {
                return Boolean.TRUE;
            }
            this.v = null;
            this.f312168w = data;
            this.u = 1;
            if (flowCollector.emit(data, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        StoredMethod storedMethod = (StoredMethod) data.getContent();
        StoredMethod.Mandate mandate = storedMethod != null ? storedMethod.f : null;
        StoredMethod.Mandate.PayTo payTo = mandate instanceof StoredMethod.Mandate.PayTo ? (StoredMethod.Mandate.PayTo) mandate : null;
        if (payTo == null || (bVar = payTo.d) == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(bVar == com.revolut.feature.topup_screen.api.model.b.INIT);
    }
}
