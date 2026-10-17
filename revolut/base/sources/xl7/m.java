package xl7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.FailedPaymentDetails;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {
    public static final TextLocalisedClause a(FailedPaymentDetails failedPaymentDetails, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(failedPaymentDetails, "<this>");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        return new TextLocalisedClause(R$string.car_insurance_policy_summary_sections_failed_payment_description, v.k(n.g(failedPaymentDetails.f75217b, null, null, 3), n.h((LocalDate) kotlin.ranges.f.c(failedPaymentDetails.f75216a, currentDate))), null, 12);
    }
}
