package hcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151113b;

    public q0(String ref2, String targetMarket) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(targetMarket, "targetMarket");
        this.f151112a = ref2;
        this.f151113b = targetMarket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f151112a, q0Var.f151112a) && Intrinsics.f(this.f151113b, q0Var.f151113b);
    }

    public final int hashCode() {
        return this.f151113b.hashCode() + (this.f151112a.hashCode() * 31);
    }
}
