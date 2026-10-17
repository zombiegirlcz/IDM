package nnj;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreen;
import dej.e3;
import dej.p0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimRefundReasonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimRefundReasonScreen esimRefundReasonScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimRefundReasonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c) nVarE3;
        y yVar = cVar.f101474x;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (obj3 == null) {
            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c.J2("onRefundReasonOptionSelected: refund reason parcel is null");
        } else if (obj3 instanceof e3) {
            cVar.H2(yVar, new ib6.j(obj3, 12));
        } else if (obj3 instanceof p0) {
            cVar.H2(yVar, new ib6.j(obj3, 13));
        } else {
            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c.J2("onRefundReasonOptionSelected: unsupported parcel type");
        }
        return Unit.f186387a;
    }
}
