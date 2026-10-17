package x18;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreen;
import com.revolut.kompot.common.StackDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SmartFeedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SmartFeedScreen smartFeedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = smartFeedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((NewsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NewsDelegate.Model model = (NewsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        StackDestination stackDestinationA = bVar.v.a(model.k);
        if (stackDestinationA != null) {
            bVar.C1(stackDestinationA);
        }
        return Unit.f186387a;
    }
}
