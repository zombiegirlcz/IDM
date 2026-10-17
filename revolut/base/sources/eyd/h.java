package eyd;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f130754b;

    public /* synthetic */ h(b0 b0Var, int i) {
        this.f130753a = i;
        this.f130754b = b0Var;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f130753a) {
            case 0:
                zxd.c cVarA = ((b) this.f130754b.f130699c).a();
                vc.s.j(cVarA);
                return new dzd.g(cVarA, new vyd.a(), new dzd.h());
            case 1:
                return new com.revolut.feature.statements.impl.ui.custom_statement.flow.b(this.f130754b.e.e());
            default:
                return new s0e.b(this.f130754b.e.e());
        }
    }
}
