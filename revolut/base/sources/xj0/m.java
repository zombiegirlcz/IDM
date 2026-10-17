package xj0;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.y0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String name = Thread.currentThread().getName();
        Intrinsics.h(name);
        if (!d0.J(name, "RxCachedThreadScheduler", false) && !d0.J(name, "DefaultDispatcher-worker", false)) {
            String simpleName = m.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, simpleName, "Run on " + name + " (" + ((zlm.h) chain).e.f281095a + ")", null, h0Var);
        }
        zlm.h hVar = (zlm.h) chain;
        return hVar.b(hVar.e);
    }
}
