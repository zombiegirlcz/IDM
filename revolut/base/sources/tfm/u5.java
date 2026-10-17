package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class u5 extends efm.d0 implements nfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.w f270864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.w f270865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.d f270866c;
    public final int d;

    public u5(efm.w wVar, efm.w wVar2, kfm.d dVar, int i) {
        this.f270864a = wVar;
        this.f270865b = wVar2;
        this.f270866c = dVar;
        this.d = i;
    }

    @Override // nfm.d
    public final efm.r a() {
        return new sfm.h(this.f270864a, this.f270865b, this.f270866c, this.d, 1);
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        s5 s5Var = new s5(f0Var, this.d, this.f270864a, this.f270865b, this.f270866c);
        f0Var.onSubscribe(s5Var);
        t5[] t5VarArr = (t5[]) s5Var.f270819j;
        s5Var.d.subscribe(t5VarArr[0]);
        s5Var.e.subscribe(t5VarArr[1]);
    }
}
