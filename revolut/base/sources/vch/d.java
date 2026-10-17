package vch;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WithdrawScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WithdrawScreen withdrawScreen, Continuation continuation) {
        super(2, continuation);
        this.v = withdrawScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarI3 = this.v.T2();
        Intrinsics.h(model);
        x0 x0Var = (x0) vVarI3;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bw0.m mVar = model.e;
        Object obj3 = mVar != null ? mVar.e : null;
        if (obj3 instanceof usb.d) {
            n1h.b bVar = x0Var.F;
            OrderQuoteParams orderQuoteParams = ((usb.d) obj3).f282867a;
            c4i.a aVar2 = c4i.a.EXCHANGE;
            k9 k9Var = k9.ProductUnspecified;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            bVar.Z2(orderQuoteParams, aVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        }
        return Unit.f186387a;
    }
}
