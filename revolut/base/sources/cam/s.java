package cam;

import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.i1;
import ulm.j1;
import ulm.y0;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Response responseB;
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h hVar = (zlm.h) chain;
        j1 j1Var = hVar.e;
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(j1Var.f281095a.i);
        if (cookie != null) {
            i1 i1VarB = j1Var.b();
            i1VarB.a("Cookie", cookie);
            responseB = hVar.b(new j1(i1VarB));
        } else {
            responseB = hVar.b(j1Var);
        }
        List list = (List) ((TreeMap) responseB.f.b()).get("Set-Cookie");
        if (list != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                cookieManager.setCookie(j1Var.f281095a.i, (String) it8.next());
            }
        }
        return responseB;
    }
}
