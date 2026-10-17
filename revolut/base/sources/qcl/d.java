package qcl;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {
    public static String a(ko3.b bVar) {
        if (bVar == null) {
            return null;
        }
        String strK = zbl.a.a().k(bVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static Long b(Instant instant) {
        if (instant != null) {
            return Long.valueOf(instant.toEpochMilli());
        }
        return null;
    }

    public static ko3.b c(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<ko3.b>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.CommonTypeConverters$jsonToDecimalMoney$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ko3.b) objD;
    }

    public static jo3.b d(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<jo3.b>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.CommonTypeConverters$jsonToMoney$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (jo3.b) objD;
    }

    public static Instant e(Long l2) {
        if (l2 != null) {
            return Instant.ofEpochMilli(l2.longValue());
        }
        return null;
    }

    public static List f(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.CommonTypeConverters$mapJsonToListOfStrings$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    public static String g(List list) {
        if (list == null) {
            return null;
        }
        String strK = zbl.a.a().k(list);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static String h(jo3.b bVar) {
        if (bVar == null) {
            return null;
        }
        String strK = zbl.a.a().k(bVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
