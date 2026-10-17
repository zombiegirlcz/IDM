package emk;

import aw0.n6;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreen;
import igk.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanGiftBenefitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PlanGiftBenefitsScreen planGiftBenefitsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planGiftBenefitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanGiftBenefitsScreen planGiftBenefitsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                planGiftBenefitsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) ((g) planGiftBenefitsScreen.R.getValue());
                hha.d dVar = (hha.d) ((f) ((j2) kVar.f127692w.f22677a).getValue()).f127679b.getContent();
                String str = dVar != null ? dVar.f152287a : null;
                if (str != null) {
                    kVar.v.b3(str, new e58.e(kVar, 21));
                } else {
                    PlanGiftingRefund planGiftingRefund = kVar.o.f103528b;
                    if (planGiftingRefund != null) {
                        kVar.f127690s.x(((qbk.c) kVar.f127691t).a(planGiftingRefund));
                    } else {
                        kVar.C2(m.a.f161259a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
