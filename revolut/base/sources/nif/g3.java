package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215836c;
    public final String d;

    public g3(String str, String str2, String str3, String str4) {
        this.f215834a = str;
        this.f215835b = str2;
        this.f215836c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.f215836c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f215834a;
    }

    public final String d() {
        return this.f215835b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return Intrinsics.f(this.f215834a, g3Var.f215834a) && Intrinsics.f(this.f215835b, g3Var.f215835b) && Intrinsics.f(this.f215836c, g3Var.f215836c) && Intrinsics.f(this.d, g3Var.d);
    }

    public final int hashCode() {
        String str = this.f215834a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215835b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215836c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
