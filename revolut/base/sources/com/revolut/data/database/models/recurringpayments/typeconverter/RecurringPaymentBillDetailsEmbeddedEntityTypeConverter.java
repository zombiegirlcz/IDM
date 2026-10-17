package com.revolut.data.database.models.recurringpayments.typeconverter;

import ce0.h;
import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentBillDetailsEntity;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/typeconverter/RecurringPaymentBillDetailsEmbeddedEntityTypeConverter;", "Lce0/h;", "<init>", "()V", "", "json", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "jsonToEntity", "(Ljava/lang/String;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "entity", "entityToJson", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;)Ljava/lang/String;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentBillDetailsEmbeddedEntityTypeConverter implements h {
    public final String entityToJson(RecurringPaymentBillDetailsEntity entity) {
        if (entity == null) {
            return null;
        }
        String strK = GsonHolder.a().k(entity);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public final RecurringPaymentBillDetailsEntity jsonToEntity(String json) {
        if (json == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<RecurringPaymentBillDetailsEntity>() { // from class: com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentBillDetailsEmbeddedEntityTypeConverter$jsonToEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (RecurringPaymentBillDetailsEntity) objD;
    }
}
