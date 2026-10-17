package js6;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ks6.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static List a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends i0>>() { // from class: com.revolut.feature.freelancer.impl.database.converters.OrderEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }
}
