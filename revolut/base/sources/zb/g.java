package zb;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f320765a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f320766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f320767c;

    static {
        icm.m mVarB = icm.m.b();
        mVarB.f160342a = 1;
        f320766b = new ve.b("startMs", v0.a.r(v0.a.p(ye.e.class, mVarB.a())));
        icm.m mVarB2 = icm.m.b();
        mVarB2.f160342a = 2;
        f320767c = new ve.b("endMs", v0.a.r(v0.a.p(ye.e.class, mVarB2.a())));
    }

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        cc.h hVar = (cc.h) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f320766b, hVar.f22910a);
        dVar.add(f320767c, hVar.f22911b);
    }
}
