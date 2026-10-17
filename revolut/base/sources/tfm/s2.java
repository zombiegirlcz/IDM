package tfm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class s2 extends ofm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f270804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f270805c;
    public boolean d;
    public boolean e;
    public boolean f;

    public s2(efm.y yVar, Iterator it8) {
        this.f270803a = yVar;
        this.f270804b = it8;
    }

    @Override // nfm.f
    public final int b(int i) {
        this.d = true;
        return 1;
    }

    @Override // nfm.j
    public final void clear() {
        this.e = true;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270805c = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270805c;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.e;
    }

    @Override // nfm.j
    public final Object poll() {
        if (this.e) {
            return null;
        }
        boolean z = this.f;
        Iterator it8 = this.f270804b;
        if (!z) {
            this.f = true;
        } else if (!it8.hasNext()) {
            this.e = true;
            return null;
        }
        Object next = it8.next();
        mfm.f.b(next, "The iterator returned a null value");
        return next;
    }
}
