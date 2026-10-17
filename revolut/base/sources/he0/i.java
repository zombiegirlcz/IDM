package he0;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import kg.s;
import kg.t;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements z, t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        String strF = json.f();
        Intrinsics.h(strF);
        if (strF.length() == 0) {
            throw new JsonParseException("Empty date string");
        }
        LocalDateTime localDateTime = LocalDateTime.parse(strF);
        Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
        return localDateTime;
    }

    @Override // kg.z
    public final u serialize(Object obj2, Type typeOfSrc, y context) {
        LocalDateTime src2 = (LocalDateTime) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter(context, "context");
        return new x(src2.toString());
    }
}
