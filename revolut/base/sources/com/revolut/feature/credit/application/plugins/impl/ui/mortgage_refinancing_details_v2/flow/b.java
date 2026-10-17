package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f68015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MortgageRefinancingDetailsV2FlowContract$Step.ChangeAddressStep f68016x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, AddressFlowContract$OutputData addressFlowContract$OutputData, MortgageRefinancingDetailsV2FlowContract$Step.ChangeAddressStep changeAddressStep, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f68015w = addressFlowContract$OutputData;
        this.f68016x = changeAddressStep;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f68015w, this.f68016x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            MortgageRefinancingDetailsV2FlowContract$Step.ChangeAddressStep changeAddressStep = this.f68016x;
            d dVar = this.v;
            a aVar2 = new a(dVar, this.f68015w, changeAddressStep, null);
            this.u = 1;
            if (dVar.p2(this, aVar2) == aVar) {
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
