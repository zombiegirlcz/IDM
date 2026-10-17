package le;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f194386a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194387b = ve.b.c("timestamp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194388c = ve.b.c("type");
    public static final ve.b d = ve.b.c("app");
    public static final ve.b e = ve.b.c("device");
    public static final ve.b f = ve.b.c("log");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f194389g = ve.b.c("rollouts");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        q0 q0Var = (q0) ((k2) obj2);
        dVar.add(f194387b, q0Var.f194369a);
        dVar.add(f194388c, q0Var.f194370b);
        dVar.add(d, q0Var.f194371c);
        dVar.add(e, q0Var.d);
        dVar.add(f, q0Var.e);
        dVar.add(f194389g, q0Var.f);
    }
}
