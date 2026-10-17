package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class k0 extends AtomicInteger implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0[] f262946c;
    public Object[] d;
    public final bhm.i e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f262947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f262948h;
    public final ygm.c i = new ygm.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f262949j;
    public int k;

    public k0(int i, int i2, fgm.l lVar, igm.o oVar, boolean z) {
        this.f262944a = lVar;
        this.f262945b = oVar;
        this.f = z;
        this.d = new Object[i];
        j0[] j0VarArr = new j0[i];
        for (int i3 = 0; i3 < i; i3++) {
            j0VarArr[i3] = new j0(this, i3);
        }
        this.f262946c = j0VarArr;
        this.e = new bhm.i(i2);
    }

    public final void a() {
        for (j0 j0Var : this.f262946c) {
            j0Var.getClass();
            jgm.b.a(j0Var);
        }
    }

    public final void b(bhm.i iVar) {
        synchronized (this) {
            this.d = null;
        }
        iVar.clear();
    }

    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        bhm.i iVar = this.e;
        fgm.l lVar = this.f262944a;
        boolean z = this.f;
        int iAddAndGet = 1;
        while (!this.f262947g) {
            if (!z && this.i.get() != null) {
                a();
                b(iVar);
                this.i.e(lVar);
                return;
            }
            boolean z3 = this.f262948h;
            Object[] objArr = (Object[]) iVar.poll();
            boolean z4 = objArr == null;
            if (z3 && z4) {
                b(iVar);
                this.i.e(lVar);
                return;
            }
            if (z4) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objApply = this.f262945b.apply(objArr);
                    Objects.requireNonNull(objApply, "The combiner returned a null value");
                    lVar.onNext(objApply);
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    this.i.a(th10);
                    a();
                    b(iVar);
                    this.i.e(lVar);
                    return;
                }
            }
        }
        b(iVar);
        this.i.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f262947g) {
            return;
        }
        this.f262947g = true;
        a();
        c();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f262947g;
    }
}
