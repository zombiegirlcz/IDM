package nfg;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import qfg.g;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static g a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<g>() { // from class: com.revolut.feature.travel.miles.impl.database.converter.TravelMilesProviderRateEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (g) objD;
    }

    public static String b(g gVar) {
        if (gVar == null) {
            return null;
        }
        String strK = GsonHolder.a().k(gVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
