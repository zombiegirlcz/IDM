package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f49791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4 f49793c;
    public final boolean d;
    public final boolean e;

    public t0(b1 b1Var, int i, k4 k4Var, boolean z, boolean z3) {
        this.f49791a = b1Var;
        this.f49792b = i;
        this.f49793c = k4Var;
        this.d = z;
        this.e = z3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        return this.f49792b - ((t0) obj2).f49792b;
    }
}
