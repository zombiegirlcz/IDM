package dy1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121047c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f121048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.b f121049h;
    public final boolean i;

    public h(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.b state, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f121045a = id10;
        this.f121046b = idValue;
        this.f121047c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f121048g = str3;
        this.f121049h = state;
        this.i = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f121045a, hVar.f121045a) && Intrinsics.f(this.f121046b, hVar.f121046b) && Intrinsics.f(this.f121047c, hVar.f121047c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f121048g, hVar.f121048g) && this.f121049h == hVar.f121049h && this.i == hVar.i;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f121045a.hashCode() * 31, 31, this.f121046b), 31, this.f121047c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f121048g;
        return Boolean.hashCode(this.i) + ((this.f121049h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }
}
