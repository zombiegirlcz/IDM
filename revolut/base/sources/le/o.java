package le;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f194349a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194350b = ve.b.c("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194351c = ve.b.c("code");
    public static final ve.b d = ve.b.c("address");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        v0 v0Var = (v0) ((z1) obj2);
        dVar.add(f194350b, v0Var.f194401a);
        dVar.add(f194351c, v0Var.f194402b);
        dVar.add(d, v0Var.f194403c);
    }
}
