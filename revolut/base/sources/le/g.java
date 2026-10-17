package le;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f194266a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194267b = ve.b.c("identifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194268c = ve.b.c("version");
    public static final ve.b d = ve.b.c("displayVersion");
    public static final ve.b e = ve.b.c("organization");
    public static final ve.b f = ve.b.c("installationUuid");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f194269g = ve.b.c("developmentPlatform");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f194270h = ve.b.c("developmentPlatformVersion");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        l0 l0Var = (l0) ((v1) obj2);
        dVar.add(f194267b, l0Var.f194325a);
        dVar.add(f194268c, l0Var.f194326b);
        dVar.add(d, l0Var.f194327c);
        dVar.add(e, (Object) null);
        dVar.add(f, l0Var.d);
        dVar.add(f194269g, l0Var.e);
        dVar.add(f194270h, l0Var.f);
    }
}
