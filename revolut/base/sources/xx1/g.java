package xx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309391c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f309392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.b f309393h;
    public final wx1.a i;

    public g(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.b state, wx1.a identityType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        this.f309389a = id10;
        this.f309390b = idValue;
        this.f309391c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f309392g = str3;
        this.f309393h = state;
        this.i = identityType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f309389a, gVar.f309389a) && Intrinsics.f(this.f309390b, gVar.f309390b) && Intrinsics.f(this.f309391c, gVar.f309391c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f309392g, gVar.f309392g) && this.f309393h == gVar.f309393h && this.i == gVar.i;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f309389a.hashCode() * 31, 31, this.f309390b), 31, this.f309391c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f309392g;
        return this.i.hashCode() + ((this.f309393h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }
}
