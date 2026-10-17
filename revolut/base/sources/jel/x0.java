package jel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f173599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f173601c;

    public x0(l0 l0Var, ArrayList arrayList, BigDecimal bigDecimal) {
        this.f173599a = l0Var;
        this.f173600b = arrayList;
        this.f173601c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return this.f173599a == x0Var.f173599a && Intrinsics.f(this.f173600b, x0Var.f173600b) && Intrinsics.f(this.f173601c, x0Var.f173601c);
    }

    public final int hashCode() {
        l0 l0Var = this.f173599a;
        int iHashCode = (l0Var == null ? 0 : l0Var.hashCode()) * 31;
        List list = this.f173600b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.f173601c;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
