package tgc;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import rgc.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static String a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strK = xgc.a.a().k(eVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static e b(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = xgc.a.a();
        Type type = new TypeToken<e>() { // from class: com.revolut.feature.rewards.impl.data.database.typeconverter.RewardsTypeConverters$jsonToDescription$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (e) objD;
    }

    public static sgc.a c(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        o oVarA = xgc.a.a();
        Type type = new TypeToken<sgc.a>() { // from class: com.revolut.feature.rewards.impl.data.database.typeconverter.RewardsTypeConverters$jsonToMerchant$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (sgc.a) objD;
    }
}
