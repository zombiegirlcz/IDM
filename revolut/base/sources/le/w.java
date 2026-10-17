package le;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f194404a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f194405b = ve.b.c("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f194406c = ve.b.c("variantId");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        g1 g1Var = (g1) ((h2) obj2);
        dVar.add(f194405b, g1Var.f194273a);
        dVar.add(f194406c, g1Var.f194274b);
    }
}
