package kbc;

import aw0.ka;
import aw0.qa;
import aw0.ra;
import aw0.sa;
import aw0.ta;
import aw0.ua;
import aw0.va;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public final Clause a(Delivery delivery) {
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        LocalDate localDateL = c6d.b.l(delivery);
        return localDateL != null ? new TimeClause(oc.c.F(localDateL), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12) : new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_subtitle_no_updates, null, null, 14);
    }

    public final TextLocalisedClause b(wbc.c progress) {
        int i;
        Intrinsics.checkNotNullParameter(progress, "progress");
        switch (a.f182573a[progress.ordinal()]) {
            case 1:
                i = R$string.revolut_pay_order_details_tracking_state_title_cancelled_date;
                break;
            case 2:
                i = R$string.revolut_pay_order_details_tracking_state_title_returned_date;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                i = R$string.revolut_pay_order_details_tracking_state_title_estimated_delivery;
                break;
            case 7:
            case 8:
                i = R$string.revolut_pay_order_details_tracking_state_title_delivery_date;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public final va c(wbc.c progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        switch (a.f182573a[progress.ordinal()]) {
            case 1:
            case 2:
                return qa.f10498a;
            case 3:
                return ra.f10516a;
            case 4:
            case 6:
                return sa.f10535a;
            case 5:
                return ua.f10568a;
            case 7:
            case 8:
                return ta.f10550a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final float d(wbc.c progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        switch (a.f182573a[progress.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return BitmapDescriptorFactory.HUE_RED;
            case 4:
                return 0.25f;
            case 5:
            case 6:
                return 0.75f;
            case 7:
            case 8:
                return 1.0f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final TextLocalisedClause e(wbc.c progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        switch (a.f182573a[progress.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_badge_cancelled, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_badge_returned, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_badge_ordered, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_badge_shipped, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_badge_missed_delivery, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_badge_in_transit, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_badge_delivered, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.revolut_pay_order_details_tracking_state_badge_pickup_available, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
