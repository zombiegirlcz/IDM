package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f201447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f201448b;

    public r0(x0 revPointsOptInState, u termsState) {
        Intrinsics.checkNotNullParameter(revPointsOptInState, "revPointsOptInState");
        Intrinsics.checkNotNullParameter(termsState, "termsState");
        this.f201447a = revPointsOptInState;
        this.f201448b = termsState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return this.f201447a == r0Var.f201447a && Intrinsics.f(this.f201448b, r0Var.f201448b);
    }

    public final int hashCode() {
        return this.f201448b.hashCode() + (this.f201447a.hashCode() * 31);
    }
}
