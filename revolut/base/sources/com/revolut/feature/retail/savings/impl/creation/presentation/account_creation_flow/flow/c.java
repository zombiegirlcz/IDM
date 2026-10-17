package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import com.revolut.feature.vaults.common.SavingAccountType;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xge.f;
import xlb.u;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            if (eVar.o.f83238b instanceof SavingAccountType.Joint) {
                this.u = 1;
                obj2 = e.J2(eVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            Continuation continuation = null;
            return l.a1(eVar, eVar.U2(), new u(eVar, continuation, 0), null, new f(eVar, continuation, 7), 2);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            eVar.T2(SavingsOnboardingFlowContract$Step.PendingJointAccount.f83258a);
            return Unit.f186387a;
        }
        Continuation continuation2 = null;
        return l.a1(eVar, eVar.U2(), new u(eVar, continuation2, 0), null, new f(eVar, continuation2, 7), 2);
    }
}
