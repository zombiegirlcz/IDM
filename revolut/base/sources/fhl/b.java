package fhl;

import com.google.gson.reflect.TypeToken;
import ehl.q;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static String a(List list) {
        if (list == null) {
            return null;
        }
        String strK = xgl.a.a().k(list);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static List b(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = xgl.a.a();
        Type type = new TypeToken<List<? extends q>>() { // from class: com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.typeconverters.CorporateEventsConverters$stringToRestructuringDetailEntityList$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }
}
