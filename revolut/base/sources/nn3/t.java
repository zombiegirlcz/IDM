package nn3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ContactsChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ContactsChooserScreen contactsChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = contactsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.contacts_chooser.impl.ui.a) this.v.R2()).J2(new fn3.c(model.f53228a, model.u));
        return Unit.f186387a;
    }
}
