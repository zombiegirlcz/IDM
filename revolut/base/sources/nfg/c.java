package nfg;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static qfg.e a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<qfg.e>() { // from class: com.revolut.feature.travel.miles.impl.database.converter.TravelMilesCampaignEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (qfg.e) objD;
    }

    public static String b(qfg.e eVar) {
        if (eVar == null) {
            return null;
        }
        String strK = GsonHolder.a().k(eVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
