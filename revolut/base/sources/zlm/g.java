package zlm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import ulm.b0;
import ulm.c0;
import ulm.e0;
import ulm.u0;
import ulm.x0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g {
    static {
        mmm.m.Companion.getClass();
        mmm.l.c("\"\\");
        mmm.l.c("\t ,=");
    }

    public static final boolean a(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.f(response.f226087a.f281096b, "HEAD")) {
            return false;
        }
        int i = response.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && vlm.j.h(response) == -1 && !"chunked".equalsIgnoreCase(response.f("Transfer-Encoding", null))) ? false : true;
    }

    public static final void b(e0 e0Var, x0 url2, u0 headers) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (e0Var == e0.F1) {
            return;
        }
        c0.Companion.getClass();
        List listC = b0.c(url2, headers);
        if (listC.isEmpty()) {
            return;
        }
        e0Var.i(url2, listC);
    }
}
