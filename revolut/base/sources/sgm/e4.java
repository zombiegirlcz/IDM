package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class e4 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm.a f262808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pgm.e1 f262810c;

    public e4(zgm.a aVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f262808a = aVar;
        this.f262809b = 1;
    }

    public final void c(pgm.e1 e1Var) {
        synchronized (this) {
            try {
                if (this.f262810c == e1Var) {
                    e1Var.getClass();
                    long j2 = e1Var.f236049b - 1;
                    e1Var.f236049b = j2;
                    if (j2 == 0) {
                        this.f262810c = null;
                        this.f262808a.d();
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void d(pgm.e1 e1Var) {
        synchronized (this) {
            try {
                if (e1Var.f236049b == 0 && e1Var == this.f262810c) {
                    this.f262810c = null;
                    Disposable disposable = (Disposable) e1Var.get();
                    jgm.b.a(e1Var);
                    if (disposable == null) {
                        e1Var.d = true;
                    } else {
                        this.f262808a.d();
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        pgm.e1 e1Var;
        boolean z;
        synchronized (this) {
            try {
                e1Var = this.f262810c;
                if (e1Var == null) {
                    e1Var = new pgm.e1(this, 1);
                    this.f262810c = e1Var;
                }
                long j2 = e1Var.f236049b + 1;
                e1Var.f236049b = j2;
                if (e1Var.f236050c || j2 != this.f262809b) {
                    z = false;
                } else {
                    z = true;
                    e1Var.f236050c = true;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.f262808a.subscribe(new d4(lVar, this, e1Var));
        if (z) {
            this.f262808a.c(e1Var);
        }
    }
}
