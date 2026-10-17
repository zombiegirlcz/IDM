package oph;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ ScreenerCollectionsPageScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ScreenerCollectionsPageScreen screenerCollectionsPageScreen, Continuation continuation) {
        super(2, continuation);
        this.u = screenerCollectionsPageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.u.S.getValue();
        mVar.getClass();
        mVar.l2(new omg.e(mVar, null, 5), new yi5.b(26));
        return Unit.f186387a;
    }
}
