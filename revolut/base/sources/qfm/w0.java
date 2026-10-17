package qfm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class w0 extends yfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f245571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f245572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f245573c;

    public w0(Iterator it8) {
        this.f245571a = it8;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2) && com.bumptech.glide.d.a(this, j2) == 0) {
            if (j2 == Long.MAX_VALUE) {
                c();
            } else {
                d(j2);
            }
        }
    }

    @Override // nfm.f
    public final int b(int i) {
        return 1;
    }

    public abstract void c();

    @Override // dom.b
    public final void cancel() {
        this.f245572b = true;
    }

    @Override // nfm.j
    public final void clear() {
        this.f245571a = null;
    }

    public abstract void d(long j2);

    @Override // nfm.j
    public final boolean isEmpty() {
        Iterator it8 = this.f245571a;
        return it8 == null || !it8.hasNext();
    }

    @Override // nfm.j
    public final Object poll() {
        Iterator it8 = this.f245571a;
        if (it8 == null) {
            return null;
        }
        if (!this.f245573c) {
            this.f245573c = true;
        } else if (!it8.hasNext()) {
            return null;
        }
        Object next = this.f245571a.next();
        mfm.f.b(next, "Iterator.next() returned a null value");
        return next;
    }
}
