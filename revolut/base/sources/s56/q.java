package s56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259982a;

    public q(String beneficiaryId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        this.f259982a = beneficiaryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f259982a, ((q) obj2).f259982a);
    }

    public final int hashCode() {
        return this.f259982a.hashCode();
    }
}
