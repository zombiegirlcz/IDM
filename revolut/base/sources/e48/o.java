package e48;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f122463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f122464b;

    public o(g gVar, n nVar) {
        this.f122463a = gVar;
        this.f122464b = nVar;
    }

    @Override // phm.a
    public final Object get() {
        e58.j jVar = new e58.j();
        AccountId.Joint joint = this.f122464b.f122460a;
        gte.a aVarB = this.f122463a.i.b();
        vc.s.j(aVarB);
        return new e58.i(jVar, joint, aVarB);
    }
}
