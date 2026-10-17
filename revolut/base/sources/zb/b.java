package zb;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f320753a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f320754b;

    static {
        icm.m mVarB = icm.m.b();
        mVarB.f160342a = 1;
        f320754b = new ve.b("storageMetrics", v0.a.r(v0.a.p(ye.e.class, mVarB.a())));
    }

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ((ve.d) obj3).add(f320754b, ((cc.b) obj2).f22900a);
    }
}
