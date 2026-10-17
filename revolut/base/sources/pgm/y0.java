package pgm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class y0 extends AtomicLong implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.g f236180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dom.b f236181c;
    public boolean d;

    public y0(dom.a aVar, igm.g gVar) {
        this.f236179a = aVar;
        this.f236180b = gVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.f236181c.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f236181c, bVar)) {
            this.f236181c = bVar;
            this.f236179a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f236179a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.d) {
            jb3.l.v(th10);
        } else {
            this.d = true;
            this.f236179a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        if (get() != 0) {
            this.f236179a.onNext(obj2);
            xam.a.m(this, 1L);
            return;
        }
        try {
            this.f236180b.accept(obj2);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            cancel();
            onError(th10);
        }
    }
}
