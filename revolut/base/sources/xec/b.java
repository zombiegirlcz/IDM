package xec;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.shared.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static tf a(int i) {
        return new tf(4, new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
    }

    public static Clause b(ShippingContact shippingContact, boolean z) {
        if (!z) {
            return new TextLocalisedClause(R$string.revolut_pay_order_summary_shipping_address_invalid_address, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        Address address = shippingContact.f84741b;
        return new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.p(address.getPostcode(), ", ", address.getCity(), ", ", address.getCountry()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
