package yuc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreen;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LinkedWalletsTabRevampScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LinkedWalletsTabRevampScreen linkedWalletsTabRevampScreen, Continuation continuation) {
        super(2, continuation);
        this.v = linkedWalletsTabRevampScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarD3 = this.v.d();
        Intrinsics.h(model);
        u uVar = (u) nVarD3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Continuation continuation = null;
        f0 f0Var = obj3 instanceof f0 ? (f0) obj3 : null;
        if (Intrinsics.f(model.f53228a, "ADD_TO_CLICK_TO_PAY") && f0Var != null) {
            uVar.n2(new yg6.v(uVar, f0Var, continuation, 29), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
