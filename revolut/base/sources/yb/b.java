package yb;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f312077a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f312078b = ve.b.c("sdkVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f312079c = ve.b.c("model");
    public static final ve.b d = ve.b.c("hardware");
    public static final ve.b e = ve.b.c("device");
    public static final ve.b f = ve.b.c("product");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f312080g = ve.b.c("osBuild");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f312081h = ve.b.c("manufacturer");
    public static final ve.b i = ve.b.c("fingerprint");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.b f312082j = ve.b.c("locale");
    public static final ve.b k = ve.b.c("country");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ve.b f312083l = ve.b.c("mccMnc");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ve.b f312084m = ve.b.c("applicationBuild");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        m mVar = (m) ((a) obj2);
        dVar.add(f312078b, mVar.f312115a);
        dVar.add(f312079c, mVar.f312116b);
        dVar.add(d, mVar.f312117c);
        dVar.add(e, mVar.d);
        dVar.add(f, mVar.e);
        dVar.add(f312080g, mVar.f);
        dVar.add(f312081h, mVar.f312118g);
        dVar.add(i, mVar.f312119h);
        dVar.add(f312082j, mVar.i);
        dVar.add(k, mVar.f312120j);
        dVar.add(f312083l, mVar.k);
        dVar.add(f312084m, mVar.f312121l);
    }
}
