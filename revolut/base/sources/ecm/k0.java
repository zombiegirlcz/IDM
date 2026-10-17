package ecm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f124832a;

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static fa.j b(ia.f r22) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ecm.k0.b(ia.f):fa.j");
    }

    public r10.a a() {
        Preconditions.checkState(this.f124832a != null, "config is not set");
        g2 g2Var = g2.e;
        Object obj2 = this.f124832a;
        r10.a aVar = new r10.a();
        aVar.f250811a = (g2) Preconditions.checkNotNull(g2Var, "status");
        aVar.f250812b = obj2;
        return aVar;
    }

    public void c(Object obj2) {
        this.f124832a = Preconditions.checkNotNull(obj2, "config");
    }
}
