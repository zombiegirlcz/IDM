package fhl;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.time.LocalDate;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static Long a(DateTime dateTime) {
        if (dateTime != null) {
            return Long.valueOf(dateTime.getMillis());
        }
        return null;
    }

    public static String b(ko3.b bVar) {
        if (bVar == null) {
            return null;
        }
        String strK = xgl.a.a().k(bVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static ko3.b c(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = xgl.a.a();
        Type type = new TypeToken<ko3.b>() { // from class: com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.typeconverters.CommonTypeConverters$jsonToDecimalMoney$lambda$0$$inlined$fromJson$1
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
        o oVarA = xgl.a.a();
        Type type = new TypeToken<jo3.b>() { // from class: com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.typeconverters.CommonTypeConverters$jsonToMoney$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (jo3.b) objD;
    }

    public static String e(LocalDate localDate) {
        if (localDate != null) {
            return localDate.toString();
        }
        return null;
    }

    public static DateTime f(Long l2) {
        if (l2 != null) {
            return new DateTime(l2.longValue());
        }
        return null;
    }

    public static String g(jo3.b bVar) {
        if (bVar == null) {
            return null;
        }
        String strK = xgl.a.a().k(bVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static LocalDate h(String str) {
        if (str != null) {
            return LocalDate.parse(str);
        }
        return null;
    }
}
