package pgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class n1 implements fgm.d, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.p f236113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f236114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f236115c;
    public Object d;

    public n1(fgm.p pVar) {
        this.f236113a = pVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f236114b.cancel();
        this.f236114b = xgm.f.CANCELLED;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f236114b, bVar)) {
            this.f236114b = bVar;
            this.f236113a.onSubscribe(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f236114b == xgm.f.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f236115c) {
            return;
        }
        this.f236115c = true;
        this.f236114b = xgm.f.CANCELLED;
        Object obj2 = this.d;
        this.d = null;
        if (obj2 == null) {
            obj2 = null;
        }
        fgm.p pVar = this.f236113a;
        if (obj2 != null) {
            pVar.onSuccess(obj2);
        } else {
            pVar.onError(new NoSuchElementException());
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236115c) {
            jb3.l.v(th10);
            return;
        }
        this.f236115c = true;
        this.f236114b = xgm.f.CANCELLED;
        this.f236113a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236115c) {
            return;
        }
        if (this.d == null) {
            this.d = obj2;
            return;
        }
        this.f236115c = true;
        this.f236114b.cancel();
        this.f236114b = xgm.f.CANCELLED;
        this.f236113a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }
}
