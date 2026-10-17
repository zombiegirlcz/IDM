package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yz f29264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g10 f29265c;
    private final gx0 d;
    private final h6 e;

    public hh1(String onboardingStatus, yz yzVar, g10 g10Var, gx0 gx0Var, h6 h6Var) {
        Intrinsics.checkNotNullParameter(onboardingStatus, "onboardingStatus");
        this.f29263a = onboardingStatus;
        this.f29264b = yzVar;
        this.f29265c = g10Var;
        this.d = gx0Var;
        this.e = h6Var;
    }

    public final h6 a() {
        return this.e;
    }

    public final yz b() {
        return this.f29264b;
    }

    public final g10 c() {
        return this.f29265c;
    }

    public final gx0 d() {
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hh1)) {
            return false;
        }
        hh1 hh1Var = (hh1) obj2;
        return Intrinsics.f(this.f29263a, hh1Var.f29263a) && Intrinsics.f(this.f29264b, hh1Var.f29264b) && Intrinsics.f(this.f29265c, hh1Var.f29265c) && Intrinsics.f(this.d, hh1Var.d) && Intrinsics.f(this.e, hh1Var.e);
    }

    public int hashCode() {
        int iHashCode = this.f29263a.hashCode() * 31;
        yz yzVar = this.f29264b;
        int iHashCode2 = (iHashCode + (yzVar == null ? 0 : yzVar.hashCode())) * 31;
        g10 g10Var = this.f29265c;
        int iHashCode3 = (iHashCode2 + (g10Var == null ? 0 : g10Var.hashCode())) * 31;
        gx0 gx0Var = this.d;
        int iHashCode4 = (iHashCode3 + (gx0Var == null ? 0 : gx0Var.hashCode())) * 31;
        h6 h6Var = this.e;
        return iHashCode4 + (h6Var != null ? h6Var.hashCode() : 0);
    }

    public String toString() {
        return "WorkflowStatus(onboardingStatus=" + this.f29263a + ", genericVerificationStatus=" + this.f29264b + ", idvStatus=" + this.f29265c + ", qesStatus=" + this.d + ", bavStatus=" + this.e + ")";
    }

    public /* synthetic */ hh1(String str, yz yzVar, g10 g10Var, gx0 gx0Var, h6 h6Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : yzVar, (i & 4) != 0 ? null : g10Var, (i & 8) != 0 ? null : gx0Var, (i & 16) != 0 ? null : h6Var);
    }
}
