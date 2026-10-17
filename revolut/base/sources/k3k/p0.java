package k3k;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.api.R$string;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ t0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(t0 t0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = t0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p0(this.v, continuation, 0);
            case 1:
                return new p0(this.v, continuation, 1);
            default:
                return new p0(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        t0 t0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                RemittanceTransferData transferData = t0Var.A2();
                zof.f fVar = t0Var.f180798x;
                t0Var.f180794r.getClass();
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                TransferScheduleData transferScheduleData = transferData.i;
                m1l.a aVar2 = transferData.f102053h;
                yji.l.g2(t0Var, ((qpf.h) fVar).d(new ScheduleTransferInputData((TextLocalisedClause) null, transferScheduleData, aVar2, aVar2 == m1l.a.SCHEDULE_REQUIRED ? new TextLocalisedClause(R.string.common_action_continue, null, null, 14) : new TextLocalisedClause(R$string.payments_transfer_schedule_action_set_schedule, null, null, 14), (List) null, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 8177)), null, new k1.a(t0Var, transferData, 10), 1);
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0Var.v2(new y(t0Var.A2()));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0Var.v2(new y(t0Var.A2()));
                break;
        }
        return Unit.f186387a;
    }
}
