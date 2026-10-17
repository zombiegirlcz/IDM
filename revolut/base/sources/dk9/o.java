package dk9;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zh9.i0;
import zh9.r0;
import zh9.s0;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f115472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f115473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f115474c;
    public final boolean d;
    public final s0 e;

    public o(a3 a3Var, i0 management, r0 payLaterPlan, boolean z, s0 planDetails) {
        Intrinsics.checkNotNullParameter(management, "management");
        Intrinsics.checkNotNullParameter(payLaterPlan, "payLaterPlan");
        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
        this.f115472a = a3Var;
        this.f115473b = management;
        this.f115474c = payLaterPlan;
        this.d = z;
        this.e = planDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f115472a, oVar.f115472a) && Intrinsics.f(this.f115473b, oVar.f115473b) && Intrinsics.f(this.f115474c, oVar.f115474c) && this.d == oVar.d && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        a3 a3Var = this.f115472a;
        return Boolean.hashCode(this.e.f322343a) + j6.a.c((this.f115474c.hashCode() + ((this.f115473b.hashCode() + ((a3Var == null ? 0 : a3Var.hashCode()) * 31)) * 31)) * 31, 31, this.d);
    }
}
