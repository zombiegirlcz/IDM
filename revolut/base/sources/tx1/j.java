package tx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f275316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f275317c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f275318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.c f275319h;

    public j(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.c state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f275315a = id10;
        this.f275316b = idValue;
        this.f275317c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f275318g = str3;
        this.f275319h = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f275315a, jVar.f275315a) && Intrinsics.f(this.f275316b, jVar.f275316b) && Intrinsics.f(this.f275317c, jVar.f275317c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f275318g, jVar.f275318g) && this.f275319h == jVar.f275319h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f275315a.hashCode() * 31, 31, this.f275316b), 31, this.f275317c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f275318g;
        return this.f275319h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
