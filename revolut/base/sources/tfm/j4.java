package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class j4 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f270566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270567h;

    public j4(long j2, long j3) {
        this.f270566g = j2;
        this.f270567h = j3;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.y yVar2;
        long j2 = this.f270567h;
        long j3 = this.f270566g;
        h4 h4Var = new h4(yVar, j3, j2 + j3, 1);
        yVar.onSubscribe(h4Var);
        if (h4Var.e) {
            return;
        }
        long j5 = h4Var.d;
        while (true) {
            long j16 = h4Var.f270510c;
            yVar2 = h4Var.f270509b;
            if (j5 == j16 || h4Var.get() != 0) {
                break;
            }
            yVar2.onNext(Long.valueOf(j5));
            j5++;
        }
        if (h4Var.get() == 0) {
            h4Var.lazySet(1);
            yVar2.onComplete();
        }
    }
}
