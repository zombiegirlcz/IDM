package ke2;

import com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ SwishRegistrationStatus f182964w;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        p pVar = new p(3, (Continuation) obj4);
        pVar.v = (FlowCollector) obj2;
        pVar.f182964w = (SwishRegistrationStatus) obj3;
        return pVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        SwishRegistrationStatus swishRegistrationStatus = this.f182964w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = null;
            this.f182964w = swishRegistrationStatus;
            this.u = 1;
            if (flowCollector.emit(swishRegistrationStatus, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Boolean.valueOf(Intrinsics.f(swishRegistrationStatus, SwishRegistrationStatus.Pending.f62904a));
    }
}
