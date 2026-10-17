package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class g7 extends AtomicInteger implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h7[] f262867c;
    public final Object[] d;
    public final boolean e;
    public volatile boolean f;

    public g7(int i, fgm.l lVar, igm.o oVar, boolean z) {
        this.f262865a = lVar;
        this.f262866b = oVar;
        this.f262867c = new h7[i];
        this.d = new Object[i];
        this.e = z;
    }

    public final void a() {
        h7[] h7VarArr = this.f262867c;
        for (h7 h7Var : h7VarArr) {
            h7Var.f262886b.clear();
        }
        for (h7 h7Var2 : h7VarArr) {
            jgm.b.a(h7Var2.e);
        }
    }

    public final void b() {
        Throwable th10;
        if (getAndIncrement() != 0) {
            return;
        }
        h7[] h7VarArr = this.f262867c;
        fgm.l lVar = this.f262865a;
        Object[] objArr = this.d;
        boolean z = this.e;
        int iAddAndGet = 1;
        while (true) {
            int i = 0;
            int i2 = 0;
            for (h7 h7Var : h7VarArr) {
                if (objArr[i2] == null) {
                    boolean z3 = h7Var.f262887c;
                    Object objPoll = h7Var.f262886b.poll();
                    boolean z4 = objPoll == null;
                    if (this.f) {
                        a();
                        return;
                    }
                    if (z3) {
                        if (!z) {
                            Throwable th11 = h7Var.d;
                            if (th11 != null) {
                                this.f = true;
                                a();
                                lVar.onError(th11);
                                return;
                            } else if (z4) {
                                this.f = true;
                                a();
                                lVar.onComplete();
                                return;
                            }
                        } else if (z4) {
                            Throwable th12 = h7Var.d;
                            this.f = true;
                            a();
                            if (th12 != null) {
                                lVar.onError(th12);
                                return;
                            } else {
                                lVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z4) {
                        i++;
                    } else {
                        objArr[i2] = objPoll;
                    }
                } else if (h7Var.f262887c && !z && (th10 = h7Var.d) != null) {
                    this.f = true;
                    a();
                    lVar.onError(th10);
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
                    Object objApply = this.f262866b.apply(objArr.clone());
                    Objects.requireNonNull(objApply, "The zipper returned a null value");
                    lVar.onNext(objApply);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th13) {
                    ce9.m.F(th13);
                    a();
                    lVar.onError(th13);
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f) {
            return;
        }
        this.f = true;
        for (h7 h7Var : this.f262867c) {
            jgm.b.a(h7Var.e);
        }
        if (getAndIncrement() == 0) {
            for (h7 h7Var2 : this.f262867c) {
                h7Var2.f262886b.clear();
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f;
    }
}
