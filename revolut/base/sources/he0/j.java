package he0;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements t, z {
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
        LocalDate localDate = LocalDate.parse(strF);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return localDate;
    }

    @Override // kg.z
    public final u serialize(Object obj2, Type typeOfSrc, y context) {
        LocalDate src2 = (LocalDate) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter(context, "context");
        return new x(src2.toString());
    }
}
