package th6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271261b;

    public a(String institutionId, String str) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f271260a = institutionId;
        this.f271261b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f271260a, aVar.f271260a) && Intrinsics.f(this.f271261b, aVar.f271261b);
    }

    public final int hashCode() {
        int iHashCode = this.f271260a.hashCode() * 31;
        String str = this.f271261b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
