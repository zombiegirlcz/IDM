package com.revolut.data.database.models.recurringpayments.typeconverter;

import ce0.h;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentMethodEmbeddedEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import nlm.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/typeconverter/RecurringPaymentMethodConverter;", "Lce0/h;", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;)V", "", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "jsonToEntity", "(Ljava/lang/String;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "entity", "entityToJson", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;)Ljava/lang/String;", "Lkotlinx/serialization/json/Json;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentMethodConverter implements h {

    @NotNull
    private final Json json;

    public RecurringPaymentMethodConverter(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
    }

    public final String entityToJson(RecurringPaymentMethodEmbeddedEntity entity) {
        if (entity == null) {
            return null;
        }
        Json json = this.json;
        json.getClass();
        return json.c(RecurringPaymentMethodEmbeddedEntity.INSTANCE.serializer(), entity);
    }

    public final RecurringPaymentMethodEmbeddedEntity jsonToEntity(String json) {
        if (json == null) {
            return null;
        }
        Json json2 = this.json;
        json2.getClass();
        return (RecurringPaymentMethodEmbeddedEntity) json2.b(a.c(RecurringPaymentMethodEmbeddedEntity.INSTANCE.serializer()), json);
    }
}
