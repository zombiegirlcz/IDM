package hbg;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.u1;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Custom f150710a = new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254);

    public static nii.z a(k0 bookingAction) {
        Intrinsics.checkNotNullParameter(bookingAction, "bookingAction");
        int i = l0.f150708a[bookingAction.ordinal()];
        if (i == 1) {
            return new nii.z(new TextLocalisedClause(R$string.hotels_booking_details_failed_title, null, null, 14), new TextLocalisedClause(R$string.hotels_booking_details_failed_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
        }
        if (i == 2) {
            return new nii.z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static nii.j0 b(k0 k0Var) {
        int i = l0.f150708a[k0Var.ordinal()];
        if (i == 1) {
            return new nii.j0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_success_confirmed_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.hotels_booking_details_success_confirmed_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, nii.h0.CONFETTI, (ResourceImage) null, 3068);
        }
        if (i == 2) {
            return new nii.j0((Clause) new TextLocalisedClause(R$string.hotels_booking_amendment_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.hotels_booking_details_success_bottom_sheet_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, nii.h0.CONFETTI, (ResourceImage) null, 3068);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static CompositeClause c(k0 k0Var, TextLocalisedClause textLocalisedClause) {
        int i;
        int i2 = l0.f150708a[k0Var.ordinal()];
        if (i2 == 1) {
            i = R$string.hotels_booking_details_success_bottom_sheet_points_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.hotels_booking_details_success_bottom_sheet_amendment_title;
        }
        return new CompositeClause(zhm.v.k(new TextLocalisedClause(i, null, null, 14), textLocalisedClause), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
