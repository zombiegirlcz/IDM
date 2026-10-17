package y8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311674b;

    public a(String str, String str2) {
        this.f311673a = str;
        this.f311674b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f311673a, aVar.f311673a) && Intrinsics.f(this.f311674b, aVar.f311674b);
    }

    public final int hashCode() {
        String str = this.f311673a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f311674b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
