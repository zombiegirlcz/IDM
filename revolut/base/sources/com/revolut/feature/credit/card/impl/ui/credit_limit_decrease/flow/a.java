package com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow;

import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import vq4.d;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        yki.i iVar = bVar.f69204s;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Object[] objArr = 0;
        if (i == 0) {
            o.b(obj2);
            d dVar = new d(bVar, objArr == true ? 1 : 0, 1);
            this.u = 1;
            obj2 = pu7.a.B(bVar.k, "Load limit decrease pre-offer", dVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        kl4.b bVar2 = (kl4.b) obj2;
        if (bVar2 == null || !bVar2.f185283a) {
            h.w2(iVar, new CreditCardLimitDecreaseFlowContract$Step.Ineligible(bVar2 != null ? bVar2.e : null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            h.w2(iVar, new CreditCardLimitDecreaseFlowContract$Step.Amount(bVar2.f185284b, bVar2.f185285c, bVar2.d), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
