package pgm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class l1 extends xgm.b implements fgm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f236105c;
    public dom.b d;
    public boolean e;

    public l1(dom.a aVar, boolean z) {
        super(aVar);
        this.f236105c = z;
    }

    @Override // dom.b
    public final void cancel() {
        set(4);
        this.f305774b = null;
        this.d.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.d, bVar)) {
            this.d = bVar;
            this.f305773a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj2 = this.f305774b;
        this.f305774b = null;
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            c(obj2);
            return;
        }
        boolean z = this.f236105c;
        dom.a aVar = this.f305773a;
        if (z) {
            aVar.onError(new NoSuchElementException());
        } else {
            aVar.onComplete();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.e) {
            jb3.l.v(th10);
        } else {
            this.e = true;
            this.f305773a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        if (this.f305774b == null) {
            this.f305774b = obj2;
            return;
        }
        this.e = true;
        this.d.cancel();
        this.f305773a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }
}
