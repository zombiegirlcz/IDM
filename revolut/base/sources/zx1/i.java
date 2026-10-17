package zx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326035c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f326036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.b f326037h;

    public i(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.b state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f326033a = id10;
        this.f326034b = idValue;
        this.f326035c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f326036g = str3;
        this.f326037h = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f326033a, iVar.f326033a) && Intrinsics.f(this.f326034b, iVar.f326034b) && Intrinsics.f(this.f326035c, iVar.f326035c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f326036g, iVar.f326036g) && this.f326037h == iVar.f326037h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f326033a.hashCode() * 31, 31, this.f326034b), 31, this.f326035c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f326036g;
        return this.f326037h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
