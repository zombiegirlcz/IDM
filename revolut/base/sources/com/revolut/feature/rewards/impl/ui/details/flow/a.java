package com.revolut.feature.rewards.impl.ui.details.flow;

import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lic.s;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PerkDetailsFlowContract$Step f84939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, PerkDetailsFlowContract$Step perkDetailsFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f84939w = perkDetailsFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f84939w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            s sVar = this.v.f84944t;
            RewardFooterAction.Cancel cancel = ((PerkDetailsFlowContract$Step.CancelSubscription) this.f84939w).f84929a;
            this.u = 1;
            if (sVar.Z2(cancel, this) == aVar) {
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
