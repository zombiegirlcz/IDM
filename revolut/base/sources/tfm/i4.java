package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class i4 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f270535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270536h;

    public i4(int i, int i2) {
        this.f270535g = i;
        this.f270536h = ((long) i) + ((long) i2);
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.y yVar2;
        h4 h4Var = new h4(yVar, this.f270535g, this.f270536h, 0);
        yVar.onSubscribe(h4Var);
        if (h4Var.e) {
            return;
        }
        long j2 = h4Var.d;
        while (true) {
            long j3 = h4Var.f270510c;
            yVar2 = h4Var.f270509b;
            if (j2 == j3 || h4Var.get() != 0) {
                break;
            }
            yVar2.onNext(Integer.valueOf((int) j2));
            j2++;
        }
        if (h4Var.get() == 0) {
            h4Var.lazySet(1);
            yVar2.onComplete();
        }
    }
}
