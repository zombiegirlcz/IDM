package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123870c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f123871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f123872h;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f123868a = str;
        this.f123869b = str2;
        this.f123870c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f123871g = str7;
        this.f123872h = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f123868a, hVar.f123868a) && Intrinsics.f(this.f123869b, hVar.f123869b) && Intrinsics.f(this.f123870c, hVar.f123870c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f123871g, hVar.f123871g) && Intrinsics.f(this.f123872h, hVar.f123872h);
    }

    public final int hashCode() {
        String str = this.f123868a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123869b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f123870c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f123871g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f123872h;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }
}
