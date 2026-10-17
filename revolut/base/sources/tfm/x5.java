package tfm;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class x5 extends ArrayDeque implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270938c;

    public x5(efm.y yVar, int i) {
        super(i);
        this.f270936a = yVar;
        this.f270937b = i;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270938c.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270938c.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270936a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270936a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270937b == size()) {
            this.f270936a.onNext(poll());
        }
        offer(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270938c, cVar)) {
            this.f270938c = cVar;
            this.f270936a.onSubscribe(this);
        }
    }
}
