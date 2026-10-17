package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation;

import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.BrazilInboundMandateConfirmationFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$OutputData;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wj6.l;
import wj6.m;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ BrPaymentLimitsUpdateScreenContract$OutputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f72580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BrazilInboundMandateConfirmationFlowContract$Step f72581x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BrPaymentLimitsUpdateScreenContract$OutputData brPaymentLimitsUpdateScreenContract$OutputData, c cVar, BrazilInboundMandateConfirmationFlowContract$Step brazilInboundMandateConfirmationFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.v = brPaymentLimitsUpdateScreenContract$OutputData;
        this.f72580w = cVar;
        this.f72581x = brazilInboundMandateConfirmationFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f72580w, this.f72581x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            BrPaymentLimitsUpdateScreenContract$OutputData brPaymentLimitsUpdateScreenContract$OutputData = this.v;
            if (!(brPaymentLimitsUpdateScreenContract$OutputData instanceof BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar = this.f72580w;
            cVar.B2();
            m mVar = cVar.f72584p;
            l lVar = new l(((BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated) brPaymentLimitsUpdateScreenContract$OutputData).f72621a, ((BrazilInboundMandateConfirmationFlowContract$Step.LimitUpdate) this.f72581x).f72574a);
            this.u = 1;
            Object objEmit = mVar.f297971a.emit(lVar, this);
            if (objEmit != aVar) {
                objEmit = Unit.f186387a;
            }
            if (objEmit == aVar) {
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
