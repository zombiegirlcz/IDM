package ay1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11022c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wx1.b f11024h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11025j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11026l;

    public i(String id10, String idValue, String descriptor, String descriptorValue, String str, String str2, String str3, wx1.b state, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idValue, "idValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f11020a = id10;
        this.f11021b = idValue;
        this.f11022c = descriptor;
        this.d = descriptorValue;
        this.e = str;
        this.f = str2;
        this.f11023g = str3;
        this.f11024h = state;
        this.i = str4;
        this.f11025j = str5;
        this.k = str6;
        this.f11026l = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f11020a, iVar.f11020a) && Intrinsics.f(this.f11021b, iVar.f11021b) && Intrinsics.f(this.f11022c, iVar.f11022c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f11023g, iVar.f11023g) && this.f11024h == iVar.f11024h && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f11025j, iVar.f11025j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f11026l, iVar.f11026l);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f11020a.hashCode() * 31, 31, this.f11021b), 31, this.f11022c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11023g;
        int iHashCode3 = (this.f11024h.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11025j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f11026l;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }
}
