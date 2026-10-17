package t1e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267272b;

    public u(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f267271a = id10;
        this.f267272b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f267271a, uVar.f267271a) && Intrinsics.f(this.f267272b, uVar.f267272b);
    }

    public final int hashCode() {
        int iHashCode = this.f267271a.hashCode() * 31;
        String str = this.f267272b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
