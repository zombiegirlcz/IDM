package wx6;

import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wr1.s;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvoiceEmailMessageScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InvoiceEmailMessageScreen invoiceEmailMessageScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invoiceEmailMessageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceEmailMessageScreen invoiceEmailMessageScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                invoiceEmailMessageScreen.R2().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = invoiceEmailMessageScreen.R2();
                jVarE3.getClass();
                jVarE3.n2(new s(jVarE3, null, 11), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
