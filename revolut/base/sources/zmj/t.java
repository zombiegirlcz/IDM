package zmj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323592b;

    public t(String phoneNumber, String str) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f323591a = phoneNumber;
        this.f323592b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f323591a, tVar.f323591a) && Intrinsics.f(this.f323592b, tVar.f323592b);
    }

    public final int hashCode() {
        int iHashCode = this.f323591a.hashCode() * 31;
        String str = this.f323592b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
