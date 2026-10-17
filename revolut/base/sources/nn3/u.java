package nn3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserContract$ModalStep;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nme.c0;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ContactsChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ContactsChooserScreen contactsChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = contactsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model it8 = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVarE3 = this.v.R2();
        Intrinsics.h(it8);
        com.revolut.feature.contacts_chooser.impl.ui.a aVar2 = (com.revolut.feature.contacts_chooser.impl.ui.a) eVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(it8, "it");
        String str = it8.f53228a;
        if (Intrinsics.f(str, "ADD_NEW_CONTACT_BUTTON_ID")) {
            oki.h.v2(aVar2.f66094x, ContactsChooserContract$ModalStep.AddNewContact.f66085a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        } else if (Intrinsics.f(str, "SEARCH_FOR_REVTAG_BUTTON_ID")) {
            aVar2.H2(aVar2.A, new c0(20));
        }
        j60.a.v(aVar2.u, false, null, 3);
        return Unit.f186387a;
    }
}
