package le;

/* JADX INFO: loaded from: classes.dex */
public final class p implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f194359a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194360b = ve.b.c("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194361c = ve.b.c("importance");
    public static final ve.b d = ve.b.c("frames");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        w0 w0Var = (w0) ((b2) obj2);
        dVar.add(f194360b, w0Var.f194407a);
        dVar.add(f194361c, w0Var.f194408b);
        dVar.add(d, w0Var.f194409c);
    }
}
