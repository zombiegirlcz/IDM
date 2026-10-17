package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3 f10584b;

    public w3(long j2, v3 v3Var) {
        this.f10583a = j2;
        this.f10584b = v3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj2;
        return this.f10583a == w3Var.f10583a && Intrinsics.f(this.f10584b, w3Var.f10584b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f10583a) * 31;
        v3 v3Var = this.f10584b;
        return iHashCode + (v3Var == null ? 0 : v3Var.hashCode());
    }
}
