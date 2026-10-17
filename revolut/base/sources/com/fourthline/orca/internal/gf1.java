package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lg1 f28871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xg1 f28872c;

    public gf1(String validationCode, lg1 lg1Var, xg1 xg1Var) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        this.f28870a = validationCode;
        this.f28871b = lg1Var;
        this.f28872c = xg1Var;
    }

    public final lg1 a() {
        return this.f28871b;
    }

    public final xg1 b() {
        return this.f28872c;
    }

    public final String c() {
        return this.f28870a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gf1)) {
            return false;
        }
        gf1 gf1Var = (gf1) obj2;
        return Intrinsics.f(this.f28870a, gf1Var.f28870a) && Intrinsics.f(this.f28871b, gf1Var.f28871b) && Intrinsics.f(this.f28872c, gf1Var.f28872c);
    }

    public int hashCode() {
        int iHashCode = this.f28870a.hashCode() * 31;
        lg1 lg1Var = this.f28871b;
        int iHashCode2 = (iHashCode + (lg1Var == null ? 0 : lg1Var.hashCode())) * 31;
        xg1 xg1Var = this.f28872c;
        return iHashCode2 + (xg1Var != null ? xg1Var.hashCode() : 0);
    }

    public String toString() {
        return "WorkflowFlowDataBundle(validationCode=" + this.f28870a + ", networkConfig=" + this.f28871b + ", qtspChallengeData=" + this.f28872c + ")";
    }

    public final void a(lg1 lg1Var) {
        this.f28871b = lg1Var;
    }

    public final void a(xg1 xg1Var) {
        this.f28872c = xg1Var;
    }

    public /* synthetic */ gf1(String str, lg1 lg1Var, xg1 xg1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : lg1Var, (i & 4) != 0 ? null : xg1Var);
    }
}
