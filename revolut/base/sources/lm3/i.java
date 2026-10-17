package lm3;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AddContactScreen addContactScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PhoneEditorDelegate.PhoneData model = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar2 = (com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) bVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52895a;
        if (Intrinsics.f(str, "ITEM_ID_PHONE")) {
            aVar2.H2(aVar2.f66025x, new lk4.g(model, 10));
        } else {
            hx7.e.h(new IllegalStateException(p.a.p("Unrecognized phone item id '", str, "'")));
        }
        return Unit.f186387a;
    }
}
