package ns6;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import ps6.e;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static List a(String str) {
        List list;
        if (str != null) {
            o oVarA = GsonHolder.a();
            Type type = new TypeToken<List<? extends e>>() { // from class: com.revolut.feature.freelancer.impl.database.tax_pockets.converters.TaxHubCalendarEventStepConverters$jsonToEventSteps$lambda$0$$inlined$fromJson$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object objD = oVarA.d(str, type);
            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
            list = (List) objD;
        } else {
            list = null;
        }
        return list == null ? f0.f322471a : list;
    }
}
