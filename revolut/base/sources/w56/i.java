package w56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294705a;

    public i(String beneficiaryId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        this.f294705a = beneficiaryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f294705a, ((i) obj2).f294705a);
    }

    public final int hashCode() {
        return this.f294705a.hashCode();
    }
}
