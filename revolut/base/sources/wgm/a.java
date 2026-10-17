package wgm;

import ce9.m;
import jb3.l;
import xgm.f;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a implements bhm.a, bhm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bhm.a f297345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f297346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bhm.d f297347c;
    public boolean d;

    public a(bhm.a aVar) {
        this.f297345a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f297346b.a(j2);
    }

    public final void c(Throwable th10) {
        m.F(th10);
        this.f297346b.cancel();
        onError(th10);
    }

    @Override // dom.b
    public final void cancel() {
        this.f297346b.cancel();
    }

    @Override // bhm.g
    public final void clear() {
        this.f297347c.clear();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (f.h(this.f297346b, bVar)) {
            this.f297346b = bVar;
            if (bVar instanceof bhm.d) {
                this.f297347c = (bhm.d) bVar;
            }
            this.f297345a.e(this);
        }
    }

    public final int f(int i) {
        return 0;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f297347c.isEmpty();
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
        this.f297345a.onComplete();
    }

    @Override // dom.a
    public void onError(Throwable th10) {
        if (this.d) {
            l.v(th10);
        } else {
            this.d = true;
            this.f297345a.onError(th10);
        }
    }
}
