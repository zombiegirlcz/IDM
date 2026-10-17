package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f68013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MortgageRefinancingDetailsV2FlowContract$Step.ChangeAddressStep f68014x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, AddressFlowContract$OutputData addressFlowContract$OutputData, MortgageRefinancingDetailsV2FlowContract$Step.ChangeAddressStep changeAddressStep, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f68013w = addressFlowContract$OutputData;
        this.f68014x = changeAddressStep;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f68013w, this.f68014x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d.P2(r3, r8, r1, r7) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData r2 = r7.f68013w
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d r3 = r7.v
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r5) goto L14
            yhm.o.b(r8)
            goto L51
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L3d
        L20:
            yhm.o.b(r8)
            ang.f r8 = r3.f68019r
            eo3.a$a r1 = new eo3.a$a
            com.revolut.feature.address.models.Address r6 = r2.f60940a
            r1.<init>(r6, r5)
            java.util.List r1 = zhm.u.c(r1)
            pfm.t r8 = ylg.b.c(r8, r1)
            r7.u = r4
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r0) goto L3d
            goto L50
        L3d:
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$Step$ChangeAddressStep r8 = r7.f68014x
            java.lang.String r8 = r8.f68006a
            xy3.t r1 = new xy3.t
            com.revolut.feature.address.models.Address r2 = r2.f60940a
            r1.<init>(r2)
            r7.u = r5
            java.lang.Object r8 = com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d.P2(r3, r8, r1, r7)
            if (r8 != r0) goto L51
        L50:
            return r0
        L51:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
