package jy6;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceRemindersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InvoiceRemindersScreen invoiceRemindersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceRemindersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f53304a;
        mVarE3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_INVOICE_REMINDERS_DEFAULT")) {
            mVarE3.H2(mVarE3.f179348q, new jxb.g(23));
        }
        return Unit.f186387a;
    }
}
