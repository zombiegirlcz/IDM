package uy6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.screen.InvoiceSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InvoiceSettingsScreen invoiceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.v.P.getValue();
        String listId = model.f53228a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1788739183:
                if (listId.equals("LIST_ID_CUSTOMISATION_TEMPLATES")) {
                    pVar.C2(l.f284088a);
                }
                break;
            case -1708811809:
                if (listId.equals("LIST_ID_GENERAL_PAYMENT_METHODS")) {
                    pVar.C2(h.f284084a);
                }
                break;
            case -920289804:
                if (listId.equals("LIST_ID_CUSTOMISATION_EMAIL")) {
                    pVar.C2(f.f284082a);
                }
                break;
            case -796773463:
                if (listId.equals("LIST_ID_GENERAL_PAYMENT_SCHEDULES")) {
                    pVar.C2(i.f284085a);
                }
                break;
            case -473959289:
                if (listId.equals("LIST_ID_NOTIFICATIONS_REMINDERS")) {
                    pVar.C2(k.f284087a);
                }
                break;
            case -162155568:
                if (listId.equals("LIST_ID_CUSTOMISATION_PAYMENT_PAGE")) {
                    pVar.C2(e.f284081a);
                }
                break;
            case 607375143:
                if (listId.equals("LIST_ID_GENERAL_RECURRING_PAYMENT_SCHEDULES")) {
                    pVar.C2(j.f284086a);
                }
                break;
            case 1153758207:
                if (listId.equals("LIST_ID_GENERAL_NUMBERING")) {
                    pVar.C2(g.f284083a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
