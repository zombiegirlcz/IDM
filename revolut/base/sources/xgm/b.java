package xgm;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f305773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f305774b;

    public b(dom.a aVar) {
        this.f305773a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        Object obj2;
        if (f.f(j2)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj2 = this.f305774b) == null) {
                        return;
                    }
                    this.f305774b = null;
                    dom.a aVar = this.f305773a;
                    aVar.onNext(obj2);
                    if (get() != 4) {
                        aVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // bhm.c
    public final int b(int i) {
        lazySet(8);
        return 2;
    }

    public final void c(Object obj2) {
        int i = get();
        do {
            dom.a aVar = this.f305773a;
            if (i == 8) {
                this.f305774b = obj2;
                lazySet(16);
                aVar.onNext(null);
                if (get() != 4) {
                    aVar.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                aVar.onNext(obj2);
                if (get() != 4) {
                    aVar.onComplete();
                    return;
                }
                return;
            }
            this.f305774b = obj2;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.f305774b = null;
    }

    @Override // bhm.g
    public final void clear() {
        lazySet(32);
        this.f305774b = null;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj2) {
        c(obj2);
    }

    @Override // bhm.g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj2 = this.f305774b;
        this.f305774b = null;
        return obj2;
    }
}
