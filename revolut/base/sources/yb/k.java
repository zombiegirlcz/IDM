package yb;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f312111a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f312112b = ve.b.c("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f312113c = ve.b.c("mobileSubtype");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        w wVar = (w) ((j0) obj2);
        dVar.add(f312112b, wVar.f312141a);
        dVar.add(f312113c, wVar.f312142b);
    }
}
