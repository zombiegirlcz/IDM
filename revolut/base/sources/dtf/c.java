package dtf;

import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreen;
import com.revolut.feature.transfer_reasons.models.reason.TransferReason;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferReasonsAmountAllocationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferReasonsAmountAllocationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) ((g) transferReasonsAmountAllocationScreen.O.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) ((g) transferReasonsAmountAllocationScreen.O.getValue());
                Map map = ((e) ((j2) iVar.f117451q.f22677a).getValue()).f117444a;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    TransferReasonNode transferReasonNode = (TransferReasonNode) entry.getKey();
                    arrayList.add(new TransferReason((dj0.d) entry.getValue(), transferReasonNode.getF92432a(), transferReasonNode.getF92434c()));
                }
                iVar.C2(new f(arrayList));
                break;
        }
        return Unit.f186387a;
    }
}
