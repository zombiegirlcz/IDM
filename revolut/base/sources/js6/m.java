package js6;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import ks6.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public static a0 a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<a0>() { // from class: com.revolut.feature.freelancer.impl.database.converters.InvoiceSupplierDetailsEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (a0) objD;
    }
}
