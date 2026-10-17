package n38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211972c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f211973g;

    public z(String id10, String shortName, String legalName, String displayName, String str, String code, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(legalName, "legalName");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f211970a = id10;
        this.f211971b = shortName;
        this.f211972c = legalName;
        this.d = displayName;
        this.e = str;
        this.f = code;
        this.f211973g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f211970a, zVar.f211970a) && Intrinsics.f(this.f211971b, zVar.f211971b) && Intrinsics.f(this.f211972c, zVar.f211972c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f211973g, zVar.f211973g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f211970a.hashCode() * 31, 31, this.f211971b), 31, this.f211972c), 31, this.d);
        String str = this.e;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.f211973g;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }
}
