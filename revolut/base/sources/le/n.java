package le;

/* JADX INFO: loaded from: classes.dex */
public final class n implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f194337a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194338b = ve.b.c("type");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194339c = ve.b.c("reason");
    public static final ve.b d = ve.b.c("frames");
    public static final ve.b e = ve.b.c("causedBy");
    public static final ve.b f = ve.b.c("overflowCount");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        u0 u0Var = (u0) ((y1) obj2);
        dVar.add(f194338b, u0Var.f194395a);
        dVar.add(f194339c, u0Var.f194396b);
        dVar.add(d, u0Var.f194397c);
        dVar.add(e, u0Var.d);
        dVar.add(f, u0Var.e);
    }
}
