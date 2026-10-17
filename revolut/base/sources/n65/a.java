package n65;

import android.os.Parcelable;
import aw0.c7;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static y0 a(int i) {
        int i2 = R$string.credit_loan_change_repayment_day_success;
        j jVar = c7.Companion;
        LocalDate localDateWithDayOfMonth = LocalDate.now().withDayOfMonth(i);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        return new y0("change-repayment-day-success", new j0((Clause) new TextLocalisedClause(i2, u.c(j.b(jVar, localDateWithDayOfMonth, new LocalDateClause$DateFormat.DayOfMonth(true))), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4);
    }
}
