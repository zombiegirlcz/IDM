package vx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292800c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f292801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.b f292802h;
    public final String i;

    public g(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.b state, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f292798a = id10;
        this.f292799b = idValue;
        this.f292800c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f292801g = str3;
        this.f292802h = state;
        this.i = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f292798a, gVar.f292798a) && Intrinsics.f(this.f292799b, gVar.f292799b) && Intrinsics.f(this.f292800c, gVar.f292800c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f292801g, gVar.f292801g) && this.f292802h == gVar.f292802h && Intrinsics.f(this.i, gVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f292798a.hashCode() * 31, 31, this.f292799b), 31, this.f292800c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f292801g;
        int iHashCode3 = (this.f292802h.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.i;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
