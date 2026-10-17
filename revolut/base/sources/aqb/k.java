package aqb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8290b;

    public k(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f8289a = id10;
        this.f8290b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f8289a, kVar.f8289a) && Intrinsics.f(this.f8290b, kVar.f8290b);
    }

    public final int hashCode() {
        int iHashCode = this.f8289a.hashCode() * 31;
        String str = this.f8290b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
