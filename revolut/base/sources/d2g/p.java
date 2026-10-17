package d2g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f110817c;

    public p(String destinationId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        this.f110815a = destinationId;
        this.f110816b = str;
        this.f110817c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f110815a, pVar.f110815a) && Intrinsics.f(this.f110816b, pVar.f110816b) && this.f110817c == pVar.f110817c;
    }

    public final int hashCode() {
        int iHashCode = this.f110815a.hashCode() * 31;
        String str = this.f110816b;
        return Boolean.hashCode(this.f110817c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
