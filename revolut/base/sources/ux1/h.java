package ux1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283860c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f283861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.b f283862h;

    public h(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.b state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f283858a = id10;
        this.f283859b = idValue;
        this.f283860c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f283861g = str3;
        this.f283862h = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f283858a, hVar.f283858a) && Intrinsics.f(this.f283859b, hVar.f283859b) && Intrinsics.f(this.f283860c, hVar.f283860c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f283861g, hVar.f283861g) && this.f283862h == hVar.f283862h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f283858a.hashCode() * 31, 31, this.f283859b), 31, this.f283860c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f283861g;
        return this.f283862h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
