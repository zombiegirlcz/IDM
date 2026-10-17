package q90;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import q90.x2;

/* JADX INFO: loaded from: classes19.dex */
public final class v2 implements kg.t {
    @Override // kg.t
    public final Object deserialize(kg.u json, Type type, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        kg.u uVarI = json.c().i("type");
        String strF = uVarI != null ? uVarI.f() : null;
        if (Intrinsics.f(strF, "GEO_LOCATION")) {
            Object objD = ((a31.a) context).d(json, x2.a.C1336a.class);
            Intrinsics.checkNotNullExpressionValue(objD, "deserialize(...)");
            return (x2.a) objD;
        }
        if (!Intrinsics.f(strF, "META_ACCESS_CODE")) {
            kg.u uVarI2 = json.c().i("type");
            throw new JsonParseException(j6.a.q("Unknown PermissionPayloadDto type: ", uVarI2 != null ? uVarI2.f() : null));
        }
        Object objD2 = ((a31.a) context).d(json, x2.a.b.class);
        Intrinsics.checkNotNullExpressionValue(objD2, "deserialize(...)");
        return (x2.a) objD2;
    }
}
