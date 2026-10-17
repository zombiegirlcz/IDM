package fy6;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoicePaymentScheduleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InvoicePaymentScheduleScreen invoicePaymentScheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoicePaymentScheduleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        Intrinsics.h(textData);
        com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) oVarE3;
        y yVar = cVar.v;
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        if (Intrinsics.f(str, "LIST_ID_LIMITS_INPUT_TEXT_AFTER")) {
            cVar.H2(yVar, new ak8.i(textData, 5));
        } else if (Intrinsics.f(str, "LIST_ID_RECURRING_PERIOD_INPUT_TEXT_INTERVAL")) {
            cVar.H2(yVar, new ak8.i(textData, 6));
        }
        return Unit.f186387a;
    }
}
