package gz8;

import java.util.List;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static List a(String str) {
        if (str == null) {
            return null;
        }
        Json jsonA = mz8.a.a();
        jsonA.getClass();
        return (List) jsonA.b(new qlm.e(jz8.e.Companion.serializer()), str);
    }
}
