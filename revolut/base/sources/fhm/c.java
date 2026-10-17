package fhm;

import io.grpc.okhttp.internal.n;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import ygm.i;
import ygm.j;
import ygm.l;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends d implements ygm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublishSubject f135270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f135271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f135272c;
    public volatile boolean d;

    public c(PublishSubject publishSubject) {
        this.f135270a = publishSubject;
    }

    public final void c() {
        n nVar;
        while (true) {
            synchronized (this) {
                try {
                    nVar = this.f135272c;
                    if (nVar == null) {
                        this.f135271b = false;
                        return;
                    }
                    this.f135272c = null;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            nVar.e(this);
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                if (!this.f135271b) {
                    this.f135271b = true;
                    this.f135270a.onComplete();
                    return;
                }
                n nVar = this.f135272c;
                if (nVar == null) {
                    nVar = new n(4);
                    this.f135272c = nVar;
                }
                nVar.b(l.COMPLETE);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.d) {
            jb3.l.v(th10);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.d) {
                    this.d = true;
                    if (this.f135271b) {
                        n nVar = this.f135272c;
                        if (nVar == null) {
                            nVar = new n(4);
                            this.f135272c = nVar;
                        }
                        ((Object[]) nVar.d)[0] = new j(th10);
                        return;
                    }
                    this.f135271b = true;
                    z = false;
                }
                if (z) {
                    jb3.l.v(th10);
                } else {
                    this.f135270a.onError(th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                if (!this.f135271b) {
                    this.f135271b = true;
                    this.f135270a.onNext(obj2);
                    c();
                } else {
                    n nVar = this.f135272c;
                    if (nVar == null) {
                        nVar = new n(4);
                        this.f135272c = nVar;
                    }
                    nVar.b(obj2);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.d) {
            synchronized (this) {
                try {
                    if (!this.d) {
                        if (this.f135271b) {
                            n nVar = this.f135272c;
                            if (nVar == null) {
                                nVar = new n(4);
                                this.f135272c = nVar;
                            }
                            nVar.b(new i(disposable));
                            return;
                        }
                        this.f135271b = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            disposable.dispose();
        } else {
            this.f135270a.onSubscribe(disposable);
            c();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.f135270a.subscribe(lVar);
    }

    @Override // igm.p
    public final boolean test(Object obj2) {
        return l.b(this.f135270a, obj2);
    }
}
