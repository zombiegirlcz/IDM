package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class a4 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f262699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262700b;

    public a4(int i, int i2) {
        this.f262699a = i;
        this.f262700b = ((long) i) + ((long) i2);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        fgm.l lVar2;
        z3 z3Var = new z3(lVar, this.f262699a, this.f262700b, 0);
        lVar.onSubscribe(z3Var);
        if (z3Var.e) {
            return;
        }
        long j2 = z3Var.d;
        while (true) {
            long j3 = z3Var.f263323c;
            lVar2 = z3Var.f263322b;
            if (j2 == j3 || z3Var.get() != 0) {
                break;
            }
            lVar2.onNext(Integer.valueOf((int) j2));
            j2++;
        }
        if (z3Var.get() == 0) {
            z3Var.lazySet(1);
            lVar2.onComplete();
        }
    }
}
