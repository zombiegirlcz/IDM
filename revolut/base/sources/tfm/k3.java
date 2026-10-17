package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends AtomicReference implements ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f270590b;

    public k3(efm.y yVar) {
        this.f270589a = yVar;
    }

    public final void a(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == lfm.d.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != lfm.d.DISPOSED) {
            long j2 = this.f270590b;
            this.f270590b = 1 + j2;
            this.f270589a.onNext(Long.valueOf(j2));
        }
    }
}
