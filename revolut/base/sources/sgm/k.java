package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class k implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f262942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.p f262943c;
    public Disposable d;
    public boolean e;

    public /* synthetic */ k(fgm.l lVar, igm.p pVar, int i) {
        this.f262941a = i;
        this.f262942b = lVar;
        this.f262943c = pVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262941a) {
            case 0:
                this.d.dispose();
                break;
            case 1:
                this.d.dispose();
                break;
            case 2:
                this.d.dispose();
                break;
            case 3:
                this.d.dispose();
                break;
            default:
                this.d.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262941a) {
        }
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262941a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    Boolean bool = Boolean.TRUE;
                    fgm.l lVar = this.f262942b;
                    lVar.onNext(bool);
                    lVar.onComplete();
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    Boolean bool2 = Boolean.FALSE;
                    fgm.l lVar2 = this.f262942b;
                    lVar2.onNext(bool2);
                    lVar2.onComplete();
                }
                break;
            case 2:
                this.f262942b.onComplete();
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    this.f262942b.onComplete();
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f262942b.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262941a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f262942b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    this.f262942b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            case 2:
                this.f262942b.onError(th10);
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    this.f262942b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f262942b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262941a) {
            case 0:
                if (!this.e) {
                    try {
                        if (!this.f262943c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            Boolean bool = Boolean.FALSE;
                            fgm.l lVar = this.f262942b;
                            lVar.onNext(bool);
                            lVar.onComplete();
                        }
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        this.d.dispose();
                        onError(th10);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    try {
                        if (this.f262943c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            Boolean bool2 = Boolean.TRUE;
                            fgm.l lVar2 = this.f262942b;
                            lVar2.onNext(bool2);
                            lVar2.onComplete();
                        }
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        this.d.dispose();
                        onError(th11);
                        return;
                    }
                    break;
                }
                break;
            case 2:
                boolean z = this.e;
                fgm.l lVar3 = this.f262942b;
                if (z) {
                    lVar3.onNext(obj2);
                } else {
                    try {
                        if (!this.f262943c.test(obj2)) {
                            this.e = true;
                            lVar3.onNext(obj2);
                        }
                    } catch (Throwable th12) {
                        ce9.m.F(th12);
                        this.d.dispose();
                        lVar3.onError(th12);
                        return;
                    }
                }
                break;
            case 3:
                if (!this.e) {
                    fgm.l lVar4 = this.f262942b;
                    lVar4.onNext(obj2);
                    try {
                        if (this.f262943c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            lVar4.onComplete();
                        }
                    } catch (Throwable th13) {
                        ce9.m.F(th13);
                        this.d.dispose();
                        onError(th13);
                        return;
                    }
                }
                break;
            default:
                if (!this.e) {
                    try {
                        boolean zTest = this.f262943c.test(obj2);
                        fgm.l lVar5 = this.f262942b;
                        if (!zTest) {
                            this.e = true;
                            this.d.dispose();
                            lVar5.onComplete();
                        } else {
                            lVar5.onNext(obj2);
                        }
                    } catch (Throwable th14) {
                        ce9.m.F(th14);
                        this.d.dispose();
                        onError(th14);
                    }
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262941a) {
            case 0:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262942b.onSubscribe(this);
                }
                break;
            case 1:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262942b.onSubscribe(this);
                }
                break;
            case 2:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262942b.onSubscribe(this);
                }
                break;
            case 3:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262942b.onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262942b.onSubscribe(this);
                }
                break;
        }
    }
}
