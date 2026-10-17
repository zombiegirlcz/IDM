package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import we6.i0;
import we6.k0;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f90900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TopupFlowContract$Step f90901x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, k0 k0Var, TopupFlowContract$Step topupFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f90900w = k0Var;
        this.f90901x = topupFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f90900w, this.f90901x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            String str = ((i0) this.f90900w).f296647b;
            TopupFlowContract$Step.JapanEasyBankAuthorization japanEasyBankAuthorization = (TopupFlowContract$Step.JapanEasyBankAuthorization) this.f90901x;
            dj0.d dVar = japanEasyBankAuthorization.d;
            TopUpTarget topUpTarget = japanEasyBankAuthorization.e;
            String str2 = japanEasyBankAuthorization.f90855c;
            this.u = 1;
            if (this.v.W2(str, dVar, topUpTarget, str2, this) == aVar) {
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
