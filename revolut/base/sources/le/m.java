package le;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f194331a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194332b = ve.b.c("threads");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194333c = ve.b.c("exception");
    public static final ve.b d = ve.b.c("appExitInfo");
    public static final ve.b e = ve.b.c("signal");
    public static final ve.b f = ve.b.c("binaries");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        s0 s0Var = (s0) ((c2) obj2);
        dVar.add(f194332b, s0Var.f194383a);
        dVar.add(f194333c, s0Var.f194384b);
        dVar.add(d, s0Var.f194385c);
        dVar.add(e, s0Var.d);
        dVar.add(f, s0Var.e);
    }
}
