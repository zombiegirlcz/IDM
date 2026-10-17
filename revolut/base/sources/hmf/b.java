package hmf;

import hmf.a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f153724w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ cmf.f f153725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a f153726y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cmf.f fVar, a aVar, Continuation continuation) {
        super(3, continuation);
        this.f153725x = fVar;
        this.f153726y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b bVar = new b(this.f153725x, this.f153726y, (Continuation) obj4);
        bVar.v = (FlowCollector) obj2;
        bVar.f153724w = (Throwable) obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        Throwable th10 = this.f153724w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            IllegalStateException illegalStateException = new IllegalStateException("Actions flow " + this.f153725x.f25229c + " failed: " + th10, th10);
            a.C0880a c0880a = a.Companion;
            Set setJ = this.f153726y.j();
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TransactionDetailsBaseScreenBuilder", null, illegalStateException, setJ);
            zhm.f0 f0Var = zhm.f0.f322471a;
            this.v = null;
            this.f153724w = null;
            this.u = 1;
            if (flowCollector.emit(f0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
