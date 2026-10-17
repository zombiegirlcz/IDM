package do9;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static LayeredImage a(PaymentCounterpartyInfo paymentCounterparty) {
        Intrinsics.checkNotNullParameter(paymentCounterparty, "paymentCounterparty");
        int i = a.f116472a[paymentCounterparty.f79061b.ordinal()];
        if (i == 1) {
            return LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bpay, new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorBackground), 2.0f, null, 48);
        }
        if (i == 2) {
            ApmUpi.f61828c.getClass();
            return LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_upi, new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorBackground), 2.0f, null, 48);
        }
        if (i == 3 || i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
