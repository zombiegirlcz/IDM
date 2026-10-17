package dg;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f114551a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f114552b = ve.b.c("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f114553c = ve.b.c("variantId");
    public static final ve.b d = ve.b.c("parameterKey");
    public static final ve.b e = ve.b.c("parameterValue");
    public static final ve.b f = ve.b.c("templateVersion");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        c cVar = (c) ((e) obj2);
        dVar.add(f114552b, cVar.f114557b);
        dVar.add(f114553c, cVar.f114558c);
        dVar.add(d, cVar.d);
        dVar.add(e, cVar.e);
        dVar.add(f, cVar.f);
    }
}
