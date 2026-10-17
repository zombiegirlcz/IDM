package lm3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactContract$ModalStep;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddContactScreen addContactScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar2 = (com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) bVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        y80.a aVar3 = aVar2.v;
        if (aVar3.c("android.permission.READ_CONTACTS") && aVar3.c("android.permission.WRITE_CONTACTS")) {
            String str = model.f53228a;
            if (Intrinsics.f(str, "ITEM_ID_SAVE_TO_PHONEBOOK")) {
                aVar2.H2(aVar2.f66025x, new llb.e(6));
            } else {
                hx7.e.h(new IllegalStateException(p.a.p("Unrecognized switch item id '", str, "'")));
            }
        } else {
            oki.h.v2(aVar2.f66026y, AddContactContract$ModalStep.ContactsPermissions.f66017a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
        }
        return Unit.f186387a;
    }
}
