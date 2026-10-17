package eq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128339b;

    public v(String beneficiaryId, boolean z) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        this.f128338a = beneficiaryId;
        this.f128339b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f128338a, vVar.f128338a) && this.f128339b == vVar.f128339b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128339b) + (this.f128338a.hashCode() * 31);
    }
}
