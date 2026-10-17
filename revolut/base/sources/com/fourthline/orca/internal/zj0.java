package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.mrz.MrzInfo;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zj0 implements xj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35614c;
    private Gender d;
    private String e;
    private String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Date f35616h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MrzInfo f35617j;

    public zj0(String str, String str2, String str3, Gender gender, String str4, String str5, String str6, Date date, String str7, MrzInfo mrzInfo) {
        this.f35612a = str;
        this.f35613b = str2;
        this.f35614c = str3;
        this.d = gender;
        this.e = str4;
        this.f = str5;
        this.f35615g = str6;
        this.f35616h = date;
        this.i = str7;
        this.f35617j = mrzInfo;
    }

    @Override // com.fourthline.orca.internal.xj0
    public String a() {
        return this.f35612a;
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.xj0
    public String c() {
        return this.f35614c;
    }

    public void d(String str) {
        this.e = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zj0)) {
            return false;
        }
        zj0 zj0Var = (zj0) obj2;
        return Intrinsics.f(this.f35612a, zj0Var.f35612a) && Intrinsics.f(this.f35613b, zj0Var.f35613b) && Intrinsics.f(this.f35614c, zj0Var.f35614c) && this.d == zj0Var.d && Intrinsics.f(this.e, zj0Var.e) && Intrinsics.f(this.f, zj0Var.f) && Intrinsics.f(this.f35615g, zj0Var.f35615g) && Intrinsics.f(this.f35616h, zj0Var.f35616h) && Intrinsics.f(this.i, zj0Var.i) && Intrinsics.f(this.f35617j, zj0Var.f35617j);
    }

    @Override // com.fourthline.orca.internal.xj0
    public Gender f() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean g() {
        return super.g();
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean h() {
        return super.h();
    }

    public int hashCode() {
        String str = this.f35612a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f35613b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35614c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Gender gender = this.d;
        int iHashCode4 = (iHashCode3 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f35615g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.f35616h;
        int iHashCode8 = (iHashCode7 + (date == null ? 0 : date.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        MrzInfo mrzInfo = this.f35617j;
        return iHashCode9 + (mrzInfo != null ? mrzInfo.hashCode() : 0);
    }

    @Override // com.fourthline.orca.internal.xj0
    public String i() {
        return this.f35613b;
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean l() {
        return super.l();
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean m() {
        return super.m();
    }

    @Override // com.fourthline.orca.internal.xj0
    public String n() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.xj0
    public String o() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.xj0
    public String q() {
        return this.f35615g;
    }

    public String toString() {
        return "PersonBundleData(firstName=" + this.f35612a + ", middleName=" + this.f35613b + ", lastName=" + this.f35614c + ", gender=" + this.d + ", nationalityCode=" + this.e + ", birthCountryCode=" + this.f + ", birthPlace=" + this.f35615g + ", birthDate=" + this.f35616h + ", rawMrz=" + this.i + ", mrzInfo=" + this.f35617j + ")";
    }

    public void a(Gender gender) {
        this.d = gender;
    }

    public void b(String str) {
        this.f35612a = str;
    }

    public void c(String str) {
        this.f35614c = str;
    }

    @Override // com.fourthline.orca.internal.xj0
    public Date d() {
        return this.f35616h;
    }

    public MrzInfo e() {
        return this.f35617j;
    }

    public void a(String str) {
        this.f35615g = str;
    }

    public void a(Date date) {
        this.f35616h = date;
    }

    public void a(MrzInfo mrzInfo) {
        this.f35617j = mrzInfo;
    }

    public /* synthetic */ zj0(String str, String str2, String str3, Gender gender, String str4, String str5, String str6, Date date, String str7, MrzInfo mrzInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : gender, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : date, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : mrzInfo);
    }
}
