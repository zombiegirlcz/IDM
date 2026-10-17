package gz8;

import java.util.List;
import jz8.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static List a(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Json jsonA = mz8.a.a();
        jsonA.getClass();
        return (List) jsonA.b(new qlm.e(r.Companion.serializer()), json);
    }
}
