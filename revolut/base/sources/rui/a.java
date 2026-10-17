package rui;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.v1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static j0 a(lui.e output) {
        Intrinsics.checkNotNullParameter(output, "output");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_cancel_booking_pass_cancelled, u.c(output.f200244b), null, 12);
        AsftPassRefundBreakdown asftPassRefundBreakdown = output.f200245c;
        String str = asftPassRefundBreakdown.f98730a;
        dj0.d dVar = asftPassRefundBreakdown.f98731b;
        return new j0((Clause) textLocalisedClause, (Clause) ((str == null || dVar.k()) ? str != null ? new TextLocalisedClause(R$string.asft_cancel_booking_refund_points, u.c(str), null, 12) : new TextLocalisedClause(R$string.asft_cancel_booking_refund_amount, u.c(ivi.b.a(dVar)), null, 12) : new TextLocalisedClause(R$string.asft_cancel_booking_refund_amount_points, v.k(ivi.b.a(dVar), str), null, 12)), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(R$string.asft_cancel_booking_purchase_new_pass, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
    }
}
