package le;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f194372a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194373b = ve.b.c("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194374c = ve.b.c("pid");
    public static final ve.b d = ve.b.c("importance");
    public static final ve.b e = ve.b.c("defaultProcess");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        a1 a1Var = (a1) ((d2) obj2);
        dVar.add(f194373b, a1Var.f194197a);
        dVar.add(f194374c, a1Var.f194198b);
        dVar.add(d, a1Var.f194199c);
        dVar.add(e, a1Var.d);
    }
}
