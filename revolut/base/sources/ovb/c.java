package ovb;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreen;
import com.revolut.feature.store.core.api.model.StoreProductVariantValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsExclusiveStoreProductCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsExclusiveStoreProductCheckoutScreen revPointsExclusiveStoreProductCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsExclusiveStoreProductCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Integer num;
        SuggestionsBarDelegate.Suggestion model = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarM3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) hVarM3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53496h;
        StoreProductVariantValue storeProductVariantValue = obj3 instanceof StoreProductVariantValue ? (StoreProductVariantValue) obj3 : null;
        if (storeProductVariantValue != null && ((num = storeProductVariantValue.f88650c) == null || num.intValue() > 0)) {
            dVar.H2(dVar.f83612y, new oqk.c(storeProductVariantValue, 22));
        }
        return Unit.f186387a;
    }
}
