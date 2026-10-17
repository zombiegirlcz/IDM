package tfm;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class z7 extends AtomicInteger implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8[] f270999c;
    public final Object[] d;
    public final boolean e;
    public volatile boolean f;

    public z7(int i, efm.y yVar, kfm.o oVar, boolean z) {
        this.f270997a = yVar;
        this.f270998b = oVar;
        this.f270999c = new a8[i];
        this.d = new Object[i];
        this.e = z;
    }

    public final void a() {
        a8[] a8VarArr = this.f270999c;
        for (a8 a8Var : a8VarArr) {
            a8Var.f270350b.clear();
        }
        for (a8 a8Var2 : a8VarArr) {
            lfm.d.a(a8Var2.e);
        }
    }

    public final void b() {
        Throwable th10;
        if (getAndIncrement() != 0) {
            return;
        }
        a8[] a8VarArr = this.f270999c;
        efm.y yVar = this.f270997a;
        Object[] objArr = this.d;
        boolean z = this.e;
        int iAddAndGet = 1;
        while (true) {
            int i = 0;
            int i2 = 0;
            for (a8 a8Var : a8VarArr) {
                if (objArr[i2] == null) {
                    boolean z3 = a8Var.f270351c;
                    Object objPoll = a8Var.f270350b.poll();
                    boolean z4 = objPoll == null;
                    if (this.f) {
                        a();
                        return;
                    }
                    if (z3) {
                        if (!z) {
                            Throwable th11 = a8Var.d;
                            if (th11 != null) {
                                this.f = true;
                                a();
                                yVar.onError(th11);
                                return;
                            } else if (z4) {
                                this.f = true;
                                a();
                                yVar.onComplete();
                                return;
                            }
                        } else if (z4) {
                            Throwable th12 = a8Var.d;
                            this.f = true;
                            a();
                            if (th12 != null) {
                                yVar.onError(th12);
                                return;
                            } else {
                                yVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z4) {
                        i++;
                    } else {
                        objArr[i2] = objPoll;
                    }
                } else if (a8Var.f270351c && !z && (th10 = a8Var.d) != null) {
                    this.f = true;
                    a();
                    yVar.onError(th10);
                    return;
                }
                i2++;
            }
            if (i != 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objApply = this.f270998b.apply(objArr.clone());
                    mfm.f.b(objApply, "The zipper returned a null value");
                    yVar.onNext(objApply);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th13) {
                    m70.a.u(th13);
                    a();
                    yVar.onError(th13);
                    return;
                }
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f) {
            return;
        }
        this.f = true;
        for (a8 a8Var : this.f270999c) {
            lfm.d.a(a8Var.e);
        }
        if (getAndIncrement() == 0) {
            for (a8 a8Var2 : this.f270999c) {
                a8Var2.f270350b.clear();
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f;
    }
}
