package ojk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BasePricingPlanBEDrivenViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BasePricingPlanBEDrivenViewController basePricingPlanBEDrivenViewController, Continuation continuation) {
        super(2, continuation);
        this.v = basePricingPlanBEDrivenViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model.c cVar = (RowDelegate.Model.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (cVar instanceof pf) {
            pf value = (pf) cVar;
            q qVar = (q) this.v.d3();
            qVar.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            Object obj3 = value.f;
            if (obj3 instanceof u) {
                qVar.J2(((u) obj3).f225843a);
            }
        }
        return Unit.f186387a;
    }
}
