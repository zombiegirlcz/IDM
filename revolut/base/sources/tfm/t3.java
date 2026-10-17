package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class t3 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f270837c;
    public final zfm.c d;
    public volatile vfm.c e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270839h;
    public volatile int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f270840j;

    public t3(efm.y yVar, int i) {
        this.f270835a = i;
        switch (i) {
            case 1:
                this.f270836b = yVar;
                this.f270837c = new AtomicReference();
                this.f270840j = new rgm.d(this, 9);
                this.d = new zfm.c();
                break;
            default:
                this.f270836b = yVar;
                this.f270837c = new AtomicReference();
                this.f270840j = new rgm.d(this, 8);
                this.d = new zfm.c();
                break;
        }
    }

    public final void a() {
        switch (this.f270835a) {
            case 0:
                efm.y yVar = this.f270836b;
                int iAddAndGet = 1;
                while (!this.f270838g) {
                    if (this.d.get() == null) {
                        int i = this.i;
                        if (i == 1) {
                            Object obj2 = this.f;
                            this.f = null;
                            this.i = 2;
                            yVar.onNext(obj2);
                            i = 2;
                        }
                        boolean z = this.f270839h;
                        vfm.c cVar = this.e;
                        Object objPoll = cVar != null ? cVar.poll() : null;
                        boolean z3 = objPoll == null;
                        if (z && z3 && i == 2) {
                            this.e = null;
                            yVar.onComplete();
                            break;
                        } else if (z3) {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                break;
                            }
                        } else {
                            yVar.onNext(objPoll);
                        }
                    } else {
                        this.f = null;
                        this.e = null;
                        zfm.c cVar2 = this.d;
                        cVar2.getClass();
                        yVar.onError(zfm.h.b(cVar2));
                        break;
                    }
                }
                this.f = null;
                this.e = null;
                break;
            default:
                efm.y yVar2 = this.f270836b;
                int iAddAndGet2 = 1;
                while (!this.f270838g) {
                    if (this.d.get() == null) {
                        int i2 = this.i;
                        if (i2 == 1) {
                            Object obj3 = this.f;
                            this.f = null;
                            this.i = 2;
                            yVar2.onNext(obj3);
                            i2 = 2;
                        }
                        boolean z4 = this.f270839h;
                        vfm.c cVar3 = this.e;
                        Object objPoll2 = cVar3 != null ? cVar3.poll() : null;
                        boolean z6 = objPoll2 == null;
                        if (z4 && z6 && i2 == 2) {
                            this.e = null;
                            yVar2.onComplete();
                            break;
                        } else if (z6) {
                            iAddAndGet2 = addAndGet(-iAddAndGet2);
                            if (iAddAndGet2 == 0) {
                                break;
                            }
                        } else {
                            yVar2.onNext(objPoll2);
                        }
                    } else {
                        this.f = null;
                        this.e = null;
                        zfm.c cVar4 = this.d;
                        cVar4.getClass();
                        yVar2.onError(zfm.h.b(cVar4));
                        break;
                    }
                }
                this.f = null;
                this.e = null;
                break;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270835a) {
            case 0:
                this.f270838g = true;
                lfm.d.a(this.f270837c);
                lfm.d.a((rgm.d) this.f270840j);
                if (getAndIncrement() == 0) {
                    this.e = null;
                    this.f = null;
                }
                break;
            default:
                this.f270838g = true;
                lfm.d.a(this.f270837c);
                lfm.d.a((rgm.d) this.f270840j);
                if (getAndIncrement() == 0) {
                    this.e = null;
                    this.f = null;
                }
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270835a) {
        }
        return lfm.d.b((ifm.c) this.f270837c.get());
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270835a) {
            case 0:
                this.f270839h = true;
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
            default:
                this.f270839h = true;
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270835a) {
            case 0:
                zfm.c cVar = this.d;
                cVar.getClass();
                if (!zfm.h.a(cVar, th10)) {
                    mo3.a.m(th10);
                } else {
                    lfm.d.a((rgm.d) this.f270840j);
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
            default:
                zfm.c cVar2 = this.d;
                cVar2.getClass();
                if (!zfm.h.a(cVar2, th10)) {
                    mo3.a.m(th10);
                } else {
                    lfm.d.a((rgm.d) this.f270840j);
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270835a) {
            case 0:
                if (compareAndSet(0, 1)) {
                    this.f270836b.onNext(obj2);
                    if (decrementAndGet() == 0) {
                    }
                } else {
                    vfm.c cVar = this.e;
                    if (cVar == null) {
                        cVar = new vfm.c(efm.r.bufferSize());
                        this.e = cVar;
                    }
                    cVar.offer(obj2);
                    if (getAndIncrement() != 0) {
                    }
                }
                a();
                break;
            default:
                if (compareAndSet(0, 1)) {
                    this.f270836b.onNext(obj2);
                    if (decrementAndGet() == 0) {
                    }
                } else {
                    vfm.c cVar2 = this.e;
                    if (cVar2 == null) {
                        cVar2 = new vfm.c(efm.r.bufferSize());
                        this.e = cVar2;
                    }
                    cVar2.offer(obj2);
                    if (getAndIncrement() != 0) {
                    }
                }
                a();
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270835a) {
            case 0:
                lfm.d.e(this.f270837c, cVar);
                break;
            default:
                lfm.d.e(this.f270837c, cVar);
                break;
        }
    }
}
