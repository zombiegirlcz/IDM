package eg;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f125423a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f125424b = ve.b.c("performance");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f125425c = ve.b.c("crashlytics");
    public static final ve.b d = ve.b.c("sessionSamplingRate");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        k kVar = (k) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f125424b, kVar.f125456a);
        dVar.add(f125425c, kVar.f125457b);
        dVar.add(d, kVar.f125458c);
    }
}
