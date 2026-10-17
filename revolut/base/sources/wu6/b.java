package wu6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or6.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static TextClause a(e scheme) {
        String str;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        switch (a.f300072c[scheme.ordinal()]) {
            case 1:
                str = "American Express";
                break;
            case 2:
                str = "Discover";
                break;
            case 3:
                str = "JCB";
                break;
            case 4:
                str = "Mastercard";
                break;
            case 5:
                str = "Private Label";
                break;
            case 6:
                str = "Visa";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static TextLocalisedClause b(lr6.a state) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.f300070a[state.ordinal()]) {
            case 1:
                i = R$string.freelancer_sale_acquiring_payment_state_authentication_challenge;
                break;
            case 2:
                i = R$string.freelancer_sale_acquiring_payment_state_authentication_verified;
                break;
            case 3:
                i = R$string.freelancer_sale_acquiring_payment_state_authorisation_passed;
                break;
            case 4:
                i = R$string.freelancer_sale_acquiring_payment_state_authorisation_started;
                break;
            case 5:
                i = R$string.freelancer_sale_acquiring_payment_state_authorised;
                break;
            case 6:
                i = R$string.freelancer_sale_acquiring_payment_state_cancellation_started;
                break;
            case 7:
                i = R$string.freelancer_sale_acquiring_payment_state_cancelled;
                break;
            case 8:
                i = R$string.freelancer_sale_acquiring_payment_state_cancelling;
                break;
            case 9:
                i = R$string.freelancer_sale_acquiring_payment_state_captured;
                break;
            case 10:
                i = R$string.freelancer_sale_acquiring_payment_state_capture_started;
                break;
            case 11:
                i = R$string.freelancer_sale_acquiring_payment_state_completed;
                break;
            case 12:
                i = R$string.freelancer_sale_acquiring_payment_state_completing;
                break;
            case 13:
                i = R$string.freelancer_sale_acquiring_payment_state_declined;
                break;
            case 14:
                i = R$string.freelancer_sale_acquiring_payment_state_declining;
                break;
            case 15:
                i = R$string.freelancer_sale_acquiring_payment_state_failed;
                break;
            case 16:
                i = R$string.freelancer_sale_acquiring_payment_state_failing;
                break;
            case 17:
                i = R$string.freelancer_sale_acquiring_payment_state_pending;
                break;
            case 18:
                i = R$string.freelancer_sale_acquiring_payment_state_refund_started;
                break;
            case 19:
                i = R$string.freelancer_sale_acquiring_payment_state_refund_validated;
                break;
            case 20:
                i = R$string.freelancer_sale_acquiring_payment_state_soft_declined;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
