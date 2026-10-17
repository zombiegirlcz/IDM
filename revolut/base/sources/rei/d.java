package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253601b;

    public d(String str, String str2) {
        this.f253600a = str;
        this.f253601b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f253600a, dVar.f253600a) && Intrinsics.f(this.f253601b, dVar.f253601b);
    }

    public final int hashCode() {
        String str = this.f253600a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f253601b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
