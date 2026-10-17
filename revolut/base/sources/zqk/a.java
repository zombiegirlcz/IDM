package zqk;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import drk.h;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static h a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<h>() { // from class: com.revolut.retail.feature.stockdetails.impl.data.database.converters.StockFinancialsStatementItemTypeConverter$fromJsonToStockFinancialsStatementItemsEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (h) objD;
    }
}
