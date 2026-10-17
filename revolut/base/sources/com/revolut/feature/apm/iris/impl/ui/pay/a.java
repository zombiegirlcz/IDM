package com.revolut.feature.apm.iris.impl.ui.pay;

import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlowContract$Step;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import gim.i;
import iz1.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.u;
        yki.i iVar = bVar.f62521t;
        IrisNavigation$StartType.Pay pay = bVar.o.f62512a;
        Continuation continuation = null;
        if (pay instanceof IrisNavigation$StartType.Pay.Scanner) {
            h.u2(bVar, iVar, IrisPayFlowContract$Step.Scanner.f62515a, null, 6);
        } else {
            int i = 26;
            if (pay instanceof IrisNavigation$StartType.Pay.Deeplink) {
                bVar.l2(new j62.h(bVar, (IrisNavigation$StartType.Pay.Deeplink) pay, null), new yi5.b(i));
            } else if (pay instanceof IrisNavigation$StartType.Pay.QrScan) {
                bVar.l2(new p(bVar, ((IrisNavigation$StartType.Pay.QrScan) pay).f62489a, continuation, 16), new yi5.b(i));
            } else {
                if (!(pay instanceof IrisNavigation$StartType.Pay.PendingAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.u2(bVar, iVar, new IrisPayFlowContract$Step.PendingPayment(new PendingPaymentContract$InputData.Apm(((IrisNavigation$StartType.Pay.PendingAction) pay).f62488a, true)), null, 6);
            }
        }
        return Unit.f186387a;
    }
}
