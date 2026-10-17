package eg;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f125438a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f125439b = ve.b.c("sessionId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f125440c = ve.b.c("firstSessionId");
    public static final ve.b d = ve.b.c("sessionIndex");
    public static final ve.b e = ve.b.c("eventTimestampUs");
    public static final ve.b f = ve.b.c("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f125441g = ve.b.c("firebaseInstallationId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f125442h = ve.b.c("firebaseAuthenticationToken");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        d1 d1Var = (d1) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f125439b, d1Var.f125419a);
        dVar.add(f125440c, d1Var.f125420b);
        dVar.add(d, d1Var.f125421c);
        dVar.add(e, d1Var.d);
        dVar.add(f, d1Var.e);
        dVar.add(f125441g, d1Var.f);
        dVar.add(f125442h, d1Var.f125422g);
    }
}
