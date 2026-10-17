package ak0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import xj0.g;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij0.a f5627a;

    public a(ij0.a configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f5627a = configuration;
    }

    public final OkHttpClient.a a(OkHttpClient.a builder) {
        List list;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (this.f5627a.getDebug()) {
            od0.a aVar = od0.a.f224253a;
            boolean zI = od0.a.i();
            boolean endToEndMode = this.f5627a.getEndToEndMode();
            g gVar = g.f306447a;
            synchronized (g.class) {
                if (zI) {
                    List list2 = endToEndMode ? g.d : g.e;
                    List list3 = g.f;
                    if (list3 == null) {
                        g.f = list2;
                    } else if (!list3.equals(list2)) {
                        throw new IllegalStateException("Interceptors have already been requested for ".concat(Intrinsics.f(g.f, g.d) ? "e2e instrumentation" : "ui test instrumentation").toString());
                    }
                    g.f306447a.getClass();
                    list = (List) g.f306450g.b(g.f306448b[0]);
                } else {
                    list = f0.f322471a;
                }
            }
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                builder.a((Interceptor) it8.next());
            }
        }
        return builder;
    }
}
