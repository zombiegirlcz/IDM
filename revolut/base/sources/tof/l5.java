package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272913c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f272914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k5 f272915h;

    public l5(String str, String str2, String str3, String str4, String str5, String str6, String str7, k5 k5Var) {
        this.f272911a = str;
        this.f272912b = str2;
        this.f272913c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f272914g = str7;
        this.f272915h = k5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj2;
        return Intrinsics.f(this.f272911a, l5Var.f272911a) && Intrinsics.f(this.f272912b, l5Var.f272912b) && Intrinsics.f(this.f272913c, l5Var.f272913c) && Intrinsics.f(this.d, l5Var.d) && Intrinsics.f(this.e, l5Var.e) && Intrinsics.f(this.f, l5Var.f) && Intrinsics.f(this.f272914g, l5Var.f272914g) && Intrinsics.f(this.f272915h, l5Var.f272915h);
    }

    public final int hashCode() {
        String str = this.f272911a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f272912b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f272913c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f272914g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        k5 k5Var = this.f272915h;
        return iHashCode7 + (k5Var != null ? k5Var.hashCode() : 0);
    }
}
