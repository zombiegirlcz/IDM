package aok;

import aok.h;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanValueOfferReminderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PlanValueOfferReminderScreen planValueOfferReminderScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planValueOfferReminderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.Q.getValue();
        Object obj3 = model.i;
        l lVar = (l) jVar;
        lVar.getClass();
        ValueOfferReminderResponse$Content.Button button = obj3 instanceof ValueOfferReminderResponse$Content.Button ? (ValueOfferReminderResponse$Content.Button) obj3 : null;
        if (button != null) {
            if (button instanceof ValueOfferReminderResponse$Content.Button.Continue) {
                lVar.C2(h.b.f8010a);
            } else if (button instanceof ValueOfferReminderResponse$Content.Button.Cancel) {
                lVar.C2(h.a.f8009a);
            } else {
                if (!(button instanceof ValueOfferReminderResponse$Content.Button.Deeplink)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar.C2(new i(((ValueOfferReminderResponse$Content.Button.Deeplink) button).f81182a));
            }
        }
        return Unit.f186387a;
    }
}
