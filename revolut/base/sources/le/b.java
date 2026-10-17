package le;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f194200a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194201b = ve.b.c("pid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194202c = ve.b.c("processName");
    public static final ve.b d = ve.b.c("reasonCode");
    public static final ve.b e = ve.b.c("importance");
    public static final ve.b f = ve.b.c("pss");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f194203g = ve.b.c("rss");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f194204h = ve.b.c("timestamp");
    public static final ve.b i = ve.b.c("traceFile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.b f194205j = ve.b.c("buildIdMappingForArch");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        e0 e0Var = (e0) ((q1) obj2);
        dVar.add(f194201b, e0Var.f194249a);
        dVar.add(f194202c, e0Var.f194250b);
        dVar.add(d, e0Var.f194251c);
        dVar.add(e, e0Var.d);
        dVar.add(f, e0Var.e);
        dVar.add(f194203g, e0Var.f);
        dVar.add(f194204h, e0Var.f194252g);
        dVar.add(i, e0Var.f194253h);
        dVar.add(f194205j, e0Var.i);
    }
}
