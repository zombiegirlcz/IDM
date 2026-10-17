package nn3;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ ContactsChooserScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ContactsChooserScreen contactsChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.u = contactsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.contacts_chooser.impl.ui.a aVar2 = (com.revolut.feature.contacts_chooser.impl.ui.a) this.u.R2();
        ContactsChooserBannerContent contactsChooserBannerContent = ((c) ((j2) aVar2.A.f22677a).getValue()).f217443j;
        if (contactsChooserBannerContent != null) {
            aVar2.C1(new BridgeDestination(contactsChooserBannerContent.f66044c));
        }
        return Unit.f186387a;
    }
}
