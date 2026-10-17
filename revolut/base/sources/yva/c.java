package yva;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317156b;

    public c(String referrerName, String str) {
        Intrinsics.checkNotNullParameter(referrerName, "referrerName");
        this.f317155a = referrerName;
        this.f317156b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f317155a, cVar.f317155a) && Intrinsics.f(this.f317156b, cVar.f317156b);
    }

    public final int hashCode() {
        int iHashCode = this.f317155a.hashCode() * 31;
        String str = this.f317156b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
