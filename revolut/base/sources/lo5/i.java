package lo5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197402b;

    public i(String beneficiaryId, boolean z) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        this.f197401a = beneficiaryId;
        this.f197402b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f197401a, iVar.f197401a) && this.f197402b == iVar.f197402b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197402b) + (this.f197401a.hashCode() * 31);
    }
}
