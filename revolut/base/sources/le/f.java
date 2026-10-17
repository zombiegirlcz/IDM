package le;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f194257a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194258b = ve.b.c("filename");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194259c = ve.b.c("contents");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        i0 i0Var = (i0) ((s1) obj2);
        dVar.add(f194258b, i0Var.f194285a);
        dVar.add(f194259c, i0Var.f194286b);
    }
}
