package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140029c;
    public final String d;

    public s(String id10, String source, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f140027a = id10;
        this.f140028b = source;
        this.f140029c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f140027a, sVar.f140027a) && Intrinsics.f(this.f140028b, sVar.f140028b) && Intrinsics.f(this.f140029c, sVar.f140029c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f140027a.hashCode() * 31, 31, this.f140028b);
        String str = this.f140029c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
