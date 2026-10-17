package le;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f194279a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194280b = ve.b.c("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194281c = ve.b.c("model");
    public static final ve.b d = ve.b.c("cores");
    public static final ve.b e = ve.b.c("ram");
    public static final ve.b f = ve.b.c("diskSpace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f194282g = ve.b.c("simulator");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f194283h = ve.b.c("state");
    public static final ve.b i = ve.b.c("manufacturer");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.b f194284j = ve.b.c("modelClass");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        o0 o0Var = (o0) ((w1) obj2);
        dVar.add(f194280b, o0Var.f194352a);
        dVar.add(f194281c, o0Var.f194353b);
        dVar.add(d, o0Var.f194354c);
        dVar.add(e, o0Var.d);
        dVar.add(f, o0Var.e);
        dVar.add(f194282g, o0Var.f);
        dVar.add(f194283h, o0Var.f194355g);
        dVar.add(i, o0Var.f194356h);
        dVar.add(f194284j, o0Var.i);
    }
}
