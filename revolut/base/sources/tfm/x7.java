package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class x7 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7[] f270946c;
    public final AtomicReferenceArray d;
    public final AtomicReference e;
    public final zfm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270947g;

    public x7(efm.y yVar, kfm.o oVar, int i) {
        this.f270944a = yVar;
        this.f270945b = oVar;
        y7[] y7VarArr = new y7[i];
        for (int i2 = 0; i2 < i; i2++) {
            y7VarArr[i2] = new y7(this, i2);
        }
        this.f270946c = y7VarArr;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReference();
        this.f = new zfm.c();
    }

    public final void a(int i) {
        int i2 = 0;
        while (true) {
            y7[] y7VarArr = this.f270946c;
            if (i2 >= y7VarArr.length) {
                return;
            }
            if (i2 != i) {
                y7 y7Var = y7VarArr[i2];
                y7Var.getClass();
                lfm.d.a(y7Var);
            }
            i2++;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.e);
        for (y7 y7Var : this.f270946c) {
            y7Var.getClass();
            lfm.d.a(y7Var);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.e.get());
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270947g) {
            return;
        }
        this.f270947g = true;
        a(-1);
        jh.d.o(this.f270944a, this, this.f);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270947g) {
            mo3.a.m(th10);
            return;
        }
        this.f270947g = true;
        a(-1);
        jh.d.p(this.f270944a, th10, this, this.f);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270947g) {
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
            Object objApply = this.f270945b.apply(objArr);
            mfm.f.b(objApply, "combiner returned a null value");
            jh.d.q(this.f270944a, objApply, this, this.f);
        } catch (Throwable th10) {
            m70.a.u(th10);
            dispose();
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.e, cVar);
    }
}
