package jel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f173517c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f173518g;

    public n0(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Integer num, ArrayList arrayList) {
        this.f173515a = bigDecimal;
        this.f173516b = bigDecimal2;
        this.f173517c = bigDecimal3;
        this.d = bigDecimal4;
        this.e = bigDecimal5;
        this.f = num;
        this.f173518g = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f173515a, n0Var.f173515a) && Intrinsics.f(this.f173516b, n0Var.f173516b) && Intrinsics.f(this.f173517c, n0Var.f173517c) && Intrinsics.f(this.d, n0Var.d) && Intrinsics.f(this.e, n0Var.e) && Intrinsics.f(this.f, n0Var.f) && Intrinsics.f(this.f173518g, n0Var.f173518g);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f173515a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f173516b;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f173517c;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.d;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.e;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f173518g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }
}
