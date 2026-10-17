package q22;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.ApmNewContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ ApmNewContactScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ApmNewContactScreen apmNewContactScreen, Continuation continuation) {
        super(2, continuation);
        this.u = apmNewContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.u.R2();
        y yVar = aVar2.u;
        if (((a) ((j2) yVar.f22677a).getValue()).i) {
            aVar2.H2(yVar, new q09.a(23));
        } else {
            ((pn3.b) aVar2.f62354s).c(aVar2, new l(aVar2, 0));
        }
        return Unit.f186387a;
    }
}
