package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class w1 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f263234c;
    public final boolean d;
    public Disposable e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f263235g;

    public w1(fgm.l lVar, long j2, Object obj2, boolean z) {
        this.f263232a = lVar;
        this.f263233b = j2;
        this.f263234c = obj2;
        this.d = z;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f263235g) {
            return;
        }
        this.f263235g = true;
        fgm.l lVar = this.f263232a;
        Object obj2 = this.f263234c;
        if (obj2 == null && this.d) {
            lVar.onError(new NoSuchElementException());
            return;
        }
        if (obj2 != null) {
            lVar.onNext(obj2);
        }
        lVar.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f263235g) {
            jb3.l.v(th10);
        } else {
            this.f263235g = true;
            this.f263232a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263235g) {
            return;
        }
        long j2 = this.f;
        if (j2 != this.f263233b) {
            this.f = j2 + 1;
            return;
        }
        this.f263235g = true;
        this.e.dispose();
        fgm.l lVar = this.f263232a;
        lVar.onNext(obj2);
        lVar.onComplete();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.e, disposable)) {
            this.e = disposable;
            this.f263232a.onSubscribe(this);
        }
    }
}
