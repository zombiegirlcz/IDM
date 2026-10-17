package qcl;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {
    private r() {
    }

    public static jcl.a a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<jcl.a>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.PortfolioTypeConverters$fromJsonToCashHolding$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (jcl.a) objD;
    }

    public static jcl.g b(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<jcl.g>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.PortfolioTypeConverters$fromJsonToStockHolding$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (jcl.g) objD;
    }
}
