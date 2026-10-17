package com.revolut.data.database.models.recurringpayments.typeconverter;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentStateEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentTypeEmbeddedEntity;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/typeconverter/RecurringPaymentTypeConverter;", "", "<init>", "()V", "jsonToState", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;", "json", "", "stateToJson", "entity", "jsonToType", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;", "typeToJson", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentTypeConverter {
    @NotNull
    public final RecurringPaymentStateEmbeddedEntity jsonToState(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<RecurringPaymentStateEmbeddedEntity>() { // from class: com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentTypeConverter$jsonToState$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (RecurringPaymentStateEmbeddedEntity) objD;
    }

    @NotNull
    public final RecurringPaymentTypeEmbeddedEntity jsonToType(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<RecurringPaymentTypeEmbeddedEntity>() { // from class: com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentTypeConverter$jsonToType$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (RecurringPaymentTypeEmbeddedEntity) objD;
    }

    @NotNull
    public final String stateToJson(@NotNull RecurringPaymentStateEmbeddedEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String strK = GsonHolder.a().k(entity);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    @NotNull
    public final String typeToJson(@NotNull RecurringPaymentTypeEmbeddedEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String strK = GsonHolder.a().k(entity);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
