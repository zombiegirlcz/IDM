package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class b2 extends efm.d0 implements nfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f270362c;

    public b2(efm.r rVar, long j2, Object obj2) {
        this.f270360a = rVar;
        this.f270361b = j2;
        this.f270362c = obj2;
    }

    @Override // nfm.d
    public final efm.r a() {
        return new x1(this.f270360a, this.f270361b, this.f270362c, true);
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        this.f270360a.subscribe(new a2(f0Var, this.f270361b, this.f270362c));
    }
}
