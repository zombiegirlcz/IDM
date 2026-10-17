package a9g;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h2 {
    public static u0 a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<u0>() { // from class: com.revolut.feature.travel.hotels.impl.database.entity.PropertyBookingDatesEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (u0) objD;
    }
}
