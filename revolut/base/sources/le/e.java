package le;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f194246a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194247b = ve.b.c("files");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194248c = ve.b.c("orgId");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        h0 h0Var = (h0) ((t1) obj2);
        dVar.add(f194247b, h0Var.f194276a);
        dVar.add(f194248c, h0Var.f194277b);
    }
}
