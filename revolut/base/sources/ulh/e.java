package ulh;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f281005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f281006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281006x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f281006x, continuation, 0);
                eVar.f281005w = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f281006x, continuation, 1);
                eVar2.f281005w = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f281005w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    ne0.j jVar = (ne0.j) this.f281006x.f281021b.get();
                    n.Companion.getClass();
                    LocalDate localDate = (LocalDate) jVar.get(n.f);
                    od0.i.Companion.getClass();
                    Data dataP = zi0.c.P(od0.h.a(localDate), localDate == null, null, 2);
                    this.f281005w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f281005w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ne0.j jVar2 = (ne0.j) this.f281006x.f281021b.get();
                    n.Companion.getClass();
                    od0.i iVar = (od0.i) jVar2.get(n.f281017g);
                    Data dataP2 = zi0.c.P(iVar, iVar == null, null, 2);
                    this.f281005w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
