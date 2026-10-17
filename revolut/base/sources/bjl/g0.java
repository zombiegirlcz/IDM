package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16168b;

    public g0(String code, String state) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f16167a = code;
        this.f16168b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f16167a, g0Var.f16167a) && Intrinsics.f(this.f16168b, g0Var.f16168b);
    }

    public final int hashCode() {
        return this.f16168b.hashCode() + (this.f16167a.hashCode() * 31);
    }
}
