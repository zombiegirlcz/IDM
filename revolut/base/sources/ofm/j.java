package ofm;

import efm.y;

/* JADX INFO: loaded from: classes13.dex */
public class j extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f224925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f224926b;

    public j(y yVar) {
        this.f224925a = yVar;
    }

    public final void a(Object obj2) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        y yVar = this.f224925a;
        if (i == 8) {
            this.f224926b = obj2;
            lazySet(16);
            yVar.onNext(null);
        } else {
            lazySet(2);
            yVar.onNext(obj2);
        }
        if (get() != 4) {
            yVar.onComplete();
        }
    }

    @Override // nfm.f
    public final int b(int i) {
        lazySet(8);
        return 2;
    }

    @Override // nfm.j
    public final void clear() {
        lazySet(32);
        this.f224926b = null;
    }

    @Override // ifm.c
    public void dispose() {
        set(4);
        this.f224926b = null;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj2) {
        a(obj2);
    }

    @Override // nfm.j
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj2 = this.f224926b;
        this.f224926b = null;
        lazySet(32);
        return obj2;
    }
}
