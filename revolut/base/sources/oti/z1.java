package oti;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class z1 {

    @NotNull
    public static final y1 Companion = new y1();
    public static final Lazy[] o = {null, null, null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new oqj.d(18)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229712c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f229713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f229714h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f229715j;
    public final n1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f229716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f229717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f229718n;

    public /* synthetic */ z1(int i, String str, String str2, String str3, boolean z, boolean z3, int i2, Integer num, Integer num2, int i3, int i5, n1 n1Var, List list, String str4, String str5) {
        if (16383 != (i & 16383)) {
            qlm.j1.f(x1.f229704a.getDescriptor(), i, 16383);
            throw null;
        }
        this.f229710a = str;
        this.f229711b = str2;
        this.f229712c = str3;
        this.d = z;
        this.e = z3;
        this.f = i2;
        this.f229713g = num;
        this.f229714h = num2;
        this.i = i3;
        this.f229715j = i5;
        this.k = n1Var;
        this.f229716l = list;
        this.f229717m = str4;
        this.f229718n = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.f229710a, z1Var.f229710a) && Intrinsics.f(this.f229711b, z1Var.f229711b) && Intrinsics.f(this.f229712c, z1Var.f229712c) && this.d == z1Var.d && this.e == z1Var.e && this.f == z1Var.f && Intrinsics.f(this.f229713g, z1Var.f229713g) && Intrinsics.f(this.f229714h, z1Var.f229714h) && this.i == z1Var.i && this.f229715j == z1Var.f229715j && Intrinsics.f(this.k, z1Var.k) && Intrinsics.f(this.f229716l, z1Var.f229716l) && Intrinsics.f(this.f229717m, z1Var.f229717m) && Intrinsics.f(this.f229718n, z1Var.f229718n);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.c(j6.a.c(p.a.c(p.a.c(this.f229710a.hashCode() * 31, 31, this.f229711b), 31, this.f229712c), 31, this.d), 31, this.e), 31);
        Integer num = this.f229713g;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f229714h;
        int iHashCode2 = (this.k.hashCode() + j6.a.b(this.f229715j, j6.a.b(this.i, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31)) * 31;
        List list = this.f229716l;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f229717m;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229718n;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public z1(String terminalId, String terminalName, String terminalDescription, boolean z, boolean z3, int i, Integer num, Integer num2, int i2, int i3, n1 priceBreakdown, ArrayList arrayList, String str, String str2) {
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        Intrinsics.checkNotNullParameter(terminalName, "terminalName");
        Intrinsics.checkNotNullParameter(terminalDescription, "terminalDescription");
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        this.f229710a = terminalId;
        this.f229711b = terminalName;
        this.f229712c = terminalDescription;
        this.d = z;
        this.e = z3;
        this.f = i;
        this.f229713g = num;
        this.f229714h = num2;
        this.i = i2;
        this.f229715j = i3;
        this.k = priceBreakdown;
        this.f229716l = arrayList;
        this.f229717m = str;
        this.f229718n = str2;
    }
}
