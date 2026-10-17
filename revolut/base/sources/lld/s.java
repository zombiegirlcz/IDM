package lld;

import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistData;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f196731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SlotChecklistPayload f196732x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(SlotChecklistPayload slotChecklistPayload, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196732x = slotChecklistPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f196732x, continuation, 0);
                sVar.f196731w = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.f196732x, continuation, 1);
                sVar2.f196731w = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f196731w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(((SlotChecklistData) this.f196732x).f87294a, false, null, 3);
                    this.f196731w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f196731w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Data data = new Data(((SlotChecklistData) this.f196732x).f87294a, null, false, 6, null);
                    this.f196731w = null;
                    this.v = 1;
                    if (flowCollector2.emit(data, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
