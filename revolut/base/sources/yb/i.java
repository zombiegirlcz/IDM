package yb;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f312100a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f312101b = ve.b.c("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f312102c = ve.b.c("eventCode");
    public static final ve.b d = ve.b.c("complianceData");
    public static final ve.b e = ve.b.c("eventUptimeMs");
    public static final ve.b f = ve.b.c("sourceExtension");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f312103g = ve.b.c("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f312104h = ve.b.c("timezoneOffsetSeconds");
    public static final ve.b i = ve.b.c("networkConnectionInfo");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.b f312105j = ve.b.c("experimentIds");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        t tVar = (t) ((f0) obj2);
        dVar.add(f312101b, tVar.f312131a);
        dVar.add(f312102c, tVar.f312132b);
        dVar.add(d, tVar.f312133c);
        dVar.add(e, tVar.d);
        dVar.add(f, tVar.e);
        dVar.add(f312103g, tVar.f);
        dVar.add(f312104h, tVar.f312134g);
        dVar.add(i, tVar.f312135h);
        dVar.add(f312105j, tVar.i);
    }
}
