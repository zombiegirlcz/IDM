package wgm;

import ce9.m;
import jb3.l;
import xgm.f;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b implements fgm.d, bhm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f297348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f297349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bhm.d f297350c;
    public boolean d;

    public b(dom.a aVar) {
        this.f297348a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f297349b.a(j2);
    }

    public final void c(Throwable th10) {
        m.F(th10);
        this.f297349b.cancel();
        onError(th10);
    }

    @Override // dom.b
    public final void cancel() {
        this.f297349b.cancel();
    }

    @Override // bhm.g
    public final void clear() {
        this.f297350c.clear();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (f.h(this.f297349b, bVar)) {
            this.f297349b = bVar;
            if (bVar instanceof bhm.d) {
                this.f297350c = (bhm.d) bVar;
            }
            this.f297348a.e(this);
        }
    }

    public final int f(int i) {
        return 0;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f297350c.isEmpty();
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // dom.a
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f297348a.onComplete();
    }

    @Override // dom.a
    public void onError(Throwable th10) {
        if (this.d) {
            l.v(th10);
        } else {
            this.d = true;
            this.f297348a.onError(th10);
        }
    }
}
