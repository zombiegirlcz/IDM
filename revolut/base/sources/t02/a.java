package t02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266851b;

    public a(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f266850a = id10;
        this.f266851b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f266850a, aVar.f266850a) && Intrinsics.f(this.f266851b, aVar.f266851b);
    }

    public final int hashCode() {
        int iHashCode = this.f266850a.hashCode() * 31;
        String str = this.f266851b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
