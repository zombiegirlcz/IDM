package dec;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static Image a(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c cVar) {
        switch (cVar == null ? -1 : h.f113367a[cVar.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new CdnImage("visa", "mobile/revolut_pay/payment_methods", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 2:
                return new CdnImage("mastercard", "mobile/revolut_pay/payment_methods", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 3:
                return new ResourceImage(R$drawable.uikit_icn_24_logo_ma, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            case 4:
                return new ResourceImage(R$drawable.uikit_icn_24_logo_amex_colour, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            case 5:
                return new ResourceImage(R$drawable.uikit_icn_24_logo_diners_club_colour, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
    }

    public static Image b(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c cVar) {
        switch (cVar == null ? -1 : h.f113367a[cVar.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new CdnImage("visa", "mobile/revolut_pay/payment_methods", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 2:
                return new CdnImage("mastercard", "mobile/revolut_pay/payment_methods", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 3:
                return new ResourceImage(R$drawable.uikit_icn_24_logo_ma, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            case 4:
                return new CdnImage("amex", "mobile/revolut_pay/payment_methods", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 5:
                return new ResourceImage(R$drawable.uikit_icn_24_logo_diners_club_colour, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
    }

    public static CdnImage c() {
        return new CdnImage("revolut_account", "mobile/revolut_pay/payment_methods", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
    }
}
