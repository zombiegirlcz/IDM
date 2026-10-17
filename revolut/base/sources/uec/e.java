package uec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.kompot.common.ModalDestination;
import k7c.t0;
import k7c.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pec.h;
import pec.l;
import pec.m;
import pec.o;
import q7c.s;
import tx0.g4;
import vkm.q;
import vkm.z1;
import w4l.i;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends n implements o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f279337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pec.a f279338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f279339n;

    public e(s shippingInteractor, pec.a inputData) {
        Object obj2;
        Intrinsics.checkNotNullParameter(shippingInteractor, "shippingInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f279337l = shippingInteractor;
        this.f279338m = inputData;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        pec.n nVarB = inputData.b();
        if (nVarB instanceof m) {
            obj2 = pec.g.f235366a;
        } else {
            if (!(nVarB instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = h.f235367a;
        }
        z1VarB.k(obj2);
        this.f279339n = z1VarB;
    }

    public static final akg.n Z2(e eVar, ShippingContact shippingContact, DeliveryMethods.DeliveryMethod deliveryMethod) {
        s sVar = eVar.f279337l;
        String orderToken = eVar.b3();
        String selectedDeliveryMethodId = deliveryMethod.f84737a;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(selectedDeliveryMethodId, "selectedDeliveryMethodId");
        y0 y0Var = sVar.f242835a;
        y0Var.getClass();
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(selectedDeliveryMethodId, "selectedDeliveryMethodId");
        return nim.a.v(y0Var.f.b(new t0(orderToken, selectedDeliveryMethodId), i.f294643c), new u69.g(shippingContact, deliveryMethod, 16));
    }

    public final String b3() {
        pec.n nVarB = this.f279338m.b();
        m mVar = nVarB instanceof m ? (m) nVarB : null;
        String str = mVar != null ? mVar.f235372a : null;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("orderToken accessed when shipping is not requested");
    }

    public final Flow c3(ShippingContact shippingContact) {
        return xam.a.h(new c(this, shippingContact, null), this.f279337l.a(b3(), shippingContact.f84740a, i.f294643c));
    }

    public final void d3(String str) {
        N2(o2(new oec.d(new ShippingContactsScreenDescriptor$InputData(new ShippingContactsScreenDescriptor$InputData.ModeConfiguration.SelectContact(b3()), str, true))), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new g4(1, this, e.class, "handleShippingContactsResult", "handleShippingContactsResult(Lcom/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$OutputData;)V", 0, 13));
    }
}
