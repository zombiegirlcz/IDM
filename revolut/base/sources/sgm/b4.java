package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class b4 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f262720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262721b;

    public b4(long j2, long j3) {
        this.f262720a = j2;
        this.f262721b = j3;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        fgm.l lVar2;
        long j2 = this.f262721b;
        long j3 = this.f262720a;
        z3 z3Var = new z3(lVar, j3, j2 + j3, 1);
        lVar.onSubscribe(z3Var);
        if (z3Var.e) {
            return;
        }
        long j5 = z3Var.d;
        while (true) {
            long j16 = z3Var.f263323c;
            lVar2 = z3Var.f263322b;
            if (j5 == j16 || z3Var.get() != 0) {
                break;
            }
            lVar2.onNext(Long.valueOf(j5));
            j5++;
        }
        if (z3Var.get() == 0) {
            z3Var.lazySet(1);
            lVar2.onComplete();
        }
    }
}
