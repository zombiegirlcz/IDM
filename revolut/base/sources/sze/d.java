package sze;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public d(b storedMethodLogoBadgeFactory) {
        Intrinsics.checkNotNullParameter(storedMethodLogoBadgeFactory, "storedMethodLogoBadgeFactory");
    }

    public static LayeredImage a(int i) {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 12.0f, Float.valueOf(40.0f), null, 32);
    }

    public static Image b(TopupMethodType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (c.f266803a[type.ordinal()]) {
            case 1:
                return a(R$drawable.uikit_icn_24_cheque);
            case 2:
                return a(R$drawable.uikit_icn_24_cash);
            case 3:
                return a(R$drawable.uikit_icn_24_card);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return a(R$drawable.uikit_icn_24_bank);
            case 10:
                return a(R$drawable.uikit_icn_24_salary);
            case 11:
                return a(R$drawable.uikit_icn_24_payments);
            case 12:
                return a(R$drawable.uikit_icn_24_repayment);
            case 13:
                return new ConfigurableResourceImage(R$drawable.uikit_icn_payment_scheme_google_pay, null, null, null, 1022);
            case 14:
            case 15:
            case 16:
                return a(R$drawable.uikit_icn_24_revolut);
            case 17:
                return zw1.a.a();
            case 18:
            case 19:
                return a(R$drawable.uikit_icn_24_logo_pix_outline);
            case 20:
                return a(R$drawable.uikit_icn_24_payto);
            case 21:
            case 22:
                return a(R$drawable.uikit_icn_24_upi);
            case 23:
            case 24:
                return a(R$drawable.uikit_icn_24_bank);
            case 25:
                return a(R$drawable.uikit_icn_24_paynow_brand_mark);
            case 26:
                return a(R$drawable.uikit_icn_24_pse);
            case 27:
                return a(R$drawable.uikit_icn_24_bre_b);
            case 28:
                return a(R$drawable.uikit_icn_16_direct_deposit);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
