package sa0;

import com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BaseFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BaseFormController baseFormController, Continuation continuation) {
        super(2, continuation);
        this.v = baseFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVarH3 = this.v.h3();
        Intrinsics.h(model);
        aVarH3.T(model);
        return Unit.f186387a;
    }
}
