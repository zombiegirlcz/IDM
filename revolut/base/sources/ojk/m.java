package ojk;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BasePricingPlanBEDrivenViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(BasePricingPlanBEDrivenViewController basePricingPlanBEDrivenViewController, Continuation continuation) {
        super(2, continuation);
        this.v = basePricingPlanBEDrivenViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0VarD3 = this.v.d3();
        Object obj3 = model.f53623w;
        q qVar = (q) c0VarD3;
        qVar.getClass();
        if (obj3 instanceof u) {
            qVar.J2(((u) obj3).f225843a);
        }
        return Unit.f186387a;
    }
}
