package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class p2 extends ofm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f270715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f270716c;
    public boolean d;
    public volatile boolean e;

    public p2(efm.y yVar, Object[] objArr) {
        this.f270714a = yVar;
        this.f270715b = objArr;
    }

    @Override // nfm.f
    public final int b(int i) {
        this.d = true;
        return 1;
    }

    @Override // nfm.j
    public final void clear() {
        this.f270716c = this.f270715b.length;
    }

    @Override // ifm.c
    public final void dispose() {
        this.e = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f270716c == this.f270715b.length;
    }

    @Override // nfm.j
    public final Object poll() {
        int i = this.f270716c;
        Object[] objArr = this.f270715b;
        if (i == objArr.length) {
            return null;
        }
        this.f270716c = i + 1;
        Object obj2 = objArr[i];
        mfm.f.b(obj2, "The array element is null");
        return obj2;
    }
}
