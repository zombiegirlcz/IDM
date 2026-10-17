package zx6;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings.InvoiceGeneralSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zuj.x;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceGeneralSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceGeneralSettingsScreen;
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
        i iVarE3 = this.v.d();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        o oVar = (o) iVarE3;
        y yVar = oVar.f326064t;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "LIST_ID_INPUT_TEXT_INVOICE_PREFIX")) {
            oVar.H2(yVar, new x(text, 2));
        } else if (Intrinsics.f(listId, "LIST_ID_INPUT_TEXT_INVOICE_NUMBER")) {
            oVar.H2(yVar, new x(text, 3));
        }
        return Unit.f186387a;
    }
}
