package com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow;

import com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            gdk.a aVar = cVar.f102565q;
            this.u = 1;
            bdk.c cVar2 = ((gdk.c) aVar).f143189a;
            cVar2.getClass();
            bdk.b bVar = new bdk.b(cVar2, null, 1);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(f.f127540b, bVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(cVar, cVar.f102566r, MilestoneRewardsFlowContract$Step.RewardsList.f102561a, false, null, false, 12);
        return Unit.f186387a;
    }
}
