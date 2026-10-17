package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173521c;
    public final String d;
    public final String e;
    public final String f;

    public n1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f173519a = str;
        this.f173520b = str2;
        this.f173521c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f173519a, n1Var.f173519a) && Intrinsics.f(this.f173520b, n1Var.f173520b) && Intrinsics.f(this.f173521c, n1Var.f173521c) && Intrinsics.f(this.d, n1Var.d) && Intrinsics.f(this.e, n1Var.e) && Intrinsics.f(this.f, n1Var.f);
    }

    public final int hashCode() {
        String str = this.f173519a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f173520b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f173521c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
