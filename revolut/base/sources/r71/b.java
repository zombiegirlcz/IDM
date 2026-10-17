package r71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251974b;

    public b(String institutionId, String str) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f251973a = institutionId;
        this.f251974b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f251973a, bVar.f251973a) && Intrinsics.f(this.f251974b, bVar.f251974b);
    }

    public final int hashCode() {
        int iHashCode = this.f251973a.hashCode() * 31;
        String str = this.f251974b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
