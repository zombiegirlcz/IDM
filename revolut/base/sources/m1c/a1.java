package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f201333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f201334b;

    public a1(r tier, double d) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        this.f201333a = tier;
        this.f201334b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f201333a == a1Var.f201333a && Double.compare(this.f201334b, a1Var.f201334b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f201334b) + (this.f201333a.hashCode() * 31);
    }
}
