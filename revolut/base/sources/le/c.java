package le;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f194218a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194219b = ve.b.c("key");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194220c = ve.b.c("value");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        g0 g0Var = (g0) ((r1) obj2);
        dVar.add(f194219b, g0Var.f194271a);
        dVar.add(f194220c, g0Var.f194272b);
    }
}
