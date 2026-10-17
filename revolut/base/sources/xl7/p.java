package xl7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.CancellationDetails;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    public static final y a(vn7.a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return vn7.a.d(aVar, i, R$string.car_insurance_policy_summary_bound_dates_modal_description, u.c(new TextLocalisedClause(R$string.car_insurance_policy_summary_bound_dates_modal_description_policy_documentation, null, new Click(30, (Integer) null, (Object) null, "POLICY_DOCUMENTATION", false), 10)), Integer.valueOf(R$string.car_insurance_common_gotIt), null, 112);
    }

    public static final qv0.i b(ZonedDateTime endDateTime, CancellationDetails cancellationDetails) {
        Intrinsics.checkNotNullParameter(endDateTime, "endDateTime");
        return cancellationDetails == null ? new CellDetailsActionDelegate.Model("POLICY_RENEWAL_DATE", new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_policy_end_date, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), n.f(endDateTime, null, false, 7), false, false, null, null, 0, 0, 32736) : new CellDetailsDelegate.Model("POLICY_CANCELLATION_DATE", new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_policy_cancellation_date, null, null, 14), n.f(cancellationDetails.f75184a, null, false, 5), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static final CellDetailsDelegate.Model c(LocalDate nextPaymentDate) {
        Intrinsics.checkNotNullParameter(nextPaymentDate, "nextPaymentDate");
        return new CellDetailsDelegate.Model("POLICY_NEXT_PAYMENT_DATE", new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_policy_payment_date, null, null, 14), n.h(nextPaymentDate), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static final CellDetailsActionDelegate.Model d(String policyNumber) {
        Intrinsics.checkNotNullParameter(policyNumber, "policyNumber");
        return d0.W(policyNumber) ? new CellDetailsActionDelegate.Model("POLICY_NUMBER_IN_PROGRESS", new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_policy_policy_number, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_policy_policy_number_in_progress_title, null, null, 14), false, false, null, null, 0, 0, 32736) : new CellDetailsActionDelegate.Model("POLICY_NUMBER", new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_policy_policy_number, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(policyNumber, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, null, policyNumber, 0, 0, 32224);
    }

    public static final CellDetailsActionDelegate.Model e(ZonedDateTime startDateTime) {
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        return new CellDetailsActionDelegate.Model("POLICY_START_DATE", new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_policy_start_date, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), n.f(startDateTime, null, false, 7), false, false, null, null, 0, 0, 32736);
    }
}
