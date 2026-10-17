package lb0;

import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(FormController formController, Continuation continuation) {
        super(2, continuation);
        this.v = formController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        ((com.revolut.core.backend_flow.impl.ui.form_screen.a) qVarK3).V0(model);
        return Unit.f186387a;
    }
}
