package n08;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210903a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f210904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rp0.y f210905c;

    public /* synthetic */ k(c0 c0Var, rp0.y yVar) {
        this.f210904b = c0Var;
        this.f210905c = yVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f210903a) {
            case 0:
                rp0.y yVar = this.f210905c;
                if (yVar != null) {
                    ((opi.b) this.f210904b.f210895t).Z(yVar);
                }
                break;
            default:
                ((opi.b) this.f210904b.f210895t).Z(this.f210905c);
                break;
        }
    }

    public /* synthetic */ k(rp0.y yVar, c0 c0Var) {
        this.f210905c = yVar;
        this.f210904b = c0Var;
    }
}
