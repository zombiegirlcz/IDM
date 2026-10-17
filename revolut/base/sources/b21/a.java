package b21;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.o;
import ko3.b;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static String a(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            return bigDecimal.toPlainString();
        }
        return null;
    }

    public static Long b(DateTime dateTime) {
        if (dateTime != null) {
            return Long.valueOf(dateTime.getMillis());
        }
        return null;
    }

    public static String c(b bVar) {
        if (bVar == null) {
            return null;
        }
        String strK = GsonHolder.a().k(bVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static Long d(Instant instant) {
        if (instant != null) {
            return Long.valueOf(instant.toEpochMilli());
        }
        return null;
    }

    public static b e(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<b>() { // from class: com.revolut.data.database.typeconverter.CommonTypeConverters$jsonToDecimalMoney$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (b) objD;
    }

    public static Map f(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<Map<String, ? extends String>>() { // from class: com.revolut.data.database.typeconverter.CommonTypeConverters$jsonToMapStringString$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (Map) objD;
    }

    public static jo3.b g(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<jo3.b>() { // from class: com.revolut.data.database.typeconverter.CommonTypeConverters$jsonToMoney$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (jo3.b) objD;
    }

    public static String h(LocalDate localDate) {
        if (localDate != null) {
            return localDate.toString();
        }
        return null;
    }

    public static DateTime i(Long l2) {
        if (l2 != null) {
            return new DateTime(l2.longValue());
        }
        return null;
    }

    public static Instant j(Long l2) {
        if (l2 != null) {
            return Instant.ofEpochMilli(l2.longValue());
        }
        return null;
    }

    public static List k(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.data.database.typeconverter.CommonTypeConverters$mapJsonToListOfStrings$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    public static Set l(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<Set<? extends String>>() { // from class: com.revolut.data.database.typeconverter.CommonTypeConverters$mapJsonToSetOfStrings$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (Set) objD;
    }

    public static String m(List list) {
        if (list != null) {
            return d.r("toJson(...)", list);
        }
        return null;
    }

    public static String n(Map map) {
        if (map == null) {
            return null;
        }
        String strK = GsonHolder.a().k(map);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static String o(jo3.b bVar) {
        if (bVar == null) {
            return null;
        }
        String strK = GsonHolder.a().k(bVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static BigDecimal p(String str) {
        if (str != null) {
            return new BigDecimal(str);
        }
        return null;
    }

    public static LocalDate q(String str) {
        if (str != null) {
            return LocalDate.parse(str);
        }
        return null;
    }
}
