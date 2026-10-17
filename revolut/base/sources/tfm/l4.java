package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class l4 extends AtomicReference implements Runnable, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4 f270612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lfm.b f270613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f270614c;
    public boolean d;
    public boolean e;

    public l4(n4 n4Var) {
        this.f270612a = n4Var;
    }

    @Override // kfm.g
    public final void accept(Object obj2) {
        ifm.c cVar = (ifm.c) obj2;
        lfm.d.c(this, cVar);
        synchronized (this.f270612a) {
            try {
                if (this.e) {
                    ((lfm.g) this.f270612a.f270676g).a(cVar);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f270612a.e(this);
    }
}
