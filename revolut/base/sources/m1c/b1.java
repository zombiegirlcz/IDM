package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f201341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f201343c;

    public b1(r planTier, String reward, dj0.d amountToSpend) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(amountToSpend, "amountToSpend");
        this.f201341a = planTier;
        this.f201342b = reward;
        this.f201343c = amountToSpend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return this.f201341a == b1Var.f201341a && Intrinsics.f(this.f201342b, b1Var.f201342b) && Intrinsics.f(this.f201343c, b1Var.f201343c);
    }

    public final int hashCode() {
        return this.f201343c.hashCode() + p.a.c(this.f201341a.hashCode() * 31, 31, this.f201342b);
    }
}
