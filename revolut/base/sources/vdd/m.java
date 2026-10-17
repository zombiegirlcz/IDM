package vdd;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultEntityGsonHolder;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {
    public static d a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = VaultEntityGsonHolder.a();
        Type type = new TypeToken<d>() { // from class: com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultPocketInfoTypeConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (d) objD;
    }
}
