package com.revolut.feature.rewards.impl.ui.rent_and_bills.flow;

import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$Step;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsStatusDialogFactory;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RentAndBillsFlowContract$Step.UnlinkPayments f84973w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, RentAndBillsFlowContract$Step.UnlinkPayments unlinkPayments, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f84973w = unlinkPayments;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f84973w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if ((n1Var.a().a() instanceof RentAndBillsUnlinkPaymentsStatusDialogFactory.UnlinkPaymentErrorDialogPayload) && (n1Var instanceof l1)) {
            RentAndBillsFlowContract$Step.UnlinkPayments unlinkPayments = this.f84973w;
            h.w2(this.v.u, new RentAndBillsFlowContract$Step.UnlinkPayments(unlinkPayments.f84970a, unlinkPayments.f84971b, unlinkPayments.f84972c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
