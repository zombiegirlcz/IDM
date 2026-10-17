package xfm;

import efm.j;
import nfm.g;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements j, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f305442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f305443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f305444c;
    public boolean d;
    public int e;

    public b(dom.a aVar) {
        this.f305442a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f305443b.a(j2);
    }

    @Override // nfm.f
    public int b(int i) {
        g gVar = this.f305444c;
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

    @Override // dom.b
    public final void cancel() {
        this.f305443b.cancel();
    }

    @Override // nfm.j
    public final void clear() {
        this.f305444c.clear();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f305443b, bVar)) {
            this.f305443b = bVar;
            if (bVar instanceof g) {
                this.f305444c = (g) bVar;
            }
            this.f305442a.e(this);
        }
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f305444c.isEmpty();
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
        this.f305442a.onComplete();
    }

    @Override // dom.a
    public void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
        } else {
            this.d = true;
            this.f305442a.onError(th10);
        }
    }
}
