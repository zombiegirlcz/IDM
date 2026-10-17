package c4d;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21134c;
    public final String d;
    public final String e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f21135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f21136h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f21137j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BigDecimal f21138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f21139m;

    public a(String id10, String fromId, String fromName, String fromTypeKey, String to6, BigDecimal targetRate, DateTime createdAt, DateTime dateTime, String type, String note, String str, BigDecimal bigDecimal, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(fromName, "fromName");
        Intrinsics.checkNotNullParameter(fromTypeKey, "fromTypeKey");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f21132a = id10;
        this.f21133b = fromId;
        this.f21134c = fromName;
        this.d = fromTypeKey;
        this.e = to6;
        this.f = targetRate;
        this.f21135g = createdAt;
        this.f21136h = dateTime;
        this.i = type;
        this.f21137j = note;
        this.k = str;
        this.f21138l = bigDecimal;
        this.f21139m = str2;
    }

    public final DateTime a() {
        return this.f21136h;
    }

    public final DateTime b() {
        return this.f21135g;
    }

    public final String c() {
        return this.k;
    }

    public final String d() {
        return this.f21133b;
    }

    public final String e() {
        return this.f21134c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f21132a, aVar.f21132a) && Intrinsics.f(this.f21133b, aVar.f21133b) && Intrinsics.f(this.f21134c, aVar.f21134c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f21135g, aVar.f21135g) && Intrinsics.f(this.f21136h, aVar.f21136h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f21137j, aVar.f21137j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f21138l, aVar.f21138l) && Intrinsics.f(this.f21139m, aVar.f21139m);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f21132a;
    }

    public final String h() {
        return this.f21137j;
    }

    public final int hashCode() {
        int iF = b.f(this.f21135g, t61.a.d(this.f, p.a.c(p.a.c(p.a.c(p.a.c(this.f21132a.hashCode() * 31, 31, this.f21133b), 31, this.f21134c), 31, this.d), 31, this.e), 31), 31);
        DateTime dateTime = this.f21136h;
        int iC = p.a.c(p.a.c((iF + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.i), 31, this.f21137j);
        String str = this.k;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f21138l;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.f21139m;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final BigDecimal i() {
        return this.f21138l;
    }

    public final BigDecimal j() {
        return this.f;
    }

    public final String k() {
        return this.f21139m;
    }

    public final String l() {
        return this.e;
    }

    public final String m() {
        return this.i;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.math.BigDecimal r22, org.joda.time.DateTime r23, org.joda.time.DateTime r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.math.BigDecimal r28, java.lang.String r29, int r30) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La
            java.lang.String r1 = "TARGET_PRICE"
            r11 = r1
            goto Lc
        La:
            r11 = r25
        Lc:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L14
            java.lang.String r1 = ""
            r12 = r1
            goto L16
        L14:
            r12 = r26
        L16:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L1d
            r13 = r2
            goto L1f
        L1d:
            r13 = r27
        L1f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L25
            r14 = r2
            goto L27
        L25:
            r14 = r28
        L27:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L3f
            r15 = r2
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r2 = r16
            goto L53
        L3f:
            r15 = r29
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
        L53:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4d.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, int):void");
    }
}
