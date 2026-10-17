package eh9;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountScreen;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PaymentAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(PaymentAmountScreen paymentAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = paymentAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.v, continuation, 0);
            case 1:
                return new n(this.v, continuation, 1);
            default:
                return new n(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentAmountScreen paymentAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) paymentAmountScreen.d();
                zVar.u.Q();
                if (zVar.z.getF78770h()) {
                    zVar.l2(new u(zVar, null, 3), new dkm.a(1, zVar, z.class, "handleTransferError", "handleTransferError(Ljava/lang/Throwable;)Z", 0, 27));
                } else {
                    zVar.l2(new u(zVar, null, 0), new yi5.b(26));
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar2 = (z) paymentAmountScreen.d();
                zof.f fVar = zVar2.f125810x;
                qpf.h hVar = (qpf.h) fVar;
                yji.l.g2(zVar2, hVar.d(new ScheduleTransferInputData((TextLocalisedClause) null, ((a) ((j2) zVar2.A.f22677a).getValue()).e, m1l.a.SCHEDULE_ENABLED, (TextLocalisedClause) null, (List) null, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, zVar2.z.getF78769g(), 4089)), null, new r(zVar2, 2), 1);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar3 = (z) paymentAmountScreen.d();
                zVar3.u.Q();
                zVar3.C2(c.f125773a);
                break;
        }
        return Unit.f186387a;
    }
}
