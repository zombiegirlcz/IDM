package com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender;

import ack.c;
import ack.k;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.PlanGiftingSenderFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
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
            int i2 = k.f3173a[((c) bVar.v).f3162b.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zjh.i iVar = bVar.f102495x;
                    this.u = 1;
                    obj2 = iVar.f(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
                bVar.K2(true);
                return Unit.f186387a;
            }
            d.D(Boolean.TYPE, bVar.f102494w.f269554a.f296243a, "INITIAL_BIRTHDAY_SHARING_REQUESTED_KEY", Boolean.TRUE);
            h.u2(bVar, bVar.A, PlanGiftingSenderFlowContract$Step.RequestBirthdaySharing.f102480a, null, 6);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            bVar.K2(true);
        } else {
            d.D(Boolean.TYPE, bVar.f102494w.f269554a.f296243a, "INITIAL_BIRTHDAY_SHARING_REQUESTED_KEY", Boolean.TRUE);
            h.u2(bVar, bVar.A, PlanGiftingSenderFlowContract$Step.RequestBirthdaySharing.f102480a, null, 6);
        }
        return Unit.f186387a;
    }
}
