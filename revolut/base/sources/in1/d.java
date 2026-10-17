package in1;

import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.boleto.impl.screen.amount.BoletoAmountScreen;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BoletoAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BoletoAmountScreen boletoAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = boletoAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BoletoAmountScreen boletoAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) boletoAmountScreen.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) boletoAmountScreen.R2();
                y yVar = sVar.f162614t;
                AccountId accountId = ((g) ((j2) yVar.f22677a).getValue()).i.f154030a;
                j2 j2Var = (j2) yVar.f22677a;
                sVar.C2(new i(((g) j2Var.getValue()).f162584a, pyd.c.H(((g) j2Var.getValue()).f162584a, sVar.o.f162590b), accountId, ((g) j2Var.getValue()).i.f154031b.f163145a));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar2 = (s) boletoAmountScreen.R2();
                zof.f fVar = sVar2.f162611q;
                List listC = u.c(jli.c.PERIOD_SELECTION_NONE);
                y yVar2 = sVar2.f162614t;
                yji.l.g2(sVar2, ((qpf.h) fVar).d(new ScheduleTransferInputData((TextLocalisedClause) null, ((g) ((j2) yVar2.f22677a).getValue()).f162588h, m1l.a.SCHEDULE_ENABLED, (TextLocalisedClause) null, listC, false, (AnalyticsContext) null, ((g) ((j2) yVar2.f22677a).getValue()).f162587g, (LocalDate) null, false, false, false, 3817)), null, new o(sVar2, 0), 1);
                break;
        }
        return Unit.f186387a;
    }
}
