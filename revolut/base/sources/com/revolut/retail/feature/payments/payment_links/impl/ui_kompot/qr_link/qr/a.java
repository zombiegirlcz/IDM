package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.payment_links.api.model.TransferLinkLimits;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.PaymentLinkQrScreenContract$ModalStep;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ks0.n;
import lo.c;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            p56.a aVar2 = bVar.f102228q;
            this.u = 1;
            c cVar = new c((n) aVar2.f233024b, (Continuation) null, 23);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, cVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.v2(bVar.u, new PaymentLinkQrScreenContract$ModalStep.ShowLimits((TransferLinkLimits) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
