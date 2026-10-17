package cuj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ RewardsHubCollectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RewardsHubCollectionScreen rewardsHubCollectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = rewardsHubCollectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((y) this.u.d()).f109068s.a();
        return Unit.f186387a;
    }
}
