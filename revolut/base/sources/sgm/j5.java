package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class j5 extends AtomicInteger implements Disposable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.d f262933b;
    public final ObservableSource d;
    public final ObservableSource e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f262935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f262936h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fgm.l[] f262937j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262932a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jgm.a f262934c = new jgm.a(2);

    public j5(fgm.l lVar, int i, ObservableSource observableSource, ObservableSource observableSource2, igm.d dVar) {
        this.i = lVar;
        this.d = observableSource;
        this.e = observableSource2;
        this.f262933b = dVar;
        this.f262937j = new k5[]{new k5(this, 0, i), new k5(this, 1, i)};
    }

    public final void a() {
        Throwable th10;
        Throwable th11;
        Throwable th12;
        Throwable th13;
        switch (this.f262932a) {
            case 0:
                if (getAndIncrement() == 0) {
                    k5[] k5VarArr = (k5[]) this.f262937j;
                    k5 k5Var = k5VarArr[0];
                    bhm.i iVar = k5Var.f262966b;
                    k5 k5Var2 = k5VarArr[1];
                    bhm.i iVar2 = k5Var2.f262966b;
                    int iAddAndGet = 1;
                    while (!this.f) {
                        boolean z = k5Var.d;
                        if (z && (th11 = k5Var.e) != null) {
                            this.f = true;
                            iVar.clear();
                            iVar2.clear();
                            ((fgm.l) this.i).onError(th11);
                        } else {
                            boolean z3 = k5Var2.d;
                            if (z3 && (th10 = k5Var2.e) != null) {
                                this.f = true;
                                iVar.clear();
                                iVar2.clear();
                                ((fgm.l) this.i).onError(th10);
                            } else {
                                if (this.f262935g == null) {
                                    this.f262935g = iVar.poll();
                                }
                                boolean z4 = this.f262935g == null;
                                if (this.f262936h == null) {
                                    this.f262936h = iVar2.poll();
                                }
                                Object obj2 = this.f262936h;
                                boolean z6 = obj2 == null;
                                if (z && z3 && z4 && z6) {
                                    ((fgm.l) this.i).onNext(Boolean.TRUE);
                                    ((fgm.l) this.i).onComplete();
                                } else if (z && z3 && z4 != z6) {
                                    this.f = true;
                                    iVar.clear();
                                    iVar2.clear();
                                    ((fgm.l) this.i).onNext(Boolean.FALSE);
                                    ((fgm.l) this.i).onComplete();
                                } else {
                                    if (!z4 && !z6) {
                                        try {
                                            igm.d dVar = this.f262933b;
                                            Object obj3 = this.f262935g;
                                            ((dcl.q) dVar).getClass();
                                            if (!Objects.equals(obj3, obj2)) {
                                                this.f = true;
                                                iVar.clear();
                                                iVar2.clear();
                                                ((fgm.l) this.i).onNext(Boolean.FALSE);
                                                ((fgm.l) this.i).onComplete();
                                            } else {
                                                this.f262935g = null;
                                                this.f262936h = null;
                                            }
                                        } catch (Throwable th14) {
                                            ce9.m.F(th14);
                                            this.f = true;
                                            iVar.clear();
                                            iVar2.clear();
                                            ((fgm.l) this.i).onError(th14);
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
                    iVar.clear();
                    iVar2.clear();
                    break;
                }
                break;
            default:
                if (getAndIncrement() == 0) {
                    k5[] k5VarArr2 = (k5[]) this.f262937j;
                    k5 k5Var3 = k5VarArr2[0];
                    bhm.i iVar3 = k5Var3.f262966b;
                    k5 k5Var4 = k5VarArr2[1];
                    bhm.i iVar4 = k5Var4.f262966b;
                    int iAddAndGet2 = 1;
                    while (!this.f) {
                        boolean z11 = k5Var3.d;
                        if (z11 && (th13 = k5Var3.e) != null) {
                            this.f = true;
                            iVar3.clear();
                            iVar4.clear();
                            ((fgm.p) this.i).onError(th13);
                        } else {
                            boolean z12 = k5Var4.d;
                            if (z12 && (th12 = k5Var4.e) != null) {
                                this.f = true;
                                iVar3.clear();
                                iVar4.clear();
                                ((fgm.p) this.i).onError(th12);
                            } else {
                                if (this.f262935g == null) {
                                    this.f262935g = iVar3.poll();
                                }
                                boolean z29 = this.f262935g == null;
                                if (this.f262936h == null) {
                                    this.f262936h = iVar4.poll();
                                }
                                Object obj4 = this.f262936h;
                                boolean z31 = obj4 == null;
                                if (z11 && z12 && z29 && z31) {
                                    ((fgm.p) this.i).onSuccess(Boolean.TRUE);
                                } else if (z11 && z12 && z29 != z31) {
                                    this.f = true;
                                    iVar3.clear();
                                    iVar4.clear();
                                    ((fgm.p) this.i).onSuccess(Boolean.FALSE);
                                } else {
                                    if (!z29 && !z31) {
                                        try {
                                            igm.d dVar2 = this.f262933b;
                                            Object obj5 = this.f262935g;
                                            ((dcl.q) dVar2).getClass();
                                            if (!Objects.equals(obj5, obj4)) {
                                                this.f = true;
                                                iVar3.clear();
                                                iVar4.clear();
                                                ((fgm.p) this.i).onSuccess(Boolean.FALSE);
                                            } else {
                                                this.f262935g = null;
                                                this.f262936h = null;
                                            }
                                        } catch (Throwable th15) {
                                            ce9.m.F(th15);
                                            this.f = true;
                                            iVar3.clear();
                                            iVar4.clear();
                                            ((fgm.p) this.i).onError(th15);
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
                    iVar3.clear();
                    iVar4.clear();
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262932a) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    this.f262934c.dispose();
                    if (getAndIncrement() == 0) {
                        k5[] k5VarArr = (k5[]) this.f262937j;
                        k5VarArr[0].f262966b.clear();
                        k5VarArr[1].f262966b.clear();
                    }
                }
                break;
            default:
                if (!this.f) {
                    this.f = true;
                    this.f262934c.dispose();
                    if (getAndIncrement() == 0) {
                        k5[] k5VarArr2 = (k5[]) this.f262937j;
                        k5VarArr2[0].f262966b.clear();
                        k5VarArr2[1].f262966b.clear();
                    }
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262932a) {
        }
        return this.f;
    }

    public j5(fgm.p pVar, int i, ObservableSource observableSource, ObservableSource observableSource2, igm.d dVar) {
        this.i = pVar;
        this.d = observableSource;
        this.e = observableSource2;
        this.f262933b = dVar;
        this.f262937j = new k5[]{new k5(this, 0, i, (byte) 0), new k5(this, 1, i, (byte) 0)};
    }
}
