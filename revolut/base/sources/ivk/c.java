package ivk;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StockDetailsFeedController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(StockDetailsFeedController stockDetailsFeedController, Continuation continuation) {
        super(2, continuation);
        this.v = stockDetailsFeedController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.N.getValue();
        Intrinsics.h(model);
        com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a aVar2 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a) fVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        k kVar = obj3 instanceof k ? (k) obj3 : null;
        if (kVar != null && !kVar.equals(h.f168875a) && !kVar.equals(i.f168876a)) {
            if (!kVar.equals(j.f168877a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.v.a();
        }
        return Unit.f186387a;
    }
}
