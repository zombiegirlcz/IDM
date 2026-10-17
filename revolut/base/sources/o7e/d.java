package o7e;

import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreen;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlow;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import ip0.um0;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nya.i0;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BillAccountDetailScreen f222770w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BillAccountDetailScreen billAccountDetailScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f222770w = billAccountDetailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f222770w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f222770w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BillAccountDetailScreen billAccountDetailScreen = this.f222770w;
        switch (i) {
            case 0:
                y yVar = (y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarI3 = billAccountDetailScreen.T2();
                String actionId = yVar.f167225a;
                k kVar = (k) hVarI3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                yji.l.i2(kVar, new BillsEditFlow(new BillsEditFlowContract$InputData(kVar.f222780r.f89002a)), ModalDestination.Style.POPUP.f98311a, null, 2);
                break;
            default:
                um0 um0Var = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarI32 = billAccountDetailScreen.T2();
                Object obj3 = um0Var.d;
                k kVar2 = (k) hVarI32;
                j60.a.v(kVar2.f222782t, false, null, 3);
                if (obj3 instanceof k6e.f) {
                    kVar2.l2(new i0(kVar2, obj3, null, 13), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
