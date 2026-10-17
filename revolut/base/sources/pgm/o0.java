package pgm;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class o0 extends AtomicLong implements dom.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f236119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f236120c = new AtomicReference();

    public o0(dom.a aVar) {
        this.f236118a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        jgm.b.a(this.f236120c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f236120c;
        if (atomicReference.get() != jgm.b.DISPOSED) {
            long j2 = get();
            dom.a aVar = this.f236118a;
            if (j2 == 0) {
                aVar.onError(new MissingBackpressureException(a0.d.j(this.f236119b, " due to lack of requests", new StringBuilder("Could not emit value "))));
                jgm.b.a(atomicReference);
            } else {
                long j3 = this.f236119b;
                this.f236119b = j3 + 1;
                aVar.onNext(Long.valueOf(j3));
                xam.a.m(this, 1L);
            }
        }
    }
}
