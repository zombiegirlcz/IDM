package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2;

import a94.q;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep flowStep;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.i iVarX = bVar.f67466t.x(AccountId.Personal.f51414a);
            this.u = 1;
            obj2 = nim.a.b(iVarX, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.H2(bVar.u, new q(0, (xi0.b) obj2));
        yki.i iVar = bVar.v;
        OutstandingDebtsV2FlowContract$InputData outstandingDebtsV2FlowContract$InputData = bVar.f67462p;
        if (outstandingDebtsV2FlowContract$InputData instanceof OutstandingDebtsV2FlowContract$InputData.Intro) {
            flowStep = OutstandingDebtsV2FlowContract$Step.Intro.f67459a;
        } else {
            if (!(outstandingDebtsV2FlowContract$InputData instanceof OutstandingDebtsV2FlowContract$InputData.DebtsHub)) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = OutstandingDebtsV2FlowContract$Step.DebtsHub.f67458a;
        }
        h.t2(bVar, iVar, flowStep, true, null, false, 12);
        return Unit.f186387a;
    }
}
