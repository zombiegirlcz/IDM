package q22;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.ApmNewContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pig.y;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmNewContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ApmNewContactScreen apmNewContactScreen, Continuation continuation) {
        super(2, continuation);
        this.v = apmNewContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PhoneEditorDelegate.PhoneData phoneData = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.R2();
        String text = phoneData.f52896b;
        com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) cVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        aVar2.H2(aVar2.u, new y(text, 14));
        return Unit.f186387a;
    }
}
