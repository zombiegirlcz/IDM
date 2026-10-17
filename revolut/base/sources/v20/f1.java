package v20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v30.u0 f285401b;

    public f1(String str, v30.u0 u0Var) {
        this.f285400a = str;
        this.f285401b = u0Var;
    }

    public final String a() {
        return this.f285400a;
    }

    public final v30.u0 b() {
        return this.f285401b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f285400a, f1Var.f285400a) && this.f285401b == f1Var.f285401b;
    }

    public final int hashCode() {
        String str = this.f285400a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        v30.u0 u0Var = this.f285401b;
        return iHashCode + (u0Var != null ? u0Var.hashCode() : 0);
    }
}
