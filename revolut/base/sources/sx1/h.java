package sx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266260c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f266261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.b f266262h;
    public final boolean i;

    public h(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.b state, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f266258a = id10;
        this.f266259b = idValue;
        this.f266260c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f266261g = str3;
        this.f266262h = state;
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
        return Intrinsics.f(this.f266258a, hVar.f266258a) && Intrinsics.f(this.f266259b, hVar.f266259b) && Intrinsics.f(this.f266260c, hVar.f266260c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f266261g, hVar.f266261g) && this.f266262h == hVar.f266262h && this.i == hVar.i;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f266258a.hashCode() * 31, 31, this.f266259b), 31, this.f266260c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f266261g;
        return Boolean.hashCode(this.i) + ((this.f266262h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }
}
