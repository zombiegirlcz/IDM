package w10;

import java.lang.reflect.Type;
import java.util.Base64;
import kg.u;
import kg.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements kg.t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        json.getClass();
        if (json instanceof v) {
            return null;
        }
        return Base64.getDecoder().decode(json.f());
    }
}
