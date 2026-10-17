package lm3;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AddContactScreen addContactScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData model = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar2 = (com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) bVarE3;
        y yVar = aVar2.f66025x;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52597a;
        String string = model.f52598b.toString();
        if (Intrinsics.f(str, "ITEM_ID_NAME")) {
            aVar2.H2(yVar, new l3d.a(string, 21));
        } else if (Intrinsics.f(str, "ITEM_ID_EMAIL")) {
            aVar2.H2(yVar, new l3d.a(string, 22));
        } else {
            hx7.e.h(new IllegalStateException(p.a.p("Unrecognized text item id '", str, "'")));
        }
        return Unit.f186387a;
    }
}
