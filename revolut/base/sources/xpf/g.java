package xpf;

import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ScheduleTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ScheduleTransferScreen scheduleTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = scheduleTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScheduleTransferScreen scheduleTransferScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) scheduleTransferScreen.T2();
                TransferScheduleData transferScheduleDataA = ((a) hVar.t2()).f307958a;
                l80.f fVar = (l80.f) hVar.f307968s;
                if (n1l.b.d(transferScheduleDataA, fVar.f()) && transferScheduleDataA.f104285a == 0) {
                    transferScheduleDataA = TransferScheduleData.a(transferScheduleDataA, ebm.a.P(fVar.e()), null, null, 6);
                }
                hVar.v2(new dpf.b(transferScheduleDataA));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) scheduleTransferScreen.T2()).v2(dpf.a.f116875a);
                break;
        }
        return Unit.f186387a;
    }
}
