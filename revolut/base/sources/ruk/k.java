package ruk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f257605b;

    public k(String id10, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f257604a = id10;
        this.f257605b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f257604a, kVar.f257604a) && this.f257605b == kVar.f257605b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257605b) + (this.f257604a.hashCode() * 31);
    }
}
