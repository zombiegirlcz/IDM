package com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow;

import com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.RedeemRewardFlowContract$Step;
import efm.d0;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m1c.r0;
import oki.h;
import yhm.o;
import zg7.d;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
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
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            if (d.f322087b[bVar.f74887r.f74882b.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            d0 d0VarE = ((nyb.o) bVar.o).e(false);
            this.u = 1;
            obj2 = nim.a.b(d0VarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        int i2 = d.f322086a[((r0) obj2).f201447a.ordinal()];
        if (i2 == 1) {
            h.u2(bVar, bVar.f74888s, RedeemRewardFlowContract$Step.RedeemRevPointHub.f74884a, null, 6);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.u2(bVar, bVar.f74888s, RedeemRewardFlowContract$Step.OptInRevPoints.f74883a, null, 6);
        }
        return Unit.f186387a;
    }
}
