package fn2;

import aw0.s8;
import em2.d;
import em2.e;
import java.util.Map;
import km2.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f136512a = new a();

    private a() {
    }

    public static d a(String backgroundId, String baseUrl) {
        Intrinsics.checkNotNullParameter(backgroundId, "backgroundId");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        String strB = e(backgroundId) ? backgroundId : b(backgroundId);
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(baseUrl, "/background-banners/", c(backgroundId));
        String strR = a0.d.r(strO, "?size=thumbnail");
        return new d(strB, strO, strO, strR, strR, true, true, s8.MULTICOLOR);
    }

    public static String b(String str) {
        return a10.b.t(str, "id", "uploaded_", str);
    }

    public static String c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return d0.e0(id10, "uploaded_");
    }

    public static e d(String id10, String baseUrl, u defaultCatalogue) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(defaultCatalogue, "defaultCatalogue");
        if (e(id10)) {
            return a(id10, baseUrl);
        }
        defaultCatalogue.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return (e) ((Map) defaultCatalogue.f185710b.getValue()).get(id10);
    }

    public static boolean e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return a0.H(id10, "uploaded_", false);
    }
}
