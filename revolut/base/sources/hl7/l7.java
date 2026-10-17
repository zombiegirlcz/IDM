package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l7 {

    @NotNull
    public static final k7 Companion = new k7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f153188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153189c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f153191h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f153192j;
    public final q3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y8 f153193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h6 f153194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f153195n;
    public final boolean o;

    public /* synthetic */ l7(int i, String str, m0 m0Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, d0 d0Var, q3 q3Var, y8 y8Var, h6 h6Var, int i2, boolean z) {
        if (32767 != (i & 32767)) {
            qlm.j1.f(j7.f153162a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f153187a = str;
        this.f153188b = m0Var;
        this.f153189c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f153190g = str6;
        this.f153191h = str7;
        this.i = str8;
        this.f153192j = d0Var;
        this.k = q3Var;
        this.f153193l = y8Var;
        this.f153194m = h6Var;
        this.f153195n = i2;
        this.o = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj2;
        return Intrinsics.f(this.f153187a, l7Var.f153187a) && Intrinsics.f(this.f153188b, l7Var.f153188b) && Intrinsics.f(this.f153189c, l7Var.f153189c) && Intrinsics.f(this.d, l7Var.d) && Intrinsics.f(this.e, l7Var.e) && Intrinsics.f(this.f, l7Var.f) && Intrinsics.f(this.f153190g, l7Var.f153190g) && Intrinsics.f(this.f153191h, l7Var.f153191h) && Intrinsics.f(this.i, l7Var.i) && Intrinsics.f(this.f153192j, l7Var.f153192j) && Intrinsics.f(this.k, l7Var.k) && Intrinsics.f(this.f153193l, l7Var.f153193l) && Intrinsics.f(this.f153194m, l7Var.f153194m) && this.f153195n == l7Var.f153195n && this.o == l7Var.o;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f153188b.hashCode() + (this.f153187a.hashCode() * 31)) * 31, 31, this.f153189c);
        String str = this.d;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f153190g);
        String str2 = this.f153191h;
        int iC3 = p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        d0 d0Var = this.f153192j;
        int iHashCode = (iC3 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        q3 q3Var = this.k;
        int iHashCode2 = (iHashCode + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
        y8 y8Var = this.f153193l;
        return Boolean.hashCode(this.o) + j6.a.b(this.f153195n, (this.f153194m.hashCode() + ((iHashCode2 + (y8Var != null ? y8Var.hashCode() : 0)) * 31)) * 31, 31);
    }

    public l7(String id10, m0 vehicle, String status, String str, String policyNumber, String startDateTime, String endDateTime, String str2, String renewalDate, d0 d0Var, q3 q3Var, y8 y8Var, h6 payment, int i, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(policyNumber, "policyNumber");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        Intrinsics.checkNotNullParameter(endDateTime, "endDateTime");
        Intrinsics.checkNotNullParameter(renewalDate, "renewalDate");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f153187a = id10;
        this.f153188b = vehicle;
        this.f153189c = status;
        this.d = str;
        this.e = policyNumber;
        this.f = startDateTime;
        this.f153190g = endDateTime;
        this.f153191h = str2;
        this.i = renewalDate;
        this.f153192j = d0Var;
        this.k = q3Var;
        this.f153193l = y8Var;
        this.f153194m = payment;
        this.f153195n = i;
        this.o = z;
    }
}
