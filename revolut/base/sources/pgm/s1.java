package pgm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class s1 extends AtomicLong implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f236141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dom.b f236142c;

    public s1(dom.a aVar, long j2) {
        this.f236140a = aVar;
        this.f236141b = j2;
        lazySet(j2);
    }

    @Override // dom.b
    public final void a(long j2) {
        long j3;
        long jMin;
        if (xgm.f.f(j2)) {
            do {
                j3 = get();
                if (j3 == 0) {
                    return;
                } else {
                    jMin = Math.min(j3, j2);
                }
            } while (!compareAndSet(j3, j3 - jMin));
            this.f236142c.a(jMin);
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.f236142c.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f236142c, bVar)) {
            long j2 = this.f236141b;
            dom.a aVar = this.f236140a;
            if (j2 != 0) {
                this.f236142c = bVar;
                aVar.e(this);
            } else {
                bVar.cancel();
                aVar.e(xgm.c.INSTANCE);
                aVar.onComplete();
            }
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f236141b > 0) {
            this.f236141b = 0L;
            this.f236140a.onComplete();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236141b <= 0) {
            jb3.l.v(th10);
        } else {
            this.f236141b = 0L;
            this.f236140a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        long j2 = this.f236141b;
        if (j2 > 0) {
            long j3 = j2 - 1;
            this.f236141b = j3;
            dom.a aVar = this.f236140a;
            aVar.onNext(obj2);
            if (j3 == 0) {
                this.f236142c.cancel();
                aVar.onComplete();
            }
        }
    }
}
