package lb0;

import aa0.x0;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FormController formController, Continuation continuation) {
        super(2, continuation);
        this.v = formController;
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
        PhoneEditorDelegate.PhoneData data = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(data);
        com.revolut.core.backend_flow.impl.ui.form_screen.a aVar2 = (com.revolut.core.backend_flow.impl.ui.form_screen.a) qVarK3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        aVar2.S2(new x0(data.f52896b), data.f52895a);
        return Unit.f186387a;
    }
}
