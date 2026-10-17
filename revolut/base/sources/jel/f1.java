package jel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f173441c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f173442g;

    public f1(String name, String str, String str2, String str3, String str4, String str5, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f173439a = name;
        this.f173440b = str;
        this.f173441c = localDate;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f173442g = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f173439a, f1Var.f173439a) && Intrinsics.f(this.f173440b, f1Var.f173440b) && Intrinsics.f(this.f173441c, f1Var.f173441c) && Intrinsics.f(this.d, f1Var.d) && Intrinsics.f(this.e, f1Var.e) && Intrinsics.f(this.f, f1Var.f) && Intrinsics.f(this.f173442g, f1Var.f173442g);
    }

    public final int hashCode() {
        int iHashCode = this.f173439a.hashCode() * 31;
        String str = this.f173440b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.f173441c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f173442g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
