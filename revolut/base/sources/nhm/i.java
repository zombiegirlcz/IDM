package nhm;

/* JADX INFO: loaded from: classes14.dex */
public abstract class i extends b {
    public static b h(int i, i iVar, k kVar) {
        int iE = iVar.e();
        int i2 = kVar.f215598a;
        if (iE == i2) {
            return new h(iE, kVar.f215599b, kVar.f215600c, iVar);
        }
        int iA = b.a(i, iE);
        int iA2 = b.a(i, i2);
        int i3 = (1 << iA) | (1 << iA2);
        if (iA != iA2) {
            return new f(i3, iVar.size() + 1, iA < iA2 ? new Object[]{iVar, kVar} : new Object[]{kVar, iVar});
        }
        b bVarH = h(i + 5, iVar, kVar);
        return new f(i3, bVarH.size(), new Object[]{bVarH});
    }

    public abstract int e();

    public abstract Object f();

    public abstract Object i();

    @Override // nhm.b
    public final boolean isEmpty() {
        return false;
    }
}
