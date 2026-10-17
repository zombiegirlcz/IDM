package ofm;

import efm.y;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements y, nfm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f224907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f224908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nfm.e f224909c;
    public boolean d;
    public int e;

    public a(y yVar) {
        this.f224907a = yVar;
    }

    @Override // nfm.f
    public int b(int i) {
        nfm.e eVar = this.f224909c;
        if (eVar == null || (i & 4) != 0) {
            return 0;
        }
        int iB = eVar.b(i);
        if (iB == 0) {
            return iB;
        }
        this.e = iB;
        return iB;
    }

    public final void c(Throwable th10) {
        m70.a.u(th10);
        this.f224908b.dispose();
        onError(th10);
    }

    @Override // nfm.j
    public void clear() {
        this.f224909c.clear();
    }

    @Override // ifm.c
    public final void dispose() {
        this.f224908b.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f224908b.isDisposed();
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f224909c.isEmpty();
    }

    @Override // nfm.j
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // efm.y
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f224907a.onComplete();
    }

    @Override // efm.y
    public void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
        } else {
            this.d = true;
            this.f224907a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f224908b, cVar)) {
            this.f224908b = cVar;
            if (cVar instanceof nfm.e) {
                this.f224909c = (nfm.e) cVar;
            }
            this.f224907a.onSubscribe(this);
        }
    }
}
