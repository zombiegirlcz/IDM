package gck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142506b;

    public n(String giftId, String planId) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f142505a = giftId;
        this.f142506b = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f142505a, nVar.f142505a) && Intrinsics.f(this.f142506b, nVar.f142506b);
    }

    public final int hashCode() {
        return this.f142506b.hashCode() + (this.f142505a.hashCode() * 31);
    }
}
