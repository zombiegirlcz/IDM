package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class m3 extends AtomicReference implements ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f270644c;

    public m3(efm.y yVar, long j2, long j3) {
        this.f270642a = yVar;
        this.f270644c = j2;
        this.f270643b = j3;
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
        if (isDisposed()) {
            return;
        }
        long j2 = this.f270644c;
        Long lValueOf = Long.valueOf(j2);
        efm.y yVar = this.f270642a;
        yVar.onNext(lValueOf);
        if (j2 != this.f270643b) {
            this.f270644c = j2 + 1;
        } else {
            lfm.d.a(this);
            yVar.onComplete();
        }
    }
}
