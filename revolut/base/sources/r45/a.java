package r45;

import h55.b;
import ie0.m;
import java.time.LocalDate;
import kotlinx.serialization.json.Json;
import o45.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static String a(c cVar) {
        if (cVar == null) {
            return null;
        }
        Json jsonA = b.a();
        jsonA.getClass();
        return jsonA.c(c.Companion.serializer(), cVar);
    }

    public static c b(String str) {
        if (str == null) {
            return null;
        }
        Json jsonA = b.a();
        jsonA.getClass();
        return (c) jsonA.b(nlm.a.c(c.Companion.serializer()), str);
    }

    public static LocalDate c(String str) {
        if (str != null) {
            return (LocalDate) b.a().b(m.f160609a, str);
        }
        return null;
    }
}
