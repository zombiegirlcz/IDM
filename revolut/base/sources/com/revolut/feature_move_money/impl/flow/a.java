package com.revolut.feature_move_money.impl.flow;

import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyFlowContract$Step.FirmPriceDeviance f97370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyFlowContract$MoveMoneyProcessState f97371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ nyh.b f97372y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, MoveMoneyFlowContract$Step.FirmPriceDeviance firmPriceDeviance, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState, nyh.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f97370w = firmPriceDeviance;
        this.f97371x = moveMoneyFlowContract$MoveMoneyProcessState;
        this.f97372y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f97370w, this.f97371x, this.f97372y, continuation);
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
            String str = this.f97370w.f97360c;
            OrderQuote orderQuote = this.f97372y.f220875a;
            this.u = 1;
            if (e.J2(this.v, str, this.f97371x, orderQuote, this) == aVar) {
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
