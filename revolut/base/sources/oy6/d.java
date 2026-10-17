package oy6;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.InvoiceRecurringSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceRecurringSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceRecurringSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(textData);
        com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) kVarE3;
        y yVar = aVar2.f73936r;
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        if (Intrinsics.f(str, "LIST_ID_LIMITS_INPUT_TEXT_AFTER")) {
            aVar2.H2(yVar, new ak8.i(textData, 18));
        } else if (Intrinsics.f(str, "LIST_ID_RECURRING_PERIOD_INPUT_TEXT_INTERVAL")) {
            aVar2.H2(yVar, new ak8.i(textData, 19));
        }
        return Unit.f186387a;
    }
}
