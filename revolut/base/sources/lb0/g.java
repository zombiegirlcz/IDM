package lb0;

import aa0.a1;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zc0.r3;
import zc0.y3;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FormController formController, Continuation continuation) {
        super(2, continuation);
        this.v = formController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.core.backend_flow.impl.ui.form_screen.a aVar2 = (com.revolut.core.backend_flow.impl.ui.form_screen.a) qVarK3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.e;
        if (obj3 instanceof r3) {
            aVar2.S2(Unit.f186387a, ((r3) obj3).f321117a);
        } else if (obj3 instanceof y3) {
            y3 y3Var = (y3) obj3;
            aVar2.S2(Boolean.valueOf(y3Var.f321176b), y3Var.f321175a);
        } else {
            String str = model.f52539a;
            aVar2.S2(new a1(str), str);
        }
        aVar2.J2();
        return Unit.f186387a;
    }
}
