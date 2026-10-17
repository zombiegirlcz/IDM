package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f49476a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f49477b;

    static {
        icm.m mVarB = icm.m.b();
        mVarB.f160342a = 1;
        f49477b = new ve.b("messagingClientEvent", v0.a.r(v0.a.p(ye.e.class, mVarB.a())));
    }

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ((ve.d) obj3).add(f49477b, ((kf.f) obj2).f183261a);
    }
}
