package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273188c;
    public final String d;

    public z0(String str, String str2, boolean z, boolean z3) {
        this.f273186a = z;
        this.f273187b = z3;
        this.f273188c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return this.f273186a == z0Var.f273186a && this.f273187b == z0Var.f273187b && Intrinsics.f(this.f273188c, z0Var.f273188c) && Intrinsics.f(this.d, z0Var.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f273186a) * 31, 31, this.f273187b);
        String str = this.f273188c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
