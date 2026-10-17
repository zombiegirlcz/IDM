package zb;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f320750a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f320751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f320752c;
    public static final ve.b d;
    public static final ve.b e;

    static {
        icm.m mVarB = icm.m.b();
        mVarB.f160342a = 1;
        f320751b = new ve.b("window", v0.a.r(v0.a.p(ye.e.class, mVarB.a())));
        icm.m mVarB2 = icm.m.b();
        mVarB2.f160342a = 2;
        f320752c = new ve.b("logSourceMetrics", v0.a.r(v0.a.p(ye.e.class, mVarB2.a())));
        icm.m mVarB3 = icm.m.b();
        mVarB3.f160342a = 3;
        d = new ve.b("globalMetrics", v0.a.r(v0.a.p(ye.e.class, mVarB3.a())));
        icm.m mVarB4 = icm.m.b();
        mVarB4.f160342a = 4;
        e = new ve.b("appNamespace", v0.a.r(v0.a.p(ye.e.class, mVarB4.a())));
    }

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        cc.a aVar = (cc.a) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f320751b, aVar.f22897a);
        dVar.add(f320752c, aVar.f22898b);
        dVar.add(d, aVar.f22899c);
        dVar.add(e, aVar.d);
    }
}
