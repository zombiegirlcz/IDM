package i2k;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PriceComparisonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PriceComparisonScreen priceComparisonScreen, Continuation continuation) {
        super(2, continuation);
        this.v = priceComparisonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.v.P.getValue();
        Intrinsics.h(model);
        com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.a aVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.a) lVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        k2k.c cVar = obj3 instanceof k2k.c ? (k2k.c) obj3 : null;
        if (cVar != null) {
            oki.h.v2(aVar2.f102003s, new PriceComparisonScreenContract$ModalStep.PlanInfo(cVar.f180610a, cVar.f180611b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
