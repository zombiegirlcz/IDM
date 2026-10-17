package eif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126614b;

    public i(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f126613a = id10;
        this.f126614b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f126613a, iVar.f126613a) && Intrinsics.f(this.f126614b, iVar.f126614b);
    }

    public final int hashCode() {
        int iHashCode = this.f126613a.hashCode() * 31;
        String str = this.f126614b;
        return Integer.hashCode(100) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
