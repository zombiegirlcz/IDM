package com.revolut.data.database.models.premium;

import fva.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;", "Lfva/j;", "toDomain", "(Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;)Lfva/j;", "toEmbeddedEntity", "(Lfva/j;)Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecurringPlanInfoEmbeddedEntityMapperKt {
    @NotNull
    public static final j toDomain(@NotNull RecurringPlanInfoEmbeddedEntity recurringPlanInfoEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recurringPlanInfoEmbeddedEntity, "<this>");
        boolean zIsTrial = recurringPlanInfoEmbeddedEntity.isTrial();
        List<String> billingCyclesIds = recurringPlanInfoEmbeddedEntity.getBillingCyclesIds();
        if (billingCyclesIds == null) {
            billingCyclesIds = f0.f322471a;
        }
        return new j(zIsTrial, billingCyclesIds, recurringPlanInfoEmbeddedEntity.getPlanName(), recurringPlanInfoEmbeddedEntity.getPlanTier());
    }

    @NotNull
    public static final RecurringPlanInfoEmbeddedEntity toEmbeddedEntity(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new RecurringPlanInfoEmbeddedEntity(jVar.f138401a, jVar.f138402b, jVar.f138403c, jVar.d);
    }
}
