package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class a2 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.p f262694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f262696c;
    public Disposable d;
    public long e;
    public boolean f;

    public a2(fgm.p pVar, long j2, Object obj2) {
        this.f262694a = pVar;
        this.f262695b = j2;
        this.f262696c = obj2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        fgm.p pVar = this.f262694a;
        Object obj2 = this.f262696c;
        if (obj2 != null) {
            pVar.onSuccess(obj2);
        } else {
            pVar.onError(new NoSuchElementException());
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f) {
            jb3.l.v(th10);
        } else {
            this.f = true;
            this.f262694a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f) {
            return;
        }
        long j2 = this.e;
        if (j2 != this.f262695b) {
            this.e = j2 + 1;
            return;
        }
        this.f = true;
        this.d.dispose();
        this.f262694a.onSuccess(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.d, disposable)) {
            this.d = disposable;
            this.f262694a.onSubscribe(this);
        }
    }
}
