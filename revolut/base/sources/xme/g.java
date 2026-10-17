package xme;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307238c;

    public g(String name, String value, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f307236a = name;
        this.f307237b = value;
        this.f307238c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f307236a, gVar.f307236a) && Intrinsics.f(this.f307237b, gVar.f307237b) && Intrinsics.f(this.f307238c, gVar.f307238c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f307236a.hashCode() * 31, 31, this.f307237b);
        String str = this.f307238c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
