package eg;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f125427a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f125428b = ve.b.c("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f125429c = ve.b.c("pid");
    public static final ve.b d = ve.b.c("importance");
    public static final ve.b e = ve.b.c("defaultProcess");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        f0 f0Var = (f0) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f125428b, f0Var.f125430a);
        dVar.add(f125429c, f0Var.f125431b);
        dVar.add(d, f0Var.f125432c);
        dVar.add(e, f0Var.d);
    }
}
