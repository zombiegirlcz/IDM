package sgm;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class n2 extends ngm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f263021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f263022c;
    public boolean d;
    public volatile boolean e;

    public n2(fgm.l lVar, Object[] objArr) {
        this.f263020a = lVar;
        this.f263021b = objArr;
    }

    @Override // bhm.c
    public final int b(int i) {
        this.d = true;
        return 1;
    }

    @Override // bhm.g
    public final void clear() {
        this.f263022c = this.f263021b.length;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.e = true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.e;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f263022c == this.f263021b.length;
    }

    @Override // bhm.g
    public final Object poll() {
        int i = this.f263022c;
        Object[] objArr = this.f263021b;
        if (i == objArr.length) {
            return null;
        }
        this.f263022c = i + 1;
        Object obj2 = objArr[i];
        Objects.requireNonNull(obj2, "The array element is null");
        return obj2;
    }
}
