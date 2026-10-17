package fad;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.invoices.impl.ui.language_selector.InvoiceLanguageSelectorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceLanguageSelectorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InvoiceLanguageSelectorScreen invoiceLanguageSelectorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceLanguageSelectorScreen;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.P.getValue();
        Object obj3 = model.u;
        gVar.getClass();
        if (obj3 instanceof u9d.b) {
            gVar.C2(new v9d.a((u9d.b) obj3));
        }
        return Unit.f186387a;
    }
}
