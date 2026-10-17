package xq9;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public static ar9.e a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<ar9.e>() { // from class: com.revolut.feature.payments.groups.impl.data.database.converters.PaymentGroupBalanceTypeConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ar9.e) objD;
    }
}
