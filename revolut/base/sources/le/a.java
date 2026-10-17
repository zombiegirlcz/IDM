package le;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f194193a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194194b = ve.b.c("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194195c = ve.b.c("libraryName");
    public static final ve.b d = ve.b.c("buildId");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        f0 f0Var = (f0) ((p1) obj2);
        dVar.add(f194194b, f0Var.f194260a);
        dVar.add(f194195c, f0Var.f194261b);
        dVar.add(d, f0Var.f194262c);
    }
}
