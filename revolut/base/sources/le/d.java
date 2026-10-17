package le;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f194231a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194232b = ve.b.c("sdkVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194233c = ve.b.c("gmpAppId");
    public static final ve.b d = ve.b.c("platform");
    public static final ve.b e = ve.b.c("installationUuid");
    public static final ve.b f = ve.b.c("firebaseInstallationId");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f194234g = ve.b.c("firebaseAuthenticationToken");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f194235h = ve.b.c("appQualitySessionId");
    public static final ve.b i = ve.b.c("buildVersion");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.b f194236j = ve.b.c("displayVersion");
    public static final ve.b k = ve.b.c(ib.b.Session);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ve.b f194237l = ve.b.c("ndkPayload");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ve.b f194238m = ve.b.c("appExitInfo");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        c0 c0Var = (c0) ((o2) obj2);
        dVar.add(f194232b, c0Var.f194221b);
        dVar.add(f194233c, c0Var.f194222c);
        dVar.add(d, c0Var.d);
        dVar.add(e, c0Var.e);
        dVar.add(f, c0Var.f);
        dVar.add(f194234g, c0Var.f194223g);
        dVar.add(f194235h, c0Var.f194224h);
        dVar.add(i, c0Var.i);
        dVar.add(f194236j, c0Var.f194225j);
        dVar.add(k, c0Var.k);
        dVar.add(f194237l, c0Var.f194226l);
        dVar.add(f194238m, c0Var.f194227m);
    }
}
