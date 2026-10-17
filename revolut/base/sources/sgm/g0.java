package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class g0 extends a implements fgm.l {
    public static final e0[] k = new e0[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e0[] f262839l = new e0[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f262840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f262841c;
    public final AtomicReference d;
    public volatile long e;
    public final f0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f262842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f262843h;
    public Throwable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f262844j;

    public g0(Observable observable, int i) {
        super(observable);
        this.f262841c = i;
        this.f262840b = new AtomicBoolean();
        f0 f0Var = new f0(i, 0);
        this.f = f0Var;
        this.f262842g = f0Var;
        this.d = new AtomicReference(k);
    }

    public final void c(e0 e0Var) {
        if (e0Var.getAndIncrement() != 0) {
            return;
        }
        long j2 = e0Var.e;
        int i = e0Var.d;
        f0 f0Var = e0Var.f262790c;
        fgm.l lVar = e0Var.f262788a;
        int i2 = this.f262841c;
        int iAddAndGet = 1;
        while (!e0Var.f) {
            boolean z = this.f262844j;
            boolean z3 = this.e == j2;
            if (z && z3) {
                e0Var.f262790c = null;
                Throwable th10 = this.i;
                if (th10 != null) {
                    lVar.onError(th10);
                    return;
                } else {
                    lVar.onComplete();
                    return;
                }
            }
            if (z3) {
                e0Var.e = j2;
                e0Var.d = i;
                e0Var.f262790c = f0Var;
                iAddAndGet = e0Var.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i == i2) {
                    f0Var = (f0) f0Var.f262822b;
                    i = 0;
                }
                lVar.onNext(((Object[]) f0Var.f262821a)[i]);
                i++;
                j2++;
            }
        }
        e0Var.f262790c = null;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f262844j = true;
        for (e0 e0Var : (e0[]) this.d.getAndSet(f262839l)) {
            c(e0Var);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.i = th10;
        this.f262844j = true;
        for (e0 e0Var : (e0[]) this.d.getAndSet(f262839l)) {
            c(e0Var);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        int i = this.f262843h;
        if (i == this.f262841c) {
            f0 f0Var = new f0(i, 0);
            ((Object[]) f0Var.f262821a)[0] = obj2;
            this.f262843h = 1;
            this.f262842g.f262822b = f0Var;
            this.f262842g = f0Var;
        } else {
            ((Object[]) this.f262842g.f262821a)[i] = obj2;
            this.f262843h = i + 1;
        }
        this.e++;
        for (e0 e0Var : (e0[]) this.d.get()) {
            c(e0Var);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        e0 e0Var = new e0(lVar, this);
        lVar.onSubscribe(e0Var);
        loop0: while (true) {
            AtomicReference atomicReference = this.d;
            e0[] e0VarArr = (e0[]) atomicReference.get();
            if (e0VarArr != f262839l) {
                int length = e0VarArr.length;
                e0[] e0VarArr2 = new e0[length + 1];
                System.arraycopy(e0VarArr, 0, e0VarArr2, 0, length);
                e0VarArr2[length] = e0Var;
                while (!atomicReference.compareAndSet(e0VarArr, e0VarArr2)) {
                    if (atomicReference.get() != e0VarArr) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        AtomicBoolean atomicBoolean = this.f262840b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            c(e0Var);
        } else {
            this.f262688a.subscribe(this);
        }
    }
}
