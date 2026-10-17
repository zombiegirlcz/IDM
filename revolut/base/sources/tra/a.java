package tra;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static sra.a a(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<sra.a>() { // from class: com.revolut.feature.push_to_card.impl.storage.database.entity.converter.CardEntityTypeConverter$fromJson$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(json, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (sra.a) objD;
    }
}
