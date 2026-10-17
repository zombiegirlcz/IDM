package qba;

import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qa9.r;
import vkm.j2;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixQrCodeTransactionAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixQrCodeTransactionAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) pixQrCodeTransactionAmountScreen.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar = (n) pixQrCodeTransactionAmountScreen.R2();
                y yVar = nVar.f244170r;
                dj0.d dVar = ((h) ((j2) yVar.f22677a).getValue()).f244154a;
                j2 j2Var = (j2) yVar.f22677a;
                nVar.C2(new i(dVar, ((h) j2Var.getValue()).d, ((h) j2Var.getValue()).f244155b, ((h) j2Var.getValue()).i));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar2 = (n) pixQrCodeTransactionAmountScreen.R2();
                zof.f fVar = nVar2.f244169q;
                List listC = u.c(jli.c.PERIOD_SELECTION_NONE);
                y yVar2 = nVar2.f244170r;
                yji.l.g2(nVar2, ((qpf.h) fVar).d(new ScheduleTransferInputData((TextLocalisedClause) null, ((h) ((j2) yVar2.f22677a).getValue()).i, m1l.a.SCHEDULE_ENABLED, (TextLocalisedClause) null, listC, false, (AnalyticsContext) null, (LocalDate) null, ((h) ((j2) yVar2.f22677a).getValue()).f244157g, false, false, false, 7657)), null, new r(nVar2, 8), 1);
                break;
        }
        return Unit.f186387a;
    }
}
