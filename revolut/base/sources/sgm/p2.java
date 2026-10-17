package sgm;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class p2 extends ngm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f263068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f263069c;
    public boolean d;
    public boolean e;
    public boolean f;

    public p2(fgm.l lVar, Iterator it8) {
        this.f263067a = lVar;
        this.f263068b = it8;
    }

    @Override // bhm.c
    public final int b(int i) {
        this.d = true;
        return 1;
    }

    @Override // bhm.g
    public final void clear() {
        this.e = true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f263069c = true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263069c;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.e;
    }

    @Override // bhm.g
    public final Object poll() {
        if (this.e) {
            return null;
        }
        boolean z = this.f;
        Iterator it8 = this.f263068b;
        if (!z) {
            this.f = true;
        } else if (!it8.hasNext()) {
            this.e = true;
            return null;
        }
        Object next = it8.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }
}
