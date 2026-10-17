package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49460a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f49461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f49462c;
    public static final ve.b d;
    public static final ve.b e;
    public static final ve.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f49463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f49464h;
    public static final ve.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.b f49465j;
    public static final ve.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ve.b f49466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ve.b f49467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ve.b f49468n;
    public static final ve.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ve.b f49469p;

    static {
        icm.m mVarB = icm.m.b();
        mVarB.f160342a = 1;
        f49461b = new ve.b("projectNumber", v0.a.r(v0.a.p(ye.e.class, mVarB.a())));
        icm.m mVarB2 = icm.m.b();
        mVarB2.f160342a = 2;
        f49462c = new ve.b("messageId", v0.a.r(v0.a.p(ye.e.class, mVarB2.a())));
        icm.m mVarB3 = icm.m.b();
        mVarB3.f160342a = 3;
        d = new ve.b("instanceId", v0.a.r(v0.a.p(ye.e.class, mVarB3.a())));
        icm.m mVarB4 = icm.m.b();
        mVarB4.f160342a = 4;
        e = new ve.b("messageType", v0.a.r(v0.a.p(ye.e.class, mVarB4.a())));
        icm.m mVarB5 = icm.m.b();
        mVarB5.f160342a = 5;
        f = new ve.b("sdkPlatform", v0.a.r(v0.a.p(ye.e.class, mVarB5.a())));
        icm.m mVarB6 = icm.m.b();
        mVarB6.f160342a = 6;
        f49463g = new ve.b("packageName", v0.a.r(v0.a.p(ye.e.class, mVarB6.a())));
        icm.m mVarB7 = icm.m.b();
        mVarB7.f160342a = 7;
        f49464h = new ve.b("collapseKey", v0.a.r(v0.a.p(ye.e.class, mVarB7.a())));
        icm.m mVarB8 = icm.m.b();
        mVarB8.f160342a = 8;
        i = new ve.b("priority", v0.a.r(v0.a.p(ye.e.class, mVarB8.a())));
        icm.m mVarB9 = icm.m.b();
        mVarB9.f160342a = 9;
        f49465j = new ve.b("ttl", v0.a.r(v0.a.p(ye.e.class, mVarB9.a())));
        icm.m mVarB10 = icm.m.b();
        mVarB10.f160342a = 10;
        k = new ve.b("topic", v0.a.r(v0.a.p(ye.e.class, mVarB10.a())));
        icm.m mVarB11 = icm.m.b();
        mVarB11.f160342a = 11;
        f49466l = new ve.b("bulkId", v0.a.r(v0.a.p(ye.e.class, mVarB11.a())));
        icm.m mVarB12 = icm.m.b();
        mVarB12.f160342a = 12;
        f49467m = new ve.b("event", v0.a.r(v0.a.p(ye.e.class, mVarB12.a())));
        icm.m mVarB13 = icm.m.b();
        mVarB13.f160342a = 13;
        f49468n = new ve.b("analyticsLabel", v0.a.r(v0.a.p(ye.e.class, mVarB13.a())));
        icm.m mVarB14 = icm.m.b();
        mVarB14.f160342a = 14;
        o = new ve.b("campaignId", v0.a.r(v0.a.p(ye.e.class, mVarB14.a())));
        icm.m mVarB15 = icm.m.b();
        mVarB15.f160342a = 15;
        f49469p = new ve.b("composerLabel", v0.a.r(v0.a.p(ye.e.class, mVarB15.a())));
    }

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        kf.e eVar = (kf.e) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f49461b, eVar.f183253a);
        dVar.add(f49462c, eVar.f183254b);
        dVar.add(d, eVar.f183255c);
        dVar.add(e, eVar.d);
        dVar.add(f, eVar.e);
        dVar.add(f49463g, eVar.f);
        dVar.add(f49464h, eVar.f183256g);
        dVar.add(i, eVar.f183257h);
        dVar.add(f49465j, eVar.i);
        dVar.add(k, eVar.f183258j);
        dVar.add(f49466l, 0L);
        dVar.add(f49467m, eVar.k);
        dVar.add(f49468n, eVar.f183259l);
        dVar.add(o, 0L);
        dVar.add(f49469p, eVar.f183260m);
    }
}
