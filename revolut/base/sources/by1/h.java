package by1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19731c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.b f19733h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wx1.d f19734j;

    public h(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.b state, boolean z, wx1.d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f19729a = id10;
        this.f19730b = idValue;
        this.f19731c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f19732g = str3;
        this.f19733h = state;
        this.i = z;
        this.f19734j = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f19729a, hVar.f19729a) && Intrinsics.f(this.f19730b, hVar.f19730b) && Intrinsics.f(this.f19731c, hVar.f19731c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f19732g, hVar.f19732g) && this.f19733h == hVar.f19733h && this.i == hVar.i && Intrinsics.f(this.f19734j, hVar.f19734j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f19729a.hashCode() * 31, 31, this.f19730b), 31, this.f19731c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19732g;
        int iC2 = j6.a.c((this.f19733h.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.i);
        wx1.d dVar = this.f19734j;
        return iC2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
