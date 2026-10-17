package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class d1 extends AtomicReference implements Runnable, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f270402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f270404c;
    public final AtomicBoolean d = new AtomicBoolean();

    public d1(Object obj2, long j2, e1 e1Var) {
        this.f270402a = obj2;
        this.f270403b = j2;
        this.f270404c = e1Var;
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
        if (this.d.compareAndSet(false, true)) {
            e1 e1Var = this.f270404c;
            long j2 = this.f270403b;
            Object obj2 = this.f270402a;
            if (j2 == e1Var.f270425g) {
                e1Var.f270422a.onNext(obj2);
                lfm.d.a(this);
            }
        }
    }
}
