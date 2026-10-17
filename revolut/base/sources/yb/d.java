package yb;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f312087a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f312088b = ve.b.c("clientType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f312089c = ve.b.c("androidClientInfo");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        o oVar = (o) ((z) obj2);
        dVar.add(f312088b, oVar.f312123a);
        dVar.add(f312089c, oVar.f312124b);
    }
}
