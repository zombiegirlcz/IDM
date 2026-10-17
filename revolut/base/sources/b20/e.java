package b20;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.j1;
import ulm.y0;
import vlm.j;
import zlm.h;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        d dVar = (d) com.bumptech.glide.d.h(j1Var, d.class);
        if (dVar == null) {
            return hVar.b(j1Var);
        }
        int timeoutSeconds = dVar.readTimeoutSeconds();
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (hVar.d != null) {
            throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
        }
        h hVarA = h.a(hVar, 0, null, null, j.d("readTimeout", unit, timeoutSeconds), 0, 47);
        int iWriteTimeoutSeconds = dVar.writeTimeoutSeconds();
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (hVarA.d == null) {
            return h.a(hVarA, 0, null, null, 0, j.d("writeTimeout", unit, iWriteTimeoutSeconds), 31).b(j1Var);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }
}
