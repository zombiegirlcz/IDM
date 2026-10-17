package zb;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f320755a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f320756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f320757c;

    static {
        icm.m mVarB = icm.m.b();
        mVarB.f160342a = 1;
        f320756b = new ve.b("eventsDroppedCount", v0.a.r(v0.a.p(ye.e.class, mVarB.a())));
        icm.m mVarB2 = icm.m.b();
        mVarB2.f160342a = 3;
        f320757c = new ve.b("reason", v0.a.r(v0.a.p(ye.e.class, mVarB2.a())));
    }

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        cc.e eVar = (cc.e) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f320756b, eVar.f22903a);
        dVar.add(f320757c, eVar.f22904b);
    }
}
