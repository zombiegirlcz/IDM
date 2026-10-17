package gik;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.plan_sharing.PlanSharingBottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanSharingBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PlanSharingBottomSheet planSharingBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = planSharingBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.T;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f52613a;
        if (Intrinsics.f(str, "plan_sharing_enable")) {
            h hVar = (h) r06.getValue();
            hVar.getClass();
            hVar.l2(new ge7.f(hVar, null, 8), new yi5.b(26));
        } else if (Intrinsics.f(str, "plan_sharing_not_now")) {
            ((h) r06.getValue()).C2(d.f144223a);
        }
        return Unit.f186387a;
    }
}
