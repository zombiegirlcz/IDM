package r7g;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import rlm.j;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static r7g.a a(String value) {
        Object objA;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            m.Companion companion = m.INSTANCE;
            JsonObject jsonObjectK = j.k(Json.d.d(value));
            String strA = j.l((JsonElement) r0.h("searchToken", jsonObjectK)).a();
            Object objH = r0.h("nextCursor", jsonObjectK);
            if (((JsonElement) objH) instanceof JsonNull) {
                objH = null;
            }
            JsonElement jsonElement = (JsonElement) objH;
            objA = new r7g.a(jsonElement != null ? j.l(jsonElement).a() : null, strA);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return (r7g.a) (objA instanceof n ? null : objA);
    }
}
