package hxi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156601b;

    public b(String loungeId, String str) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        this.f156600a = loungeId;
        this.f156601b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f156600a, bVar.f156600a) && Intrinsics.f(this.f156601b, bVar.f156601b);
    }

    public final int hashCode() {
        int iHashCode = this.f156600a.hashCode() * 31;
        String str = this.f156601b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
