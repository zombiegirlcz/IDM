package uec;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.shared.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f279340a;

    public g(b shippingAddressMapper) {
        Intrinsics.checkNotNullParameter(shippingAddressMapper, "shippingAddressMapper");
        this.f279340a = shippingAddressMapper;
    }

    public static RowDelegate.Model a(DeliveryMethods.DeliveryMethod deliveryMethod, boolean z) {
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_order_summary_bnpl_shipping, null, null, 14);
        if (deliveryMethod != null) {
            String str = deliveryMethod.f84738b;
            m70.a.a(t0.f186434a);
            compositeClause = new CompositeClause(v.k(new TextClause(str + " · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(deliveryMethod.f84739c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, null, null, 14);
        } else {
            compositeClause = null;
        }
        return new RowDelegate.Model("CHECKOUT_DETAILS_DELIVERY_METHOD_LIST_ID", new RowDelegate.Model.MainImage.Image24(oc.c.a(R$drawable.uikit_icn_24_delivery_car), false, false, 6), textLocalisedClause, null, 0, compositeClause, null, null, 0, c(), z, null, false, z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536851416);
    }

    public static tf c() {
        return new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
    }

    public final RowDelegate.Model b(ShippingContact shippingContact, boolean z, String str) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_order_summary_bnpl_address, null, null, 14);
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(oc.c.a(R$drawable.uikit_icn_24_location_pin), false, false, 6);
        String[] elements = {shippingContact.d, shippingContact.e};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (!d0.W((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        List list = (List) ue0.e.M(arrayList);
        String strK0 = list != null ? zhm.d0.k0(list, " ", null, null, 0, null, 62) : null;
        if (strK0 == null) {
            strK0 = str;
        }
        Address address = shippingContact.f84741b;
        Intrinsics.checkNotNullParameter(address, "address");
        String country = address.getCountry();
        Locale localeA = ((s80.b) this.f279340a.f279332a).a();
        String displayCountry = new Locale(localeA.getLanguage(), country).getDisplayCountry(localeA);
        Intrinsics.h(displayCountry);
        if (d0.W(displayCountry)) {
            displayCountry = null;
        }
        if (displayCountry != null) {
            country = displayCountry;
        }
        String[] elements2 = {strK0, b.a(v.k(address.getStreetLine1(), address.getPostcode())), b.a(v.k(address.getCity(), country))};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new RowDelegate.Model("SHIPPING_ADDRESS_LIST_ID", image24, textLocalisedClause, null, 0, new TextClause(zhm.d0.k0(kotlin.collections.d.L(elements2), b.f279331b, null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z ? null : new TextLocalisedClause(R$string.revolut_pay_order_summary_shipping_address_invalid_address, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, c(), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867736);
    }
}
