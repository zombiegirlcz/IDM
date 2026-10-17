package pgm;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class z0 extends AtomicLong implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f236183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f236184c;

    public z0(dom.a aVar) {
        this.f236182a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.f236183b.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f236183b, bVar)) {
            this.f236183b = bVar;
            this.f236182a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f236184c) {
            return;
        }
        this.f236184c = true;
        this.f236182a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236184c) {
            jb3.l.v(th10);
        } else {
            this.f236184c = true;
            this.f236182a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236184c) {
            return;
        }
        if (get() != 0) {
            this.f236182a.onNext(obj2);
            xam.a.m(this, 1L);
        } else {
            this.f236183b.cancel();
            onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
        }
    }
}
