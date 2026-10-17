package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 extends efm.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.r f270718b;

    public /* synthetic */ p3(efm.r rVar, int i) {
        this.f270717a = i;
        this.f270718b = rVar;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f270717a) {
            case 0:
                this.f270718b.subscribe(new o2(lVar, 1));
                break;
            default:
                this.f270718b.subscribe(new m1(lVar));
                break;
        }
    }
}
