package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment;

import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ku1.v;
import n14.k;
import nii.e;
import oki.h;
import pi6.r;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            v vVar = new v(14);
            r rVar = new r(dVar, continuation, 4);
            this.u = 1;
            obj2 = k.Q(dVar, null, null, vVar, rVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        e eVar = (e) obj2;
        if (eVar instanceof nii.c) {
            throw ((nii.c) eVar).f216123a;
        }
        if (!(eVar instanceof nii.d)) {
            throw new NoWhenBranchMatchedException();
        }
        pi6.c cVar = (pi6.c) ((nii.d) eVar).f216133a;
        if (cVar instanceof pi6.a) {
            d.K2(dVar, ((pi6.a) cVar).f236435a);
        } else {
            if (!(cVar instanceof pi6.b)) {
                throw new NoWhenBranchMatchedException();
            }
            yki.i iVar = dVar.f72523w;
            String str = dVar.o.d;
            Object obj3 = ((pi6.b) cVar).f236436a;
            Intrinsics.checkNotNullExpressionValue(obj3, "<get-result>(...)");
            h.u2(dVar, iVar, new OpenBankingAuthPaymentFlowContract$Step.PaymentScreen(new OpenBankingAuthPaymentScreenContract$InputData(str, (OpenBankingPayment) obj3)), null, 6);
        }
        return Unit.f186387a;
    }
}
