package com.fourthline.orca.internal;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31648c;
    private final String d;
    private final String e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Date f31649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Date f31650h;
    private final Date i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f31651j;
    private final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f31652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f31653m;

    public od1(String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, String str7, String str8, String str9, String str10) {
        this.f31646a = str;
        this.f31647b = str2;
        this.f31648c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f31649g = date;
        this.f31650h = date2;
        this.i = date3;
        this.f31651j = str7;
        this.k = str8;
        this.f31652l = str9;
        this.f31653m = str10;
    }

    public final Date a() {
        return this.i;
    }

    public final Date b() {
        return this.f31650h;
    }

    public final String c() {
        return this.e;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof od1)) {
            return false;
        }
        od1 od1Var = (od1) obj2;
        return Intrinsics.f(this.f31646a, od1Var.f31646a) && Intrinsics.f(this.f31647b, od1Var.f31647b) && Intrinsics.f(this.f31648c, od1Var.f31648c) && Intrinsics.f(this.d, od1Var.d) && Intrinsics.f(this.e, od1Var.e) && Intrinsics.f(this.f, od1Var.f) && Intrinsics.f(this.f31649g, od1Var.f31649g) && Intrinsics.f(this.f31650h, od1Var.f31650h) && Intrinsics.f(this.i, od1Var.i) && Intrinsics.f(this.f31651j, od1Var.f31651j) && Intrinsics.f(this.k, od1Var.k) && Intrinsics.f(this.f31652l, od1Var.f31652l) && Intrinsics.f(this.f31653m, od1Var.f31653m);
    }

    public int hashCode() {
        String str = this.f31646a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31647b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31648c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.f31649g;
        int iHashCode7 = (iHashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f31650h;
        int iHashCode8 = (iHashCode7 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.i;
        int iHashCode9 = (iHashCode8 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str7 = this.f31651j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f31652l;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f31653m;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "ValidationDocumentIdData(firstName=" + this.f31646a + ", lastName=" + this.f31647b + ", initials=" + this.f31648c + ", gender=" + this.d + ", nationality=" + this.e + ", issuingCountry=" + this.f + ", issueDate=" + this.f31649g + ", expirationDate=" + this.f31650h + ", dateOfBirth=" + this.i + ", birthPlace=" + this.f31651j + ", documentNumber=" + this.k + ", documentType=" + this.f31652l + ", taxIdentificationNumber=" + this.f31653m + ")";
    }
}
