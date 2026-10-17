package rrl;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import krl.b;
import krl.e;
import krl.g;
import krl.h;
import krl.p;
import krl.q;
import nrl.d;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static krl.a a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = d.a();
        Type type = new TypeToken<krl.a>() { // from class: com.revolut.trading.orders.data.typeconverters.InvestOrderTypeConverters$fromJsonToInitiatedByEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (krl.a) objD;
    }

    public static b b(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = d.a();
        Type type = new TypeToken<b>() { // from class: com.revolut.trading.orders.data.typeconverters.InvestOrderTypeConverters$fromJsonToInvestCommodityOrderEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (b) objD;
    }

    public static krl.d c(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = d.a();
        Type type = new TypeToken<krl.d>() { // from class: com.revolut.trading.orders.data.typeconverters.InvestOrderTypeConverters$fromJsonToInvestFundOrderEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (krl.d) objD;
    }

    public static e d(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = d.a();
        Type type = new TypeToken<e>() { // from class: com.revolut.trading.orders.data.typeconverters.InvestOrderTypeConverters$fromJsonToInvestMarginOrderEmbeddedEntity$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (e) objD;
    }

    public static g e(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = d.a();
        Type type = new TypeToken<g>() { // from class: com.revolut.trading.orders.data.typeconverters.InvestOrderTypeConverters$fromJsonToInvestMutualFundOrderEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (g) objD;
    }

    public static h f(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = d.a();
        Type type = new TypeToken<h>() { // from class: com.revolut.trading.orders.data.typeconverters.InvestOrderTypeConverters$fromJsonToInvestOptionOrderEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (h) objD;
    }

    public static p g(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = d.a();
        Type type = new TypeToken<p>() { // from class: com.revolut.trading.orders.data.typeconverters.InvestOrderTypeConverters$fromJsonToInvestStockOrderEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (p) objD;
    }

    public static q h(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = d.a();
        Type type = new TypeToken<q>() { // from class: com.revolut.trading.orders.data.typeconverters.InvestOrderTypeConverters$fromJsonToInvestTaaOrderEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (q) objD;
    }
}
