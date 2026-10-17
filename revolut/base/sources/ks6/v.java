package ks6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189272c;
    public final String d;
    public final String e;
    public final so3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f189273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f189274h;

    public v(String id10, String str, String str2, String str3, String str4, so3.c cVar, long j2, long j3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f189270a = id10;
        this.f189271b = str;
        this.f189272c = str2;
        this.d = str3;
        this.e = str4;
        this.f = cVar;
        this.f189273g = j2;
        this.f189274h = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f189270a, vVar.f189270a) && Intrinsics.f(this.f189271b, vVar.f189271b) && Intrinsics.f(this.f189272c, vVar.f189272c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && this.f189273g == vVar.f189273g && this.f189274h == vVar.f189274h;
    }

    public final int hashCode() {
        int iHashCode = this.f189270a.hashCode() * 31;
        String str = this.f189271b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f189272c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        so3.c cVar = this.f;
        return Long.hashCode(this.f189274h) + a0.d.c((iHashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f189273g);
    }
}
