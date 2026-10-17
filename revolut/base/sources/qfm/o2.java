package qfm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends AtomicBoolean implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f245498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f245499c;
    public dom.b d;
    public long e;

    public o2(dom.a aVar, long j2) {
        this.f245497a = aVar;
        this.f245498b = j2;
        this.e = j2;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            if (get() || !compareAndSet(false, true) || j2 < this.f245498b) {
                this.d.a(j2);
            } else {
                this.d.a(Long.MAX_VALUE);
            }
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.d.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.d, bVar)) {
            this.d = bVar;
            long j2 = this.f245498b;
            dom.a aVar = this.f245497a;
            if (j2 != 0) {
                aVar.e(this);
                return;
            }
            bVar.cancel();
            this.f245499c = true;
            yfm.d.c(aVar);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f245499c) {
            return;
        }
        this.f245499c = true;
        this.f245497a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f245499c) {
            mo3.a.m(th10);
            return;
        }
        this.f245499c = true;
        this.d.cancel();
        this.f245497a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245499c) {
            return;
        }
        long j2 = this.e;
        long j3 = j2 - 1;
        this.e = j3;
        if (j2 > 0) {
            boolean z = j3 == 0;
            this.f245497a.onNext(obj2);
            if (z) {
                this.d.cancel();
                onComplete();
            }
        }
    }
}
