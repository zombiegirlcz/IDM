package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253594b;

    public a(String str, String str2) {
        this.f253593a = str;
        this.f253594b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f253593a, aVar.f253593a) && Intrinsics.f(this.f253594b, aVar.f253594b);
    }

    public final int hashCode() {
        String str = this.f253593a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f253594b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
