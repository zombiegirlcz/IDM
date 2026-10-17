package c3k;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection.VendorSelectionScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ VendorSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(VendorSelectionScreen vendorSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = vendorSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        Intrinsics.h(model);
        g gVar = (g) eVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        PaymentVendor paymentVendor = obj3 instanceof PaymentVendor ? (PaymentVendor) obj3 : null;
        if (paymentVendor != null) {
            gVar.C2(new d(paymentVendor));
        }
        return Unit.f186387a;
    }
}
