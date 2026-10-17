package xq9;

import ar9.k;
import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static List a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends k>>() { // from class: com.revolut.feature.payments.groups.impl.data.database.converters.PaymentGroupBillLineItemConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    public static String b(List list) {
        if (list != null) {
            return com.revolut.data.database.models.openbanking.d.r("toJson(...)", list);
        }
        return null;
    }
}
