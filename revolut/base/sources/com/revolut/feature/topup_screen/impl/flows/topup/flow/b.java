package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import we6.m0;
import we6.o0;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f90898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TopupFlowContract$Step f90899x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, o0 o0Var, TopupFlowContract$Step topupFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f90898w = o0Var;
        this.f90899x = topupFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f90898w, this.f90899x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            String str = ((m0) this.f90898w).f296655a;
            TopupFlowContract$Step.JapanEasyBankTransfer japanEasyBankTransfer = (TopupFlowContract$Step.JapanEasyBankTransfer) this.f90899x;
            dj0.d dVar = japanEasyBankTransfer.f90859a;
            i iVar = this.v;
            TopUpTarget topUpTarget = iVar.o.f284275a;
            String f72268b = japanEasyBankTransfer.f90861c.getF72268b();
            this.u = 1;
            if (iVar.W2(str, dVar, topUpTarget, f72268b, this) == aVar) {
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
