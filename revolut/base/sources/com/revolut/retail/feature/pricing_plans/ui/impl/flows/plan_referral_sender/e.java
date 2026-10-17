package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanReferralsSenderFlowContract$Step.PlanSharing f103231w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, PlanReferralsSenderFlowContract$Step.PlanSharing planSharing, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f103231w = planSharing;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f103231w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            int i2 = this.f103231w.f103227a;
            this.u = 1;
            if (this.v.N2(i2, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
