package le;

/* JADX INFO: loaded from: classes.dex */
public final class q implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f194366a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194367b = ve.b.c("pc");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194368c = ve.b.c("symbol");
    public static final ve.b d = ve.b.c("file");
    public static final ve.b e = ve.b.c("offset");
    public static final ve.b f = ve.b.c("importance");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        y0 y0Var = (y0) ((a2) obj2);
        dVar.add(f194367b, y0Var.f194418a);
        dVar.add(f194368c, y0Var.f194419b);
        dVar.add(d, y0Var.f194420c);
        dVar.add(e, y0Var.d);
        dVar.add(f, y0Var.e);
    }
}
