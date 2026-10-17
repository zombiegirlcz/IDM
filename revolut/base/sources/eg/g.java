package eg;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f125433a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f125434b = ve.b.c("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f125435c = ve.b.c("sessionData");
    public static final ve.b d = ve.b.c("applicationInfo");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        s0 s0Var = (s0) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f125434b, s0Var.f125490a);
        dVar.add(f125435c, s0Var.f125491b);
        dVar.add(d, s0Var.f125492c);
    }
}
