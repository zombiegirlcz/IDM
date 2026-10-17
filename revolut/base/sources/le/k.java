package le;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f194309a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194310b = ve.b.c("execution");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194311c = ve.b.c("customAttributes");
    public static final ve.b d = ve.b.c("internalKeys");
    public static final ve.b e = ve.b.c("background");
    public static final ve.b f = ve.b.c("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f194312g = ve.b.c("appProcessDetails");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f194313h = ve.b.c("uiOrientation");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        r0 r0Var = (r0) ((e2) obj2);
        dVar.add(f194310b, r0Var.f194375a);
        dVar.add(f194311c, r0Var.f194376b);
        dVar.add(d, r0Var.f194377c);
        dVar.add(e, r0Var.d);
        dVar.add(f, r0Var.e);
        dVar.add(f194312g, r0Var.f);
        dVar.add(f194313h, r0Var.f194378g);
    }
}
