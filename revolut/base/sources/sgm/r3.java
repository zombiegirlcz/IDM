package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class r3 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f263121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f263122c;
    public final ygm.c d;
    public volatile bhm.i e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f263123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f263124h;
    public volatile int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f263125j;

    public r3(fgm.l lVar, int i) {
        this.f263120a = i;
        switch (i) {
            case 1:
                this.f263121b = lVar;
                this.f263122c = new AtomicReference();
                this.f263125j = new rgm.d(this, 7);
                this.d = new ygm.c();
                break;
            default:
                this.f263121b = lVar;
                this.f263122c = new AtomicReference();
                this.f263125j = new rgm.d(this, 6);
                this.d = new ygm.c();
                break;
        }
    }

    public final void a() {
        switch (this.f263120a) {
            case 0:
                fgm.l lVar = this.f263121b;
                int iAddAndGet = 1;
                while (!this.f263123g) {
                    if (this.d.get() == null) {
                        int i = this.i;
                        if (i == 1) {
                            Object obj2 = this.f;
                            this.f = null;
                            this.i = 2;
                            lVar.onNext(obj2);
                            i = 2;
                        }
                        boolean z = this.f263124h;
                        bhm.i iVar = this.e;
                        Object objPoll = iVar != null ? iVar.poll() : null;
                        boolean z3 = objPoll == null;
                        if (z && z3 && i == 2) {
                            this.e = null;
                            lVar.onComplete();
                            break;
                        } else if (z3) {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                break;
                            }
                        } else {
                            lVar.onNext(objPoll);
                        }
                    } else {
                        this.f = null;
                        this.e = null;
                        this.d.e(lVar);
                        break;
                    }
                }
                this.f = null;
                this.e = null;
                break;
            default:
                fgm.l lVar2 = this.f263121b;
                int iAddAndGet2 = 1;
                while (!this.f263123g) {
                    if (this.d.get() == null) {
                        int i2 = this.i;
                        if (i2 == 1) {
                            Object obj3 = this.f;
                            this.f = null;
                            this.i = 2;
                            lVar2.onNext(obj3);
                            i2 = 2;
                        }
                        boolean z4 = this.f263124h;
                        bhm.i iVar2 = this.e;
                        Object objPoll2 = iVar2 != null ? iVar2.poll() : null;
                        boolean z6 = objPoll2 == null;
                        if (z4 && z6 && i2 == 2) {
                            this.e = null;
                            lVar2.onComplete();
                            break;
                        } else if (z6) {
                            iAddAndGet2 = addAndGet(-iAddAndGet2);
                            if (iAddAndGet2 == 0) {
                                break;
                            }
                        } else {
                            lVar2.onNext(objPoll2);
                        }
                    } else {
                        this.f = null;
                        this.e = null;
                        this.d.e(lVar2);
                        break;
                    }
                }
                this.f = null;
                this.e = null;
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263120a) {
            case 0:
                this.f263123g = true;
                jgm.b.a(this.f263122c);
                jgm.b.a((rgm.d) this.f263125j);
                this.d.b();
                if (getAndIncrement() == 0) {
                    this.e = null;
                    this.f = null;
                }
                break;
            default:
                this.f263123g = true;
                jgm.b.a(this.f263122c);
                jgm.b.a((rgm.d) this.f263125j);
                this.d.b();
                if (getAndIncrement() == 0) {
                    this.e = null;
                    this.f = null;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263120a) {
        }
        return jgm.b.b((Disposable) this.f263122c.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f263120a) {
            case 0:
                this.f263124h = true;
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
            default:
                this.f263124h = true;
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f263120a) {
            case 0:
                if (this.d.a(th10)) {
                    jgm.b.a((rgm.d) this.f263125j);
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
            default:
                if (this.d.a(th10)) {
                    jgm.b.a((rgm.d) this.f263125j);
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f263120a) {
            case 0:
                if (compareAndSet(0, 1)) {
                    this.f263121b.onNext(obj2);
                    if (decrementAndGet() == 0) {
                    }
                } else {
                    bhm.i iVar = this.e;
                    if (iVar == null) {
                        iVar = new bhm.i(Observable.bufferSize());
                        this.e = iVar;
                    }
                    iVar.offer(obj2);
                    if (getAndIncrement() != 0) {
                    }
                }
                a();
                break;
            default:
                if (compareAndSet(0, 1)) {
                    this.f263121b.onNext(obj2);
                    if (decrementAndGet() == 0) {
                    }
                } else {
                    bhm.i iVar2 = this.e;
                    if (iVar2 == null) {
                        iVar2 = new bhm.i(Observable.bufferSize());
                        this.e = iVar2;
                    }
                    iVar2.offer(obj2);
                    if (getAndIncrement() != 0) {
                    }
                }
                a();
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f263120a) {
            case 0:
                jgm.b.e(this.f263122c, disposable);
                break;
            default:
                jgm.b.e(this.f263122c, disposable);
                break;
        }
    }
}
