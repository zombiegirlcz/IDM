package z19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318766b;

    public c(String primary, String str) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f318765a = primary;
        this.f318766b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f318765a, cVar.f318765a) && Intrinsics.f(this.f318766b, cVar.f318766b);
    }

    public final int hashCode() {
        int iHashCode = this.f318765a.hashCode() * 31;
        String str = this.f318766b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
