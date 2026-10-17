package r3f;

import com.google.gson.reflect.TypeToken;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import n3f.c;
import n3f.d;
import n3f.e;
import n3f.f;
import n3f.h;
import n3f.i;
import n3f.l;
import n3f.m;
import n3f.n;
import n3f.p;
import n3f.q;
import n3f.r;
import n3f.s;
import n3f.t;
import n3f.u;
import n3f.v;
import n3f.w;
import n3f.x;
import n3f.y;
import n3f.z;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private a() {
    }

    public static c a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<c>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToCashTradeEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (c) objD;
    }

    public static d b(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<d>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToCashTransferTradeEmbeddedEntity$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (d) objD;
    }

    public static e c(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<e>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToCommodityTradeEmbeddedEntity$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (e) objD;
    }

    public static f d(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<f>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToCouponPaymentEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (f) objD;
    }

    public static h e(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<h>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToCustodyFeesEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (h) objD;
    }

    public static i f(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<i>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToDividendEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (i) objD;
    }

    public static l g(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<l>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToExchangeTradeEmbeddedEntity$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (l) objD;
    }

    public static n3f.o h(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<n3f.o>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToFundTradeEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (n3f.o) objD;
    }

    public static y i(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<y>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToIStockTradeEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (y) objD;
    }

    public static n j(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<n>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToInitiatedByEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (n) objD;
    }

    public static p k(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<p>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToInvestValueEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (p) objD;
    }

    public static q l(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<q>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToMarginTradeEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (q) objD;
    }

    public static r m(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<r>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToMergerEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (r) objD;
    }

    public static s n(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<s>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToOvernightFeeEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (s) objD;
    }

    public static t o(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<t>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToPriceAdjustmentEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (t) objD;
    }

    public static u p(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<u>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToRedemptionEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (u) objD;
    }

    public static v q(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<v>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToRefundEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (v) objD;
    }

    public static w r(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<w>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToSpinOffEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (w) objD;
    }

    public static x s(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<x>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToStockSplitEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (x) objD;
    }

    public static z t(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<z>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromJsonToStockTransferTradeEmbeddedEntity$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (z) objD;
    }

    public static WealthAccountType u(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        o oVarA = f3f.a.a();
        Type type = new TypeToken<WealthAccountType>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromStringToWealthAccountType$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(value, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (WealthAccountType) objD;
    }

    public static m v(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = f3f.a.a();
        Type type = new TypeToken<m>() { // from class: com.revolut.feature.trading.impl.data.database.typeconverters.TradeTypeConverters$fromfFeeTradeEmbeddedEntityToJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (m) objD;
    }
}
