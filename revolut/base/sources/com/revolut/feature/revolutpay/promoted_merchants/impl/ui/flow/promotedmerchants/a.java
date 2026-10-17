package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants;

import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants.PromotedMerchantsFlowContract$Step;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m1c.r0;
import m1c.x0;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
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
            d0 d0VarE = ((nyb.o) bVar.f84675p).e(false);
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
        if (((r0) obj2).f201447a == x0.OPTED_OUT) {
            h.u2(bVar, bVar.f84676q, PromotedMerchantsFlowContract$Step.RevPointsOptIn.f84674a, null, 6);
        } else {
            yki.i iVar = bVar.f84676q;
            PromotedMerchantsDestination.InputData inputData = bVar.o;
            h.u2(bVar, iVar, (inputData.f84667a && inputData.f84668b) ? PromotedMerchantsFlowContract$Step.PromotedMerchants.f84672a : PromotedMerchantsFlowContract$Step.IntroArticle.f84671a, null, 6);
        }
        return Unit.f186387a;
    }
}
