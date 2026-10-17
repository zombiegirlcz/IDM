package mcm;

import ecm.m1;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends ecm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f204415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.l f204416b;

    public v(n nVar, ecm.l lVar) {
        this.f204415a = nVar;
        this.f204416b = lVar;
    }

    @Override // ecm.l
    public final ecm.n a(ecm.m mVar, m1 m1Var) {
        ecm.l lVar = this.f204416b;
        return lVar != null ? new t(this, lVar.a(mVar, m1Var)) : new u(this);
    }
}
