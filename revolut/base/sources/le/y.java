package le;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f194415a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194416b = ve.b.c("platform");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194417c = ve.b.c("version");
    public static final ve.b d = ve.b.c("buildVersion");
    public static final ve.b e = ve.b.c("jailbroken");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        j1 j1Var = (j1) ((l2) obj2);
        dVar.add(f194416b, j1Var.f194306a);
        dVar.add(f194417c, j1Var.f194307b);
        dVar.add(d, j1Var.f194308c);
        dVar.add(e, j1Var.d);
    }
}
