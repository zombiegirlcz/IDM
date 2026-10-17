package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3 f273025c;
    public final f0 d;
    public final g0 e;

    public r3(String str, String str2, s3 s3Var, f0 f0Var, g0 g0Var) {
        this.f273023a = str;
        this.f273024b = str2;
        this.f273025c = s3Var;
        this.d = f0Var;
        this.e = g0Var;
    }

    public final String a() {
        return this.f273023a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj2;
        return Intrinsics.f(this.f273023a, r3Var.f273023a) && Intrinsics.f(this.f273024b, r3Var.f273024b) && Intrinsics.f(this.f273025c, r3Var.f273025c) && this.d == r3Var.d && this.e == r3Var.e;
    }

    public final int hashCode() {
        String str = this.f273023a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273024b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        s3 s3Var = this.f273025c;
        int iHashCode3 = (iHashCode2 + (s3Var == null ? 0 : s3Var.hashCode())) * 31;
        f0 f0Var = this.d;
        int iHashCode4 = (iHashCode3 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        g0 g0Var = this.e;
        return iHashCode4 + (g0Var != null ? g0Var.hashCode() : 0);
    }
}
