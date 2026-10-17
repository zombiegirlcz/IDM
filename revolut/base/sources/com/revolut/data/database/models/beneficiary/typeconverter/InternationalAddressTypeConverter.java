package com.revolut.data.database.models.beneficiary.typeconverter;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so3.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/typeconverter/InternationalAddressTypeConverter;", "", "<init>", "()V", "Lso3/c;", "address", "", "addressToJson", "(Lso3/c;)Ljava/lang/String;", "json", "jsonToAddress", "(Ljava/lang/String;)Lso3/c;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InternationalAddressTypeConverter {
    public final String addressToJson(c address) {
        if (address == null) {
            return null;
        }
        String strK = GsonHolder.a().k(address);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public final c jsonToAddress(String json) {
        if (json == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<c>() { // from class: com.revolut.data.database.models.beneficiary.typeconverter.InternationalAddressTypeConverter$jsonToAddress$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (c) objD;
    }
}
