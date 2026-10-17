package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes14.dex */
public final class e7 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f7[] f262816c;
    public final AtomicReferenceArray d;
    public final AtomicReference e;
    public final ygm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f262817g;

    public e7(fgm.l lVar, igm.o oVar, int i) {
        this.f262814a = lVar;
        this.f262815b = oVar;
        f7[] f7VarArr = new f7[i];
        for (int i2 = 0; i2 < i; i2++) {
            f7VarArr[i2] = new f7(this, i2);
        }
        this.f262816c = f7VarArr;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReference();
        this.f = new ygm.c();
    }

    public final void a(int i) {
        int i2 = 0;
        while (true) {
            f7[] f7VarArr = this.f262816c;
            if (i2 >= f7VarArr.length) {
                return;
            }
            if (i2 != i) {
                f7 f7Var = f7VarArr[i2];
                f7Var.getClass();
                jgm.b.a(f7Var);
            }
            i2++;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.e);
        for (f7 f7Var : this.f262816c) {
            f7Var.getClass();
            jgm.b.a(f7Var);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) this.e.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f262817g) {
            return;
        }
        this.f262817g = true;
        a(-1);
        yoj.b.r(this.f262814a, this, this.f);
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f262817g) {
            jb3.l.v(th10);
            return;
        }
        this.f262817g = true;
        a(-1);
        yoj.b.t(this.f262814a, th10, this, this.f);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f262817g) {
            return;
        }
        AtomicReferenceArray atomicReferenceArray = this.d;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[length + 1];
        int i = 0;
        objArr[0] = obj2;
        while (i < length) {
            Object obj3 = atomicReferenceArray.get(i);
            if (obj3 == null) {
                return;
            }
            i++;
            objArr[i] = obj3;
        }
        try {
            Object objApply = this.f262815b.apply(objArr);
            Objects.requireNonNull(objApply, "combiner returned a null value");
            yoj.b.u(this.f262814a, objApply, this, this.f);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.e, disposable);
    }
}
