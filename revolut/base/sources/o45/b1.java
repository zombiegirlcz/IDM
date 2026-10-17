package o45;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f222009c;
    public final String d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f222010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f222011h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f222012j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f222013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f222014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f222015n;
    public final String o;

    public /* synthetic */ b1(int i, String str, String str2, ZonedDateTime zonedDateTime, String str3, long j2, String str4, String str5, String str6, String str7, Long l2, Long l3, Long l4, String str8, b2 b2Var, String str9) {
        if (32767 != (i & 32767)) {
            qlm.j1.f(z0.f222161a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f222007a = str;
        this.f222008b = str2;
        this.f222009c = zonedDateTime;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        this.f222010g = str5;
        this.f222011h = str6;
        this.i = str7;
        this.f222012j = l2;
        this.k = l3;
        this.f222013l = l4;
        this.f222014m = str8;
        this.f222015n = b2Var;
        this.o = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f222007a, b1Var.f222007a) && Intrinsics.f(this.f222008b, b1Var.f222008b) && Intrinsics.f(this.f222009c, b1Var.f222009c) && Intrinsics.f(this.d, b1Var.d) && this.e == b1Var.e && Intrinsics.f(this.f, b1Var.f) && Intrinsics.f(this.f222010g, b1Var.f222010g) && Intrinsics.f(this.f222011h, b1Var.f222011h) && Intrinsics.f(this.i, b1Var.i) && Intrinsics.f(this.f222012j, b1Var.f222012j) && Intrinsics.f(this.k, b1Var.k) && Intrinsics.f(this.f222013l, b1Var.f222013l) && Intrinsics.f(this.f222014m, b1Var.f222014m) && Intrinsics.f(this.f222015n, b1Var.f222015n) && Intrinsics.f(this.o, b1Var.o);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c(h30.l.h(this.f222009c, p.a.c(this.f222007a.hashCode() * 31, 31, this.f222008b), 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f222010g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f222011h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f222012j;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.k;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f222013l;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str4 = this.f222014m;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b2 b2Var = this.f222015n;
        int iHashCode8 = (iHashCode7 + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        String str5 = this.o;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public b1(String id10, String transactionId, ZonedDateTime repaymentDateTime, String currency, long j2, String type, String str, String str2, String str3, Long l2, Long l3, Long l4, String str4, b2 b2Var, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(repaymentDateTime, "repaymentDateTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f222007a = id10;
        this.f222008b = transactionId;
        this.f222009c = repaymentDateTime;
        this.d = currency;
        this.e = j2;
        this.f = type;
        this.f222010g = str;
        this.f222011h = str2;
        this.i = str3;
        this.f222012j = l2;
        this.k = l3;
        this.f222013l = l4;
        this.f222014m = str4;
        this.f222015n = b2Var;
        this.o = str5;
    }
}
