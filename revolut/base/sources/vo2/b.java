package vo2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f290846c;
    public final String d;
    public final a e;
    public final String f;

    public b(String id10, String title, String str, String logoUrl, a status, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f290844a = id10;
        this.f290845b = title;
        this.f290846c = str;
        this.d = logoUrl;
        this.e = status;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f290844a, bVar.f290844a) && Intrinsics.f(this.f290845b, bVar.f290845b) && Intrinsics.f(this.f290846c, bVar.f290846c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f290844a.hashCode() * 31, 31, this.f290845b);
        String str = this.f290846c;
        int iHashCode = (this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
