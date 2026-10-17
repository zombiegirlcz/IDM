package js6;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import ks6.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public static m0 a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<m0>() { // from class: com.revolut.feature.freelancer.impl.database.converters.OriginalOrderDetailsEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (m0) objD;
    }
}
