package ri9;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelCancellationOutcome;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f254570a = new a();

    private a() {
    }

    public static j0 a(RightToCancelCancellationOutcome cancellationOutcome) {
        Intrinsics.checkNotNullParameter(cancellationOutcome, "cancellationOutcome");
        TextLocalisedClause textLocalisedClauseA = ky4.a.a(R$string.credit_pay_later_cancellation_outcome_title, cancellationOutcome.f78850b);
        TextLocalisedClause textLocalisedClauseA2 = ky4.a.a(R$string.credit_pay_later_cancellation_outcome_description, cancellationOutcome.f78851c);
        TextLocalisedClause textLocalisedClauseA3 = ky4.a.a(R$string.credit_pay_later_cancellation_outcome_primary_button_label, cancellationOutcome.d);
        String str = cancellationOutcome.e;
        return new j0((Clause) textLocalisedClauseA, (Clause) textLocalisedClauseA2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, textLocalisedClauseA3, str != null ? ky4.a.a(R$string.credit_pay_later_cancellation_outcome_secondary_button_label, str) : null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
    }
}
