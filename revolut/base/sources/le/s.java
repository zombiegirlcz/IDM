package le;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f194379a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194380b = ve.b.c("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194381c = ve.b.c("batteryVelocity");
    public static final ve.b d = ve.b.c("proximityOn");
    public static final ve.b e = ve.b.c("orientation");
    public static final ve.b f = ve.b.c("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f194382g = ve.b.c("diskUsed");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        c1 c1Var = (c1) ((f2) obj2);
        dVar.add(f194380b, c1Var.f194228a);
        dVar.add(f194381c, c1Var.f194229b);
        dVar.add(d, c1Var.f194230c);
        dVar.add(e, c1Var.d);
        dVar.add(f, c1Var.e);
        dVar.add(f194382g, c1Var.f);
    }
}
