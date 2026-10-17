package st9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265540c;
    public final long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f265541g;

    public c(String id10, String name, String str, long j2, String inviterCode, String inviterName, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(inviterCode, "inviterCode");
        Intrinsics.checkNotNullParameter(inviterName, "inviterName");
        this.f265538a = id10;
        this.f265539b = name;
        this.f265540c = str;
        this.d = j2;
        this.e = inviterCode;
        this.f = inviterName;
        this.f265541g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265538a, cVar.f265538a) && Intrinsics.f(this.f265539b, cVar.f265539b) && Intrinsics.f(this.f265540c, cVar.f265540c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f265541g == cVar.f265541g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f265538a.hashCode() * 31, 31, this.f265539b);
        String str = this.f265540c;
        return Boolean.hashCode(this.f265541g) + p.a.c(p.a.c(a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
