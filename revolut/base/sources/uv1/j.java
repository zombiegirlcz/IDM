package uv1;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.feature.apm.breb.impl.ui.area.BrebAreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrebAreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BrebAreaScreen brebAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brebAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((HeaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HeaderDelegate.Model model = (HeaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVarE3 = this.v.d();
        Intrinsics.h(model);
        d0 d0Var = (d0) wVarE3;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52397a, "BREB_KEY_HEADER_ID")) {
            d0Var.C2(n.f283282a);
        }
        return Unit.f186387a;
    }
}
