package xec;

import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsContract$ModalStep;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsScreen;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShippingContactsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ShippingContactsScreen shippingContactsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shippingContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        s8c.a accountDetailsUpdateState;
        List list;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        if (obj3 != null) {
            com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.v.d();
            s8c.e eVar = bVar.f84756q;
            if (obj3 instanceof d) {
                oki.h.v2(bVar.f84759t, new ShippingContactsContract$ModalStep.ShippingContactOptions(((d) obj3).f304576a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else if (obj3 instanceof c) {
                eVar.getClass();
                String str = ((c) obj3).f304573a;
                nec.c cVar = (nec.c) ((e) ((j2) bVar.f84758s.f22677a).getValue()).f304580a.getContent();
                ShippingContact shippingContact = null;
                Object obj4 = null;
                shippingContact = null;
                if (cVar != null && (list = cVar.f214428a) != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next = it8.next();
                        if (Intrinsics.f(((ShippingContact) next).f84740a, str)) {
                            obj4 = next;
                            break;
                        }
                    }
                    shippingContact = (ShippingContact) obj4;
                }
                if (shippingContact == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
                j2 j2Var = eVar.f260970m;
                do {
                    value = j2Var.getValue();
                    accountDetailsUpdateState = new s8c.a(shippingContact);
                    ((s8c.d) value).getClass();
                    Intrinsics.checkNotNullParameter(accountDetailsUpdateState, "accountDetailsUpdateState");
                } while (!j2Var.h(value, new s8c.d(accountDetailsUpdateState)));
                eVar.A2(u0.c(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) UserDetailsDestination.f26226a, false, (Integer) null, 0, 61)));
            }
        }
        return Unit.f186387a;
    }
}
