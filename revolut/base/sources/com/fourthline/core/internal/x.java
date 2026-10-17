package com.fourthline.core.internal;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26408c;
    private final v d;
    private final List e;
    private final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Date f26410h;
    private final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Date f26411j;
    private final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f26412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f26413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f26414n;
    private final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f26415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f26416q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String documentCode, String issuingCountry, String nationality, v documentNumber, List firstNames, List lastNames, String birthDateString, Date date, String expirationDateString, Date date2, String gender, String str, boolean z, String birthDateChecksum, String expirationDateChecksum, String totalChecksum, String totalChecksumContent) {
        super(null);
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(firstNames, "firstNames");
        Intrinsics.checkNotNullParameter(lastNames, "lastNames");
        Intrinsics.checkNotNullParameter(birthDateString, "birthDateString");
        Intrinsics.checkNotNullParameter(expirationDateString, "expirationDateString");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(birthDateChecksum, "birthDateChecksum");
        Intrinsics.checkNotNullParameter(expirationDateChecksum, "expirationDateChecksum");
        Intrinsics.checkNotNullParameter(totalChecksum, "totalChecksum");
        Intrinsics.checkNotNullParameter(totalChecksumContent, "totalChecksumContent");
        this.f26406a = documentCode;
        this.f26407b = issuingCountry;
        this.f26408c = nationality;
        this.d = documentNumber;
        this.e = firstNames;
        this.f = lastNames;
        this.f26409g = birthDateString;
        this.f26410h = date;
        this.i = expirationDateString;
        this.f26411j = date2;
        this.k = gender;
        this.f26412l = str;
        this.f26413m = z;
        this.f26414n = birthDateChecksum;
        this.o = expirationDateChecksum;
        this.f26415p = totalChecksum;
        this.f26416q = totalChecksumContent;
    }

    public final x a(String documentCode, String issuingCountry, String nationality, v documentNumber, List firstNames, List lastNames, String birthDateString, Date date, String expirationDateString, Date date2, String gender, String str, boolean z, String birthDateChecksum, String expirationDateChecksum, String totalChecksum, String totalChecksumContent) {
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(firstNames, "firstNames");
        Intrinsics.checkNotNullParameter(lastNames, "lastNames");
        Intrinsics.checkNotNullParameter(birthDateString, "birthDateString");
        Intrinsics.checkNotNullParameter(expirationDateString, "expirationDateString");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(birthDateChecksum, "birthDateChecksum");
        Intrinsics.checkNotNullParameter(expirationDateChecksum, "expirationDateChecksum");
        Intrinsics.checkNotNullParameter(totalChecksum, "totalChecksum");
        Intrinsics.checkNotNullParameter(totalChecksumContent, "totalChecksumContent");
        return new x(documentCode, issuingCountry, nationality, documentNumber, firstNames, lastNames, birthDateString, date, expirationDateString, date2, gender, str, z, birthDateChecksum, expirationDateChecksum, totalChecksum, totalChecksumContent);
    }

    public final String b() {
        return this.f26414n;
    }

    public final String c() {
        return this.f26409g;
    }

    public final String d() {
        return this.f26406a;
    }

    public final v e() {
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f26406a, xVar.f26406a) && Intrinsics.f(this.f26407b, xVar.f26407b) && Intrinsics.f(this.f26408c, xVar.f26408c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f26409g, xVar.f26409g) && Intrinsics.f(this.f26410h, xVar.f26410h) && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f26411j, xVar.f26411j) && Intrinsics.f(this.k, xVar.k) && Intrinsics.f(this.f26412l, xVar.f26412l) && this.f26413m == xVar.f26413m && Intrinsics.f(this.f26414n, xVar.f26414n) && Intrinsics.f(this.o, xVar.o) && Intrinsics.f(this.f26415p, xVar.f26415p) && Intrinsics.f(this.f26416q, xVar.f26416q);
    }

    public final Date f() {
        return this.f26411j;
    }

    public final String g() {
        return this.o;
    }

    public final String h() {
        return this.i;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f26406a.hashCode() * 31) + this.f26407b.hashCode()) * 31) + this.f26408c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f26409g.hashCode()) * 31;
        Date date = this.f26410h;
        int iHashCode2 = (((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.i.hashCode()) * 31;
        Date date2 = this.f26411j;
        int iHashCode3 = (((iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31) + this.k.hashCode()) * 31;
        String str = this.f26412l;
        return ((((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f26413m)) * 31) + this.f26414n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.f26415p.hashCode()) * 31) + this.f26416q.hashCode();
    }

    public final List i() {
        return this.e;
    }

    public final String j() {
        return this.k;
    }

    public final String k() {
        return this.f26407b;
    }

    public final List l() {
        return this.f;
    }

    public final String m() {
        return this.f26408c;
    }

    public final String n() {
        return this.f26412l;
    }

    public final String o() {
        return this.f26415p;
    }

    public final String p() {
        return this.f26416q;
    }

    public final boolean q() {
        return this.f26413m;
    }

    public String toString() {
        return "ParsedMrtdMrz(documentCode=" + this.f26406a + ", issuingCountry=" + this.f26407b + ", nationality=" + this.f26408c + ", documentNumber=" + this.d + ", firstNames=" + this.e + ", lastNames=" + this.f + ", birthDateString=" + this.f26409g + ", birthDate=" + this.f26410h + ", expirationDateString=" + this.i + ", expirationDate=" + this.f26411j + ", gender=" + this.k + ", optionalData=" + this.f26412l + ", isNameTruncated=" + this.f26413m + ", birthDateChecksum=" + this.f26414n + ", expirationDateChecksum=" + this.o + ", totalChecksum=" + this.f26415p + ", totalChecksumContent=" + this.f26416q + ")";
    }

    public static /* synthetic */ x a(x xVar, String str, String str2, String str3, v vVar, List list, List list2, String str4, Date date, String str5, Date date2, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, int i, Object obj2) {
        String str12;
        String str13;
        String str14;
        x xVar2;
        String str15;
        String str16;
        String str17;
        v vVar2;
        List list3;
        List list4;
        String str18;
        Date date3;
        String str19;
        Date date4;
        String str20;
        String str21;
        boolean z3;
        String str22;
        String str23 = (i & 1) != 0 ? xVar.f26406a : str;
        String str24 = (i & 2) != 0 ? xVar.f26407b : str2;
        String str25 = (i & 4) != 0 ? xVar.f26408c : str3;
        v vVar3 = (i & 8) != 0 ? xVar.d : vVar;
        List list5 = (i & 16) != 0 ? xVar.e : list;
        List list6 = (i & 32) != 0 ? xVar.f : list2;
        String str26 = (i & 64) != 0 ? xVar.f26409g : str4;
        Date date5 = (i & 128) != 0 ? xVar.f26410h : date;
        String str27 = (i & 256) != 0 ? xVar.i : str5;
        Date date6 = (i & 512) != 0 ? xVar.f26411j : date2;
        String str28 = (i & 1024) != 0 ? xVar.k : str6;
        String str29 = (i & 2048) != 0 ? xVar.f26412l : str7;
        boolean z4 = (i & 4096) != 0 ? xVar.f26413m : z;
        String str30 = (i & 8192) != 0 ? xVar.f26414n : str8;
        String str31 = str23;
        String str32 = (i & 16384) != 0 ? xVar.o : str9;
        String str33 = (i & 32768) != 0 ? xVar.f26415p : str10;
        if ((i & 65536) != 0) {
            str13 = str33;
            str12 = xVar.f26416q;
            str15 = str32;
            str16 = str24;
            str17 = str25;
            vVar2 = vVar3;
            list3 = list5;
            list4 = list6;
            str18 = str26;
            date3 = date5;
            str19 = str27;
            date4 = date6;
            str20 = str28;
            str21 = str29;
            z3 = z4;
            str22 = str30;
            str14 = str31;
            xVar2 = xVar;
        } else {
            str12 = str11;
            str13 = str33;
            str14 = str31;
            xVar2 = xVar;
            str15 = str32;
            str16 = str24;
            str17 = str25;
            vVar2 = vVar3;
            list3 = list5;
            list4 = list6;
            str18 = str26;
            date3 = date5;
            str19 = str27;
            date4 = date6;
            str20 = str28;
            str21 = str29;
            z3 = z4;
            str22 = str30;
        }
        return xVar2.a(str14, str16, str17, vVar2, list3, list4, str18, date3, str19, date4, str20, str21, z3, str22, str15, str13, str12);
    }

    public final Date a() {
        return this.f26410h;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public x(java.lang.String r21, java.lang.String r22, java.lang.String r23, com.fourthline.core.internal.v r24, java.util.List r25, java.util.List r26, java.lang.String r27, java.util.Date r28, java.lang.String r29, java.util.Date r30, java.lang.String r31, java.lang.String r32, boolean r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 16
            if (r1 == 0) goto La
            zhm.f0 r1 = zhm.f0.f322471a
            r7 = r1
            goto Lc
        La:
            r7 = r25
        Lc:
            r1 = r0 & 32
            if (r1 == 0) goto L14
            zhm.f0 r1 = zhm.f0.f322471a
            r8 = r1
            goto L16
        L14:
            r8 = r26
        L16:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L1d
            r1 = 0
            r14 = r1
            goto L1f
        L1d:
            r14 = r32
        L1f:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L26
            r1 = 0
            r15 = r1
            goto L28
        L26:
            r15 = r33
        L28:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            java.lang.String r2 = ""
            if (r1 == 0) goto L31
            r16 = r2
            goto L33
        L31:
            r16 = r34
        L33:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L3a
            r17 = r2
            goto L3c
        L3a:
            r17 = r35
        L3c:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L45
            r18 = r2
            goto L47
        L45:
            r18 = r36
        L47:
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L63
            r19 = r2
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r2 = r20
            goto L79
        L63:
            r19 = r37
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
        L79:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.core.internal.x.<init>(java.lang.String, java.lang.String, java.lang.String, com.fourthline.core.internal.v, java.util.List, java.util.List, java.lang.String, java.util.Date, java.lang.String, java.util.Date, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
