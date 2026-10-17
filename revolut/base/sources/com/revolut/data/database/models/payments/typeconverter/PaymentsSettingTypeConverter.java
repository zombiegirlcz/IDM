package com.revolut.data.database.models.payments.typeconverter;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.data.database.models.payments.PaymentsSettingEmbeddedEntity;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/revolut/data/database/models/payments/typeconverter/PaymentsSettingTypeConverter;", "", "<init>", "()V", "fromJson", "", "Lcom/revolut/data/database/models/payments/PaymentsSettingEmbeddedEntity;", "json", "", "toJson", "entities", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentsSettingTypeConverter {
    public final List<PaymentsSettingEmbeddedEntity> fromJson(String json) {
        if (json == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends PaymentsSettingEmbeddedEntity>>() { // from class: com.revolut.data.database.models.payments.typeconverter.PaymentsSettingTypeConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    public final String toJson(List<PaymentsSettingEmbeddedEntity> entities) {
        if (entities != null) {
            return d.r("toJson(...)", entities);
        }
        return null;
    }
}
