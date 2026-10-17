package pvb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsExclusiveStoreProductStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RevPointsExclusiveStoreProductStatusScreen revPointsExclusiveStoreProductStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsExclusiveStoreProductStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.T.getValue();
        Intrinsics.h(model);
        e eVar = (e) cVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        eVar.f240048r.a();
        return Unit.f186387a;
    }
}
