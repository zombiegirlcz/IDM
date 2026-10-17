package e60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122860b;

    public k(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f122859a = id10;
        this.f122860b = str;
    }

    @Override // e60.l
    public final String a() {
        return this.f122860b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f122859a, kVar.f122859a) && Intrinsics.f(this.f122860b, kVar.f122860b);
    }

    public final int hashCode() {
        int iHashCode = this.f122859a.hashCode() * 31;
        String str = this.f122860b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
