package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class r1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f36748a;

    private r1(s0 s0Var) {
        this.f36748a = s0Var;
    }

    public static v9 b(s0 s0Var) {
        v9 v9VarProvidesPlayServicesAvailabilityDataSource = s0Var.providesPlayServicesAvailabilityDataSource();
        vc.s.k(v9VarProvidesPlayServicesAvailabilityDataSource);
        return v9VarProvidesPlayServicesAvailabilityDataSource;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v9 get() {
        return b(this.f36748a);
    }

    public static r1 a(s0 s0Var) {
        return new r1(s0Var);
    }
}
