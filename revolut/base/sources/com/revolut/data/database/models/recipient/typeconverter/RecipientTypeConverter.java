package com.revolut.data.database.models.recipient.typeconverter;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.recipient.RecipientEmbeddedEntity;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/data/database/models/recipient/typeconverter/RecipientTypeConverter;", "", "<init>", "()V", "fromRecipientToJson", "", "recipient", "Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;", "fromJsonToRecipient", "json", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecipientTypeConverter {
    public final RecipientEmbeddedEntity fromJsonToRecipient(String json) {
        if (json == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<RecipientEmbeddedEntity>() { // from class: com.revolut.data.database.models.recipient.typeconverter.RecipientTypeConverter$fromJsonToRecipient$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (RecipientEmbeddedEntity) objD;
    }

    public final String fromRecipientToJson(RecipientEmbeddedEntity recipient) {
        if (recipient == null) {
            return null;
        }
        String strK = GsonHolder.a().k(recipient);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
