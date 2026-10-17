package oy6;

import com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.InvoiceRecurringSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvoiceRecurringSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invoiceRecurringSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) invoiceRecurringSettingsScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar3 = (com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) invoiceRecurringSettingsScreen.d();
                f fVar = (f) ((j2) aVar3.f73936r.f22677a).getValue();
                if (fVar.c()) {
                    aVar3.n2(new osk.m(aVar3, fVar, null, 12), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
