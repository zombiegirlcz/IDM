package eq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128336a;

    public u(String beneficiaryId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        this.f128336a = beneficiaryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f128336a, ((u) obj2).f128336a);
    }

    public final int hashCode() {
        return this.f128336a.hashCode();
    }
}
