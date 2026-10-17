package zb;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f320758a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f320759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f320760c;

    static {
        icm.m mVarB = icm.m.b();
        mVarB.f160342a = 1;
        f320759b = new ve.b("logSource", v0.a.r(v0.a.p(ye.e.class, mVarB.a())));
        icm.m mVarB2 = icm.m.b();
        mVarB2.f160342a = 2;
        f320760c = new ve.b("logEventDropped", v0.a.r(v0.a.p(ye.e.class, mVarB2.a())));
    }

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        cc.f fVar = (cc.f) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f320759b, fVar.f22906a);
        dVar.add(f320760c, fVar.f22907b);
    }
}
