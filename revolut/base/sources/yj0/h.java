package yj0;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import nkm.d0;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.j1;
import ulm.y0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f314363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f314364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kk0.a f314365c;
    public final j d;
    public final ij0.a e;
    public final Lazy f;

    public h(Set dependencyRules, Set urls, kk0.a readWriteLockPool, j cacheProvider, ij0.a networkConfiguration) {
        Intrinsics.checkNotNullParameter(dependencyRules, "dependencyRules");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(readWriteLockPool, "readWriteLockPool");
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f314363a = dependencyRules;
        this.f314364b = urls;
        this.f314365c = readWriteLockPool;
        this.d = cacheProvider;
        this.e = networkConfiguration;
        this.f = yhm.j.b(new y99.c(this, 14));
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h hVar = (zlm.h) chain;
        j1 j1Var = hVar.e;
        Response responseB = hVar.b(j1Var);
        String str = responseB.f226087a.f281095a.i;
        Object obj2 = null;
        if (this.e.getLogEnabled()) {
            String strF = responseB.f("Cache-Control", null);
            if (strF == null) {
                strF = "none";
            }
            String simpleName = h.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.INFO, simpleName, com.google.android.gms.internal.mlkit_vision_face.a.o(str, " Cache-Control: ", strF), null, null, 16);
        }
        if (!Intrinsics.f(j1Var.f281096b, "GET")) {
            String pathFromUrl = j1Var.f281095a.b();
            Iterator it8 = this.f314364b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                String pathTemplateFromRetrofitService = (String) next;
                Intrinsics.checkNotNullParameter(pathTemplateFromRetrofitService, "pathTemplateFromRetrofitService");
                Intrinsics.checkNotNullParameter(pathFromUrl, "pathFromUrl");
                d0 d0VarO0 = kotlin.text.d0.o0(kotlin.text.d0.G0(pathTemplateFromRetrofitService, '/'), new char[]{'/'});
                Iterator it9 = d0VarO0.f216835a.iterator();
                d0 d0VarO02 = kotlin.text.d0.o0(kotlin.text.d0.G0(pathFromUrl, '/'), new char[]{'/'});
                Iterator it10 = d0VarO02.f216835a.iterator();
                while (it9.hasNext() && it10.hasNext()) {
                    String str2 = (String) d0VarO0.f216836b.invoke(it9.next());
                    String str3 = (String) d0VarO02.f216836b.invoke(it10.next());
                    Character chQ0 = f0.Q0(str2);
                    if (chQ0 == null || chQ0.charValue() != '{') {
                        if (!str2.equals(str3)) {
                            break;
                        }
                    }
                }
                if (it9.hasNext() == it10.hasNext()) {
                    obj2 = next;
                    break;
                }
            }
            String str4 = (String) obj2;
            if (str4 != null) {
                for (m mVar : this.f314363a) {
                    String[] strArr = mVar.f314372b;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (Intrinsics.f(strArr[i], str4)) {
                            String str5 = mVar.f314371a;
                            cp5.c.T(this.f314365c, str5, new qg7.k(str5, j1Var, this, 27));
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return responseB;
    }
}
