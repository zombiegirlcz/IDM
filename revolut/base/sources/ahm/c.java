package ahm;

import fgm.l;
import io.grpc.okhttp.internal.n;
import io.reactivex.rxjava3.disposables.Disposable;
import ygm.g;
import ygm.j;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f5139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f5140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5141c;
    public n d;
    public volatile boolean e;

    public c(l lVar) {
        this.f5139a = lVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.e = true;
        this.f5140b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f5140b.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.f5141c) {
                    this.e = true;
                    this.f5141c = true;
                    this.f5139a.onComplete();
                } else {
                    n nVar = this.d;
                    if (nVar == null) {
                        nVar = new n(4);
                        this.d = nVar;
                    }
                    nVar.b(ygm.l.COMPLETE);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.e) {
            jb3.l.v(th10);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    if (this.f5141c) {
                        this.e = true;
                        n nVar = this.d;
                        if (nVar == null) {
                            nVar = new n(4);
                            this.d = nVar;
                        }
                        ((Object[]) nVar.d)[0] = new j(th10);
                        return;
                    }
                    this.e = true;
                    this.f5141c = true;
                    z = false;
                }
                if (z) {
                    jb3.l.v(th10);
                } else {
                    this.f5139a.onError(th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        Object[] objArr;
        if (this.e) {
            return;
        }
        if (obj2 == null) {
            this.f5140b.dispose();
            onError(g.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.f5141c) {
                    n nVar = this.d;
                    if (nVar == null) {
                        nVar = new n(4);
                        this.d = nVar;
                    }
                    nVar.b(obj2);
                    return;
                }
                this.f5141c = true;
                this.f5139a.onNext(obj2);
                while (true) {
                    synchronized (this) {
                        try {
                            n nVar2 = this.d;
                            if (nVar2 == null) {
                                this.f5141c = false;
                                return;
                            }
                            this.d = null;
                            l lVar = this.f5139a;
                            for (Object[] objArr2 = (Object[]) nVar2.d; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (ygm.l.b(lVar, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f5140b, disposable)) {
            this.f5140b = disposable;
            this.f5139a.onSubscribe(this);
        }
    }
}
