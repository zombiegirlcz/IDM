package ulm;

import java.io.IOException;
import okhttp3.Cache;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends mmm.u {
    public final /* synthetic */ Cache d;
    public final /* synthetic */ j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Cache cache, j jVar, mmm.q0 q0Var) {
        super(q0Var);
        this.d = cache;
        this.f = jVar;
    }

    @Override // mmm.u, mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Cache cache = this.d;
        j jVar = this.f;
        synchronized (cache) {
            if (jVar.d) {
                return;
            }
            jVar.d = true;
            cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount() + 1);
            super.close();
            this.f.f281092a.b();
        }
    }
}
