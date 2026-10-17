package x69;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static List a(String str) {
        if (str != null) {
            o oVarA = GsonHolder.a();
            Type type = new TypeToken<List<? extends v69.a>>() { // from class: com.revolut.feature.notification_centre.impl.data.database.typeconverter.InboxItemButtonTypeConverter$fromJsonToItemButton$lambda$0$$inlined$fromJson$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object objD = oVarA.d(str, type);
            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
            List list = (List) objD;
            if (list != null) {
                return list;
            }
        }
        return f0.f322471a;
    }
}
