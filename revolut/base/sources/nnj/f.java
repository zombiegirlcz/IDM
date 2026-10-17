package nnj;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nn3.z;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimRefundReasonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EsimRefundReasonScreen esimRefundReasonScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimRefundReasonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputChecklistDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.TextData model = (InputChecklistDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c) nVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52532a, "ID_REASON_ITEM_OTHER")) {
            cVar.H2(cVar.f101474x, new z(model, 12));
        }
        return Unit.f186387a;
    }
}
