package zb;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f320762a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f320763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f320764c;

    static {
        icm.m mVarB = icm.m.b();
        mVarB.f160342a = 1;
        f320763b = new ve.b("currentCacheSizeBytes", v0.a.r(v0.a.p(ye.e.class, mVarB.a())));
        icm.m mVarB2 = icm.m.b();
        mVarB2.f160342a = 2;
        f320764c = new ve.b("maxCacheSizeBytes", v0.a.r(v0.a.p(ye.e.class, mVarB2.a())));
    }

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        cc.g gVar = (cc.g) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f320763b, gVar.f22908a);
        dVar.add(f320764c, gVar.f22909b);
    }
}
