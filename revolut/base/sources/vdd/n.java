package vdd;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultEntityGsonHolder;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {
    public static e a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = VaultEntityGsonHolder.a();
        Type type = new TypeToken<e>() { // from class: com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultStateReasonConverter$jsonToStateReason$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (e) objD;
    }
}
