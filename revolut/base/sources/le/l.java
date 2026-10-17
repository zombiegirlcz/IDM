package le;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f194322a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194323b = ve.b.c("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194324c = ve.b.c("size");
    public static final ve.b d = ve.b.c("name");
    public static final ve.b e = ve.b.c("uuid");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        t0 t0Var = (t0) ((x1) obj2);
        dVar.add(f194323b, t0Var.f194390a);
        dVar.add(f194324c, t0Var.f194391b);
        dVar.add(d, t0Var.f194392c);
        String str = t0Var.d;
        dVar.add(e, str != null ? str.getBytes(o2.f194358a) : null);
    }
}
