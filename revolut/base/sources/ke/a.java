package ke;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f182921a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f182922b = ve.b.c("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f182923c = ve.b.c("parameterKey");
    public static final ve.b d = ve.b.c("parameterValue");
    public static final ve.b e = ve.b.c("variantId");
    public static final ve.b f = ve.b.c("templateVersion");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        b bVar = (b) ((n) obj2);
        dVar.add(f182922b, bVar.f182924b);
        dVar.add(f182923c, bVar.f182925c);
        dVar.add(d, bVar.d);
        dVar.add(e, bVar.e);
        dVar.add(f, bVar.f);
    }
}
