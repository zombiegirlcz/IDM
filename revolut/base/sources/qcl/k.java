package qcl;

import com.google.gson.reflect.TypeToken;
import hcl.a3;
import hcl.d3;
import hcl.l0;
import hcl.n0;
import hcl.v2;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {
    public static String a(l0 l0Var) {
        if (l0Var == null) {
            return null;
        }
        String strK = zbl.a.a().k(l0Var);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static String b(n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        String strK = zbl.a.a().k(n0Var);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static l0 c(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<l0>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentEmbeddedEntityTypeConverters$fromJsonToInstrumentListStatusEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (l0) objD;
    }

    public static n0 d(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<n0>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentEmbeddedEntityTypeConverters$fromJsonToInstrumentStateDetailsEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (n0) objD;
    }

    public static v2 e(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<v2>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentEmbeddedEntityTypeConverters$fromJsonToPriceRangeEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (v2) objD;
    }

    public static a3 f(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<a3>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentEmbeddedEntityTypeConverters$fromJsonToRequiredProductsEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (a3) objD;
    }

    public static d3 g(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<d3>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentEmbeddedEntityTypeConverters$fromJsonToTypeSpecificPropertiesEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (d3) objD;
    }

    public static String h(v2 v2Var) {
        if (v2Var == null) {
            return null;
        }
        String strK = zbl.a.a().k(v2Var);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static String i(a3 a3Var) {
        if (a3Var == null) {
            return null;
        }
        String strK = zbl.a.a().k(a3Var);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }

    public static String j(d3 d3Var) {
        if (d3Var == null) {
            return null;
        }
        String strK = zbl.a.a().k(d3Var);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
