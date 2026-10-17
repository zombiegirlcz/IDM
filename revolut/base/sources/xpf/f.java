package xpf;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.api.R$string;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import gim.i;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import xng.l;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ScheduleTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ScheduleTransferScreen scheduleTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = scheduleTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = model.f instanceof jli.c;
        int i = 2;
        ScheduleTransferScreen scheduleTransferScreen = this.v;
        if (z) {
            b bVarT2 = scheduleTransferScreen.T2();
            Object obj3 = model.f;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.ktx.PaymentPeriod");
            jli.c period = (jli.c) obj3;
            h hVar = (h) bVarT2;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(period, "period");
            hVar.x2(new xpe.c(hVar, period, i));
            j60.a.v(hVar.f307966q, true, null, 2);
        } else {
            b bVarT22 = scheduleTransferScreen.T2();
            String listId = model.f53324a;
            h hVar2 = (h) bVarT22;
            j60.a aVar2 = hVar2.f307966q;
            Intrinsics.checkNotNullParameter(listId, "listId");
            if (Intrinsics.f(listId, "BOTTOM_ENDS_ON_NEVER_FIELD_ID")) {
                hVar2.x2(new l(hVar2, 11));
                j60.a.v(aVar2, true, null, 2);
            } else if (Intrinsics.f(listId, "BOTTOM_ENDS_ON_DATE_FIELD_ID")) {
                LocalDate localDateA = n1l.b.a(((a) hVar2.t2()).f307958a, ((l80.f) hVar2.f307968s).f());
                TransferScheduleEndsOn transferScheduleEndsOn = ((a) hVar2.t2()).f307958a.f104287c;
                LocalDateTime localDateTimeOfInstant = transferScheduleEndsOn instanceof TransferScheduleEndsOn.Date ? LocalDateTime.ofInstant(Instant.ofEpochMilli(((TransferScheduleEndsOn.Date) transferScheduleEndsOn).f104288a), ZoneId.systemDefault()) : localDateA.atTime(0, 0);
                zpf.b bVar = hVar2.f307967r;
                Intrinsics.h(localDateTimeOfInstant);
                aVar2.A(new y(((zpf.e) bVar).b(localDateTimeOfInstant, localDateA, null, "DATE_PICKER_END_DATE_FIELD_ID"), new t(new TextLocalisedClause(R$string.transfer_schedule_ends_on_option_end_date, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
            }
        }
        return Unit.f186387a;
    }
}
