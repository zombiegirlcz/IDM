package lm3;

import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactContract$ModalStep;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AddContactScreen addContactScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddContactScreen addContactScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                addContactScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar3 = (com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) addContactScreen.R2();
                a aVar4 = (a) ((j2) aVar3.f66025x.f22677a).getValue();
                aVar3.l2(new ll6.i(aVar3, aVar4, null, 10), new j(aVar3, 0));
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) addContactScreen.R2()).f66026y, AddContactContract$ModalStep.ShowCountryCodePicker.f66018a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                break;
        }
        return Unit.f186387a;
    }
}
