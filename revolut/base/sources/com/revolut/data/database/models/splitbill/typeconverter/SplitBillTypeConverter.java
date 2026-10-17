package com.revolut.data.database.models.splitbill.typeconverter;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.splitbill.SplitMoneyRequestEmbeddedEntity;
import com.revolut.data.database.models.splitbill.SplittedItemEntity;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\r\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0007¨\u0006\u000e"}, d2 = {"Lcom/revolut/data/database/models/splitbill/typeconverter/SplitBillTypeConverter;", "", "<init>", "()V", "jsonToMoneyRequests", "", "Lcom/revolut/data/database/models/splitbill/SplitMoneyRequestEmbeddedEntity;", "json", "", "moneyRequestsToJson", "moneyRequests", "jsonToSplittedItemEntity", "Lcom/revolut/data/database/models/splitbill/SplittedItemEntity;", "splittedItemEntityToJson", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBillTypeConverter {
    @NotNull
    public final List<SplitMoneyRequestEmbeddedEntity> jsonToMoneyRequests(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends SplitMoneyRequestEmbeddedEntity>>() { // from class: com.revolut.data.database.models.splitbill.typeconverter.SplitBillTypeConverter$jsonToMoneyRequests$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    @NotNull
    public final List<SplittedItemEntity> jsonToSplittedItemEntity(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends SplittedItemEntity>>() { // from class: com.revolut.data.database.models.splitbill.typeconverter.SplitBillTypeConverter$jsonToSplittedItemEntity$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    @NotNull
    public final String moneyRequestsToJson(@NotNull List<SplitMoneyRequestEmbeddedEntity> moneyRequests) {
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        String strK = GsonHolder.a().k(moneyRequests);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    @NotNull
    public final String splittedItemEntityToJson(@NotNull List<SplittedItemEntity> moneyRequests) {
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        String strK = GsonHolder.a().k(moneyRequests);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
