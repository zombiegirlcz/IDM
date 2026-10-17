package nn3;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.contacts_chooser.api.context.ContextAction;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ContactsChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ContactsChooserScreen contactsChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = contactsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ip0.y yVar = (ip0.y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVarE3 = this.v.R2();
        ActionsView.Item action = yVar.f167226b;
        com.revolut.feature.contacts_chooser.impl.ui.a aVar2 = (com.revolut.feature.contacts_chooser.impl.ui.a) eVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj3 = action.f58324n;
        if (obj3 instanceof ContextAction) {
            aVar2.v.b3((ContextAction) obj3);
        } else {
            aVar2.H2(aVar2.A, new nj8.b(aVar2, action.f58316a));
            aVar2.f66095y.onNext(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
