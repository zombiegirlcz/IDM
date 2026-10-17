package le;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f194398a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194399b = ve.b.c("rolloutVariant");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194400c = ve.b.c("parameterKey");
    public static final ve.b d = ve.b.c("parameterValue");
    public static final ve.b e = ve.b.c("templateVersion");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        f1 f1Var = (f1) ((i2) obj2);
        dVar.add(f194399b, f1Var.f194263a);
        dVar.add(f194400c, f1Var.f194264b);
        dVar.add(d, f1Var.f194265c);
        dVar.add(e, f1Var.d);
    }
}
