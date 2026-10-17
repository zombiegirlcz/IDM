package le;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f194290a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194291b = ve.b.c("generator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194292c = ve.b.c("identifier");
    public static final ve.b d = ve.b.c("appQualitySessionId");
    public static final ve.b e = ve.b.c("startedAt");
    public static final ve.b f = ve.b.c("endedAt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f194293g = ve.b.c("crashed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f194294h = ve.b.c("app");
    public static final ve.b i = ve.b.c("user");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.b f194295j = ve.b.c("os");
    public static final ve.b k = ve.b.c("device");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ve.b f194296l = ve.b.c("events");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ve.b f194297m = ve.b.c("generatorType");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        k0 k0Var = (k0) ((n2) obj2);
        dVar.add(f194291b, k0Var.f194314a);
        dVar.add(f194292c, k0Var.f194315b.getBytes(o2.f194358a));
        dVar.add(d, k0Var.f194316c);
        dVar.add(e, k0Var.d);
        dVar.add(f, k0Var.e);
        dVar.add(f194293g, k0Var.f);
        dVar.add(f194294h, k0Var.f194317g);
        dVar.add(i, k0Var.f194318h);
        dVar.add(f194295j, k0Var.i);
        dVar.add(k, k0Var.f194319j);
        dVar.add(f194296l, k0Var.k);
        dVar.add(f194297m, k0Var.f194320l);
    }
}
