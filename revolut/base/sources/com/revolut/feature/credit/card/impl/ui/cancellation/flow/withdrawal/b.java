package com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal;

import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationDetails;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n14.k;
import nii.f;
import nii.g;
import nii.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            an1.d dVar2 = new an1.d(dVar, 18);
            al6.c cVar = new al6.c(10);
            a aVar2 = new a(dVar, null);
            this.u = 1;
            obj2 = k.V(dVar, null, cVar, dVar2, aVar2, this, 1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h hVar = (h) obj2;
        if (hVar instanceof g) {
            CreditCardCancellationDetails creditCardCancellationDetails = dVar.I2().f69150a.f68703b.d;
            if (creditCardCancellationDetails != null) {
                oki.h.t2(dVar, dVar.f69160w, new CreditCardWithdrawalFlowContract$Step.CancellationDetails(creditCardCancellationDetails), false, null, false, 12);
            } else {
                dVar.n2(new eq4.h(dVar, null), new whi.b(6));
            }
        } else {
            if (!(hVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
