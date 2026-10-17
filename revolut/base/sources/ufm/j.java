package ufm;

import efm.f0;
import efm.y;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends ofm.b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f279893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dz7.l f279894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f279895c;
    public volatile Iterator d;
    public volatile boolean e;
    public boolean f;

    public j(y yVar, dz7.l lVar) {
        this.f279893a = yVar;
        this.f279894b = lVar;
    }

    @Override // nfm.f
    public final int b(int i) {
        this.f = true;
        return 2;
    }

    @Override // nfm.j
    public final void clear() {
        this.d = null;
    }

    @Override // ifm.c
    public final void dispose() {
        this.e = true;
        this.f279895c.dispose();
        this.f279895c = lfm.d.DISPOSED;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.d == null;
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        this.f279895c = lfm.d.DISPOSED;
        this.f279893a.onError(th10);
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f279895c, cVar)) {
            this.f279895c = cVar;
            this.f279893a.onSubscribe(this);
        }
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        y yVar = this.f279893a;
        try {
            Iterator it8 = ((Iterable) this.f279894b.apply(obj2)).iterator();
            if (!it8.hasNext()) {
                yVar.onComplete();
                return;
            }
            if (this.f) {
                this.d = it8;
                yVar.onNext(null);
                yVar.onComplete();
                return;
            }
            while (!this.e) {
                try {
                    yVar.onNext(it8.next());
                    if (this.e) {
                        return;
                    }
                    try {
                        if (!it8.hasNext()) {
                            yVar.onComplete();
                            return;
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        yVar.onError(th10);
                        return;
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    yVar.onError(th11);
                    return;
                }
            }
        } catch (Throwable th12) {
            m70.a.u(th12);
            this.f279893a.onError(th12);
        }
    }

    @Override // nfm.j
    public final Object poll() {
        Iterator it8 = this.d;
        if (it8 == null) {
            return null;
        }
        Object next = it8.next();
        mfm.f.b(next, "The iterator returned a null value");
        if (!it8.hasNext()) {
            this.d = null;
        }
        return next;
    }
}
