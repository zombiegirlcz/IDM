package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f272884c;
    public final Integer d;
    public final Integer e;
    public final m5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f272885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f272886h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f272887j;
    public final String k;

    public k5(String str, String str2, Boolean bool, Integer num, Integer num2, m5 m5Var, String str3, String str4, String str5, String str6, String str7) {
        this.f272882a = str;
        this.f272883b = str2;
        this.f272884c = bool;
        this.d = num;
        this.e = num2;
        this.f = m5Var;
        this.f272885g = str3;
        this.f272886h = str4;
        this.i = str5;
        this.f272887j = str6;
        this.k = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj2;
        return Intrinsics.f(this.f272882a, k5Var.f272882a) && Intrinsics.f(this.f272883b, k5Var.f272883b) && Intrinsics.f(this.f272884c, k5Var.f272884c) && Intrinsics.f(this.d, k5Var.d) && Intrinsics.f(this.e, k5Var.e) && this.f == k5Var.f && Intrinsics.f(this.f272885g, k5Var.f272885g) && Intrinsics.f(this.f272886h, k5Var.f272886h) && Intrinsics.f(this.i, k5Var.i) && Intrinsics.f(this.f272887j, k5Var.f272887j) && Intrinsics.f(this.k, k5Var.k);
    }

    public final int hashCode() {
        String str = this.f272882a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f272883b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f272884c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        m5 m5Var = this.f;
        int iHashCode6 = (iHashCode5 + (m5Var == null ? 0 : m5Var.hashCode())) * 31;
        String str3 = this.f272885g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f272886h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f272887j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }
}
