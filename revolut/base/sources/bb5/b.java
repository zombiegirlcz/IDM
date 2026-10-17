package bb5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14162b;

    public b(String primary, String str) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f14161a = primary;
        this.f14162b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f14161a, bVar.f14161a) && Intrinsics.f(this.f14162b, bVar.f14162b);
    }

    public final int hashCode() {
        int iHashCode = this.f14161a.hashCode() * 31;
        String str = this.f14162b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
