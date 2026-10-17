package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class s5 extends AtomicInteger implements ifm.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.d f270815b;
    public final efm.w d;
    public final efm.w e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f270817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f270818h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.y[] f270819j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270814a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.a f270816c = new lfm.a(2);

    public s5(efm.y yVar, int i, efm.w wVar, efm.w wVar2, kfm.d dVar) {
        this.i = yVar;
        this.d = wVar;
        this.e = wVar2;
        this.f270815b = dVar;
        this.f270819j = new t5[]{new t5(this, 0, i), new t5(this, 1, i)};
    }

    public final void a() {
        Throwable th10;
        Throwable th11;
        Throwable th12;
        Throwable th13;
        switch (this.f270814a) {
            case 0:
                if (getAndIncrement() == 0) {
                    t5[] t5VarArr = (t5[]) this.f270819j;
                    t5 t5Var = t5VarArr[0];
                    vfm.c cVar = t5Var.f270844b;
                    t5 t5Var2 = t5VarArr[1];
                    vfm.c cVar2 = t5Var2.f270844b;
                    int iAddAndGet = 1;
                    while (!this.f) {
                        boolean z = t5Var.d;
                        if (z && (th11 = t5Var.e) != null) {
                            this.f = true;
                            cVar.clear();
                            cVar2.clear();
                            ((efm.y) this.i).onError(th11);
                        } else {
                            boolean z3 = t5Var2.d;
                            if (z3 && (th10 = t5Var2.e) != null) {
                                this.f = true;
                                cVar.clear();
                                cVar2.clear();
                                ((efm.y) this.i).onError(th10);
                            } else {
                                if (this.f270817g == null) {
                                    this.f270817g = cVar.poll();
                                }
                                boolean z4 = this.f270817g == null;
                                if (this.f270818h == null) {
                                    this.f270818h = cVar2.poll();
                                }
                                Object obj2 = this.f270818h;
                                boolean z6 = obj2 == null;
                                if (z && z3 && z4 && z6) {
                                    ((efm.y) this.i).onNext(Boolean.TRUE);
                                    ((efm.y) this.i).onComplete();
                                } else if (z && z3 && z4 != z6) {
                                    this.f = true;
                                    cVar.clear();
                                    cVar2.clear();
                                    ((efm.y) this.i).onNext(Boolean.FALSE);
                                    ((efm.y) this.i).onComplete();
                                } else {
                                    if (!z4 && !z6) {
                                        try {
                                            if (!this.f270815b.test(this.f270817g, obj2)) {
                                                this.f = true;
                                                cVar.clear();
                                                cVar2.clear();
                                                ((efm.y) this.i).onNext(Boolean.FALSE);
                                                ((efm.y) this.i).onComplete();
                                            } else {
                                                this.f270817g = null;
                                                this.f270818h = null;
                                            }
                                        } catch (Throwable th14) {
                                            m70.a.u(th14);
                                            this.f = true;
                                            cVar.clear();
                                            cVar2.clear();
                                            ((efm.y) this.i).onError(th14);
                                            return;
                                        }
                                    }
                                    if (z4 || z6) {
                                        iAddAndGet = addAndGet(-iAddAndGet);
                                        if (iAddAndGet == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    cVar.clear();
                    cVar2.clear();
                    break;
                }
                break;
            default:
                if (getAndIncrement() == 0) {
                    t5[] t5VarArr2 = (t5[]) this.f270819j;
                    t5 t5Var3 = t5VarArr2[0];
                    vfm.c cVar3 = t5Var3.f270844b;
                    t5 t5Var4 = t5VarArr2[1];
                    vfm.c cVar4 = t5Var4.f270844b;
                    int iAddAndGet2 = 1;
                    while (!this.f) {
                        boolean z11 = t5Var3.d;
                        if (z11 && (th13 = t5Var3.e) != null) {
                            this.f = true;
                            cVar3.clear();
                            cVar4.clear();
                            ((efm.f0) this.i).onError(th13);
                        } else {
                            boolean z12 = t5Var4.d;
                            if (z12 && (th12 = t5Var4.e) != null) {
                                this.f = true;
                                cVar3.clear();
                                cVar4.clear();
                                ((efm.f0) this.i).onError(th12);
                            } else {
                                if (this.f270817g == null) {
                                    this.f270817g = cVar3.poll();
                                }
                                boolean z29 = this.f270817g == null;
                                if (this.f270818h == null) {
                                    this.f270818h = cVar4.poll();
                                }
                                Object obj3 = this.f270818h;
                                boolean z31 = obj3 == null;
                                if (z11 && z12 && z29 && z31) {
                                    ((efm.f0) this.i).onSuccess(Boolean.TRUE);
                                } else if (z11 && z12 && z29 != z31) {
                                    this.f = true;
                                    cVar3.clear();
                                    cVar4.clear();
                                    ((efm.f0) this.i).onSuccess(Boolean.FALSE);
                                } else {
                                    if (!z29 && !z31) {
                                        try {
                                            if (!this.f270815b.test(this.f270817g, obj3)) {
                                                this.f = true;
                                                cVar3.clear();
                                                cVar4.clear();
                                                ((efm.f0) this.i).onSuccess(Boolean.FALSE);
                                            } else {
                                                this.f270817g = null;
                                                this.f270818h = null;
                                            }
                                        } catch (Throwable th15) {
                                            m70.a.u(th15);
                                            this.f = true;
                                            cVar3.clear();
                                            cVar4.clear();
                                            ((efm.f0) this.i).onError(th15);
                                            return;
                                        }
                                    }
                                    if (z29 || z31) {
                                        iAddAndGet2 = addAndGet(-iAddAndGet2);
                                        if (iAddAndGet2 == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    cVar3.clear();
                    cVar4.clear();
                    break;
                }
                break;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270814a) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    this.f270816c.dispose();
                    if (getAndIncrement() == 0) {
                        t5[] t5VarArr = (t5[]) this.f270819j;
                        t5VarArr[0].f270844b.clear();
                        t5VarArr[1].f270844b.clear();
                    }
                }
                break;
            default:
                if (!this.f) {
                    this.f = true;
                    this.f270816c.dispose();
                    if (getAndIncrement() == 0) {
                        t5[] t5VarArr2 = (t5[]) this.f270819j;
                        t5VarArr2[0].f270844b.clear();
                        t5VarArr2[1].f270844b.clear();
                    }
                }
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270814a) {
        }
        return this.f;
    }

    public s5(efm.f0 f0Var, int i, efm.w wVar, efm.w wVar2, kfm.d dVar) {
        this.i = f0Var;
        this.d = wVar;
        this.e = wVar2;
        this.f270815b = dVar;
        this.f270819j = new t5[]{new t5(this, 0, i, (byte) 0), new t5(this, 1, i, (byte) 0)};
    }
}
