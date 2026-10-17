package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ g u;
    public final /* synthetic */ PlanReferralsSenderFlowContract$Step.InviteVideo v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, PlanReferralsSenderFlowContract$Step.InviteVideo inviteVideo, Continuation continuation) {
        super(1, continuation);
        this.u = gVar;
        this.v = inviteVideo;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.P2(this.v.f103226b);
        return Unit.f186387a;
    }
}
