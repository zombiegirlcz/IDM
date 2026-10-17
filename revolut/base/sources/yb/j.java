package yb;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f312106a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f312107b = ve.b.c("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f312108c = ve.b.c("requestUptimeMs");
    public static final ve.b d = ve.b.c("clientInfo");
    public static final ve.b e = ve.b.c("logSource");
    public static final ve.b f = ve.b.c("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f312109g = ve.b.c("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f312110h = ve.b.c("qosTier");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        u uVar = (u) ((g0) obj2);
        dVar.add(f312107b, uVar.f312136a);
        dVar.add(f312108c, uVar.f312137b);
        dVar.add(d, uVar.f312138c);
        dVar.add(e, uVar.d);
        dVar.add(f, uVar.e);
        dVar.add(f312109g, uVar.f);
        dVar.add(f312110h, uVar.f312139g);
    }
}
