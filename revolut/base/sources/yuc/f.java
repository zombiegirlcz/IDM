package yuc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LinkedWalletsTabRevampScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LinkedWalletsTabRevampScreen linkedWalletsTabRevampScreen, Continuation continuation) {
        super(2, continuation);
        this.v = linkedWalletsTabRevampScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        Intrinsics.i(model.k, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RowDelegate.Model.Value.Switch");
        uVar.n2(new mt8.b(uVar, !((vf) r0).f54880a, null, 20), new whi.b(6));
        return Unit.f186387a;
    }
}
