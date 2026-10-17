package wmk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder.PlanDowngradeOfferReminderScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wmk.j;
import wmk.l;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanDowngradeOfferReminderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PlanDowngradeOfferReminderScreen planDowngradeOfferReminderScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planDowngradeOfferReminderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.v.Q.getValue();
        Object obj3 = model.i;
        o oVar = (o) mVar;
        oVar.getClass();
        j jVar = obj3 instanceof j ? (j) obj3 : null;
        if (jVar != null) {
            if (jVar.equals(j.a.f298694a)) {
                oVar.C2(l.b.f298698a);
            } else {
                if (!jVar.equals(j.b.f298695a)) {
                    throw new NoWhenBranchMatchedException();
                }
                oVar.C2(l.a.f298697a);
            }
        }
        return Unit.f186387a;
    }
}
