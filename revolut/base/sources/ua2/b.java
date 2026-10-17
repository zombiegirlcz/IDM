package ua2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.payid.impl.screen.send.contacts.ContactsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ContactsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ContactsScreen contactsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = contactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f53228a, "LIST_ID_NEW_CONTACT");
        ContactsScreen contactsScreen = this.v;
        if (zF) {
            ((t) contactsScreen.R2()).I2(j.f278525a);
        } else {
            Object obj3 = model.u;
            if (obj3 instanceof zm3.a) {
                ((t) contactsScreen.R2()).I2(new i((zm3.a) obj3));
            } else if (obj3 instanceof f5j.a) {
                ((t) contactsScreen.R2()).I2(new h((f5j.a) obj3));
            }
        }
        return Unit.f186387a;
    }
}
