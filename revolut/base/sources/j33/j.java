package j33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f170944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170945b;

    public j(String str, Boolean bool) {
        this.f170944a = bool;
        this.f170945b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f170944a, jVar.f170944a) && Intrinsics.f(this.f170945b, jVar.f170945b);
    }

    public final int hashCode() {
        Boolean bool = this.f170944a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f170945b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
