package txb;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import vxb.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static a0 a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<a0>() { // from class: com.revolut.feature.rev_points.impl.data.storage.database.converter.RevPointsTransactionExchangeDetailsTypeConverter$fromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (a0) objD;
    }

    public static String b(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        String strK = GsonHolder.a().k(a0Var);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
