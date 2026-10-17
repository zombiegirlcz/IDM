package com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow;

import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$Action;
import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import dv4.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        yki.i iVar = bVar.f69650r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d dVar = new d(bVar, null, 1);
            this.u = 1;
            obj2 = pu7.a.B(bVar.k, "Load settings model", dVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ul4.a aVar2 = (ul4.a) obj2;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (aVar2 != null) {
            CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason = aVar2.f280885c;
            if (creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason != null) {
                String str = creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68864a;
                String str2 = creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68865b;
                CreditCardSettings$Action creditCardSettings$Action = creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68866c;
                h.w2(iVar, new CreditCardSelectDueDateFlowContract$Step.IneligibilityError(str, str2, creditCardSettings$Action.f68859a, creditCardSettings$Action.f68860b), bottom_dialog);
            } else {
                h.w2(iVar, new CreditCardSelectDueDateFlowContract$Step.SelectDueDate(bVar.o.f69638a, aVar2.f280883a, aVar2.f280884b, aVar2.d), bottom_dialog);
            }
        } else {
            h.w2(iVar, CreditCardSelectDueDateFlowContract$Step.Error.f69639a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
