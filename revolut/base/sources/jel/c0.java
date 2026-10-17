package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173424c;
    public final String d;
    public final String e;
    public final String f;

    public c0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f173422a = str;
        this.f173423b = str2;
        this.f173424c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f173422a, c0Var.f173422a) && Intrinsics.f(this.f173423b, c0Var.f173423b) && Intrinsics.f(this.f173424c, c0Var.f173424c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f);
    }

    public final int hashCode() {
        String str = this.f173422a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f173423b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f173424c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
