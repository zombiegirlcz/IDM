package bjk;

import bjk.y0;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x0 implements kg.t {
    @Override // kg.t
    public final Object deserialize(kg.u json, Type type, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = boh.f.i("type", json);
        if (strI == null) {
            throw new NullPointerException("type field is required");
        }
        if (!strI.equals("BADGE")) {
            throw new IllegalStateException("unknown type of header.content");
        }
        Object objD = ((a31.a) context).d(json, y0.b.e.C0110b.class);
        Intrinsics.checkNotNullExpressionValue(objD, "deserialize(...)");
        return (y0.b.e) objD;
    }
}
