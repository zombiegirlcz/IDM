package txb;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import vxb.z;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static z a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<z>() { // from class: com.revolut.feature.rev_points.impl.data.storage.database.converter.RevPointsTransactionExchangeAmountConverter$fromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (z) objD;
    }
}
