package com.revolut.data.database.models.endcriteria.mapper;

import com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaEmbeddedEntity;
import com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaTypeEmbeddedEntity;
import com.revolut.feature.shared.recurring_payments.models.RecurringPaymentEndCriteria;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDomain", "Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria;", "Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentEndCriteriaEmbeddedEntityMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringPaymentEndCriteriaTypeEmbeddedEntity.values().length];
            try {
                iArr[RecurringPaymentEndCriteriaTypeEmbeddedEntity.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringPaymentEndCriteriaTypeEmbeddedEntity.COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RecurringPaymentEndCriteria toDomain(@NotNull RecurringPaymentEndCriteriaEmbeddedEntity recurringPaymentEndCriteriaEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPaymentEndCriteriaEmbeddedEntity, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[recurringPaymentEndCriteriaEmbeddedEntity.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        LocalDate localDate = LocalDate.parse(recurringPaymentEndCriteriaEmbeddedEntity.getDate());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return new RecurringPaymentEndCriteria.Date(localDate);
    }
}
