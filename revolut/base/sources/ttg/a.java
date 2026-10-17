package ttg;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import stg.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static String a(List list) {
        if (list != null) {
            return d.r("toJson(...)", list);
        }
        return null;
    }

    public static List b(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends c>>() { // from class: com.revolut.feature.wealth.account_closure.impl.data.database.typeconverters.AccountClosureProgressStepListTypeConverter$toAccountClosureProgressStepEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }
}
