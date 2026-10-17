package gz8;

import jz8.l;
import jz8.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static z0 a(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Json jsonA = mz8.a.a();
        jsonA.getClass();
        return (z0) jsonA.b(z0.Companion.serializer(), json);
    }

    public static l b(String str) {
        if (str == null) {
            return null;
        }
        Json jsonA = mz8.a.a();
        jsonA.getClass();
        return (l) jsonA.b(l.Companion.serializer(), str);
    }
}
