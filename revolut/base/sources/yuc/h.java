package yuc;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ LinkedWalletsTabRevampScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedWalletsTabRevampScreen linkedWalletsTabRevampScreen, Continuation continuation) {
        super(2, continuation);
        this.u = linkedWalletsTabRevampScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((u) this.u.d()).C2(l.f316984a);
        return Unit.f186387a;
    }
}
