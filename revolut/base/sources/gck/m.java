package gck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142504a;

    public m(String giftedPlanId) {
        Intrinsics.checkNotNullParameter(giftedPlanId, "giftedPlanId");
        this.f142504a = giftedPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f142504a, ((m) obj2).f142504a);
    }

    public final int hashCode() {
        return this.f142504a.hashCode();
    }
}
