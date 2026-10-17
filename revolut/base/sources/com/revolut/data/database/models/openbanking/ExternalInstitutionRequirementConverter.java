package com.revolut.data.database.models.openbanking;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/data/database/models/openbanking/ExternalInstitutionRequirementConverter;", "", "<init>", "()V", "", "value", "", "fromString", "(Ljava/lang/String;)Ljava/util/List;", "list", "fromArrayList", "(Ljava/util/List;)Ljava/lang/String;", "Lkg/o;", "gson", "Lkg/o;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalInstitutionRequirementConverter {

    @NotNull
    private final o gson = new o();

    @NotNull
    public final String fromArrayList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        String strK = this.gson.k(list);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    @NotNull
    public final List<String> fromString(String value) {
        if (value == null || d0.W(value)) {
            return f0.f322471a;
        }
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.data.database.models.openbanking.ExternalInstitutionRequirementConverter$fromString$listType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = this.gson.d(value, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }
}
