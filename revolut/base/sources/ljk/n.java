package ljk;

import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import ljk.m;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements t {
    @Override // kg.t
    public final Object deserialize(u json, Type type, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = boh.f.i("type", json);
        if (strI == null) {
            throw new NullPointerException("type field is required");
        }
        if (!strI.equals("HEADER")) {
            throw new IllegalStateException("unknown type of header");
        }
        Object objD = ((a31.a) context).d(json, m.b.class);
        Intrinsics.checkNotNullExpressionValue(objD, "deserialize(...)");
        return (m) objD;
    }
}
