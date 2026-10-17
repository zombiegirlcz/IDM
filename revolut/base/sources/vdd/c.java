package vdd;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultEntityGsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static List a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = VaultEntityGsonHolder.a();
        Type type = new TypeToken<List<? extends b>>() { // from class: com.revolut.feature.shared.vaults.domain.impl.data.database.models.MoneyBoxesRecurringPaymentEntityTypeConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }
}
