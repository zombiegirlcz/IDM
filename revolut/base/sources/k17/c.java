package k17;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.FreelancerOriginalOrderDetails;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import jr6.n;
import jr6.t;
import jr6.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import lr6.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements t {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f180131a;

    public c(u saleStateMapper, n invoiceMapper) {
        Intrinsics.checkNotNullParameter(saleStateMapper, "saleStateMapper");
        Intrinsics.checkNotNullParameter(invoiceMapper, "invoiceMapper");
        this.f180131a = saleStateMapper;
    }

    public static LayeredImage a(int i) {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 10.0f, Float.valueOf(20.0f), null, 32);
    }

    public final LayeredImage b(FreelancerOrder order) {
        LayeredImage layeredImageA;
        int i;
        Intrinsics.checkNotNullParameter(order, "order");
        LayeredImage layeredImageA2 = null;
        switch (b.f180129a[order.f.ordinal()]) {
            case 1:
            case 5:
                layeredImageA = a(R$drawable.uikit_icn_24_revert_left);
                break;
            case 2:
            case 6:
                layeredImageA = a(R$drawable.uikit_icn_24_revert_right);
                break;
            case 3:
            case 4:
                layeredImageA = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (layeredImageA != null) {
            return layeredImageA;
        }
        k kVar = order.d;
        if (kVar != null) {
            switch (b.f180130b[kVar.ordinal()]) {
                case 1:
                    i = R$drawable.uikit_icn_24_logo_apple_tap_to_pay_filled;
                    break;
                case 2:
                    i = R$drawable.uikit_icn_24_card_reader;
                    break;
                case 3:
                    i = R$drawable.uikit_icn_24_card_terminal;
                    break;
                case 4:
                    i = R$drawable.uikit_icn_24_document;
                    break;
                case 5:
                    i = R$drawable.uikit_icn_24_link;
                    break;
                case 6:
                    i = R$drawable.uikit_icn_24_qr;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    i = R$drawable.uikit_icn_24_merchant;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            layeredImageA2 = a(i);
        }
        return layeredImageA2 == null ? a(R$drawable.uikit_icn_24_question_sign) : layeredImageA2;
    }

    public final Clause c(FreelancerOrder order) {
        Clause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        String strV0;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(order, "order");
        FreelancerOriginalOrderDetails freelancerOriginalOrderDetails = order.f73300r;
        String strL = (freelancerOriginalOrderDetails == null || (str2 = freelancerOriginalOrderDetails.f73319b) == null) ? null : m70.a.l(str2);
        if (strL != null) {
            textLocalisedClause = new TextClause(strL, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (d0.W(order.f73291c)) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_description_common_id, zhm.u.c(f0.V0(6, order.f73289a)), null, 12);
            k kVar = order.d;
            switch (kVar == null ? -1 : b.f180130b[kVar.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_description_tap_to_pay, zhm.u.c(textLocalisedClause), null, 12);
                    break;
                case 2:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_description_card_reader, zhm.u.c(textLocalisedClause), null, 12);
                    break;
                case 3:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_description_revolut_terminal, zhm.u.c(textLocalisedClause), null, 12);
                    break;
                case 4:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_description_invoice, zhm.u.c(textLocalisedClause), null, 12);
                    break;
                case 5:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_description_payment_link, zhm.u.c(textLocalisedClause), null, 12);
                    break;
                case 6:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_description_qr_code, zhm.u.c(textLocalisedClause), null, 12);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_description_ecommerce, zhm.u.c(textLocalisedClause), null, 12);
                    break;
            }
            textLocalisedClause = textLocalisedClause2;
        } else {
            textLocalisedClause = new TextClause(order.f73291c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        int i = R$string.freelancer_sale_description_common_id;
        FreelancerOriginalOrderDetails freelancerOriginalOrderDetails2 = order.f73300r;
        if (freelancerOriginalOrderDetails2 == null || (str = freelancerOriginalOrderDetails2.f73318a) == null || (strV0 = f0.V0(6, str)) == null) {
            strV0 = "";
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, zhm.u.c(strV0), null, 12);
        switch (b.f180129a[order.f.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.freelancer_sale_description_refund, zhm.u.c(textLocalisedClause3), null, 12);
            case 2:
                return new TextLocalisedClause(R$string.freelancer_sale_description_chargeback, zhm.u.c(textLocalisedClause3), null, 12);
            case 3:
            case 4:
                return textLocalisedClause;
            case 5:
                return new TextLocalisedClause(R$string.freelancer_sale_description_refund_reversal, zhm.u.c(textLocalisedClause3), null, 12);
            case 6:
                return new TextLocalisedClause(R$string.freelancer_sale_description_chargeback_reversal, zhm.u.c(textLocalisedClause3), null, 12);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model d(com.revolut.feature.freelancer.common.models.sale.FreelancerSale.OrderSale r30, com.revolut.core.ui_kit.models.q0 r31) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k17.c.d(com.revolut.feature.freelancer.common.models.sale.FreelancerSale$OrderSale, com.revolut.core.ui_kit.models.q0):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }
}
