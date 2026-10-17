package xfm;

import nfm.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements nfm.a, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfm.a f305439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f305440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f305441c;
    public boolean d;
    public int e;

    public a(nfm.a aVar) {
        this.f305439a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f305440b.a(j2);
    }

    @Override // nfm.f
    public int b(int i) {
        g gVar = this.f305441c;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int iB = gVar.b(i);
        if (iB == 0) {
            return iB;
        }
        this.e = iB;
        return iB;
    }

    public final void c(Throwable th10) {
        m70.a.u(th10);
        this.f305440b.cancel();
        onError(th10);
    }

    @Override // dom.b
    public final void cancel() {
        this.f305440b.cancel();
    }

    @Override // nfm.j
    public final void clear() {
        this.f305441c.clear();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f305440b, bVar)) {
            this.f305440b = bVar;
            if (bVar instanceof g) {
                this.f305441c = (g) bVar;
            }
            this.f305439a.e(this);
        }
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f305441c.isEmpty();
    }

    @Override // nfm.j
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // dom.a
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f305439a.onComplete();
    }

    @Override // dom.a
    public void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
        } else {
            this.d = true;
            this.f305439a.onError(th10);
        }
    }
}
