package ylm;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ulm.p f314774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f314775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f314776c;

    public n(q qVar, ulm.p responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        this.f314776c = qVar;
        this.f314774a = responseCallback;
        this.f314775b = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OkHttpClient okHttpClient;
        String str = "OkHttp " + this.f314776c.f314780b.f281095a.i();
        q qVar = this.f314776c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            qVar.f.j();
            boolean z = false;
            try {
                try {
                    try {
                        this.f314774a.onResponse(qVar, qVar.f());
                        okHttpClient = qVar.f314779a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            emm.h.Companion.getClass();
                            emm.h.f127697a.j(4, "Callback failure for " + q.a(qVar), e);
                        } else {
                            this.f314774a.onFailure(qVar, e);
                        }
                        okHttpClient = qVar.f314779a;
                    } catch (Throwable th10) {
                        th = th10;
                        z = true;
                        qVar.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f314774a.onFailure(qVar, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        okHttpClient = qVar.f314779a;
                    }
                } catch (Throwable th11) {
                    qVar.f314779a.f226053a.c(this);
                    throw th11;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th12) {
                th = th12;
            }
            okHttpClient.f226053a.c(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
