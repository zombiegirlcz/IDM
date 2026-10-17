package jel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v0 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f173574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f173576c;

    public v0(u0 u0Var, ArrayList arrayList, BigDecimal bigDecimal) {
        this.f173574a = u0Var;
        this.f173575b = arrayList;
        this.f173576c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return this.f173574a == v0Var.f173574a && Intrinsics.f(this.f173575b, v0Var.f173575b) && Intrinsics.f(this.f173576c, v0Var.f173576c);
    }

    public final int hashCode() {
        u0 u0Var = this.f173574a;
        int iHashCode = (u0Var == null ? 0 : u0Var.hashCode()) * 31;
        List list = this.f173575b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.f173576c;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
