package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation;

import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.BrazilInboundMandateConfirmationFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$OutputData;
import gim.i;
import hk6.j;
import hk6.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ BrPaymentExpiryDateUpdateScreenContract$OutputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f72582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BrazilInboundMandateConfirmationFlowContract$Step f72583x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BrPaymentExpiryDateUpdateScreenContract$OutputData brPaymentExpiryDateUpdateScreenContract$OutputData, c cVar, BrazilInboundMandateConfirmationFlowContract$Step brazilInboundMandateConfirmationFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.v = brPaymentExpiryDateUpdateScreenContract$OutputData;
        this.f72582w = cVar;
        this.f72583x = brazilInboundMandateConfirmationFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f72582w, this.f72583x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            BrPaymentExpiryDateUpdateScreenContract$OutputData brPaymentExpiryDateUpdateScreenContract$OutputData = this.v;
            if (!(brPaymentExpiryDateUpdateScreenContract$OutputData instanceof BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar = this.f72582w;
            cVar.B2();
            k kVar = cVar.f72585q;
            j jVar = new j(((BrazilInboundMandateConfirmationFlowContract$Step.ExpiryDateUpdate) this.f72583x).f72570a, ((BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated) brPaymentExpiryDateUpdateScreenContract$OutputData).f72715a);
            this.u = 1;
            Object objEmit = kVar.f152859a.emit(jVar, this);
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
