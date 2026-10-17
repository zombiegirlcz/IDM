package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167441c;
    public final lb0 d;

    public zb0(boolean z, boolean z3, boolean z4, lb0 lb0Var) {
        this.f167439a = z;
        this.f167440b = z3;
        this.f167441c = z4;
        this.d = lb0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj2;
        return this.f167439a == zb0Var.f167439a && this.f167440b == zb0Var.f167440b && this.f167441c == zb0Var.f167441c && Intrinsics.f(this.d, zb0Var.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f167439a) * 31, 31, this.f167440b), 31, this.f167441c);
        lb0 lb0Var = this.d;
        return iC + (lb0Var == null ? 0 : lb0Var.hashCode());
    }
}
